package DAO;

import Entity.*;


import java.util.ArrayList;
import java.util.Scanner;

public class Database {

    protected ArrayList<Product> productTable = new ArrayList<>();
    protected ArrayList<Category> categoryTable = new ArrayList<>();
    protected ArrayList<Accessory> accessoryTable = new ArrayList<>();

    public static String NAME_PRODUCT = "Entity.Product";
    public static String NAME_CATEGORY = "Entity.Category";
    public static String NAME_ACCESSORY = "Entity.Accessory";

    protected static Database instance;


    public static Database getDataBase(){
        if(instance == null){
            instance = new Database();
        }
        return instance;
    }
    /**
     * insert row  array by name
     *
     * @param name
     * @param row
     * @return 1 if successful, 0 if failure
     */
    public int insertTable(String name, BaseRow row) {
        if (name.equals(NAME_PRODUCT)) {
            productTable.add((Product) row);
            return 1;
        }
        if (name.equals(NAME_CATEGORY)) {
            categoryTable.add((Category) row);
            return 1;
        }
        if (name.equals(NAME_ACCESSORY)) {
            accessoryTable.add((Accessory) row);
            return 1;
        }
        return 0;
    }

    /**
     * return array by name
     *
     * @param name
     * @param where
     * @return array if successful, null if failure
     */
    public ArrayList selectTable(String name, String where) {
        if (name.equalsIgnoreCase(NAME_PRODUCT)) {
            return productTable;
        }
        if (name.equalsIgnoreCase(NAME_CATEGORY)) {
            return categoryTable;
        }
        if (name.equalsIgnoreCase(NAME_ACCESSORY)) {
            return accessoryTable;
        }
        return null;
    }

    /**
     * find id on array, update by row
     *
     * @param name
     * @param row
     * @return 1 if successful, 0 if failure
     */
    public int updateTable(String name, BaseRow row) {
        if (name.equals(NAME_PRODUCT)) {
            Product product = (Product) row;
            for (int i = 0; i < productTable.size(); i++) {
                if (productTable.get(i).getId() == product.getId()) {
                    productTable.set(i, product);
                    return 1;
                }
            }
        }

        if (name.equals(NAME_CATEGORY)) {
            Category category = (Category) row;
            for (int i = 0; i < categoryTable.size(); i++) {
                if (categoryTable.get(i).getId() == category.getId()) {
                    categoryTable.set(i, category);
                    return 1;
                }
            }
        }

        if (name.equals(NAME_ACCESSORY)) {
            Accessory accessory = (Accessory) row;
            for (int i = 0; i < accessoryTable.size(); i++) {
                if (accessoryTable.get(i).getId() == accessory.getId()) {
                    accessoryTable.set(i, accessory);
                    return 1;
                }
            }
        }

        return 0;
    }

    /**
     * find row there id on array, delete row
     *
     * @param name
     * @param row
     * @return true if successful, false if failure
     */
    public boolean deleteTable(String name, BaseRow row) {
        if (name.equals(NAME_PRODUCT)) {
            Product product = (Product) row;
            for (int i = 0; i < productTable.size(); i++) {
                if (productTable.get(i).getId() == product.getId()) {
                    productTable.remove(i);
                    return true;
                }
            }

        }

        if (name.equals(NAME_CATEGORY)) {
            Category category = (Category) row;
            for (int i = 0; i < categoryTable.size(); i++) {
                if (categoryTable.get(i).getId() == category.getId()) {
                    categoryTable.remove(i);
                    return true;
                }
            }

        }

        if (name.equals(NAME_ACCESSORY)) {
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

    /**
     * delete all array on DB by name
     *
     * @param name
     */
    public void truncateTable(String name) {
        if (name.equals(NAME_PRODUCT)) {
            productTable.removeAll(productTable);
        }

        if (name.equals(NAME_CATEGORY)) {
            categoryTable.removeAll(categoryTable);
        }

        if (name.equals(NAME_ACCESSORY)) {
            accessoryTable.removeAll(accessoryTable);
        }
    }

    /**
     * update table there id by row
     *
     * @param id
     * @param row
     */
    public void updateTableById(int id, BaseRow row) {
        if (row.getClass().getName().equals(NAME_PRODUCT)) {
            for (int i = 0; i < productTable.size(); i++) {
                if (productTable.get(i).getId() == id) {
                    productTable.set(i, (Product) row);
                }
            }
        }

        if (row.getClass().getName().equals(NAME_CATEGORY)) {
            for (int i = 0; i < categoryTable.size(); i++) {
                if (categoryTable.get(i).getId() == id) {
                    categoryTable.set(i, (Category) row);
                }
            }
        }

        if (row.getClass().getName().equals(NAME_ACCESSORY)) {
            for (int i = 0; i < accessoryTable.size(); i++) {
                if (accessoryTable.get(i).getId() == id) {
                    accessoryTable.set(i, (Accessory) row);
                }
            }
        }
    }
}
