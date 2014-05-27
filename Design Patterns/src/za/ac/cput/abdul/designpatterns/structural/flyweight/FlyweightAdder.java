/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package za.ac.cput.abdul.designpatterns.structural.flyweight;

/**
 *
 * @author Abdul
 */
public class FlyweightAdder implements Flyweight {
    String operation;
    public FlyweightAdder(){
    operation = "adding";
    try {
    Thread.sleep(3000);
    } catch( InterruptedException e){
    e.printStackTrace();
    }
    }
    @Override
    public void doMath( int a , int b){
    System.out.println( operation + " " + a + " and " + b + " : " +( a + b ));
    }
    
}
