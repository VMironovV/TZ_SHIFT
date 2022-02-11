import java.util.ArrayList;

public class ArgsParser {
    private char sort;

    public char getSort() {
        return sort;
    }

    public char getData() {
        return data;
    }

    public boolean isDefaultSort() {
        return defaultSort;
    }

    public Writer getWriter() {
        return writer;
    }

    public ArrayList<Reader> getReaders() {
        return readers;
    }

    private char data;

    private boolean defaultSort = false;

    private Writer writer;

    private String[] args;

    private ArrayList<Reader> readers = new ArrayList<>();

    public ArgsParser(String[] args) {
        this.args = args;
    }

    public void argsParsing() {
        switch (args[0]) {
            case "-a", "-d" -> {
                sort = args[0].charAt(1);
                switch (args[1]) {
                    case "-s", "-i" -> data = args[1].charAt(1);
                }
            }
            case "-s", "-i" -> {
                sort = 'a';
                defaultSort = true;
                data = args[0].charAt(1);
            }
        }
        if(!defaultSort){
            writer = new Writer(args[2]);
        }else{
            writer = new Writer(args[1]);
        }
        int i;
        if(!defaultSort){
            i = 3;
        }else{
            i = 2;
        }
        for( ; i < args.length; i++){
            Reader reader = new Reader(args[i]);
            readers.add(reader);
        }
    }
}
