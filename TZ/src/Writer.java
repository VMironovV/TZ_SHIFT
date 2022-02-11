import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Writer {

    private File file;

    private final FileWriter fWriter;

    public Writer(String filename) throws IOException {
        file = new File(filename);
        fWriter = new FileWriter(file, false);
    }

    public void write(String element){
        try{
            fWriter.write(element);
            fWriter.append('\n');
            fWriter.flush();
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }
    }

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }
}
