package DAO;

import Entity.Product;

import java.util.ArrayList;

public class ProductDAO extends BaseDAO {
    static Database database = Database.getDataBase();
    public static String NAME_PRODUCT = "Entity.Product";

    /**
     * find product by id
     *
     * @param id
     * @return
     */
    public Product findById(int id) {
        ArrayList<Product> list = database.selectTable(NAME_PRODUCT,"");
        for (Product product : list
        ) {
            if (product.getId() == id) {
                return product;
            }
        }
        return null;
    }


    /**
     * find product by name
     *
     * @param name
     * @return
     */
    public Product findByName(String name) {
        ArrayList<Product> list = database.selectTable(NAME_PRODUCT,"");
        for (Product product : list
        ) {
            if (product.getName().equals(name)) {
                return product;
            }
        }
        return null;
    }

    /**
     * find array product by name
     *
     * @param name
     * @return
     */
    public ArrayList<Product> search(String name) {
        ArrayList<Product> list = database.selectTable(NAME_PRODUCT,"");
        for (Product product : list
        ) {
            if (product.getName().equals(name)) {
                list.add(product);
            }
        }
        return list;
    }
}
