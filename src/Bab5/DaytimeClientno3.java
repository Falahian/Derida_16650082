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
public class DaytimeClientno3 {

    public static final int SERVICE_PORT = 13;

    public static void main(String[] args) {
        try {
            for (;;) {

                String hostname = "localhost";
                Socket daytime = new Socket(hostname, SERVICE_PORT);
                System.out.println("Connection established");
                System.out.println("Silahkan Masukkan Data");
                daytime.setSoTimeout(2000);
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                String kata = br.readLine();
                System.out.println("Data yang diinputkan : " + kata);

                OutputStream os = daytime.getOutputStream();
                PrintStream ps = new PrintStream(os);
                ps.println(kata);
                BufferedReader br1 = new BufferedReader(new InputStreamReader(daytime.getInputStream()));
                System.out.println("result\t: " + br1.readLine());
                System.out.println("");
                os.flush();
                os.close();
                daytime.close();
            }

        } catch (IOException ioe) {
            System.out.println("Error " + ioe);
        }
    }
}
