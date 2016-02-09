/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab3;

/**
 *
 * @author Carson Schultz
 */
public class ConsoleWriter implements OutputMethods {

    @Override
    public void Output(InputMethods input) {
        System.out.println(input.getInput());
    }

}
