/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package za.ac.cput.abdul.designpatterns.structural.adapter;

/**
 *
 * @author Abdul
 */
public interface TemperatureInfo {
    
    public double getTemperatureInF() ;
    public void setTemperatureInF(double temperatureInF);
    public double getTemperatureInC() ;
    public void setTemperatureInC(double temperatureInC);

    
}
