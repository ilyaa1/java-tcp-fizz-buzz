package interview;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class CommandServer {
    public static void main(String[] args) throws IOException {
        System.out.println("Command server is running");

        ServerSocket listener = new ServerSocket(4321);

        try {
            final Socket requestSocket = listener.accept();

            System.out.println("--- Accepted client connection");

            InputReaderImpl inputReader = new InputReaderImpl(requestSocket);
            CommandProcessorImpl commandProcessor = new CommandProcessorImpl();
            InputParser inputParser = new InputParser(inputReader, commandProcessor);

            inputParser.processInput();
        } finally {
            listener.close();
        }
    }
}
