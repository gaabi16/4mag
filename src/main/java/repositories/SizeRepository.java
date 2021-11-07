package repositories;

import entities.Product;
import entities.Size;
import org.hibernate.Session;
import org.hibernate.query.Query;
import util.HibernateUtil;

import java.util.ArrayList;
import java.util.List;

public class SizeRepository {

    public static List<Size> selectSize(){
        List<Size> sizeList = new ArrayList<>();
        try{
            Session session = HibernateUtil.getSessionFactory().openSession();
            Query query = session.createQuery("from Size");
            sizeList = query.getResultList();
            return sizeList;

        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }

    public static Size selectSizeBasedOnID(Integer sizeChoiceID) {
        Size size = new Size();
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            Query query = session.createQuery("from Size s where s.idSize =:ch");
            query.setParameter("ch", sizeChoiceID);
            size = (Size) query.getSingleResult();

            return size;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

}
