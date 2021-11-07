import menu.Menus;
import util.HibernateUtil;

public class Main {
    public static void main(String[] args) {

        Menus menu = new Menus();
        menu.SignUpMenu();

        //TODO
        // Don't forget to change the User and Pass fields in HibernateUtil Class with
        // your own user and password!!


        //TODO
        // Apelare metode (in meniu) care afiseaza toate produsele, toate produsele bazate pe o marime,
        // respectiv toate produsele bazate pe un gender!!



        HibernateUtil.shutdown();
    }
}
