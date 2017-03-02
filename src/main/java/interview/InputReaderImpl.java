package interview;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class InputReaderImpl implements InputReader {
    private Socket socket;

    public InputReaderImpl(Socket socket) {
        this.socket = socket;
    }

    public String getNextLine() throws IOException {
        BufferedReader socketReader =
                new BufferedReader(new InputStreamReader(socket.getInputStream()));

        String message = socketReader.readLine();

        return message == null ? null : message.replaceAll("\n", "");
    }
}
