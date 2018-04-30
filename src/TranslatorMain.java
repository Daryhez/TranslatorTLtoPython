import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class TranslatorMain {
    public static void main(String[] args) throws Exception {
        TLONLexer lexer = new TLONLexer(CharStreams.fromStream(System.in));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        TLONParser parser = new TLONParser(tokens);
        ParseTree tree = parser.parse();
        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(new Listener(), tree);
    }
}
