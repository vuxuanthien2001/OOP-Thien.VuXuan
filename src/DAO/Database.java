package DAO;

import Entity.Accessory;
import Entity.Category;
import Entity.Product;


import java.util.ArrayList;
import java.util.Scanner;

public class Database {

    public ArrayList<Product> productTable = new ArrayList<>();
    public ArrayList<Category> categoryTable = new ArrayList<>();
    public ArrayList<Accessory> accessoryTable = new ArrayList<>();

    Scanner scanner = new Scanner(System.in);

    // "Viết class Database theo thiết kế. Đặt tên là Database, đặt trong thưc mục dao
    //1. Hàm  insertTable(name,row) sẽ insert object vào array tương ứng theo name
    public int insertTable(String name, Object row) {
        if (name.equals("Entity.Product")) {
            productTable.add((Product) row);
            return 1;
        }
        if (name.equals("Entity.Category")) {
            categoryTable.add((Category) row);
            return 1;
        }
        if (name.equals("Entity.Accessory")) {
            accessoryTable.add((Accessory) row);
            return 1;
        }
        return 0;
    }

    //2. Hàm  selectTable(name, where) trả ra toàn bộ màng theo tên truyền vào
    public ArrayList selectTable(String name, String where) {
        ArrayList list = new ArrayList();
        if (name.equals("Entity.Product")) {
            for (Product product : productTable
            ) {
                if (product.getName().equals(where)) {
                    list.add(product);
                }
            }
        }
        if (name.equals("Entity.Category")) {
            for (Category category : categoryTable
            ) {
                if (category.getName().equals(where)) {
                    list.add(category);
                }
            }
        }

        if (name.equals("Entity.Accessory")) {
            for (Accessory accessory : accessoryTable
            ) {
                if (accessory.getName().equals(where)) {
                    list.add(accessory);
                }
            }
        }

        return list;
    }

    //3. Hàm  updateTable(name,row): tìm row có id trong mảng, update theo row truyền vào
    public int updateTable(String name, Object row) {
        if (name.equals("Entity.Product")) {
            Product product = (Product) row;
            for (int i = 0; i < productTable.size(); i++) {
                if(productTable.get(i).getId() == product.getId()){
                    productTable.set(i, product);
                    return 1;
                }
            }
        }

        if (name.equals("Entity.Category")) {
            Category category = (Category) row;
            for (int i = 0; i < categoryTable.size(); i++) {
                if(categoryTable.get(i).getId() == category.getId()){
                    categoryTable.set(i, category);
                    return 1;
                }
            }
        }

        if (name.equals("Entity.Accessory")) {
            Accessory accessory = (Accessory) row;
            for (int i = 0; i < accessoryTable.size(); i++) {
                if(accessoryTable.get(i).getId() == accessory.getId()){
                    accessoryTable.set(i, accessory);
                    return 1;
                }
            }
        }

        return 0;
    }


    //4. Hàm  deleteTable(name,row): tìm row có id trong mảng, xóa row đó khỏi mảng của DB
    public boolean deleteTable(String name, Object row) {
        if (name.equals("Entity.Product")) {
            Product product = (Product) row;
            for (int i = 0; i < productTable.size(); i++) {
                if (productTable.get(i).getId() == product.getId()) {
                    productTable.remove(i);
                    return true;
                }
            }

        }

        if (name.equals("Entity.Category")) {
            Category category = (Category) row;
            for (int i = 0; i < categoryTable.size(); i++) {
                if (categoryTable.get(i).getId() == category.getId()) {
                    categoryTable.remove(i);
                    return true;
                }
            }

        }

        if (name.equals("Entity.Accessory")) {
            Accessory accessory = (Accessory) row;
            for (int i = 0; i < accessoryTable.size(); i++) {
                if (accessoryTable.get(i).getId() == accessory.getId()) {
                    accessoryTable.remove(i);
                    return true;
                }
            }

        }
        return false;
    }

    //5. Hàm  truncateTable(name): xóa toàn bộ mảng trong DB"
    public void truncateTable(String name) {
        if (name.equals("Entity.Product")) {
            productTable.removeAll(productTable);
        }

        if (name.equals("Entity.Category")) {
            categoryTable.removeAll(categoryTable);
        }

        if (name.equals("Entity.Accessory")) {
            accessoryTable.removeAll(accessoryTable);
        }
    }

    // 7.1. "Trong class Database, viết thêm function updateTableById(integer id, row).
    public void updateTableById(int id, Object row) {
        if (row.getClass().getName().equals("Entity.Product")) {
            for (int i = 0; i < productTable.size(); i++) {
                if (productTable.get(i).getId() == id) {
                    productTable.set(i, (Product) row);
                }
            }
        }

        if (row.getClass().getName().equals("Entity.Category")) {
            for (int i = 0; i < categoryTable.size(); i++) {
                if (categoryTable.get(i).getId() == id) {
                    categoryTable.set(i, (Category) row);
                }
            }
        }

        if (row.getClass().getName().equals("Entity.Accessory")) {
            for (int i = 0; i < accessoryTable.size(); i++) {
                if (accessoryTable.get(i).getId() == id) {
                    accessoryTable.set(i, (Accessory) row);
                }
            }
        }
    }

    public static void main(String[] args) {
        Database database = new Database();
        database.productTable.add(new Product(1, "CPU", 750, 10, 1));
        database.productTable.add(new Product(2, "RAM", 50, 2, 2));
        database.productTable.add(new Product(3, "HDD", 70, 1, 2));
        database.productTable.add(new Product(4, "Main", 400, 3, 1));
        database.productTable.add(new Product(5, "Keyboard", 30, 8, 4));
        database.productTable.add(new Product(6, "Mouse", 25, 50, 4));
        database.productTable.add(new Product(7, "VGA", 60, 35, 3));
        database.productTable.add(new Product(8, "Monitor", 120, 28, 2));
        database.productTable.add(new Product(9, "Case", 120, 28, 5));
        for (Product product : database.productTable
        ) {
            System.out.println(product.getName());
        }
        /*if (database.insertTable("Entity.Product", new Product(10, "Hào", 130, 29, 5)) == 1) {
            System.out.println("Thêm thành công");
        }*/
        //database.insertTable("Entity.Product",new Product(10,"Hào",130,29,5));
      /*  for (Product product : database.productTable
        ) {
            System.out.println(product.getName());
        }*/
        /*ArrayList<Product> list = database.selectTable("Entity.Product", "HDD");
        System.out.println(list.get(0).getId());*/

        //database.updateTable("Entity.Product", new Product(8,"Hào",4,5,6));

        database.deleteTable("Entity.Product", new Product(8,"Hào",4,5,6));

        //database.truncateTable("Entity.Product");

        for (Product product : database.productTable
        ) {
            System.out.println(product.getName());
        }
    }

}
