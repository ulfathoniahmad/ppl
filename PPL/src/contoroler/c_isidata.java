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
import model.m_hasil;
import view.hasil;
import view.isidata;

/**
 *
 * @author JEE
 */
public class c_isidata {

    isidata view;
    hasil views;
    m_hasil model;

    public c_isidata() throws SQLException {
        view = new isidata();
        views = new hasil();
        model = new m_hasil();
        view.getAnalisa().addActionListener(new klikAnalisa());
        view.setVisible(true);
        view.getKembali().addMouseListener((MouseListener) new klikKembali());
    }

    private class klikAnalisa implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            String strukturTanah = (String) view.getstrukturTanah().getSelectedItem();
            String luasTanah = (String) view.getluasTanah().getSelectedItem();
            String jenisTanah = (String) view.getjenisTanah().getSelectedItem();
            String jumlahPohon = (String) view.getjumlahPohon().getSelectedItem();
            String kadarAir = (String) view.getkadarAir().getSelectedItem();
            String jumlahPH = (String) view.getjumlahPH().getSelectedItem();

            try {
                if (strukturTanah.equals("") || luasTanah.equals("") || jenisTanah.equals("") || jumlahPohon.equals("") || kadarAir.equals("") || jumlahPH.equals("")) {
                    JOptionPane.showMessageDialog(view, "data tidak boleh ada yang kosong");
                    view.setVisible(true);
                } else {
                    model.analisa(strukturTanah, luasTanah, jenisTanah, jumlahPohon, kadarAir, jumlahPH);
                    views.getHasil().setText(model.analisa(strukturTanah, luasTanah, jenisTanah, jumlahPohon, kadarAir, jumlahPH));
                    if (views.getHasil().getText().equals("")) {
                        JOptionPane.showMessageDialog(view, "Data Masih belum Ada");
                    } else {
                        JOptionPane.showMessageDialog(view, views.getHasil().getText());
                    }
               }
            } catch (SQLException ex) {
                Logger.getLogger(c_isidata.class.getName()).log(Level.SEVERE, null, ex);

            }

        }

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
}
