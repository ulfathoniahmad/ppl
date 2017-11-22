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
import view.Home;

/**
 *
 * @author JEE
 */
public class c_home {

    Home view;

    public c_home() throws SQLException {
        view = new Home();
        view.setVisible(true);
        view.getPupuk().addMouseListener((MouseListener) new klikPupuk());
        view.getPenyakit().addMouseListener((MouseListener) new klikPenyakit());
    }

    private class klikPupuk implements MouseListener {

        @Override
        public void mouseClicked(MouseEvent e) {
            try {
                c_isidata c_isidata = new c_isidata();

                view.dispose();
            } catch (SQLException ex) {
                Logger.getLogger(c_home.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        @Override
        public void mousePressed(MouseEvent e) {
            try {
                c_isidata c_isidata = new c_isidata();

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
            ImageIcon II = new ImageIcon(getClass().getResource("/gambar/seeds1.png"));
            view.getPupuk().setIcon(II);
        }

        @Override
        public void mouseExited(MouseEvent e) {
            ImageIcon II = new ImageIcon(getClass().getResource("/gambar/seeds.png"));
            view.getPupuk().setIcon(II);
        }

    }

    private class klikPenyakit implements MouseListener {

        @Override
        public void mouseClicked(MouseEvent e) {
            try {
                new c_penyakit();
                view.dispose();
            } catch (SQLException ex) {
                Logger.getLogger(c_home.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        @Override
        public void mousePressed(MouseEvent e) {
            try {
                new c_penyakit();
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
            ImageIcon II = new ImageIcon(getClass().getResource("/gambar/pest1.png"));
            view.getPenyakit().setIcon(II);
        }

        @Override
        public void mouseExited(MouseEvent e) {
            ImageIcon II = new ImageIcon(getClass().getResource("/gambar/pest.png"));
            view.getPenyakit().setIcon(II);
        }

    }
}
