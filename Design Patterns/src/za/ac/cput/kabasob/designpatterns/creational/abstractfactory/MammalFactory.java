/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package za.ac.cput.kabasob.designpatterns.creational.abstractfactory;

/**
 *
 * @author Khulsum
 */
public class MammalFactory extends SpeciesFactory {
    @Override
    public Animal getAnimal(String type){
        if("dog".equals(type)){
            return new Dog();
        }
        else{
            return new Cat();
            
        }
    }
    
}
