/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package za.ac.cput.abdul.designpatterns.structural.decorator;

/**
 *
 * @author Abdul
 */
public class MainDriver {
    public static void main( String [ ] args ) {
    Animal animal = new LivingAnimal();
    animal.describe();
    animal = new LegDecorator(animal);
    animal.describe();
    animal = new WingDecorator(animal);
    animal.describe();
    animal = new GrowlDecorator(animal);
    animal = new GrowlDecorator(animal);
    animal.describe();
    }
}