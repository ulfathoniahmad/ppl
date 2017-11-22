///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package contoroler;
//
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import java.sql.SQLException;
//import java.util.logging.Level;
//import java.util.logging.Logger;
//import model.m_hasil;
//import view.hasil;
//import view.isidata;
//
///**
// *
// * @author JEE
// */
//public class c_hasil {
//
//    hasil view;
//    isidata views;
//    m_hasil model;
//
//    public c_hasil() throws SQLException {
//        view = new hasil();
//        views = new isidata();
//        model = new m_hasil();
//        view.getKembali().addActionListener(new klikKembali());
//        view.setVisible(true);
////        try {
//            String strukturTanah = views.getstrukturTanah().getText().toLowerCase();
//            String luasTanah = views.getluasTanah().getText().toLowerCase();
//            String jenisTanah = views.getjenisTanah().getText().toLowerCase();
//            String jumlahPohon = views.getjumlahPohon().getText().toLowerCase();
//            String kadarAir = views.getkadarAir().getText().toLowerCase();
//            String jumlahPH = views.getjumlahPH().getText().toLowerCase();
            
//            
//            model.analisa(strukturTanah, luasTanah, jenisTanah, jumlahPohon, kadarAir, jumlahPH);
//            view.getHasil().setText(model.analisa(strukturTanah, luasTanah, jenisTanah, jumlahPohon, kadarAir, jumlahPH));
//        } catch (SQLException ex) {
//            Logger.getLogger(c_hasil.class.getName()).log(Level.SEVERE, null, ex);
//
//        }
//
//    }

//    private class klikKembali implements ActionListener {
//
//        @Override
//        public void actionPerformed(ActionEvent e) {
//            try {
//                new c_home();
//                view.dispose();
//
//            } catch (SQLException ex) {
//                Logger.getLogger(c_home.class.getName()).log(Level.SEVERE, null, ex);
//            }
//        }
//    }

//}
