package interview;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class InputParser extends AbstractInputParser {
    public InputParser(InputReader reader, CommandProcessor processor) {
        super(reader, processor);
    }

    @Override
    public void processInput() {
        ArrayList<String> commands = new ArrayList<String>();

        try {
            while (true) {
                String message = reader.getNextLine();

                if (message.equals("begin")) {
                    commands = new ArrayList<String>();
                }
                else if (message.equals("end")) {
                    String command = commands.stream().map(s -> s + "\n").collect(Collectors.joining(""));
                    processor.processCommand(command);
                }
                else if (message.equals(null)) {
                    throw new Exception("User input terminated");
                }
                else {
                    commands.add(message);
                }
            }
        }
        catch (Exception ex) {
            processor.processError(ex.getMessage());
        }
    }
}
