package repositories;

import entities.Product;
import org.hibernate.Session;
import org.hibernate.query.Query;
import util.HibernateUtil;

import java.util.ArrayList;
import java.util.List;

public class ProductRepository {

    public List<Product> selectProducts(){
        List<Product> productList = new ArrayList<>();
        try{
            Session session = HibernateUtil.getSessionFactory().openSession();
            String queryString = "from Product p ";
            Query query = session.createQuery(queryString);
            productList = query.getResultList();
            return productList;
        } catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }

    public void showProducts(){
        List<Product> productList = selectProducts();
        for(Product element: productList){
            System.out.println(element);
        }
    }

    public List<Product> selectProductsBasedOnGender(String character){
        List<Product> productList = new ArrayList<>();
        try{
            Session session = HibernateUtil.getSessionFactory().openSession();
            Query query = session.createQuery("select p.type, pd.gender, b.name, pd.quantity from ProductDetails" +
                    " pd join Brand b join Product p on pd.product = p.idProduct and pd.brand = b.idBrand " +
                    "where pd.gender=:ch");
            query.setParameter("ch", character);
            productList = query.getResultList();
            return productList;
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }

    public void showProductsBasedOnGender(String character){
        List<Product> productList = selectProductsBasedOnGender(character);
        for(Product element: productList){
            System.out.println(element);
        }
    }
}
