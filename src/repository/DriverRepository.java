package repository;

import config.DatabaseConfig;
import logistics.Driver;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;

public class DriverRepository {

    public static void insertDriver(String name, int age, String city, int idCar) {
        String insertPersonSql = "INSERT INTO Driver(Name, Age, City, CarId) VALUES(?, ?, ?, ?)";

        Connection connection = DatabaseConfig.getDatabaseConnection();

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(insertPersonSql);
            preparedStatement.setString(1, name);
            preparedStatement.setDouble(2, age);
            preparedStatement.setDouble(3, city);
            preparedStatement.setDouble(3, idCar);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void deleteDriver(int driverId) {
        String insertPersonSql = "DELETE FROM Driver WHERE idDriver = ?";

        Connection connection = DatabaseConfig.getDatabaseConnection();

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(insertPersonSql);
            preparedStatement.setString(1, driverId);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void updateDriver(int driverId, String name, int age, String city, boolean disponibilty) {
        String insertPersonSql = "UPDATE Driver SET Name = ?, Age = ?, City = ?, CarId = ? WHERE idDriver = ?";

        Connection connection = DatabaseConfig.getDatabaseConnection();

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(insertPersonSql);
            preparedStatement.setString(1, name);
            preparedStatement.setString(2, age);
            preparedStatement.setString(3, city);
            preparedStatement.setString(4, disponibilty);
            preparedStatement.setString(5, driverId);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void getDriver(int idDriver) {
        String insertPersonSql = "SELECT * FROM Driver where idDriver = ?";

        Connection connection = DatabaseConfig.getDatabaseConnection();

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(insertPersonSql);
            preparedStatement.setString(1, idDriver);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
