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
public class Person implements EmotionalState{
    EmotionalState emotionalState ;
    public Person(EmotionalState emotionalState){
    this.emotionalState = emotionalState ;
    }
    public void setEmotionalState(EmotionalState emotionalState){
    this.emotionalState = emotionalState ;
    }
    @Override
    public String sayGoodbye(){
    return emotionalState.sayGoodbye() ;
    }
    @Override
    public String sayHello(){
    return emotionalState.sayHello() ;
    }
}
