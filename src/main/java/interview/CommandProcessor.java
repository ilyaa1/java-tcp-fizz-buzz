package interview;

/**
 * User: kink
 * Date: 2012.09.10
 * Time: 21:56
 */
public interface CommandProcessor {
    void processCommand(String command);

    void processError(String errorMessage);
}
