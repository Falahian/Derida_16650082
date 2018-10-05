/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package praktikum5;

/**
 *
 * @author LAB_TI
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
public class DaytimeClien2 {
    public static final int SERVICE_PORT=13;
    public static void main(String[] args) {
        try{
            String hostname="localhost";

            Socket daytime=new Socket(hostname, SERVICE_PORT);
            System.out.println("Connection established");

        daytime.setSoTimeout(2000);
        BufferedReader reader=new BufferedReader(
                new InputStreamReader(daytime.getInputStream()));

        System.out.println("Result: "+reader.readLine());
        daytime.close();

    } catch(IOException ioe){
        System.out.println("Error "+ioe);
    }
}
}