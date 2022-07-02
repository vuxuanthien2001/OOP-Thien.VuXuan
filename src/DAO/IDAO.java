package DAO;

import Entity.IEnity;

import java.util.ArrayList;

public interface IDAO {
    /**
     * insert row of IDAO
     * @param row
     * @return 1 if successful, 0 if failure
     */
    public int insert(IEnity row);

    /**
     * update row of IDAO
     * @param row
     * @return 1 if successful, 0 if failure
     */
    public int update(IEnity row);

    /**
     * delete row of IDAO
     * @param row
     * @return true if successful, false if failure
     */
    public boolean delete(IEnity row);

    /**
     * findAll Array IEnity row of IDAO
     * @return ArrayList<IEnity>
     */
    public ArrayList<IEnity> findAll();

    /**
     * find by id of IDAO
     * @param id
     * @return IEity
     */
    public IEnity findById(int id);

}
