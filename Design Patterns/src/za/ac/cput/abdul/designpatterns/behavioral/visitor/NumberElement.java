/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package za.ac.cput.abdul.designpatterns.behavioral.visitor;

/**
 *
 * @author Abdul
 */
public interface NumberElement {
public void accept (NumberVisitor visitor);
}
