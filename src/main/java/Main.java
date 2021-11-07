import entities.User;
import menu.methods.FinalMethods;
import repositories.ProductDetailsRepository;
import repositories.ProductRepository;
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

        FinalMethods.productsBasedOnBrand();
        System.out.println("\n\n\n\n");
        FinalMethods.productsBasedOnGender();
        System.out.println("\n\n\n\n");
        FinalMethods.products();
        System.out.println("\n\n\n\n");
        FinalMethods.productsBasedOnSize();

        HibernateUtil.shutdown();
    }
}
