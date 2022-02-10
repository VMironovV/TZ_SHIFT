import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Writer {

    private File file;

    public Writer(String filename) {
        file = new File(filename);
    }

    public void write(Integer element){
        try(FileWriter writer = new FileWriter(file, true))
        {
            writer.write(element);
            writer.append('\n');
            writer.flush();
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