/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.ResultSet;
import java.sql.SQLException;
import ppl.koneksi;

/**
 *
 * @author JEE
 */
public class m_penyakit {
    koneksi kon;
    
    public m_penyakit() throws SQLException {
        kon = new koneksi("ppl", "root", "");
    }
    
    public String penyakit(String jenisPohon, String kondisiPohon, String kondisiDaun, String kondisiBuah) throws SQLException {
        String hasil = null;
        try {
            String query = "SELECT hasil FROM penyakit WHERE jenisPohon='"
                    + jenisPohon + "' AND kondisiPohon='" + kondisiPohon + "'AND kondisiDaun='" + kondisiDaun + ""
                    + "'AND kondisiBuah='" + kondisiBuah +"'";
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
