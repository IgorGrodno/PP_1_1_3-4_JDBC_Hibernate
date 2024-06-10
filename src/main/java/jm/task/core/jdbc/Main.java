package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserServiceImpl;
import jm.task.core.jdbc.model.User;


import java.util.List;

public class Main {
    public static void main(String[] args) {
        UserServiceImpl userService = new UserServiceImpl();

        userService.createUsersTable();
        userService.saveUser("name", "lastName", (byte) 1);
        userService.saveUser("name1", "lastName1", (byte) 2);
        userService.saveUser("name2", "lastName2", (byte) 3);
        userService.saveUser("name3", "lastName3", (byte) 4);

        List<User> userList = userService.getAllUsers();
        for (User user : userList) {
            System.out.println(user.toString());
        }


        userService.cleanUsersTable();
        userService.dropUsersTable();
    }
}

