package DAO;

import Entity.Product;

import java.util.ArrayList;

public class ProductDAO extends BaseDAO {
    static Database database = new Database();

    public static void main(String[] args) {
        ProductDAO dao = new ProductDAO();
        /*dao.insert(new Product(1,"a",2,3,4));
        ArrayList<Product> list = dao.findAll();
        for (Product product: list
             ) {
            System.out.println(product.getName());
        }*/

    }

    /*public int insert(Product product){
        if(database.insertTable("Entity.Product", product) == 1){
            return 1;
        }
        return 0;
    }

    public int update(Product product){
        if(database.updateTable("Entity.Product", product) == 1){
            return 1;
        }
        return 0;
    }

    public boolean delete(Product product){
        if(database.deleteTable("Entity.Product", product) == true){
            return true;
        }
        return false;
    }

    public ArrayList<Product> findAll(){
        ArrayList<Product> listProduct = new ArrayList<>();
        for (Product product: database.productTable
        ) {
            listProduct.add(product);
        }
        return listProduct;
    }
*/

    /**
     * find product by id
     * @param id
     * @return
     */
    public Product findById(int id){
        for (Product product: database.productTable
        ) {
            if(product.getId() == id){
                return product;
            }
        }
        return null;
    }


    /**
     * find product by name
     * @param name
     * @return
     */
    public  Product findByName(String name){
        for (Product product: database.productTable
             ) {
            if(product.getName().equals(name)){
                return product;
            }
        }
        return null;
    }

    /**
     * find array product by name
     * @param name
     * @return
     */

    public  ArrayList<Product> search(String name){
        ArrayList<Product> list = new ArrayList<>();
        for (Product product: database.productTable
             ) {
            if(product.getName().equals(name)){
                list.add(product);
            }
        }
        return list;
    }
}
