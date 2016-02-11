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
        MessageInputMethods first = new KeyboardInput();
        //multiple options to show Liskov's property
        KeyboardInput second = new KeyboardInput();
        MessageInputMethods third = new ArrayInput();
        ArrayInput fourth = new ArrayInput();

        MessageOutputMethods fifth = new ConsoleWriter();
        ConsoleWriter sixth = new ConsoleWriter();
        MessageOutputMethods seventh = new GUIWriter();
        GUIWriter eighth = new GUIWriter();

    }
}
