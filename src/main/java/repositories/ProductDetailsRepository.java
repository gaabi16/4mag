package repositories;

import entities.ProductDetails;
import org.hibernate.Session;
import org.hibernate.query.Query;
import util.HibernateUtil;

import java.util.ArrayList;
import java.util.List;

public class ProductDetailsRepository {

    public static List<ProductDetails> selectProductsBasedOnGender(String character) {
        List<ProductDetails> productList = new ArrayList<>();
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            Query query = session.createQuery("from ProductDetails pd where pd.gender=:ch");
            query.setParameter("ch", character);
            productList = query.getResultList();
            return productList;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static List<ProductDetails> selectProductsBasedOnSize(Integer size) {
        List<ProductDetails> productList = new ArrayList<>();
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            Query query = session.createQuery("from ProductDetails pd where pd.size.idSize =:ch");
            query.setParameter("ch", size);
            productList = query.getResultList();
            return productList;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static List<ProductDetails> selectProductsBasedOnBrand(Integer brand){
        List<ProductDetails> productDetailsList = new ArrayList<>();
        try{
            Session session = HibernateUtil.getSessionFactory().openSession();
            Query query = session.createQuery("from ProductDetails pd where pd.brand.idBrand=:brandName");
            query.setParameter("brandName",brand);
            productDetailsList = query.getResultList();
            return productDetailsList;
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }

}
