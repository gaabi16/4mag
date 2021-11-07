package menu.methods;

import SignUpLogin.SignUp;
import entities.User;
import repositories.UserRepository;

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
    public static void SignUp(){
        User user1 = SignUp.signUp();
        UserRepository.createUser(user1);

    }
}
