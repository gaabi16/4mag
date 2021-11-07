package menu.methods;

import java.util.Scanner;

public class FinalMethods {

    public static void products(){
        NeededMethods.showProducts();
    }

    public static void productsBasedOnSize() {
        SecondaryMenus.sizeOptions();
        Scanner scanner = new Scanner(System.in);
        Integer option = scanner.nextInt();
        NeededMethods.showProductsBasedOnSize(option);
    }

    public static void productsBasedOnGender(){
        SecondaryMenus.genderOptions();
        Scanner scanner = new Scanner(System.in);
        String option = scanner.nextLine();
        NeededMethods.showProductsBasedOnGender(option);
    }

    public static void productsBasedOnBrand(){
        SecondaryMenus.brandOptions();
        Scanner scanner = new Scanner(System.in);
        Integer option = scanner.nextInt();
        NeededMethods.showProductsBasedOnBrand(option);
    }
}
