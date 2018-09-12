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
public class nomor4 {
    public static void main(String[] args) {
        try {
            System.out.println("Masukan txt, ketik exit untuk keluar ");
            InputStream is = System.in;
            InputStreamReader reader = new InputStreamReader(is);
            BufferedReader bufReader = new BufferedReader(reader);
            String text;
            int no=1;
            boolean right = true;
                text = bufReader.readLine();
                System.out.println("Pleased to meet ,"+text);
            while (right) {
                System.out.println(no+"");
                text = bufReader.readLine();
                if (text.matches("exit")){
                    System.out.println("selesai");
                    System.out.println("kamu menulis :"+text);
                    right = false;
                }else {
                    System.out.println("kamu menulis "+no+""+text);
                    no++;
                }
            }
        } catch(Exception e) {
        
        }
    }
}
