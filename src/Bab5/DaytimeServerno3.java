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
public class DaytimeServerno3 {

    public static final int SERVICE_PORT = 13;

    public static void main(String[] args) {
        try {
            ServerSocket server = new ServerSocket(SERVICE_PORT); //membuat socketserver dengan nomor port yang di tentukan
            System.out.println("Daytime service started");
            for (;;) {
                Socket nextClient = server.accept(); //client menerima untuk koneksi ke server socket
                System.out.println("Received request from :\n" + "Alamat \t : " + nextClient.getInetAddress() + " :" + "Port \t : " + nextClient.getPort());
                BufferedReader br = new BufferedReader(new InputStreamReader(nextClient.getInputStream()));
                String data = br.readLine();

                System.out.println("Result \t : " + data);
                OutputStream os = nextClient.getOutputStream();
                PrintStream ps = new PrintStream(os);
                if (data.equalsIgnoreCase("assalamualaikum")) {
                    ps.println("waalaikumsalam");
                } else {
                    ps.println("("+data +")"+ " data yang anda masukkan akan saya simpan");
                }
                os.flush();
                os.close(); //menutup koneksi socket
                nextClient.close();

            }
        } catch (BindException be) {
            System.out.println("Error " + be);
        } catch (IOException ioe) {
            System.out.println("Error " + ioe);
        }
    }
}
