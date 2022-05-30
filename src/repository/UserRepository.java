package repository;

import config.DatabaseConfig;
import users.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;

public class UserRepository {

    public static void insertUser(String firstN, String lastN, String city, List<String> addresses) {
        String insertPersonSql = "INSERT INTO User(FirstName, LastName, City, Addresses) VALUES(?, ?, ?, ?)";

        Connection connection = DatabaseConfig.getDatabaseConnection();

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(insertPersonSql);
            preparedStatement.setString(1, firstN);
            preparedStatement.setDouble(2, lastN);
            preparedStatement.setDouble(3, city);
            preparedStatement.setDouble(3, addresses);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void deleteUser(int userId) {
        String insertPersonSql = "DELETE FROM User WHERE idUser = ?";

        Connection connection = DatabaseConfig.getDatabaseConnection();

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(insertPersonSql);
            preparedStatement.setString(1, userId);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void updateUser(int userId, String firstN, String firstN, String city, List<String> addresses) {
        String insertPersonSql = "UPDATE User SET FirstName = ?, LastName = ?, City = ?, Addresses = ? WHERE idUser = ?";

        Connection connection = DatabaseConfig.getDatabaseConnection();

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(insertPersonSql);
            preparedStatement.setString(1, firstN);
            preparedStatement.setString(2, firstN);
            preparedStatement.setString(3, city);
            preparedStatement.setString(4, addresses);
            preparedStatement.setString(5, userId);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void getUser(int idUser) {
        String insertPersonSql = "SELECT * FROM User where idUser = ?";

        Connection connection = DatabaseConfig.getDatabaseConnection();

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(insertPersonSql);
            preparedStatement.setString(1, idUser);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
