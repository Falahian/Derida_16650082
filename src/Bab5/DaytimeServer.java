/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package praktikum5;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.BindException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author LAB_TI
 */
public class DaytimeServer {
public static final int SERVICE_PORT=13;
    public static void main(String[] args) throws IOException {
        try{
            ServerSocket server= new ServerSocket (SERVICE_PORT);
            System.out.println("Daytime service started");

            for(;;){
                Socket nextClient = server.accept();
                System.out.println("Received request from "+nextClient.getInetAddress()+" : "
                        +nextClient.getPort());

                OutputStream out= nextClient.getOutputStream();
                PrintStream pout = new PrintStream(out);
                pout.print(new java.util.Date());
                out.flush();
                out.close();
                nextClient.close();
            }
        }catch(BindException be){
            System.err.println("Service already running on port "+SERVICE_PORT);
        }catch(IOException ioe){
            System.err.println("I/O error - "+ioe);
        }
    }
}
