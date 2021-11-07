package repositories;

import entities.Brand;
import entities.Size;
import org.hibernate.Session;
import org.hibernate.query.Query;
import util.HibernateUtil;

import java.util.ArrayList;
import java.util.List;

public class BrandRepository {

    public static List<Brand> selectBrands(){
        List<Brand> brandList = new ArrayList<>();
        try{
            Session session = HibernateUtil.getSessionFactory().openSession();
            Query query = session.createQuery("from Brand");
            brandList = query.getResultList();
            return brandList;

        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }


    public static Brand selectBrandBasedOnID(Integer BrandChoiceID) {
        Brand brand = new Brand();
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            Query query = session.createQuery("from Brand b where b.idBrand =:ch");
            query.setParameter("ch", BrandChoiceID);
            brand = (Brand) query.getSingleResult();

            return brand;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

}
