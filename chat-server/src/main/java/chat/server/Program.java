package chat.server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.UnknownHostException;

public class Program {

    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(8888);
            Server server = new Server(serverSocket);
            server.runServer();
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }

}
