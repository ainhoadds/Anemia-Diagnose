package pojos;

public class Role {
    private int id;
    private String type;

    public Role(int id, String type) {
        this.id = id;
        this.type = type;
    }

    public Role(String type) {
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Role{" +
                "id=" + id +
                ", type='" + type + '\'' +
                '}';
    }
}
