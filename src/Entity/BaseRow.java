package Entity;

public abstract class BaseRow {
    private int id;
    private String name;

    /**
     * create constructor BaseRow
     */
    public BaseRow() {
    }

    /**
     * create constructor (id, name)
     *
     * @param id
     * @param name
     */
    public BaseRow(int id, String name) {
        this.id = id;
        this.name = name;
    }

    /**
     * get id of BaseRow
     *
     * @return id
     */
    public int getId() {
        return id;
    }

    /**
     * set id of BaseRow
     *
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * get name of BaseRow
     *
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * set name of BaseRow
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }
}
