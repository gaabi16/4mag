package SignUpLogin;

import SignUpLogin.UserType;
import entities.User;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.HibernateUtil;

import java.util.ArrayList;
import java.util.Scanner;

public class SignUp {

    public static User signUp(){

        //ArrayList<UserType> client = new ArrayList<UserType>(); // store and hold client input temporary
        Scanner input = new Scanner(System.in); // to obtain input from user

        String firstname,lastname,email,password,usertype;

        System.out.println("========== SIGN UP PAGE ==========");

        System.out.println("first_name :");
        firstname = input.next();
        System.out.println("last_name :");
        lastname = input.next();
        System.out.println("email :");
        email = input.next();
        System.out.print("password : ");
        password = input.next();
       // System.out.print("usertype : ");
        //usertype = input.next();
        User user1 = new User();
        user1.setFirstName(firstname);
        user1.setLastName(lastname);
        user1.setEmail(email);
        user1.setPassword(password);
        return user1;




    }
    public void createClient(User client) {
        String firstname;
        Scanner input = new Scanner(System.in); // to obtain input from user
        Transaction transaction = null;
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            // start a transaction
            transaction = session.beginTransaction();
            // save the person object
            firstname = input.next();
            session.save(client);
            //session.addEventListeners(new User(firstname));
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

