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
public class StartUp {

    public static void main(String[] args) {
        MessageOutputMethods output = new GUIWriter();
        MessageInputMethods input = new KeyboardInput();

        MessageInputOutputService message = new MessageInputOutputService(input, output);

        message.getOutput();

    }
}
