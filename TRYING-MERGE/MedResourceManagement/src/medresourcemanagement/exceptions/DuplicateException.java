/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medresourcemanagement.exceptions;

import javax.swing.JOptionPane;

/**
 *
 * @author neilmcclelland
 */
public class DuplicateException extends RuntimeException {
    public DuplicateException(){
    super("This doctor already exists");
            JOptionPane.showMessageDialog(
                                null, getMessage(), "Error", 
                                JOptionPane.PLAIN_MESSAGE);
    }
    
}
