package repositories;

import entities.*;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import util.HibernateUtil;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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

    public static ProductDetails selectProductBasedOnUserDesiredProduct (ProductDetails UserDesiredProduct) {
        ProductDetails productDetails = new ProductDetails();
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            Query query = session.createQuery("from ProductDetails pd where pd.product.idProduct =:Product_id and " +
                    "pd.brand.idBrand =:Brand_id and " +
                    "pd.size.idSize =:Size_id and " +
                    "pd.gender =:Gender");
            query.setParameter("Product_id",UserDesiredProduct.getProduct().getIdProduct());
            query.setParameter("Brand_id",UserDesiredProduct.getBrand().getIdBrand());
            query.setParameter("Gender",UserDesiredProduct.getGender());
            query.setParameter("Size_id", UserDesiredProduct.getSize().getIdSize());

            productDetails = (ProductDetails) query.getSingleResult();
            return productDetails;
        } catch (HibernateException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void updateProductDetails(ProductDetails productDetails){
        Transaction transaction = null;
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            // start a transaction
            transaction = session.beginTransaction();
            // save the person object
            session.update(productDetails);
            // commit transaction
            transaction.commit();
        } catch (Exception ex) {
            if (transaction != null) {
                transaction.rollback();
            }
            ex.printStackTrace();
        }
    }




}
