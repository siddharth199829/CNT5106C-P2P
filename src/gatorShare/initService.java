package gatorShare;

import java.net.ServerSocket;
import java.net.Socket;

public class initService {

    private Socket socket;
    private ServerSocket server = null;

    public initService(int port) {
        System.out.println("[TEST]: Starting server...");
        try {
            socket = new Socket("192.168.0.1", 1121);
            server = new ServerSocket(port);
            System.out.println("[TEST]: Trying to establish connection to client.");
            socket = server.accept();
            System.out.println("[TEST]: Client connected.");
            socket.close();
            server.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
