package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
    public static void main(String[] args) {

        final UserService userService = new UserServiceImpl();

        userService.createUsersTable();
        userService.saveUser("Yuliya","Globina",(byte) 28);
        userService.saveUser("Vadim","Erzunov",(byte) 31);
        userService.saveUser("Ivav","Demidov",(byte) 21);
        userService.saveUser("Olga","Avdeeva",(byte) 26);
        userService.getAllUsers().forEach(System.out::println);
        userService.cleanUsersTable();
        userService.dropUsersTable();
    }
}