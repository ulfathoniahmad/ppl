/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contoroler;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import java.util.Timer;
import model.alarm;
import view.Home;

/**
 *
 * @author JEE
 */
public class c_home {

    Home view;
    Timer timer;
    alarm alr;

    public c_home() throws SQLException {
        view = new Home();
        alr = new alarm();
        view.setVisible(true);
        view.getPupuk().addMouseListener((MouseListener) new klikPupuk());
        view.getCalculator().addMouseListener((MouseListener) new klikCalculator());
        view.getPenyakit().addMouseListener((MouseListener) new klikPenyakit());
    }

    private class klikPupuk implements MouseListener {

        @Override
        public void mouseClicked(MouseEvent e) {
            try {
                new c_pupuk();

                view.dispose();
            } catch (SQLException ex) {
                Logger.getLogger(c_home.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        @Override
        public void mousePressed(MouseEvent e) {
            try {
                c_pupuk c_isidata = new c_pupuk();

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
                new c_pilihTanaman();
                view.dispose();
            } catch (SQLException ex) {
                Logger.getLogger(c_home.class.getName()).log(Level.SEVERE, null, ex);
            }
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
    
        private class klikCalculator implements MouseListener {

        @Override
        public void mouseClicked(MouseEvent e) {
            new c_farmCalculator();
            view.dispose();
        }

        @Override
        public void mousePressed(MouseEvent e) {
            new c_farmCalculator();
            view.dispose();
        }

        @Override
        public void mouseReleased(MouseEvent e) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void mouseEntered(MouseEvent e) {
            ImageIcon II = new ImageIcon(getClass().getResource("/gambar/calculator1.png"));
            view.getCalculator().setIcon(II);
        }

        @Override
        public void mouseExited(MouseEvent e) {
            ImageIcon II = new ImageIcon(getClass().getResource("/gambar/calculator.png"));
            view.getCalculator().setIcon(II);
        }

    }
}
