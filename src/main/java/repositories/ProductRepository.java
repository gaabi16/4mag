package repositories;

import entities.Product;
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
            return productList;
        } catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }



}
