/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Bab1;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 *
 * @author LAB_TI
 */
public class No3_a {

    public static void main(String[] args) throws UnknownHostException {
        String host = "localhost";
        System.out.println("Host from IP " + host + " : " + InetAddress.getByName(host).getHostAddress());
        System.out.println("Host/IP " + InetAddress.getByName(host));

        try {
            InetAddress[] ia = InetAddress.getAllByName(host);
            System.out.println(ia.length);
            for (int i = 0; i < ia.length; i++) {
                System.out.println(ia[i]);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}