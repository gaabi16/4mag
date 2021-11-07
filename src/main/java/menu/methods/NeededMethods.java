package menu.methods;

import entities.Brand;
import entities.Product;
import entities.ProductDetails;
import entities.Size;
import repositories.BrandRepository;
import repositories.ProductDetailsRepository;
import repositories.ProductRepository;
import repositories.SizeRepository;

import java.sql.PseudoColumnUsage;
import java.util.List;
import java.util.Scanner;

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




    public static void showProducts() {
        List<Product> productList = ProductRepository.selectProducts();
        for (Product element : productList) {
            System.out.println(element);
        }
    }

    public static ProductDetails desiredProduct(){

        ProductDetails userBoughtProduct = new ProductDetails();

        Scanner scanner = new Scanner(System.in);
        //Tipul produsului
        SecondaryMenus.productTypeOptions();
        Integer productChoiceID = scanner.nextInt();
        scanner.nextLine();

        Product product = ProductRepository.selectProductsBasedOnID(productChoiceID);


        //Genul produsului
        SecondaryMenus.genderOptions();
        String genderChoice = scanner.nextLine();

        //Marimea produsului
        SecondaryMenus.sizeOptions();
        Integer sizeChoiceID = scanner.nextInt();

        Size size = SizeRepository.selectSizeBasedOnID(sizeChoiceID);

        //Brand-ul produsului
        SecondaryMenus.brandOptions();
        Integer brandChoiceID = scanner.nextInt();

        Brand brand = BrandRepository.selectBrandBasedOnID(brandChoiceID);


        userBoughtProduct.setProduct(product);
        userBoughtProduct.setGender(genderChoice);
        userBoughtProduct.setSize(size);
        userBoughtProduct.setBrand(brand);

        return userBoughtProduct;

    }



}
