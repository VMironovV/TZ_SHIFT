import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        ArgsParser argsParser = new ArgsParser(args);
        if(args.length >= 3 && argsParser.argsParsing()) {
            Parser.parser(argsParser.getReaders(), argsParser.getData(), argsParser.getSort(), argsParser.isDefaultSort(), argsParser.getWriter());
        }else{
            System.out.println("Неверно заданы аргументы");
        }

    }
}
