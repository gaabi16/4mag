package menu;

import menu.methods.FinalMethods;

import java.util.Scanner;

public class Menus {
    boolean isSignUpRunning = true;
    boolean isMainMenuRunning = false;
    boolean isViewProductsMenuRunning = true;
    Scanner sc = new Scanner(System.in);


    public void SignUpMenu() {

        System.out.println("Hello. Welcome to 4mag shop!");

        while (isSignUpRunning = true ) {
            System.out.println("1. Sign Up");
            System.out.println("2. Login");
            switchSignUpMenu();
        }
    }

    public void switchSignUpMenu () {
        String optionSignUpMenu = sc.nextLine();
        switch (optionSignUpMenu) {

            case "1": FinalMethods.SignUp();
                break;

            case "2":
                isSignUpRunning = false;
                isMainMenuRunning = true;

                mainMenu();

        }
    }


    public void mainMenu() {

        while (isMainMenuRunning = true) {

            System.out.println("Please select an option:");
            System.out.println("1. View Products");
            System.out.println("2. Buy Products");
            System.out.println("3. Exit");
            switchMainMenu();
        }
    }

    public void switchMainMenu() {
        String optionMainMenu = sc.nextLine();

        switch (optionMainMenu) {
            case "1":

                viewProductsMenu();
                break;

            case "2":

                FinalMethods.buyProduct();
                break;

            case "3":
                System.exit(0);

            default:
                System.out.println("Wrong input, try again!");
        }
    }


    public void viewProductsMenu() {

        while (isViewProductsMenuRunning = true) {
            System.out.println("Please select how you want to see products ");
            System.out.println("1.All products");
            System.out.println("2.Based on Size");
            System.out.println("3.Based on Brand");
            System.out.println("4.Based on Gender");
            System.out.println("5.Back");
            System.out.println("6.Exit");
            switchViewProductsMenu();
        }
    }

    public void switchViewProductsMenu() {
        String optionViewProductsMenu = sc.nextLine();

        switch (optionViewProductsMenu) {

            case "1":
                FinalMethods.products();
                break;

            case "2":

                FinalMethods.productsBasedOnSize();
                break;

            case "3":
                FinalMethods.productsBasedOnBrand();
                break;

            case "4":
                FinalMethods.productsBasedOnGender();
                break;

            case "5":
                this.mainMenu();
                break;

            case "6":
                System.exit(0);

            default:
                System.out.println("Wrong input, try again!");

        }

    }



}



