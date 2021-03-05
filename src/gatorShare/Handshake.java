package gatorShare;

import java.io.IOException;
import java.net.*;
import java.util.Scanner;

public class Handshake {

    private int ID;
    private Socket socket = null;

    public Handshake(String message, int myID) {
        System.out.println(message.substring(28));
        System.out.println(myID);
    }
}
