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
public class No1_LocalHostDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws UnknownHostException {
        System.out.println("Looking up local host");
        InetAddress localAddress = InetAddress.getLocalHost();
        System.out.println("Name: " + localAddress.getHostName());
        System.out.println("IP Address: " + localAddress.getHostAddress());
        System.out.println(localAddress);
    }
}
