/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab3.student.solution1;

/**
 *
 * @author Carson Schultz
 */
public class ArrayInput implements InputMethods{
    String[] ai = {"1","2"};

    @Override
    public void setInput() {
        
    }

    @Override
    public String getInput() {
        return ai[0];
    }
    
}
