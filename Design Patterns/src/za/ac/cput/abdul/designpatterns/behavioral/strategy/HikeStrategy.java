/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package za.ac.cput.abdul.designpatterns.behavioral.strategy;

/**
 *
 * @author Abdul
 */
public class HikeStrategy implements Strategy {
    @Override
    public boolean checkTemperature(int temperatureInF){
    if(( temperatureInF >= 50)&&(temperatureInF <= 90)){
    return true;
    } else {
    return false;
    }
    }
}
