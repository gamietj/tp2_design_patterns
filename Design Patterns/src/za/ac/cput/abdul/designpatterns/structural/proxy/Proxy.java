/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package za.ac.cput.abdul.designpatterns.structural.proxy;

import java.util.Date;

/**
 *
 * @author Abdul
 */
public class Proxy {
    
    SlowThing slowThing ;
    public Proxy () {
    System.out.println ("Creating proxy at " + new Date ());
    }
    public void sayHello () {
    if ( slowThing == null) {
    slowThing = new SlowThing ();
    }
    slowThing.sayHello();
    }
    
}
