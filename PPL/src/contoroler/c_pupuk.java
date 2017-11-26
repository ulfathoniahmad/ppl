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
import javax.swing.JOptionPane;
import model.m_pupuk;
import view.hasil;
import view.pupuk;

/**
 *
 * @author JEE
 */
public class c_pupuk {

    pupuk view;
    hasil views;
    m_pupuk model;

    public c_pupuk() throws SQLException {
        view = new pupuk();
        views = new hasil();
        model = new m_pupuk();
        view.getAnalisa().addMouseListener((MouseListener) new klikAnalisa());
        view.setVisible(true);
        view.getKembali().addMouseListener((MouseListener) new klikKembali());
        view.getReset().addMouseListener((MouseListener) new klikReset());
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
//            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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

    private class klikAnalisa implements MouseListener {

        @Override
        public void mouseClicked(MouseEvent e) {
            String namabuah = (String) view.getNamaBuah().getSelectedItem();
            String umur = (String) view.getUmur().getSelectedItem();

            try {
                if (namabuah.equals("") || umur.equals("")) {
                    JOptionPane.showMessageDialog(view, "data tidak boleh ada yang kosong");
                } else {
                    model.analisa(namabuah, umur);
                    view.getHasil().setText(model.analisa(namabuah, umur));
                    if (view.getHasil().getText().equals("")) {
                        JOptionPane.showMessageDialog(view, "SiLahkan Pilih Data Terlebih Dahulu");
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(c_pupuk.class.getName()).log(Level.SEVERE, null, ex);

            }
        }

        @Override
        public void mouseReleased(MouseEvent e) {
//            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void mouseEntered(MouseEvent e) {
            ImageIcon II = new ImageIcon(getClass().getResource("/gambar/anal1.png"));
            view.getAnalisa().setIcon(II);
        }

        @Override
        public void mouseExited(MouseEvent e) {
            ImageIcon II = new ImageIcon(getClass().getResource("/gambar/anal.png"));
            view.getAnalisa().setIcon(II);
        }

        @Override
        public void mousePressed(MouseEvent e) {
            String namabuah = (String) view.getNamaBuah().getSelectedItem();
            String umur = (String) view.getUmur().getSelectedItem();

            try {
                if (namabuah.equals("") || umur.equals("")) {
                    JOptionPane.showMessageDialog(view, "data tidak boleh ada yang kosong");
                } else {
                    model.analisa(namabuah, umur);
                    view.getHasil().setText(model.analisa(namabuah, umur));
                    if (view.getHasil().getText().equals("")) {
                        JOptionPane.showMessageDialog(view, "Data Masih belum Ada");
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(c_pupuk.class.getName()).log(Level.SEVERE, null, ex);

            }
        }
    }

    private class klikReset implements MouseListener {

        @Override
        public void mouseClicked(MouseEvent e) {
            view.getHasil().setText("");
            view.getNamaBuah().setSelectedItem("PILIH TANAMAN");
            view.getUmur().setSelectedItem("PILIH UMUR");
        }

        @Override
        public void mouseReleased(MouseEvent e) {
//            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void mouseEntered(MouseEvent e) {
            ImageIcon II = new ImageIcon(getClass().getResource("/gambar/reset1.png"));
            view.getReset().setIcon(II);
        }

        @Override
        public void mouseExited(MouseEvent e) {
            ImageIcon II = new ImageIcon(getClass().getResource("/gambar/reset.png"));
            view.getReset().setIcon(II);
        }

        @Override
        public void mousePressed(MouseEvent e) {
            view.getHasil().setText("");
        }
    }
}
