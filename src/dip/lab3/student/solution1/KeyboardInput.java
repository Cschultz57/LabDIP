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

import java.util.Scanner;

public class KeyboardInput implements InputMethods {

    private String message;

    @Override
    public void setInput() {

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Please enter some text: ");
        message = keyboard.nextLine();

    }

    @Override
    public String getInput() {
        return message;
    }
}
