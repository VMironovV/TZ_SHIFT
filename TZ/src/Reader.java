import java.io.*;

public class Reader {

    private File file;

    FileReader fr;

    public Reader(String filename) throws FileNotFoundException {
        file = new File(filename);
        fr = new FileReader(file);
    }

    public String read(){
        try {
            //создаем BufferedReader с существующего FileReader для построчного считывания
            BufferedReader reader = new BufferedReader(fr);
            // считаем сначала первую строку
            return reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }


}
