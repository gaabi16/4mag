package repositories;

import entities.Product;
import entities.ProductDetails;
import org.hibernate.Session;
import org.hibernate.query.Query;
import util.HibernateUtil;

import java.util.ArrayList;
import java.util.List;

public class ProductRepository {

    public static List<Product> selectProducts(){
        List<Product> productList = new ArrayList<>();
        try{
            Session session = HibernateUtil.getSessionFactory().openSession();
            String queryString = "from Product p";
            Query query = session.createQuery(queryString);
            productList = query.getResultList();
            session.close();
            return productList;
        } catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }

    public static Product selectProductsBasedOnID(Integer productChoiceID) {
        Product product = new Product();
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            Query query = session.createQuery("from Product p where p.idProduct =:ch");
            query.setParameter("ch", productChoiceID);
            product = (Product) query.getSingleResult();

            return product;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }





}
