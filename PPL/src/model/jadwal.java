/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.Locale;
import ppl.koneksi;

/**
 *
 * @author JEE
 */
public class jadwal {

    koneksi kon;

    public jadwal() throws SQLException {
        kon = new koneksi("ppl", "root", "");
    }

    public void penjadwal() throws SQLException {
        String query = " Select * from penjadwalan where bibit = jeruk";
        ResultSet rs = kon.getResult(query);
        String tindakan[] = new String[5];
        int[] time = new int[5];
        while (rs.next()) {
            tindakan[0] = rs.getString("tindakan1");
            tindakan[1] = rs.getString("tindakan2");
            tindakan[2] = rs.getString("tindakan3");
            tindakan[3] = rs.getString("tindakan4");
            tindakan[4] = rs.getString("tindakan5");

            time[0] = Integer.parseInt("timer1");
            time[1] = Integer.parseInt("timer2");
            time[2] = Integer.parseInt("timer3");
            time[3] = Integer.parseInt("timer4");
            time[4] = Integer.parseInt("timer5");
        }
        Calendar c = Calendar.getInstance(Locale.ROOT);
        int tgl = c.get(Calendar.DAY_OF_MONTH);
        int hours = c.get(Calendar.HOUR);
        int minit = c.get(Calendar.MINUTE);
    }

}
