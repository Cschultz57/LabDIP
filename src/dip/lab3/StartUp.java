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
public class StartUp {
    public static void main(String[] args) {
        InputMethods first = new KeyboardInput();
        //multiple options to show Liskov's property
        KeyboardInput second = new KeyboardInput();
        InputMethods third = new ArrayInput();
        ArrayInput fourth = new ArrayInput();
        
        OutputMethods fifth = new ConsoleWriter();
        ConsoleWriter sixth = new ConsoleWriter();
        OutputMethods seventh = new GUIWriter();
        GUIWriter eighth = new GUIWriter();
        
        
    }
}
