package DAO;

import Entity.Product;

public class ProductDAO {
    static Database database = new Database();

    public static void main(String[] args) {

    }

    public int insert(Product product){
        if(database.insertTable("Entity.Prodcut", product) == 1){
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
}
