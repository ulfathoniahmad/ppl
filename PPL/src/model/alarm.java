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
import java.util.TimerTask;
import java.util.Timer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import ppl.koneksi;

/**
 *
 * @author JEE
 */
public class alarm {

    koneksi kon;
    TimerTask task;

    public alarm() throws SQLException {
        kon = new koneksi("ppl", "root", "");
    }

    public TimerTask checkAlarm(String bibit) throws SQLException {
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

            task = new TimerTask() {
                int detik;
                int a = 0;
                int hari = 0;

                public void run() {
                    while (a <= 4) {
                        System.out.print(a + ".   ");
                        detik = time[a];
                       
                        System.out.println(" time =" + detik);
                        while (detik > 0) {
                            detik--;
                            try {
                                Thread.sleep(3*1000);
                            } catch (InterruptedException ex) {
                                Logger.getLogger(alarm.class.getName()).log(Level.SEVERE, null, ex);
                            }
                            System.out.println(detik);
                            if (detik == 0) {
                                System.out.println("======");
                                System.out.println("Tindakan :"+ tindakan[a]);
                                JOptionPane.showMessageDialog(null, "Sudah "+time[a]+"hari, waktunya anda melakukan"+tindakan[a]);
                            }
                        }
                        a++;
                        if (a == 5) {
                            System.out.println("SELESAI");
                        }
                    }
                }
            };
        }
//        Thread t = new Thread() {
//            Calendar c = Calendar.getInstance(Locale.ROOT);
//            int tgl = c.get(Calendar.DAY_OF_MONTH);
//            int hours = c.get(Calendar.HOUR);
//            int minit = c.get(Calendar.MINUTE);
//            int a = 0;
//
//            public void run() {
////                int wl = 0;
////                while (wl == 0) {
//
//                while (a < 5) {
////                    int b = minit + time[a];
////                    System.out.println("menit " + b + ":" + tindakan[a]);
//                    System.out.println("error");
//                    if (minit == (minit + time[a])) {
//                        JOptionPane.showMessageDialog(null, "Sekarang Jam " + (minit + time[a]));
//                        System.out.println("berhasil");
//                        System.out.println(tindakan[a]);
//
//                    }
//                    a++;
//
//                }
//            }
//        };
//        t.setPriority(Thread.MIN_PRIORITY);
//        t.start();

        return task;
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
