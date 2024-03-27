package Pojos;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class User {
    private int id;
    private String user;
    private byte[] password;

    private Role role;

    public User(int id, String user, byte[] password, Role role) {
        this.id = id;
        this.user = user;
        this.password = password;
        this.role = role;
    }

    public User(String user, byte[] password, Role role) {
        this.user = user;
        this.password = password;
        this.role = role;
    }

    public String getUser() {
        return user;
    }

    public byte[] getPassword() {
        return password;
    }

    public Role getRole() {
        return role;
    }

    public static byte[] encryptPassword(String password) {
        byte[] hash = null;
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(password.getBytes());
            hash = md.digest();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return hash;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", user='" + user + '\'' +
                ", role=" + role.toString() +
                '}';
    }
}
