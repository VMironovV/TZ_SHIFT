import java.io.*;
import java.util.Scanner;

public class Reader {

    private final File file;

    private final Scanner in;

    public Reader(String filename) throws FileNotFoundException {
        file = new File(filename);
        in = new Scanner(file);
    }

    public String read(){
        if(in.hasNextLine()){
            return in.nextLine();
        }
        return null;
    }


}
