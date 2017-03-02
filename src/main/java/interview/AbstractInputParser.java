package interview;

/**
 * User: kink
 * Date: 2012.09.10
 * Time: 21:56
 */
public abstract class AbstractInputParser {
    protected InputReader reader;

    protected CommandProcessor processor;

    public AbstractInputParser(InputReader reader, CommandProcessor processor) {
        this.reader = reader;
        this.processor = processor;
    }

    public abstract void processInput();
}
