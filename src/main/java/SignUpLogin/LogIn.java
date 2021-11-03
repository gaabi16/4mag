package SignUpLogin;

import java.util.Scanner;

    public class LogIn {
        public static void logIn() {
            String mailDB;
            String passwordDB;
            mailDB = "1234";
            passwordDB = "coco";
            Scanner input1 = new Scanner(System.in);
            System.out.print("Enter e-mail : ");
            String mail = input1.next();

            Scanner input2 = new Scanner(System.in);
            System.out.println("Enter Password : ");
            String password = input2.next();

            if (mail.equals(mailDB) && password.equals(passwordDB)) {
                System.out.println("Access Granted!");
            } else {
                System.out.println("Invalid Username & Password!");

            }
        }
    }


