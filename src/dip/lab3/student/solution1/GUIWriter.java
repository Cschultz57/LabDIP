/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab3.student.solution1;

import javax.swing.JOptionPane;

/**
 *
 * @author Carson Schultz
 */
public class GUIWriter implements OutputMethods{

    @Override
    public void Output(InputMethods input) {
        JOptionPane.showMessageDialog(null,input.getInput());
    }
    
}
