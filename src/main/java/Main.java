

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

        ProductRepository productRepository = new ProductRepository();
        productRepository.showProducts();

//        Scanner scanner = new Scanner(System.in);
//        String character = scanner.nextLine();
//        productRepository.showProductsBasedOnGender(character);
        HibernateUtil.shutdown();

    }
}
