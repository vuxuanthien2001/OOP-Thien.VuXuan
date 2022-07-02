package DAO;

import Entity.BaseRow;

import java.util.ArrayList;

public abstract class BaseDAO {
    Database database = Database.getDataBase();

    /**
     * insert row of BaseDao
     *
     * @param row
     * @return 1 if successful, 0 if failure
     */
    public int insert(BaseRow row) {
        if (row != null) {
            database.insertTable(row.getClass().getName(), row);
            return 1;
        }
        return 0;
    }

    /**
     * update row of BaseDAO
     *
     * @param row
     * @return 1 if successful, 0 if failure
     */
    public int update(BaseRow row) {
        if (row != null) {
            database.updateTable(row.getClass().getName(), row);
            return 1;
        }
        return 0;
    }


    /**
     * delete row of BaseDAO
     *
     * @param row
     * @return true if successful, false if failure
     */
    public boolean delete(BaseRow row) {
        if (row != null) {
            database.deleteTable(row.getClass().getName(), row);
            return true;
        }
        return false;
    }

    /**
     * Find all by name of BaseDAO
     *
     * @param name
     * @return
     */
    public ArrayList<BaseRow> findAll(String name) {
        return database.selectTable(name, "");
    }

}
