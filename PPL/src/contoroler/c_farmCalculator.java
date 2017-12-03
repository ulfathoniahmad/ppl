/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contoroler;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import model.m_farmCalculator;
import view.farmCalculator;

/**
 *
 * @author JEE
 */
public class c_farmCalculator {

    farmCalculator view;
    m_farmCalculator model;

    public c_farmCalculator() {
        view = new farmCalculator();
        model = new m_farmCalculator();
        view.fertilizer().addMouseListener((MouseListener) new klikFertilizer());
        view.back().addMouseListener(new klikKembali());
        view.setVisible(true);
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
        }

        @Override
        public void mouseEntered(MouseEvent e) {
            ImageIcon II = new ImageIcon(getClass().getResource("/gambar/back2.png"));
            view.back().setIcon(II);
        }

        @Override
        public void mouseExited(MouseEvent e) {
            ImageIcon II = new ImageIcon(getClass().getResource("/gambar/back.png"));
            view.back().setIcon(II);
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

    public class klikFertilizer implements MouseListener {

        @Override
        public void mouseClicked(MouseEvent e) {
            DecimalFormat des = new DecimalFormat("#.##");
            String nit = view.nitrogen().getText();
            String pos = view.fosfor().getText();
            String kal = view.kalium().getText();

            double nitrogen;
            double posfor;
            double kalium;

            if (nit.equals("") && pos.equals("") && kal.equals("")) {
                JOptionPane.showMessageDialog(view, "Isi Form");
            } else if (nit.equals("") && pos.equals("")) {
                nitrogen = 0;
                posfor = 0;
                kalium = Double.parseDouble(kal);

                view.hasil().setText("KOMBINASI PUPUK \nUrea : " + des.format(model.Urea(nitrogen)) + " Kg \n"
                        + "SSP : " + des.format(model.SSP(posfor)) + " Kg \n"
                        + "MOP : " + des.format(model.MOP(kalium)) + " Kg");

                System.out.println(nitrogen + " nitrogen = " + des.format(model.Urea(nitrogen)) + "Kg Urea");
                System.out.println(posfor + " fosfor = " + des.format(model.SSP(posfor)) + "Kg SSP");
                System.out.println(kalium + " kalium = " + des.format(model.MOP(kalium)) + "Kg MOP");
            } else if (nit.equals("") && kal.equals("")) {
                nitrogen = 0;
                posfor = Double.parseDouble(pos);
                kalium = 0;

                view.hasil().setText("KOMBINASI PUPUK \nUrea : " + des.format(model.Urea(nitrogen)) + " Kg \n"
                        + "SSP : " + des.format(model.SSP(posfor)) + " Kg \n"
                        + "MOP : " + des.format(model.MOP(kalium)) + " Kg");

                System.out.println(nitrogen + " nitrogen = " + des.format(model.Urea(nitrogen)) + "Kg Urea");
                System.out.println(posfor + " fosfor = " + des.format(model.SSP(posfor)) + "Kg SSP");
                System.out.println(kalium + " kalium = " + des.format(model.MOP(kalium)) + "Kg MOP");
            } else if (pos.equals("") && kal.equals("")) {
                nitrogen = Double.parseDouble(nit);
                posfor = 0;
                kalium = 0;

                view.hasil().setText("KOMBINASI PUPUK \nUrea : " + des.format(model.Urea(nitrogen)) + " Kg \n"
                        + "SSP : " + des.format(model.SSP(posfor)) + " Kg \n"
                        + "MOP : " + des.format(model.MOP(kalium)) + " Kg");

                System.out.println(nitrogen + " nitrogen = " + des.format(model.Urea(nitrogen)) + "Kg Urea");
                System.out.println(posfor + " fosfor = " + des.format(model.SSP(posfor)) + "Kg SSP");
                System.out.println(kalium + " kalium = " + des.format(model.MOP(kalium)) + "Kg MOP");
            } else if (nit.equals("")) {
                nitrogen = 0.0;
                posfor = Double.parseDouble(pos);
                kalium = Double.parseDouble(kal);

                view.hasil().setText("KOMBINASI PUPUK \nUrea : " + des.format(model.Urea(nitrogen)) + " Kg \n"
                        + "SSP : " + des.format(model.SSP(posfor)) + " Kg \n"
                        + "MOP : " + des.format(model.MOP(kalium)) + " Kg");

                System.out.println(nitrogen + " nitrogen = " + des.format(model.Urea(nitrogen)) + "Kg Urea");
                System.out.println(posfor + " fosfor = " + des.format(model.SSP(posfor)) + "Kg SSP");
                System.out.println(kalium + " kalium = " + des.format(model.MOP(kalium)) + "Kg MOP");
            } else if (pos.equals("")) {
                nitrogen = Double.parseDouble(nit);
                posfor = 0.0;
                kalium = Double.parseDouble(kal);

                view.hasil().setText("KOMBINASI PUPUK \nUrea : " + des.format(model.Urea(nitrogen)) + " Kg \n"
                        + "SSP : " + des.format(model.SSP(posfor)) + " Kg \n"
                        + "MOP : " + des.format(model.MOP(kalium)) + " Kg");

                System.out.println(nitrogen + " nitrogen = " + des.format(model.Urea(nitrogen)) + "Kg Urea");
                System.out.println(posfor + " fosfor = " + des.format(model.SSP(posfor)) + "Kg SSP");
                System.out.println(kalium + " kalium = " + des.format(model.MOP(kalium)) + "Kg MOP");

            } else if (kal.equals("")) {
                kalium = 0.0;
                nitrogen = Double.parseDouble(nit);
                posfor = Double.parseDouble(pos);

                view.hasil().setText("KOMBINASI PUPUK \nUrea : " + des.format(model.Urea(nitrogen)) + " Kg \n"
                        + "SSP : " + des.format(model.SSP(posfor)) + " Kg \n"
                        + "MOP : " + des.format(model.MOP(kalium)) + " Kg");

                System.out.println(nitrogen + " nitrogen = " + des.format(model.Urea(nitrogen)) + "Kg Urea");
                System.out.println(posfor + " fosfor = " + des.format(model.SSP(posfor)) + "Kg SSP");
                System.out.println(kalium + " kalium = " + des.format(model.MOP(kalium)) + "Kg MOP");
            } else {
                nitrogen = Double.parseDouble(nit);
                posfor = Double.parseDouble(pos);
                kalium = Double.parseDouble(kal);

                view.hasil().setText("KOMBINASI PUPUK \nUrea : " + des.format(model.Urea(nitrogen)) + " Kg \n"
                        + "SSP : " + des.format(model.SSP(posfor)) + " Kg \n"
                        + "MOP : " + des.format(model.MOP(kalium)) + " Kg");

                System.out.println(nitrogen + " nitrogen = " + des.format(model.Urea(nitrogen)) + "Kg Urea");
                System.out.println(posfor + " fosfor = " + des.format(model.SSP(posfor)) + "Kg SSP");
                System.out.println(kalium + " kalium = " + des.format(model.MOP(kalium)) + "Kg MOP");
            }

        }

        @Override
        public void mousePressed(MouseEvent e) {
//            String n = view.nitrogen().getText();
//            double nitrogen = Double.parseDouble(n);
//           System.out.println(2+"kg nitrogen = "+(model.m_farmCalculator(nitrogen)));
        }

        @Override
        public void mouseReleased(MouseEvent e) {
//            /throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void mouseEntered(MouseEvent e) {
            ImageIcon II = new ImageIcon(getClass().getResource("/gambar/anal.png"));
            view.fertilizer().setIcon(II);
        }

        @Override
        public void mouseExited(MouseEvent e) {
            ImageIcon II = new ImageIcon(getClass().getResource("/gambar/anal1.png"));
            view.fertilizer().setIcon(II);
        }

    }
}
