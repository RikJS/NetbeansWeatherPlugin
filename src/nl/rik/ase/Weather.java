/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nl.rik.ase;

/**
 *
 * @author Rik
 */
public class Weather {
    
    private double degrees;
    
    public Weather(double degrees) {
        this.degrees = degrees;
    }

    /**
     * @return the degrees
     */
    public double getDegrees() {
        return degrees;
    }

    /**
     * @param degrees the degrees to set
     */
    public void setDegrees(double degrees) {
        this.degrees = degrees;
    }
    
}
