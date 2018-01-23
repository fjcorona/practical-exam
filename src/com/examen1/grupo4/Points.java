/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.examen1.grupo4;

import com.examen1.files.FileManager;

/**
 *
 * @author fjcorona
 */
public class Points {
    public static void main(String[] args) {
        String myFile = "Puntos.txt";
        FileManager.createFile(myFile);
        
        for (int x = 0; x < 25; x++) {
            float y = x * x + 1;
            String newLine = "x: " + x + " y: " + y;
            FileManager.writeFile(myFile, newLine);
        }
    }
}
