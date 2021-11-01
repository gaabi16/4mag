import java.util.Scanner;

public class Menus {
    boolean isMainMenuRunning = true;
    boolean isViewProductsMenuRunning = true;
    boolean isMasculineMenuRunning = true;
    boolean isFeminineMenuRunning = true;
    boolean isUnisexMenuRunning = true;
    boolean isAllProductsMenuRunning = true;
    Scanner sc = new Scanner(System.in);

    public void mainMenu() {

        while (isMainMenuRunning = true) {
            System.out.println("Please select an option:");
            System.out.println("1. View Products");
            System.out.println("2. View Chart");
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

                break;

            case "3":
                System.exit(0);

            default:
                System.out.println("Wrong input, try again!");
        }
    }


    public void viewProductsMenu() {

        while (isViewProductsMenuRunning = true) {
            System.out.println("Please select gender:");
            System.out.println("1.Masculine");
            System.out.println("2.Feminine");
            System.out.println("3.Unisex");
            System.out.println("4.All products");
            System.out.println("5.Back");
            System.out.println("6.Exit");
            switchViewProductsMenu();
        }
    }

    public void switchViewProductsMenu() {
        String optionViewProductsMenu = sc.nextLine();

        switch (optionViewProductsMenu) {

            case "1":
                masculineMenu();
                break;

            case "2":
                feminineMenu();
                break;

            case "3":
                unisexMenu();
                break;

            case "4":
                allProductsMenu();
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


    public void masculineMenu() {

        while (isMasculineMenuRunning = true) {
            System.out.println("Please select a category:");
            System.out.println("1.T-shirts");
            System.out.println("2.Jeans");
            System.out.println("3.Jackets");
            System.out.println("4.Shorts");
            System.out.println("5.Hoodies");
            System.out.println("6.Back");
            System.out.println("7.Exit");
            switchMasculineMenu();
        }
    }

    public void switchMasculineMenu(){
        String optionMasculineMenu = sc.nextLine();

        switch (optionMasculineMenu) {

            case "1":

                break;

            case "2":

                break;

            case "3":

                break;

            case "4":

                break;

            case "5":

                break;

            case "6":
                this.viewProductsMenu();
                break;

            case "7":
                System.exit(0);

            default:
                System.out.println("Wrong input, try again!");

        }

    }

    public void feminineMenu() {

        while (isFeminineMenuRunning = true) {
            System.out.println("Please select a category:");
            System.out.println("1.T-shirts");
            System.out.println("2.Jeans");
            System.out.println("3.Skirts");
            System.out.println("4.Jackets");
            System.out.println("5.Shorts");
            System.out.println("6.Hoodies");
            System.out.println("7.Back");
            System.out.println("8.Exit");
            switchFeminineMenu();
        }
    }

    public void switchFeminineMenu(){
        String optionFeminineMenu = sc.nextLine();

        switch (optionFeminineMenu) {

            case "1":

                break;

            case "2":

                break;

            case "3":

                break;

            case "4":

                break;

            case "5":

                break;

            case "6":

                break;

            case "7":
                this.viewProductsMenu();
                break;

            case "8":
                System.exit(0);

            default:
                System.out.println("Wrong input, try again!");

        }

    }

    public void unisexMenu() {

        while (isUnisexMenuRunning = true) {
            System.out.println("Please select a category:");
            System.out.println("1.Hats");
            System.out.println("2.Scarfs");
            System.out.println("3.Back");
            System.out.println("4.Exit");
            switchUnisexMenu();
        }
    }

    public void switchUnisexMenu(){
        String optionUnisexMenu = sc.nextLine();

        switch (optionUnisexMenu) {

            case "1":

                break;

            case "2":

                break;

            case "3":
                this.viewProductsMenu();
                break;

            case "4":
                System.exit(0);

            default:
                System.out.println("Wrong input, try again!");

        }

    }
    public void allProductsMenu() {

        while (isAllProductsMenuRunning = true) {
            System.out.println("Please select a category:");
            System.out.println("1.T-shirts");
            System.out.println("2.Jeans");
            System.out.println("3.Jackets");
            System.out.println("4.Shorts");
            System.out.println("5.Hoodies");
            System.out.println("6.Hats");
            System.out.println("7.Scarfs");
            System.out.println("8.Back");
            System.out.println("9.Exit");
            switchAllProductsMenu();
        }
    }
    public void switchAllProductsMenu(){
        String optionAllProductsMenu = sc.nextLine();

        switch (optionAllProductsMenu) {

            case "1":

                break;

            case "2":

                break;

            case "3":

                break;

            case "4":

                break;

            case "5":

                break;

            case "6":

                break;

            case "7":

                break;


            case "8":
                this.viewProductsMenu();
                break;

            case "9":
                System.exit(0);

            default:
                System.out.println("Wrong input, try again!");

        }

    }
}



