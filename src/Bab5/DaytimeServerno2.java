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
import java.net.BindException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author LAB_TI
 */
public class DaytimeServerno2 {

    public static final int service = 13;

    public static void main(String[] args) {
        try {
            String pesan;
            ServerSocket server = new ServerSocket(service);
            for (;;) {
                Socket nextClient = server.accept();
                BufferedReader in = new BufferedReader(new InputStreamReader(nextClient.getInputStream()));
                System.out.println("pesan dari \t :" + nextClient.getInetAddress() + " " + nextClient.getPort());
                System.out.println("pesan masuk\t : " + in.readLine());
                nextClient.close();

            }
        } catch (BindException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("error : " + e.getMessage());
        }
    }
}
