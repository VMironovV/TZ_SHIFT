import java.io.*;

public class Reader {

    private File file;

    public Reader(String filename) {
        file = new File(filename);
    }

    public String read(){
        try {
            //создаем объект FileReader для объекта File
            FileReader fr = new FileReader(file);
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
