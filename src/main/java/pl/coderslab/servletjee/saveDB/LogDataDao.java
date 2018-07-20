package pl.coderslab.servletjee.saveDB;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

import java.sql.ResultSet;
import java.sql.SQLException;


public class LogDataDao {

    public void saveToDB(Connection conn) throws SQLException {

        String sql = "INSERT INTO log (data) values (?)";

        try (PreparedStatement preparedStatement = conn.prepareStatement(sql)){


        String generatedColumns[] = {"ID"};
        PreparedStatement preparedStatement = conn.prepareStatement(sql, generatedColumns)
        preparedStatement = conn.prepareStatement(sql, generatedColumns);
        preparedStatement.setString(1, this.username);
        preparedStatement.setString(2, this.email);
        preparedStatement.setString(3, this.password);
        preparedStatement.executeUpdate();
        ResultSet rs = preparedStatement.getGeneratedKeys();
    }


}
