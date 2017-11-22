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
import javax.swing.JOptionPane;
import ppl.koneksi;

/**
 *
 * @author JEE
 */
public class alarm {

    koneksi kon;

    public alarm() throws SQLException {
        kon = new koneksi("ppl", "root", "");
    }

    public void checkAlarm(String bibit) throws SQLException {
        String query = " Select * from penjadwalan where bibit = '" + bibit + "'";
        ResultSet rs = kon.getResult(query);
        String tindakan[] = new String[5];
        int[] time = new int[5];
        while (rs.next()) {
            tindakan[0] = rs.getString("tindakan1");
            tindakan[1] = rs.getString("tindakan2");
            tindakan[2] = rs.getString("tindakan3");
            tindakan[3] = rs.getString("tindakan4");
            tindakan[4] = rs.getString("tindakan5");

            time[0] = Integer.parseInt(rs.getString("timer1"));
            time[1] = Integer.parseInt(rs.getString("timer2"));
            time[2] = Integer.parseInt(rs.getString("timer3"));
            time[3] = Integer.parseInt(rs.getString("timer4"));
            time[4] = Integer.parseInt(rs.getString("timer5"));
        }
//        Thread t = new Thread() {
//            public void run() {
////                int wl = 0;
////                while (wl == 0) {
//                    Calendar c = Calendar.getInstance(Locale.ROOT);
//                    int tgl = c.get(Calendar.DAY_OF_MONTH);
//                    int hours = c.get(Calendar.HOUR);
//                    int minit = c.get(Calendar.MINUTE);
//                    
//                    System.out.println(minit+time[0]);
//                    for (int a = time.length; a < time.length; a++) {
//                        int b = minit+time[a];
//                        System.out.println(b);
//                        if (b == minit) {
//                            JOptionPane.showMessageDialog(null, "Sekarang Jam " + b);
//                            System.out.println("berhasil");
//
//                        }
//                        break;
//                    }
//
////                }
//            }
//        };
//        t.setPriority(Thread.MIN_PRIORITY);
//        t.start();


    }

//    public void setAlarmnya(String bibit) throws SQLException {
//        
//        for(int a=time.length;a>=1;a--){
//            Calendar c = Calendar.getInstance(Locale.ROOT);
//            int minit = c.get(Calendar.MINUTE);
//            System.out.println(minit);
//            checkAlarm(minit+time[a-1]);
//            break;
//        }
//    }
}
