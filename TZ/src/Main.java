public class Main {

    public static void main(String[] args){

        ArgsParser argsParser = new ArgsParser(args);
        argsParser.argsParsing();
        Parser.parser(argsParser.getReaders(), argsParser.getData(), argsParser.getSort(), argsParser.isDefaultSort(), argsParser.getWriter());






    }
}
