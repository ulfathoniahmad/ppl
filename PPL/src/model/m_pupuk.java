/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.ResultSet;
import java.sql.SQLException;
import ppl.koneksi;
import view.pupuk;

/**
 *
 * @author JEE
 */
public class m_pupuk {

    koneksi kon;
    String query;
//    String nama;
    pupuk view;

    public m_pupuk() throws SQLException {
        kon = new koneksi("ppl", "root", "");
        view = new pupuk();

    }

    public String analisa(String namabuah, String umur) throws SQLException {
        String hasil = null;
        try {
            query = "SELECT hasil FROM npk WHERE namabuah='"
                    + namabuah + "' AND umur='" + umur + "'";
            ResultSet rs = kon.getResult(query);
            while (rs.next()) {
                hasil = rs.getString("hasil");

            }

        } catch (SQLException e) {
            System.out.println(e);
        }
        return hasil;
    }


}
