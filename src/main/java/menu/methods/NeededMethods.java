package menu.methods;

import entities.Product;
import entities.ProductDetails;
import repositories.ProductDetailsRepository;
import repositories.ProductRepository;

import java.util.List;

public class NeededMethods {

    public static void showProductsBasedOnGender(String character) {
        List<ProductDetails> productList = ProductDetailsRepository.selectProductsBasedOnGender(character);
        System.out.println("Produse care corespund cerintelor alese: ");
        System.out.println("produs/marime/gender/brand/pret");
        for (ProductDetails element : productList) {
            System.out.println(element.getProduct().getType() + " " + element.getSize().getSize() + " "
                    + element.getGender() + " " + element.getBrand().getName() + " "
                    + element.getProduct().getPrice());
        }
    }

    public static void showProductsBasedOnSize(Integer size) {
        List<ProductDetails> productDetailsList = ProductDetailsRepository.selectProductsBasedOnSize(size);
        System.out.println("Produse care corespund cerintelor alese: ");
        System.out.println("produs/marime/gender/brand/pret");
        for (ProductDetails element : productDetailsList) {
            System.out.println(element.getProduct().getType() + " " + element.getSize().getSize() + " "
                    + element.getGender() + " " + element.getBrand().getName() + " "
                    + element.getProduct().getPrice());
        }
    }

    public static void showProducts() {
        List<Product> productList = ProductRepository.selectProducts();
        for (Product element : productList) {
            System.out.println(element);
        }
    }
}
