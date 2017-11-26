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
import view.pilihTanaman;

/**
 *
 * @author JEE
 */
public class c_pilihTanaman {

    pilihTanaman view;
    m_penyakit model;

    public c_pilihTanaman() throws SQLException {
        view = new pilihTanaman();

        view.getApel().addMouseListener((MouseListener) new klikApel());
        view.setVisible(true);
        view.getKembali().addMouseListener((MouseListener) new klikKembali());
        view.getJeruk().addMouseListener((MouseListener) new klikJeruk());
        view.getDurian().addMouseListener(new klikDurian());

    }

    private class klikKembali implements MouseListener {

        @Override
        public void mouseClicked(MouseEvent e) {
            try {
                new c_home();
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
                new c_home();
                view.dispose();

            } catch (SQLException ex) {
                Logger.getLogger(c_home.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

    private class klikApel implements MouseListener {

        @Override
        public void mouseClicked(MouseEvent e) {
            try {
                new c_penyakitApel();
                view.dispose();
            } catch (SQLException ex) {
                Logger.getLogger(c_pilihTanaman.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        @Override
        public void mousePressed(MouseEvent e) {
            try {
                new c_penyakitApel();
                view.dispose();
            } catch (SQLException ex) {
                Logger.getLogger(c_pilihTanaman.class.getName()).log(Level.SEVERE, null, ex);
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

    private class klikJeruk implements MouseListener {

        @Override
        public void mouseClicked(MouseEvent e) {
            try {
                new c_penyakitJeruk();
                view.dispose();
            } catch (SQLException ex) {
                Logger.getLogger(c_pilihTanaman.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        @Override
        public void mousePressed(MouseEvent e) {
            try {
                new c_penyakitJeruk();
                view.dispose();
            } catch (SQLException ex) {
                Logger.getLogger(c_pilihTanaman.class.getName()).log(Level.SEVERE, null, ex);
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
            try {
                new c_penyakitDurian();
                view.dispose();
            } catch (SQLException ex) {
                Logger.getLogger(c_pilihTanaman.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        @Override
        public void mousePressed(MouseEvent e) {
            try {
                new c_penyakitDurian();
                view.dispose();
            } catch (SQLException ex) {
                Logger.getLogger(c_pilihTanaman.class.getName()).log(Level.SEVERE, null, ex);
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
}
