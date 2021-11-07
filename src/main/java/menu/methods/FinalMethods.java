package menu.methods;

import SignUpLogin.SignUp;
import entities.ProductDetails;
import entities.User;
import repositories.ProductDetailsRepository;
import repositories.UserRepository;

import java.util.Scanner;

public class FinalMethods {

    public static void SignUp() {
        User user1 = SignUp.signUp();
        UserRepository.createUser(user1);
    }


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

    public static void buyProduct() {

        ProductDetails desiredProduct = NeededMethods.desiredProduct();
        ProductDetails choosenProduct = ProductDetailsRepository.selectProductBasedOnUserDesiredProduct(desiredProduct);




        if (choosenProduct.getQuantity() > 0 ) {



            System.out.println("Ai cumparat produsul " + choosenProduct.getProduct().getType() +
                     ", Brand-ul: " + choosenProduct.getBrand().getName() +
                     ", Marimea: " + choosenProduct.getSize().getSize() +
                     ", Genul: " + choosenProduct.getGender());

            Integer newQuantity = choosenProduct.getQuantity() - 1;
            choosenProduct.setQuantity(newQuantity);
            ProductDetailsRepository.updateProductDetails(choosenProduct);
        } else {
            System.out.println("Ne pare rau. Produsul nu mai este pe stoc. Incercati un alt produs!");
        }

    }





}
