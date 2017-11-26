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
import view.penyakitDurian;
import view.penyakitJeruk;
import view.pilihTanaman;

/**
 *
 * @author JEE
 */
public class c_penyakitDurian {

    penyakitDurian view;

    public c_penyakitDurian() throws SQLException {
        view = new penyakitDurian();

        view.getBusukAkar().addMouseListener((MouseListener) new klikBusukAkar());
        view.setVisible(true);
        view.getKembali().addMouseListener((MouseListener) new klikKembali());
        view.getKankerBatang().addMouseListener((MouseListener) new klikKankerBatang());

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

    private class klikBusukAkar implements MouseListener {

        @Override
        public void mouseClicked(MouseEvent e) {
            try {
                Runtime.getRuntime().exec("rundll32 url.dll, FileProtocolHandler " + "C:\\Users\\JEE\\Documents\\NetBeansProjects\\PPL\\src\\penyakit\\busukakar.pdf");
            } catch (Exception ex) {
                Logger.getLogger(c_penyakitDurian.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, "error");
            }
        }

        @Override
        public void mousePressed(MouseEvent e) {
            try {
                Runtime.getRuntime().exec("rundll32 url.dll, FileProtocolHandler " + "C:\\Users\\JEE\\Documents\\NetBeansProjects\\PPL\\src\\penyakit\\busukakar.pdf");
            } catch (Exception ex) {
                Logger.getLogger(c_penyakitDurian.class.getName()).log(Level.SEVERE, null, ex);
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

    private class klikKankerBatang implements MouseListener {

        @Override
        public void mouseClicked(MouseEvent e) {

            try {
                Runtime.getRuntime().exec("rundll32 url.dll, FileProtocolHandler " + "C:\\Users\\JEE\\Documents\\NetBeansProjects\\PPL\\src\\penyakit\\kankerbatang");
            } catch (Exception ex) {
                Logger.getLogger(c_penyakitDurian.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, "error");
            }
        }

        @Override
        public void mousePressed(MouseEvent e) {
            try {
                Runtime.getRuntime().exec("rundll32 url.dll, FileProtocolHandler " + "C:\\Users\\JEE\\Documents\\NetBeansProjects\\PPL\\src\\penyakit\\kankerbatang");
            } catch (Exception ex) {
                Logger.getLogger(c_penyakitDurian.class.getName()).log(Level.SEVERE, null, ex);
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
