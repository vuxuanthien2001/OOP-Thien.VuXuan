package Demo;

import Entity.Product;

import java.util.ArrayList;
import java.util.Scanner;

public class ProductDemo {
    static Scanner sc = new Scanner(System.in);
    //static ArrayList<Product> listProduct = new ArrayList<Product>();
    public Product createProductTest(){
        Product product = new Product(addId(),addName(),addPrice(),addQuality(),addCategoryId());
        return product;
    }

    public int addId(){
        int id;
        System.out.print("Nhập id: ");
        do{
            id = Integer.parseInt(sc.nextLine());
            if(id < 0){
                System.out.print("Nhập lại id: ");
            }
        }while (id < 0);
        return id;
    }

    public String addName(){
        String name;
        System.out.print("Nhập name: ");
        do{
            name = sc.nextLine();
            if(name.equals("")){
                System.out.print("Nhập lại name: ");
            }
        }while (name.equals(""));
        return name;
    }

    public double addPrice(){
        double price;
        System.out.print("Nhập price: ");
        do{
            price = Double.parseDouble(sc.nextLine());
            if(price < 0){
                System.out.print("Nhập lại price: ");
            }
        }while (price < 0);
        return price;
    }

    public double addQuality(){
        double quality;
        System.out.print("Nhập quality: ");
        do{
            quality = Double.parseDouble(sc.nextLine());
            if(quality < 0){
                System.out.print("Nhập lại quality: ");
            }
        }while (quality < 0);
        return quality;
    }

    public int addCategoryId(){
        int categoryId;
        System.out.print("Nhập categoryId: ");
        do{
            categoryId = Integer.parseInt(sc.nextLine());
            if(categoryId < 0){
                System.out.print("Nhập lại categoryId: ");
            }
        }while (categoryId < 0);
        return categoryId;
    }

    public void printProduct(Product product){
        System.out.println("Thông tin sản phẩm:");
        System.out.println("Id: " + product.getId());
        System.out.println("Name: " + product.getName());
        System.out.println("Price: " + product.getPrice());
        System.out.println("Quality: " + product.getQuality());
        System.out.println("CategoryId: " + product.getCategoryId());
    }

    public static void main(String[] args) {
        ProductDemo demo = new ProductDemo();
        Product product = demo.createProductTest();
        demo.printProduct(product);
    }

}
