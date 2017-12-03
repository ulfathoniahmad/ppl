/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author JEE
 */
public class m_farmCalculator {

    public double Urea(double nitrogen) {

        double n = (100 * nitrogen) / 46;
        
        return n;
    }

    public double SSP(double posfor) {
        double p = (100 * posfor) / 18;

        return p;
    }

    public double MOP(double kalium) {
        double k = (100 * kalium) / 64;

        return k;
    }

}
