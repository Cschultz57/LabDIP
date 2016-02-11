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
public class ConsoleWriter implements MessageOutputMethods {

    @Override
    public void Output(MessageInputMethods input) {
        System.out.println(input.getInput());
    }

}
