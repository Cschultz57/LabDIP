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
public class MessageInputOutputService {


    private MessageInputMethods input;
    private MessageOutputMethods output;

    public MessageInputOutputService(MessageInputMethods input, MessageOutputMethods output) {
        this.input = input;
        this.output = output;
    }

    public void getOutput() {
        String line = input.inputMessage();
        output.outputMessage(line);
    }
}
