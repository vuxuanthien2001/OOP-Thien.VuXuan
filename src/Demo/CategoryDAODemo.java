package Demo;

import DAO.Database;
import Entity.Category;

import java.util.ArrayList;
import java.util.Scanner;

public class CategoryDAODemo extends Database {
    Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        CategoryDAODemo demo = new CategoryDAODemo();
    }

    public void insertTest(){
        System.out.println("Nhập id: ");
        int iid = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập name: ");
        String strname = scanner.nextLine();
        super.insertTable("Entity.Category",new Category(iid, strname));
    }

    public void findAllTest(){
        for (Category category: super.categoryTable
             ) {
            System.out.println(category.getId()+ "\t" + category.getName());
        }
    }

    public void updateTest(){
        System.out.println("Nhập id: ");
        int iid = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập name: ");
        String strname = scanner.nextLine();
        super.updateTable("Entity.Category",new Category(iid, strname));
    }

    public void deleteTest(){
        System.out.println("Nhập id: ");
        int iid = Integer.parseInt(scanner.nextLine());
        /*System.out.println("Nhập name: ");
        String strname = scanner.nextLine();*/
        super.deleteTable("Entity.Category", new Category(iid,""));
    }

}
