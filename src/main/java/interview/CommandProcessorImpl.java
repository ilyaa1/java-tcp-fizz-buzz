package interview;

public class CommandProcessorImpl implements CommandProcessor {
    public void processCommand(String command) {
        System.out.println("processCommand called with \"" + command + "\"");
    }

    public void processError(String errorMessage) {
        System.err.println("processError called with \"" + errorMessage + "\"");
    }
}
