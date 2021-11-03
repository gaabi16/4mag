package SignUpLogin;

import SignUpLogin.UserType;

import java.util.ArrayList;
import java.util.Scanner;

public class SignUp {

    public static void signUp(){

        ArrayList<UserType> client = new ArrayList<UserType>(); // store and hold client input temporary
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
        System.out.print("usertype : ");
        usertype = input.next();
        client.add(new UserType(firstname,lastname,email, password, usertype));


    }
}

