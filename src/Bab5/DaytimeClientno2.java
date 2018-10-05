/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;

/**
 *
 * @author LAB_TI
 */
public class DaytimeClientno2 {

    public static final int service = 13;

    public static void main(String[] args) {
        try {
            for (;;) {

                String hostname = "localhost";
                Socket client = new Socket(hostname, service);
                System.out.println("Connection established");
                client.setSoTimeout(3000);
                String pesan;
                String value = "exit";
                BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
                OutputStream out = client.getOutputStream();
                PrintStream pout = new PrintStream(out);
                System.out.print("Masukkan pesan anda : ");
                pesan = in.readLine();
                pout.println(pesan + "\nOn\t:" + new java.util.Date());
                if (pesan.equalsIgnoreCase(value)) {
                    client.close();
                    System.exit(0);
                } else {
                    out.flush();
                    out.close();
                    client.close();
                }

            }
        } catch (Exception e) {
            System.out.println("error pada " + e.getMessage());
        }
    }
}
