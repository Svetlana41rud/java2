package lesson6;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer {
    public static void main(String[] args) {

        Socket socket = null;
        try (ServerSocket serverSocket = new ServerSocket(8189)) {
        } catch (IOException e) {
            e.printStackTrace();
            throw  new RuntimeException(e);
        }

    }
}
