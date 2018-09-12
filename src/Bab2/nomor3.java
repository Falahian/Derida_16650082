/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bab2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;

/**
 *
 * @author toshiba
 */
public class nomor3 {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        try{
            System.out.print("Masukan Tulisan :");
            InputStream input = System.in;
            InputStreamReader reader = new InputStreamReader(input);
            
            BufferedReader bufReader = new BufferedReader(reader);
            String data = bufReader.readLine();
            
            String destination = "d:/coba.txt";
            OutputStream output = new FileOutputStream(destination);
            System.out.println("Opened "+ destination +" for writing.");
            
            for (int i=0; i<data.length();i++){
                output.write((byte)data.charAt(i));
            }
            output.close();
        } catch(Exception e) {
    
    }
    }
}
