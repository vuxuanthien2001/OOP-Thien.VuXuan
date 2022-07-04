package Demo;

import DAO.Database;
import Entity.Accessory;
import Entity.Category;
import Entity.Product;
import jdk.swing.interop.SwingInterOpUtils;

import java.util.ArrayList;
import java.util.Scanner;

public class DatabaseDemo {
    static Database database = Database.getDataBase();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        /*updateTableByIdTest();
        printTableTest();*/
        /*insertTableTest();
        printTableTest();*/
        /*selectTableTest();
        printTableTest();*/
        /*updateTableTest();
        printTableTest();*/
        deleteTableTest();
        /*truncateTableTest();
        printTableTest();*/

    }

    //"""Viết class DatabaseDemo, sử dụng các phương thức của class Database.
    //Đặt trong thư mục demo.
    //Class DatabaseDemo phải có các phương thức sau:
    //- insertTableTest()
    public static void insertTableTest() {
        System.out.println("Nhập id: ");
        int strid = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập name: ");
        String strname = scanner.nextLine();
        System.out.println("Nhập price: ");
        double dprice = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập quality: ");
        double dquality = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập categoryId: ");
        int icategoryId = Integer.parseInt(scanner.nextLine());
        if (database.insertTable("Entity.Product", new Product(strid, strname, dprice, dquality, icategoryId)) == 1) {
            System.out.println("Thêm thành công");
        }

    }

    //- selectTableTest()
    public static void selectTableTest() {
       /* System.out.println("Nhập name cần tìm: ");
        String nameFind = scanner.nextLine();*/
        ArrayList<Product> list = database.selectTable("Entity.Product", "nameFind");
        System.out.println("Danh sách sản phẩm có tên trên:");
        for (Product product : list
        ) {
            System.out.println(product.getId() + "\t" + product.getName() + "\t" + product.getPrice() + "\t" + product.getQuality() + "\t" + product.getCategoryId());
        }
    }

    //- updateTableTest()
    public static void updateTableTest() {
        System.out.println("Nhập id: ");
        int strid = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập name: ");
        String strname = scanner.nextLine();
        System.out.println("Nhập price: ");
        double dprice = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập quality: ");
        double dquality = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập categoryId: ");
        int icategoryId = Integer.parseInt(scanner.nextLine());
        database.updateTable("Entity.Product", new Product(strid, strname, dprice, dquality, icategoryId));
    }

    //- deleteTableTest()
    public static void deleteTableTest() {
        System.out.println("Nhập id: ");
        int strid = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập name: ");
        String strname = scanner.nextLine();
        System.out.println("Nhập price: ");
        double dprice = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập quality: ");
        double dquality = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập categoryId: ");
        int icategoryId = Integer.parseInt(scanner.nextLine());
        database.deleteTable("Entity.Product", new Product(strid, strname, dprice, dquality, icategoryId));
    }

    //- truncateTableTest()
    public static void truncateTableTest() {
        database.truncateTable("Entity.Product");
    }

    //- initDatabase() : Tạo mỗi bảng 10 bản ghi.


    //- printTableTest(...)"""


    // 7.2 Trong class DatabaseDemo, update function updateTableTest để test function mới viết"
    public static void updateTableByIdTest() {
        System.out.println("Nhập id cần update: ");
        int iid = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập name: ");
        String strname = scanner.nextLine();
        System.out.println("Nhập price: ");
        double dprice = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập quality: ");
        double dquality = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập categoryId: ");
        int icategoryId = Integer.parseInt(scanner.nextLine());
        database.updateTableById(iid, new Product(iid, strname, dprice, dquality, icategoryId));
    }


}
