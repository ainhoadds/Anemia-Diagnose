package ui;

import Pojos.User;
import JDBC.JDBCManager;

public class LogInMenu {
    private static User user;

    public static void main(String[] args) {

        JDBCManager manager = new JDBCManager();
        manager.connect();

        while (true) {
            Utilities.LogInMenu();
            int option = Utilities.readInteger("Choose an option: ");
            switch (option) {
                case 1: {
                    user = logIn(manager);
                    if (user != null) {
                        MainMenu.menu();
                    }
                    break;
                }
                case 2: {
                    user = register(manager);
                    if (user != null) {
                        MainMenu.menu();

                    }
                    break;
                }
                case 0: {
                    System.out.println("Exiting...");
                    manager.disconnect();
                    System.exit(0);
                }
                default: {
                    System.out.println(" ERROR: Invalid option.");
                    break;
                }
            }
        }
    }
    public static User logIn(JDBCManager manager) {
        String username = Utilities.readString("Username: ");
        String password = Utilities.readString("Password: ");
        if (manager.checkUsername(username) && manager.checkPassword(username, password)) {
            System.out.println("Log in successful");
            return manager.getUser(username);
        } else {
            System.out.println("Log in failed");
            return null;
        }
    }

    public static User register(JDBCManager manager) {
        String username = Utilities.readString("Username: ");
        String password = Utilities.readString("Password: ");
        if (manager.checkUsername(username)) {
            System.out.println("Username already exists");
            return null;
        } else {
            User u = new User(username, User.encryptPassword(password), manager.getRole("Doctor"));
            manager.addUser(u);
            System.out.println("User registered");
            u = manager.getUser(username);
            return u;
        }
    }
}


