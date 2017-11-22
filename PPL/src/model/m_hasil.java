/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.ResultSet;
import java.sql.SQLException;
import ppl.koneksi;
import view.isidata;

/**
 *
 * @author JEE
 */
public class m_hasil {

    koneksi kon;
    String query;
//    String nama;
    isidata view;

    public m_hasil() throws SQLException {
        kon = new koneksi("ppl", "root", "");
        view = new isidata();

    }

    public String analisa(String strukturTanah, String luasTanah, String jenisTanah, String jumlahPohon, String kadarAir,
            String jumlahPH) throws SQLException {
        String hasil = null;
        try {
            query = "SELECT hasil FROM analisa WHERE strukturTanah='"
                    + strukturTanah + "' AND luasTanah='" + luasTanah + "'AND jenisTanah='" + jenisTanah + ""
                    + "'AND jumlahPohon='" + jumlahPohon + "'AND kadarAir='" + kadarAir + "'AND jumlahPH='" + jumlahPH + "'";
            ResultSet rs = kon.getResult(query);
            while (rs.next()) {
                hasil = rs.getString("hasil");

            }

        } catch (SQLException e) {
            System.out.println(e);
        }
        return hasil;
    }

//    public void cbx() throws SQLException {
//        query = "SELECT strukturTanah FROM analisa ";
//        ResultSet rs = kon.getResult(query);
//        if (rs.next()) {
//            view.getCombo().addItem(rs.getString("strukturTanah"));
////            System.out.println(name);
//            
//        }
//
//    }

}
