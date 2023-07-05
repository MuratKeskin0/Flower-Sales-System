/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Databases;

/**
 *
 * @author murat
 */
import Classes.Flower;
import java.sql.*;
import java.util.ArrayList;

public class FlowerDatabaseManager {

    private static String connectionString = "jdbc:mysql://localhost:3306/flower_system_db?user=root&password=root";
    private static Connection conn;

    public FlowerDatabaseManager(Connection conn) {
        this.conn = conn;
    }

    public static boolean createFlower(Flower flower) {
        String sql = "INSERT INTO flowers (nameflowers, priceflowers, stockflowers) VALUES (?, ?, ?)";
        boolean isSuccessful = false;

        try ( Connection connection = DriverManager.getConnection(connectionString);  PreparedStatement statement = connection.prepareStatement(sql)) {

            statement.setString(1, flower.getName());
            statement.setDouble(2, flower.getPrice());
            statement.setInt(3, flower.getStock());
            int affectedRows = statement.executeUpdate();

            if (affectedRows > 0) {
                isSuccessful = true;
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return isSuccessful;
    }

    public static ArrayList<Flower> getFlowers() {
        ArrayList<Flower> flowers = new ArrayList<>();
        String sql = "SELECT * FROM flowers";

        try ( Connection connection = DriverManager.getConnection(connectionString);  PreparedStatement statement = connection.prepareStatement(sql)) {

            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                String id = resultSet.getString("idflowers");
                String name = resultSet.getString("nameflowers");
                double price = resultSet.getDouble("priceflowers");
                int stock = resultSet.getInt("stockflowers");

                Flower flower = new Flower(id, name, price, stock);
                flowers.add(flower);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return flowers;
    }

    public static Flower getFlower(int flowerId) {
        Flower flower = null;
        String sql = "SELECT * FROM flowers WHERE idflowers = ?";

        try ( Connection connection = DriverManager.getConnection(connectionString);  PreparedStatement statement = connection.prepareStatement(sql)) {

            statement.setInt(1, flowerId);
            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) {
                String id = resultSet.getString("idflowers");
                String name = resultSet.getString("nameflowers");
                double price = resultSet.getDouble("priceflowers");
                int stock = resultSet.getInt("stockflowers");

                flower = new Flower(id, name, price, stock);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return flower;
    }

    public static boolean updateFlowerStock(int flowerId, int newStock) {
        String sql = "UPDATE flowers SET stockflowers = ? WHERE idflowers = ?";
        boolean isSuccessful = false;

        try ( Connection connection = DriverManager.getConnection(connectionString);  PreparedStatement statement = connection.prepareStatement(sql)) {

            statement.setInt(1, newStock);
            statement.setInt(2, flowerId);
            int affectedRows = statement.executeUpdate();

            if (affectedRows > 0) {
                isSuccessful = true;
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return isSuccessful;
    }

    public static boolean updateFlowerStockbyName(String flowerName, int additionalStock) {
        String sql = "UPDATE flowers SET stockflowers = stockflowers + ? WHERE nameflowers = ?";
        boolean isSuccessful = false;

        try ( Connection connection = DriverManager.getConnection(connectionString);  PreparedStatement statement = connection.prepareStatement(sql)) {

            statement.setInt(1, additionalStock);
            statement.setString(2, flowerName);
            int affectedRows = statement.executeUpdate();

            if (affectedRows > 0) {
                isSuccessful = true;
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return isSuccessful;
    }

    public static boolean deleteFlower(int id) {
        String sql = "DELETE FROM flowers WHERE idflowers = ?";

        try ( Connection connection = DriverManager.getConnection(connectionString);  PreparedStatement statement = connection.prepareStatement(sql)) {

            statement.setInt(1, id);
            int rowsAffected = statement.executeUpdate();
            return rowsAffected > 0;

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public static int getFlowerStock(int flowerId) {
        int stock = 0;
        String sql = "SELECT stockflowers FROM flowers WHERE idflowers = ?";

        try ( Connection connection = DriverManager.getConnection(connectionString);  PreparedStatement statement = connection.prepareStatement(sql)) {

            statement.setInt(1, flowerId);
            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) {
                stock = resultSet.getInt("stockflowers");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return stock;
    }

    public static int getFlowerIdByName(String flowerName) {
        int flowerId = 0;

        try ( Connection connection = DriverManager.getConnection(connectionString)) {
            String query = "SELECT idflowers FROM flowers WHERE nameflowers = ?";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1, flowerName);
            ResultSet rs = statement.executeQuery();

            if (rs.next()) {
                flowerId = rs.getInt("idflowers");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return flowerId;
    }

    public static boolean increaseFlowerStock(int flowerId, int stockIncrement) {
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        try {

            if (conn == null || conn.isClosed()) {
                conn = DriverManager.getConnection(connectionString);
            }

            String selectQuery = "SELECT stockflowers FROM flowers WHERE idflowers = ?";

            preparedStatement = conn.prepareStatement(selectQuery);

            preparedStatement.setInt(1, flowerId);

            resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                int currentStock = resultSet.getInt("stockflowers");
                int newStock = currentStock + stockIncrement;

                return updateFlowerStock(flowerId, newStock);
            } else {
                return false;
            }

        } catch (SQLException e) {

            e.printStackTrace();
            return false;
        } finally {

            try {
                if (resultSet != null) {
                    resultSet.close();
                }
                if (preparedStatement != null) {
                    preparedStatement.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public static boolean decreaseFlowerStock(int flowerId, int stockDecrement) {
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        try {
            if (conn == null || conn.isClosed()) {
                conn = DriverManager.getConnection(connectionString);
            }

            String selectQuery = "SELECT stockflowers FROM flowers WHERE idflowers = ?";

            preparedStatement = conn.prepareStatement(selectQuery);

            preparedStatement.setInt(1, flowerId);

            resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                int currentStock = resultSet.getInt("stockflowers");
                int newStock = currentStock - stockDecrement;

                if (newStock < 0) {
                    return false;
                }

                return updateFlowerStock(flowerId, newStock);
            } else {
                return false;
            }

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        } finally {
            try {
                if (resultSet != null) {
                    resultSet.close();
                }
                if (preparedStatement != null) {
                    preparedStatement.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public static boolean updateFlowerPrice(int flowerId, double newPrice) {
        String sql = "UPDATE flowers SET priceflowers = ? WHERE idflowers = ?";
        boolean isSuccessful = false;

        try ( Connection connection = DriverManager.getConnection(connectionString);  PreparedStatement statement = connection.prepareStatement(sql)) {

            statement.setDouble(1, newPrice);
            statement.setInt(2, flowerId);
            int affectedRows = statement.executeUpdate();

            if (affectedRows > 0) {
                isSuccessful = true;
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return isSuccessful;
    }

}
