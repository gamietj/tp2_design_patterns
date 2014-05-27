/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package za.ac.cput.abdul.designpatterns.behavioral.state;

/**
 *
 * @author Abdul   
 */
public class SadState implements EmotionalState {
    @Override
    public String sayGoodbye(){
    return "Bye.Sniff , sniff.";
    }
    @Override
    public String sayHello(){
    return "Hello.Sniff , sniff.";
    }
}