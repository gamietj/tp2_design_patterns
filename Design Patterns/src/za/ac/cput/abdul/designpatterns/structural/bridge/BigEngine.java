/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package za.ac.cput.abdul.designpatterns.structural.bridge;

/**
 *
 * @author Abdul
 */
public class BigEngine implements Engine {
    int horsepower ;
    public BigEngine(){
    horsepower = 350;
    }
    @Override
    public int go(){
    System.out.println("The big engine i s running") ;
    return horsepower ;
    }
    
}
