/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.examen1.grupo4;

import com.examen1.files.FileManager;
import java.util.*;

/**
 *
 * @author Francisco Javier Corona Sánchez
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String fileName = scan.nextLine();
        FileManager.readFile(fileName);
    }
    
}
