package DAO;

import Entity.IEnity;

import java.util.ArrayList;

public interface IDAO {

    public int insert(IEnity row);

    public int update(IEnity row);

    public boolean delete(IEnity row);

    public ArrayList<IEnity> findAll();

    public IEnity findById(int id);

}
