/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ppl;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Jee
 */
public class koneksi {

    private Connection koneksi;
    private Statement stm;

    public koneksi(String database, String user, String password) throws SQLException {
        String url = "jdbc:mysql://localhost:3306/" + database;
        koneksi = (Connection) DriverManager.getConnection(url, user, password);
        stm = (Statement) koneksi.createStatement();
    }

    public ResultSet getResult(String sql) throws SQLException {
        ResultSet rs = stm.executeQuery(sql);
        return rs;
      
    }

    public void execute(String sql) throws SQLException {
        this.stm.executeUpdate(sql);
    }
    
}
