/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contoroler;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import model.m_penyakit;
import view.isiPenyakit;
import view.penyakitJeruk;
import view.pilihTanaman;

/**
 *
 * @author JEE
 */
public class c_penyakitJeruk {

    penyakitJeruk view;

    public c_penyakitJeruk() throws SQLException {
        view = new penyakitJeruk();

        view.getCVPD().addMouseListener((MouseListener) new klikCVPD());
        view.setVisible(true);
        view.getKembali().addMouseListener((MouseListener) new klikKembali());
        view.getTristeza().addMouseListener((MouseListener) new klikTristeza());

    }

    private class klikKembali implements MouseListener {

        @Override
        public void mouseClicked(MouseEvent e) {
            try {
                new c_pilihTanaman();
                view.dispose();

            } catch (SQLException ex) {
                Logger.getLogger(c_home.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        @Override
        public void mouseReleased(MouseEvent e) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void mouseEntered(MouseEvent e) {
            ImageIcon II = new ImageIcon(getClass().getResource("/gambar/back2.png"));
            view.getKembali().setIcon(II);
        }

        @Override
        public void mouseExited(MouseEvent e) {
            ImageIcon II = new ImageIcon(getClass().getResource("/gambar/back.png"));
            view.getKembali().setIcon(II);
        }

        @Override
        public void mousePressed(MouseEvent e) {
            try {
                new c_pilihTanaman();
                view.dispose();

            } catch (SQLException ex) {
                Logger.getLogger(c_home.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

    private class klikTristeza implements MouseListener {

        @Override
        public void mouseClicked(MouseEvent e) {
            try {
                Runtime.getRuntime().exec("rundll32 url.dll, FileProtocolHandler " + "C:\\Users\\JEE\\Documents\\NetBeansProjects\\PPL\\src\\penyakit\\Tristeza.pdf");
            } catch (Exception ex) {
                Logger.getLogger(c_penyakitJeruk.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, "error");
            }
        }

        @Override
        public void mousePressed(MouseEvent e) {
            try {
                Runtime.getRuntime().exec("rundll32 url.dll, FileProtocolHandler " + "C:\\Users\\JEE\\Documents\\NetBeansProjects\\PPL\\src\\penyakit\\Tristeza.pdf");
            } catch (Exception ex) {
                Logger.getLogger(c_penyakitJeruk.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, "error");
            }
        }

        @Override
        public void mouseReleased(MouseEvent e
        ) {
//            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void mouseEntered(MouseEvent e
        ) {
//            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void mouseExited(MouseEvent e
        ) {
//            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

    }

    private class klikCVPD implements MouseListener {

        @Override
        public void mouseClicked(MouseEvent e) {

            try {
                JOptionPane.showConfirmDialog(view, "Bolehkan Membuka Software Lain?");
                Runtime.getRuntime().exec("rundll32 url.dll, FileProtocolHandler " + "C:\\Users\\JEE\\Documents\\NetBeansProjects\\PPL\\src\\penyakit\\CVPD.pdf");
//            cvpd.getHasil().setText(model.jerukcvpd());
//            view.dispose();
//            if (cvpd.getHasil().equals("")) {
//                System.out.println("error");
//            } else {
//                cvpd.setVisible(true);
//            }
            } catch (Exception ex) {
                Logger.getLogger(c_penyakitJeruk.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, "error");
            }
        }

        @Override
        public void mousePressed(MouseEvent e) {
            try {
                JOptionPane.showConfirmDialog(view, "Bolehkan Membuka SOftware Lain?");
                Runtime.getRuntime().exec("rundll32 url.dll, FileProtocolHandler " + "C:\\Users\\JEE\\Documents\\NetBeansProjects\\PPL\\src\\penyakit\\CVPD.pdf");
            } catch (Exception ex) {
                Logger.getLogger(c_penyakitJeruk.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, "error");
            }
        }

        @Override
        public void mouseReleased(MouseEvent e) {
//            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void mouseEntered(MouseEvent e) {
//            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void mouseExited(MouseEvent e) {
//            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

    }

    private class klikDurian implements MouseListener {

        @Override
        public void mouseClicked(MouseEvent e) {
//            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void mousePressed(MouseEvent e) {
//            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void mouseReleased(MouseEvent e) {
//            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void mouseEntered(MouseEvent e) {
//            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void mouseExited(MouseEvent e) {
//            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

    }
}
