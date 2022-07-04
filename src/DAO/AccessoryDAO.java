package DAO;

import Entity.Accessory;
import Entity.Product;

import java.util.ArrayList;

public class AccessoryDAO extends BaseDAO {
    static Database database = Database.getDataBase();

    /**
     * Find Accessory by id
     *
     * @param id
     * @return
     */
    public Accessory findById(int id) {
        for (Accessory Accessory : database.accessoryTable
        ) {
            if (Accessory.getId() == id) {
                return Accessory;
            }
        }
        return null;
    }

    /**
     * Find Accessory by name
     *
     * @param name
     * @return
     */

    public Accessory findByName(String name) {
        for (Accessory Accessory : database.accessoryTable
        ) {
            if (Accessory.getName().equals(name)) {
                return Accessory;
            }
        }
        return null;
    }

    /**
     * Find array accessory by name
     *
     * @param name
     * @return
     */

    public ArrayList<Accessory> search(String name) {
        ArrayList<Accessory> list = new ArrayList<>();
        for (Accessory Accessory : database.accessoryTable
        ) {
            if (Accessory.getName().equals(name)) {
                list.add(Accessory);
            }
        }
        return list;
    }

}
