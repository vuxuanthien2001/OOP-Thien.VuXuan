package Demo;

import DAO.Database;
import DAO.ProductDAO;
import Entity.Category;
import Entity.Product;

import java.util.ArrayList;
import java.util.Scanner;

public class ProductDAODemo extends ProductDAO {
    static Database database = Database.getDataBase();
    static Scanner scanner = new Scanner(System.in);

    public static String NAME_PRODUCT = "Entity.Product";

    public static void main(String[] args) {
        ProductDAODemo demo = new ProductDAODemo();
        demo.initData();
        demo.insertTest();
        demo.updateTest();
        demo.deleteTest();
        demo.findAllTest();
        demo.findByIdTest();
        demo.findByNameTest();
        //demo.searchTest();
    }

    /**
     * create data test
     */
    public void initData() {
        database.productTable.add(new Product(1, "CPU", 750, 10, 1));
        database.productTable.add(new Product(2, "RAM", 50, 2, 2));
        database.productTable.add(new Product(3, "HDD", 70, 1, 2));
        database.productTable.add(new Product(4, "Main", 400, 3, 1));
        database.productTable.add(new Product(5, "Keyboard", 30, 8, 4));
        database.productTable.add(new Product(6, "Mouse", 25, 50, 4));
        database.productTable.add(new Product(7, "VGA", 60, 35, 3));
        database.productTable.add(new Product(8, "Monitor", 120, 28, 2));
        database.productTable.add(new Product(9, "Case", 120, 28, 5));
        database.productTable.add(new Product(10, "Case", 210, 32, 5));
    }

    /**
     * test funtion insert product
     */
    public void insertTest() {
        System.out.println("Thêm sản phẩm");
        System.out.print("Nhập id: ");
        int iid = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập name: ");
        String strname = scanner.nextLine();
        System.out.print("Nhập price: ");
        double dprice = Double.parseDouble(scanner.nextLine());
        System.out.print("Nhập quality: ");
        double dquality = Double.parseDouble(scanner.nextLine());
        System.out.print("Nhập categoryId: ");
        int icategoryId = Integer.parseInt(scanner.nextLine());
        //super.insert(new Product(iid, strname,dprice,dquality,icategoryId));
        database.insertTable(NAME_PRODUCT, new Product(iid, strname,dprice,dquality,icategoryId));
    }

    /**
     * test funtion update product
     */
    public void updateTest() {
        System.out.println("Cập nhật sản phẩm");
        System.out.print("Nhập id: ");
        int iid = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập name: ");
        String strname = scanner.nextLine();
        System.out.print("Nhập price: ");
        double dprice = Double.parseDouble(scanner.nextLine());
        System.out.print("Nhập quality: ");
        double dquality = Double.parseDouble(scanner.nextLine());
        System.out.print("Nhập categoryId: ");
        int icategoryId = Integer.parseInt(scanner.nextLine());
        //super.update(new Product(iid, strname,dprice,dquality,icategoryId));
        database.updateTable(NAME_PRODUCT, new Product(iid, strname,dprice,dquality,icategoryId));
    }

    /**
     * test funtion delete product
     */
    public void deleteTest() {
        System.out.println("Xóa sản phẩm");
        System.out.print("Nhập id: ");
        int iid = Integer.parseInt(scanner.nextLine());
        //super.delete(new Product(iid,"",1,2,3));
        database.deleteTable(NAME_PRODUCT, new Product(iid,"",1,2,3));

    }

    /**
     * test funtion show all product
     */
    public void findAllTest() {
        System.out.println("Danh sách sản phẩm");
        ArrayList<Product> list = database.selectTable(NAME_PRODUCT,"");
        for (Product product: list
             ) {
            System.out.println(product.getId()+ "\t" + product.getName()+ "\t" + product.getPrice()+ "\t"+ product.getQuality()+ "\t"+product.getCategoryId());
        }
    }


    /**
     * test funtion find prodcut by id
     */
    public void findByIdTest() {
        System.out.println("Tìm kiếm theo id");
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
     * test funtion find product by name
     */
    public void findByNameTest() {
        System.out.println("Tìm kiếm theo tên");
        System.out.println("Nhập name: ");
        String strname = scanner.nextLine();
        Product product = super.findByName(strname);
        System.out.println("Id: " + product.getId());
        System.out.println("Name: " + product.getName());
        System.out.println("Price: " + product.getPrice());
        System.out.println("Quality: " + product.getQuality());
        System.out.println("CategoryId: " + product.getCategoryId());
    }

    /**
     * test funtion search product by name
     */
    public void searchTest() {
        System.out.println("Nhập name: ");
        String strname = scanner.nextLine();
        ArrayList<Product> list = super.search(strname);
        for (Product product : list
        ) {
            System.out.println("Id: " + product.getId());
            System.out.println("Name: " + product.getName());
            System.out.println("Price: " + product.getPrice());
            System.out.println("Quality: " + product.getQuality());
            System.out.println("CategoryId: " + product.getCategoryId());
        }
    }
}
