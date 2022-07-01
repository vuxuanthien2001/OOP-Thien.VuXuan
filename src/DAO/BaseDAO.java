package DAO;

import java.util.ArrayList;

public abstract class BaseDAO {
    Database database = new Database();

    /**
     * insert
     * @param row
     * @return
     */
    public int insert(BaseDAO row) {
        if(row != null){
            database.insertTable(row.getClass().getName(), row);
            return 1;
        }
        return 0;
    }

    /**
     * update
     * @param row
     * @return
     */
    public int update(BaseDAO row){
        if(row != null){
            database.updateTable(row.getClass().getName(), row);
            return 1;
        }
       return 0;
    }


    /**
     * delete
     * @param row
     * @return
     */
    public boolean delete(BaseDAO row){
        if(row != null){
            database.deleteTable(row.getClass().getName(), row);
            return true;
        }
        return false;
    }

    /**
     * Find all
     * @param name
     * @return
     */

    public ArrayList<BaseDAO> findAll(String name){
        return database.selectTable(name,"");
    }

}
