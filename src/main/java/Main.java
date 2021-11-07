
import SignUpLogin.SignUp;
import entities.User;


import menu.methods.FinalMethods;
import repositories.ProductRepository;
import repositories.UserRepository;
import util.HibernateUtil;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        menu.Menus mainMenu = new menu.Menus();
//
//        mainMenu.mainMenu();

        //TODO
        // Don't forget to change the User and Pass fields in HibernateUtil Class with
        // your own user and password!!


        //TODO
        // Apelare metode (in meniu) care afiseaza toate produsele, toate produsele bazate pe o marime,

        // respectiv toate produsele bazate pe un gender!!
        FinalMethods.SignUp();
        HibernateUtil.shutdown();
    }
}
