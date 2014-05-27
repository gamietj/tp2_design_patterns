/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package za.ac.cput.abdul.designpatterns.behavioral.mediator;

/**
 *
 * @author Abdul
 */
class FrenchBuyer extends Buyer{
    public FrenchBuyer(Mediator mediator ){
    super(mediator ,"euro") ;
    this.mediator.registerFrenchBuyer(this);
    }
    
}
