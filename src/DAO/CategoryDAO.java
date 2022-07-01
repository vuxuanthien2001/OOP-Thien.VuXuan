package DAO;

import Entity.Category;
import Entity.Product;

import java.util.ArrayList;
import java.util.Scanner;

public class CategoryDAO {
    //"Viết class CategoryDAO theo thiết kế. Đặt tên là CategoryDAO,
    //đặt trong thư mục dao
    //Trong class này sử dụng  object của class  Category entiry làm row, phải dùng class Database:
    //- Mô tả function insert(row): Mục đich  insert một object category vào Database
    // 1. khởi tạo object class Database
    // 2. Gọi phương thức insertTable('category', row) để insert row vào categoryTable của class Database
    // 3. Trả kết quả true nếu thành công, false nếu thất bại"

    static Database database = new Database();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        CategoryDAO categoryDAO = new CategoryDAO();
        System.out.println("Nhập id: ");
        int iid = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập name: ");
        String strname = scanner.nextLine();
        categoryDAO.insert(new Category(iid, strname));
        for (Category category : database.categoryTable
        ) {
            System.out.println(category.getId() + "\t" + category.getName());
        }

    }

    public int insert(Category category) {
        if (database.insertTable("Entity.Category", category) == 1) {
            return 1;
        }
        return 0;
    }

    public int update(Category category){
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
        if(database.updateTable("Entity.Category", category) == 1){
            return 1;
        }
        return 0;
    }

    public boolean delete(Category category){
        System.out.println("Nhập id: ");
        int iid = Integer.parseInt(scanner.nextLine());
       /* System.out.println("Nhập name: ");
        String strname = scanner.nextLine();
        System.out.println("Nhập price: ");
        double dprice = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập quality: ");
        double dquality = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập categoryId: ");
        int icategoryId = Integer.parseInt(scanner.nextLine());*/
        if(database.deleteTable("Entity.Category", category) == true){
            return true;
        }
        return false;
    }

    public static ArrayList<Category> findAll(){
        ArrayList<Category> listCategory = new ArrayList<>();
        for (Category category: database.categoryTable
             ) {
            listCategory.add(category);
        }
        return listCategory;
    }

    public static Category findById(int id){
        for (Category category: database.categoryTable
             ) {
            if(category.getId() == id){
                return category;
            }
        }
        return null;
    }


}
