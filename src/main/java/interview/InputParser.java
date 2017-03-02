package interview;

import java.util.ArrayList;

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
                    // String finalCommand = commands.stream().collect(Collectors.joining("\n"));
                    processor.processCommand(String.join("\n", commands));
                }
            }
        }
        catch (Exception ex) {
            processor.processError(ex.getMessage());
        }
    }
}
