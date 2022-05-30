package repository;

import config.DatabaseConfig;
import users.Order;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

public class OrdersRepository {

    public static void insertOrder(Date received, Date delivered, int pubId, int userId) {
        String insertPersonSql = "INSERT INTO Order(Recieve_date, Deliver_date, pubId, userId) VALUES(?, ?, ?, ?)";

        Connection connection = DatabaseConfig.getDatabaseConnection();

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(insertPersonSql);
            preparedStatement.setString(1, received);
            preparedStatement.setDouble(2, delivered);
            preparedStatement.setDouble(3, pubId);
            preparedStatement.setDouble(3, userId);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void deleteOrder(int orderId) {
        String insertPersonSql = "DELETE FROM Order WHERE idOrder = ?";

        Connection connection = DatabaseConfig.getDatabaseConnection();

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(insertPersonSql);
            preparedStatement.setString(1, orderId);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void updateOrder(int orderId, Date recieved,Date delivered, int idPub, boolean idUser) {
        String insertPersonSql = "UPDATE Order SET Recieve_date = ?, Deliver_date = ?, pubId = ?, userId = ? WHERE orderId = ?";

        Connection connection = DatabaseConfig.getDatabaseConnection();

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(insertPersonSql);
            preparedStatement.setString(1, recieved);
            preparedStatement.setString(2, delivered);
            preparedStatement.setString(3, idPub);
            preparedStatement.setString(4, idUser);
            preparedStatement.setString(5, orderId);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void getOrder(int idOrder) {
        String insertPersonSql = "SELECT * FROM Order where orderId = ?";

        Connection connection = DatabaseConfig.getDatabaseConnection();

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(insertPersonSql);
            preparedStatement.setString(1, idOrder);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
