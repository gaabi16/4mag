package menu.methods;

import entities.Brand;
import entities.Product;
import entities.Size;
import repositories.BrandRepository;
import repositories.ProductRepository;
import repositories.SizeRepository;

import java.util.List;

public class SecondaryMenus {


    public static void productTypeOptions() {
        System.out.println("Introdu tipul produsului dorit: ");
        List<Product> productList = ProductRepository.selectProducts();
        for (Product element : productList) {
            System.out.println(element.getIdProduct() + ". " + element.getType());
        }
    }

    public static void genderOptions(){
        System.out.println("Introdu gender-ul dorit: ");
        System.out.println("M, F sau N");
    }



    public static void brandOptions() {
        System.out.println("Introdu brand-ul produsului dorit: ");
        List<Brand> productList = BrandRepository.selectBrands();
        for (Brand element : productList) {
            System.out.println(element.getIdBrand() + ". " + element.getName());
        }
    }

    public static void sizeOptions() {
        System.out.println("Introdu numarul marimii corespunzatoare produselor: ");
        List<Size> sizeList = SizeRepository.selectSize();
        for (Size element : sizeList) {
            System.out.println(element.getIdSize() + ". " + element.getSize());
        }
    }



}
