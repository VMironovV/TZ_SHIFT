public class Main {

    public static void main(String[] args){

        ArgsParser argsParser = new ArgsParser(args);
        Parser.parser(argsParser.getReaders(), argsParser.getData(), argsParser.getSort(), argsParser.isDefaultSort(), argsParser.getWriter());






    }
}
