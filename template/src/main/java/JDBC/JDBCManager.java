package JDBC;

import interfaces.DBManager;
import pojos.Role;
import pojos.User;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class JDBCManager implements DBManager { //class that impelements the DB manager interface and uses SQL queries to interact with the DB

    private Connection c;

    public JDBCManager() {
        this.c = null;
    }
    @Override
    public void connect() {
        try {
            if (c == null) {
                Class.forName("org.sqlite.JDBC");
                //here we get the connection
                this.c = DriverManager.getConnection("jdbc:sqlite:./db/AnemiaDiagnoseUsers.db");
                c.createStatement().execute("PRAGMA foreign_keys=ON");
                createTables();
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void disconnect() {
        try {
            c.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void createTables() {
        try{
            Statement stmt = c.createStatement();
            String sql = "CREATE TABLE IF NOT EXISTS ROLE " + "(id INTEGER PRIMARY KEY AUTOINCREMENT,"
                    + " type TEXT NOT NULL)";
            stmt.executeUpdate(sql);
            sql = "CREATE TABLE IF NOT EXISTS USER (id INTEGER PRIMARY KEY AUTOINCREMENT, username TEXT NOT NULL,"
                    + " password BLOB NOT NULL, role_id INTEGER REFERENCES ROLE(id) ON UPDATE CASCADE ON DELETE CASCADE)";
            stmt.executeUpdate(sql);
            if (listAllRoles().isEmpty()) {
                Role doctorRole = new Role("Doctor");
                addRole(doctorRole);
            }
            if (listAllUsers().isEmpty()) {
                User admin = new User("admin", User.encryptPassword("admin"), getRole("Doctor"));
                addUser(admin);
            }
            stmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Role> listAllRoles() {
        List<Role> roles = new ArrayList<>();
        try{
            Statement stmt = c.createStatement();
            String sql = "SELECT * FROM ROLE";
            ResultSet rs = stmt.executeQuery(sql);
            while(rs.next()) {
                int id = rs.getInt("id");
                String type = rs.getString("type");
                Role r = new Role(id, type);
                roles.add(r);
            }
            rs.close();
            stmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return roles;
    }

    @Override
    public void addRole(Role r) {
        try {
            String sql = "INSERT INTO ROLE (type) VALUES (?)";
            PreparedStatement prep = c.prepareStatement(sql);
            prep.setString(1, r.getType());
            prep.executeUpdate();
            prep.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Role getRole(String type) {
        Role r = null;
        try {
            String sql = "SELECT * FROM ROLE WHERE type = ?";
            PreparedStatement stmt = c.prepareStatement(sql);
            stmt.setString(1, type);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                int id = rs.getInt("id");
                r = new Role(id, type);
            }
            rs.close();
            stmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return r;
    }

    @Override
    public Role getRole(int id) {
        Role r = null;
        try {
            String sql = "SELECT * FROM ROLE WHERE id = ?";
            PreparedStatement stmt = c.prepareStatement(sql);
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                String type = rs.getString("type");
                r = new Role(id, type);
            }
            rs.close();
            stmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return r;
    }

    @Override
    public void addUser(User u) {
        try {
            String sql = "INSERT INTO USER (username, password, role_id) VALUES (?,?,?)";
            PreparedStatement prep = c.prepareStatement(sql);
            prep.setString(1, u.getUser());
            prep.setBytes(2, u.getPassword());
            Role r = getRole(u.getRole().getType());
            prep.setInt(3, r.getId());
            prep.executeUpdate();
            prep.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public boolean checkUsername(String username) {
        List<User> users = listAllUsers();
        for (User u : users){
            if (u.getUser().equals(username)){
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean checkPassword(String username, String password) {
        try {
            String sql = "SELECT * FROM USER WHERE username = ? AND password = ?";
            PreparedStatement stmt = c.prepareStatement(sql);
            stmt.setString(1, username);
            byte[] hash = User.encryptPassword(password);
            stmt.setBytes(2, hash);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()){
                rs.close();
                stmt.close();
                return true;
            }
            rs.close();
            stmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return false;
    }

    @Override
    public void changePassword(String username, String oldPassword, String newPassword) {
        if(checkPassword(username, oldPassword)){
            try {
                String sql = "UPDATE USER SET password = ? WHEN username = ?";
                PreparedStatement stmt = c.prepareStatement(sql);
                byte[] hash = User.encryptPassword(newPassword);
                stmt.setBytes(1, hash);
                stmt.setString(2, username);
                stmt.executeUpdate();
                stmt.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("Username and/or current password are not correct");
        }
    }

    @Override
    public List<User> listAllUsers() {
        List<User> users = new ArrayList<>();
        try{
            Statement stmt = c.createStatement();
            String sql = "SELECT * FROM USER";
            ResultSet rs = stmt.executeQuery(sql);
            while(rs.next()) {
                int id = rs.getInt("id");
                String user = rs.getString("username");
                byte[] password = rs.getBytes("password");
                int role_id = rs.getInt("role_id");
                Role r = getRole(role_id);
                User u = new User(id, user, password, r);
                users.add(u);
            }
            rs.close();
            stmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return users;
    }

    @Override
    public User getUser(String username) {
        User u = null;
        try {
            String sql = "SELECT * FROM USER WHERE username = ?";
            PreparedStatement stmt = c.prepareStatement(sql);
            stmt.setString(1, username);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                int id = rs.getInt("id");
                byte[] password = rs.getBytes("password");
                int role_id = rs.getInt("role_id");
                Role r = getRole(role_id);
                u = new User(id, username, password, r);
            }
            rs.close();
            stmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return u;
    }


}
