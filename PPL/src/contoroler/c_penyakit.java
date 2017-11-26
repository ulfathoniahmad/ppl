///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package contoroler;
//
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import java.awt.event.MouseEvent;
//import java.awt.event.MouseListener;
//import java.sql.SQLException;
//import java.util.logging.Level;
//import java.util.logging.Logger;
//import javax.swing.ImageIcon;
//import javax.swing.JOptionPane;
//import model.m_penyakit;
//import view.hasil;
//import view.isiPenyakit;
//
///**
// *
// * @author JEE
// */
//public class c_penyakit {
//
//    hasil views;
//    isiPenyakit view;
//    m_penyakit model;
//
//    public c_penyakit() throws SQLException {
//        view = new isiPenyakit();
//        views = new hasil();
//        model = new m_penyakit();
//        view.getAnalisa().addMouseListener((MouseListener) new klikAnalisa());
//        view.setVisible(true);
//        view.getKembali().addMouseListener((MouseListener) new klikKembali());
//        views.getHome().addActionListener(new klikHome());
//    }
//
//    private class klikHome implements ActionListener {
//
//        @Override
//        public void actionPerformed(ActionEvent e) {
//            try {
//                new c_home();
//                views.dispose();
//
//            } catch (SQLException ex) {
//                Logger.getLogger(c_home.class.getName()).log(Level.SEVERE, null, ex);
//            }
//        }
//    }
//
//    private class klikKembali implements MouseListener {
//
//        @Override
//        public void mouseClicked(MouseEvent e) {
//            try {
//                new c_home();
//                view.dispose();
//
//            } catch (SQLException ex) {
//                Logger.getLogger(c_home.class.getName()).log(Level.SEVERE, null, ex);
//            }
//        }
//
//        @Override
//        public void mouseReleased(MouseEvent e) {
//            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//        }
//
//        @Override
//        public void mouseEntered(MouseEvent e) {
//            ImageIcon II = new ImageIcon(getClass().getResource("/gambar/back2.png"));
//            view.getKembali().setIcon(II);
//        }
//
//        @Override
//        public void mouseExited(MouseEvent e) {
//            ImageIcon II = new ImageIcon(getClass().getResource("/gambar/back.png"));
//            view.getKembali().setIcon(II);
//        }
//
//        @Override
//        public void mousePressed(MouseEvent e) {
//            try {
//                new c_home();
//                view.dispose();
//
//            } catch (SQLException ex) {
//                Logger.getLogger(c_home.class.getName()).log(Level.SEVERE, null, ex);
//            }
//        }
//
//    }
//
//    private class klikAnalisa implements MouseListener {
//
//        @Override
//        public void mouseClicked(MouseEvent e) {
//            String jenisPohon = (String) view.getjenisPohon().getSelectedItem();
//            String kondisiPohon = (String) view.getkondisiPohon().getSelectedItem();
//            String kondisiDaun = (String) view.getkondisiDaun().getSelectedItem();
//            String kondisiBuah = (String) view.getkondisiBuah().getSelectedItem();
//
//            try {
//                if (jenisPohon.equals("") || kondisiPohon.equals("") || kondisiDaun.equals("") || kondisiBuah.equals("")) {
//                    JOptionPane.showMessageDialog(view, "data tidak boleh ada yang kosong");
//                    view.setVisible(true);
//                } else {
//                    model.penyakit(jenisPohon, kondisiPohon, kondisiDaun, kondisiBuah);
//                    views.getHasil().setText(model.penyakit(jenisPohon, kondisiPohon, kondisiDaun, kondisiBuah));
//                    if (views.getHasil().getText().equals("")) {
//                        JOptionPane.showMessageDialog(view, "Data Masih belum Ada");
//                    } else {
//                        view.dispose();
//                        views.setVisible(true);
//                    }
//                }
//            } catch (SQLException ex) {
//                Logger.getLogger(c_penyakit.class.getName()).log(Level.SEVERE, null, ex);
//
//            }
//
//        }
//
//        @Override
//        public void mouseReleased(MouseEvent e) {
//            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//        }
//
//        @Override
//        public void mouseEntered(MouseEvent e) {
//            ImageIcon II = new ImageIcon(getClass().getResource("/gambar/anal.png"));
//            view.getAnalisa().setIcon(II);
//        }
//
//        @Override
//        public void mouseExited(MouseEvent e) {
//            ImageIcon II = new ImageIcon(getClass().getResource("/gambar/anal1.png"));
//            view.getAnalisa().setIcon(II);
//        }
//
//        @Override
//        public void mousePressed(MouseEvent e) {
//            String jenisPohon = (String) view.getjenisPohon().getSelectedItem();
//            String kondisiPohon = (String) view.getkondisiPohon().getSelectedItem();
//            String kondisiDaun = (String) view.getkondisiDaun().getSelectedItem();
//            String kondisiBuah = (String) view.getkondisiBuah().getSelectedItem();
//
//            try {
//                if (jenisPohon.equals("") || kondisiPohon.equals("") || kondisiDaun.equals("") || kondisiBuah.equals("")) {
//                    JOptionPane.showMessageDialog(view, "data tidak boleh ada yang kosong");
//                    view.setVisible(true);
//                } else {
//                    model.penyakit(jenisPohon, kondisiPohon, kondisiDaun, kondisiBuah);
//                    views.getHasil().setText(model.penyakit(jenisPohon, kondisiPohon, kondisiDaun, kondisiBuah));
//                    if (views.getHasil().getText().equals("")) {
//                        JOptionPane.showMessageDialog(view, "Data Masih belum Ada");
//                    } else {
//                        view.dispose();
//                        views.setVisible(true);
//                    }
//                }
//            } catch (SQLException ex) {
//                Logger.getLogger(c_penyakit.class.getName()).log(Level.SEVERE, null, ex);
//
//            }
//
//        }
//
//    }
//}
