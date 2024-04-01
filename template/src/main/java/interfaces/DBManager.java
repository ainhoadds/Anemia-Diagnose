package interfaces;

import pojos.Role;
import pojos.User;

import java.util.List;

public interface DBManager { //this interface proporcionates methods to interact with the DB that manages roles and users operations
    public void connect();

    public void disconnect();

    public void createTables();

    public List<Role> listAllRoles();

    public void addRole(Role r);

    public Role getRole(String type);

    public Role getRole(int id);

    public void addUser(User u);

    public boolean checkUsername(String username);

    public boolean checkPassword(String username, String password);

    public void changePassword(String username, String oldPassword, String newPassword);

    public List<User> listAllUsers();

    public User getUser(String username);
}
