package Demo;

import DAO.Database;
import Entity.Category;

import java.util.ArrayList;
import java.util.Scanner;

public class CategoryDAODemo extends Database {
    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        CategoryDAODemo demo = new CategoryDAODemo();
        demo.insertTest();
        demo.findAllTest();
        demo.updateTest();
        demo.findAllTest();
        demo.deleteTest();
        demo.findAllTest();
    }

    /**
     * insert category
     */
    public void insertTest() {
        System.out.println("Nhập id: ");
        int iid = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập name: ");
        String strname = scanner.nextLine();
        super.insertTable("Entity.Category", new Category(iid, strname));
    }

    /**
     * show all category
     */
    public void findAllTest() {
        for (Category category : super.categoryTable
        ) {
            System.out.println(category.getId() + "\t" + category.getName());
        }
    }

    /**
     * update category
     */

    public void updateTest() {
        System.out.println("Nhập id: ");
        int iid = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập name: ");
        String strname = scanner.nextLine();
        super.updateTable("Entity.Category", new Category(iid, strname));
    }

    /**
     * delete category
     */
    public void deleteTest() {
        System.out.println("Nhập id: ");
        int iid = Integer.parseInt(scanner.nextLine());
        /*System.out.println("Nhập name: ");
        String strname = scanner.nextLine();*/
        super.deleteTable("Entity.Category", new Category(iid, ""));
    }

}
