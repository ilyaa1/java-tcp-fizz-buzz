package interview;

import org.easymock.EasyMock;
import org.easymock.IMocksControl;
import org.junit.Before;

public class InputParserTest {

    private IMocksControl control;

    private CommandProcessor processor;
    private InputReader reader;

    InputParser parser;

    @Before
    public void setup() {
        control = EasyMock.createControl();

        processor = control.createMock(CommandProcessor.class);
        reader = control.createMock(InputReader.class);

        parser = new InputParser(reader, processor);
    }

//
//    @Test
//    public void assignmentExampleTest() {
//        expect(reader.getNextLine()).andReturn("begin");
//        expect(reader.getNextLine()).andReturn("abcd");
//        expect(reader.getNextLine()).andReturn("efg");
//        expect(reader.getNextLine()).andReturn("end");
//
//        processor.processCommand("abcd\nefg\n");
//        expectLastCall();
//
//        expect(reader.getNextLine()).andReturn("begin");
//        expect(reader.getNextLine()).andReturn("sdfs");
//        expect(reader.getNextLine()).andReturn("end");
//
//        processor.processCommand("sdfs\n");
//        expectLastCall();
//
//        expect(reader.getNextLine()).andReturn(null);
//
//        control.replay();
//
//        parser.processInput();
//
//        control.verify();
//    }
}
