/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package za.ac.cput.abdul.designpatterns.behavioral.command;

/**
 *
 * @author Abdul
 */
public class LunchCommand implements Command {
Lunch lunch ;
public LunchCommand(Lunch lunch){
this.lunch = lunch;
}
@Override
public void execute(){
lunch.makeLunch();
}
}
