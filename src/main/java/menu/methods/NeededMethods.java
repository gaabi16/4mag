package menu.methods;

import entities.Product;
import entities.ProductDetails;
import repositories.ProductDetailsRepository;
import repositories.ProductRepository;

import java.util.List;
import java.util.Scanner;

public class NeededMethods {

    public static void showProducts() {
        List<Product> productList = ProductRepository.selectProducts();
        System.out.println("Produse care corespund cerintelor alese: ");
        System.out.println("  produs   |   pret(lei)");
        for (Product element : productList) {
            System.out.println("  " + element.getType() + "  |  " + element.getPrice());
        }
    }

    public static void showProductsBasedOnGender(String character) {
        List<ProductDetails> productList = ProductDetailsRepository.selectProductsBasedOnGender(character);
        System.out.println("Produse care corespund cerintelor alese: ");
        System.out.println("  produs   |   marime   |   gender   |   brand   |   pret");
        for (ProductDetails element : productList) {
            System.out.println("  " + element.getProduct().getType() + "  |  " + element.getSize().getSize() + "  |  "
                    + element.getGender() + "  |  " + element.getBrand().getName() + "  |  "
                    + element.getProduct().getPrice());
        }
    }

    public static void showProductsBasedOnSize(Integer size) {
        List<ProductDetails> productDetailsList = ProductDetailsRepository.selectProductsBasedOnSize(size);
        System.out.println("Produse care corespund cerintelor alese: ");
        System.out.println("   produs   |   marime   |   gender   |   brand   |   pret(lei)");
        for (ProductDetails element : productDetailsList) {
            System.out.println("  " + element.getProduct().getType() + "  |  " + element.getSize().getSize()
                    + "  |  " + element.getGender() + "  |  " + element.getBrand().getName() + "  |  "
                    + element.getProduct().getPrice());
        }
    }

    public static void showProductsBasedOnBrand(Integer brand) {
        List<ProductDetails> productDetailsList = ProductDetailsRepository.selectProductsBasedOnBrand(brand);
        System.out.println("Produse care corespund cerintelor alese: ");
        System.out.println("   produs    |   marime   |   gender  |   brand   |   pret(lei)");
        for (ProductDetails element : productDetailsList) {
            System.out.println("  " + element.getProduct().getType() + "   |  " + element.getSize().getSize() +
                    "  |  " + element.getGender() + "  |  " + element.getBrand().getName() + "  |  " +
                    element.getProduct().getPrice());
        }
    }

    public static void buyProduct() {
        Scanner scanner = new Scanner(System.in);
        Product product = new Product();
        //tipul produsului
        SecondaryMenus.genderOptions();
        String gender = scanner.nextLine();
        SecondaryMenus.sizeOptions();
        Integer sizeInteger = scanner.nextInt();
        SecondaryMenus.brandOptions();
        Integer brandInteger = scanner.nextInt();

    }
}
