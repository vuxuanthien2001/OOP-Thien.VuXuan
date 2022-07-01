package Demo;

import DAO.Database;
import DAO.ProductDAO;
import Entity.Category;
import Entity.Product;

import java.util.ArrayList;
import java.util.Scanner;

public class ProductDAODemo extends ProductDAO {
    static Database database = new Database();
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        ProductDAODemo demo = new ProductDAODemo();
        demo.initData();
        /*demo.insertTest();
        ArrayList<Product> list = demo.findAll();
        for (Product product: list
             ) {
            System.out.println(product.getId()+ "\t" + product.getName()+ "\t" + product.getPrice()+ "\t"+ product.getQuality()+ "\t"+product.getCategoryId());
        }*/
        demo.findByNameTest();

    }

    /**
     * create data
     */
    public void initData(){
        super.insert(new Product(1,"CPU", 750, 10, 1));
        super.insert(new Product(2,"RAM", 50, 2, 2));
        super.insert(new Product(3,"HDD", 70, 1, 2));
        super.insert(new Product(4,"Main", 400, 3, 1));
        super.insert(new Product(5,"Keyboard", 30, 8, 4));
        super.insert(new Product(6,"Mouse", 25, 50, 4));
        super.insert(new Product(7,"VGA", 60, 35, 3));
        super.insert(new Product(8,"Monitor", 120, 28, 2));
        super.insert(new Product(9,"Case", 120, 28, 5));
        super.insert(new Product(10,"Laptop", 240, 30, 1));
    }

    /**
     * insert product
     */
    public void insertTest(){
        System.out.println("Nhập id: ");
        int iid = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập name: ");
        String strname = scanner.nextLine();
        System.out.println("Nhập price: ");
        double dprice = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập quality: ");
        double dquality = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập categoryId: ");
        int icategoryId = Integer.parseInt(scanner.nextLine());
        super.insert(new Product(iid, strname,dprice,dquality,icategoryId));
    }

    /**
     * update product
     */
    public void updateTest(){
        System.out.println("Nhập id: ");
        int iid = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập name: ");
        String strname = scanner.nextLine();
        System.out.println("Nhập price: ");
        double dprice = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập quality: ");
        double dquality = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập categoryId: ");
        int icategoryId = Integer.parseInt(scanner.nextLine());
        super.update(new Product(iid, strname,dprice,dquality,icategoryId));
    }

    /**
     * delete product
     */
    public void deleteTest(){
        System.out.println("Nhập id: ");
        int iid = Integer.parseInt(scanner.nextLine());
        super.delete(new Product(iid,"",1,2,3));
    }

    /**
     * show all product
     */
    public void findAllTest(){
        ArrayList<Product> list = super.findAll();
        for (Product product: list
             ) {
            System.out.println(product.getId()+ "\t" + product.getName()+ "\t" + product.getPrice()+ "\t"+ product.getQuality()+ "\t"+product.getCategoryId());
        }
    }


    /**
     * find prodcut by id
     */
    public void findByIdTest(){
        System.out.println("Nhập id: ");
        int iid = Integer.parseInt(scanner.nextLine());
        Product product = super.findById(iid);
        System.out.println("Id: " + product.getId());
        System.out.println("Name: " + product.getName());
        System.out.println("Price: " + product.getPrice());
        System.out.println("Quality: " + product.getQuality());
        System.out.println("CategoryId: " + product.getCategoryId());
    }

    /**
     * find product by name
     */
    public void findByNameTest(){
        System.out.println("Nhập name: ");
        String strname = scanner.nextLine();
        Product product = super.findByName(strname);
        System.out.println("Id: " + product.getId());
        System.out.println("Name: " + product.getName());
        System.out.println("Price: " + product.getPrice());
        System.out.println("Quality: " + product.getQuality());
        System.out.println("CategoryId: " + product.getCategoryId());
    }
    public void searchTest(){
        System.out.println("Nhập name: ");
        String strname = scanner.nextLine();
        ArrayList<Product> list = super.search(strname);
        for (Product product: list
             ) {
            System.out.println("Id: " + product.getId());
            System.out.println("Name: " + product.getName());
            System.out.println("Price: " + product.getPrice());
            System.out.println("Quality: " + product.getQuality());
            System.out.println("CategoryId: " + product.getCategoryId());
        }
    }
}
