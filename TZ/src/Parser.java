import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Parser {

    public static void parser(ArrayList<Reader> readers, char data, char sort, boolean defaultSort, Writer writer){

        ArrayList<Integer> numbers = new ArrayList<>();

        while(!numbers.isEmpty() || !readers.isEmpty()){
            for (Reader reader : readers){
                String string = reader.read();
                if(string == null){
                    readers.remove(reader);
                }else {
                    if (data == 'i') {
                        numbers.add(Integer.parseInt(string));

                    } else {
                        numbers.add(string.length());
                    }
                }
            }
            Collections.sort(numbers);
            if (sort == 'a') {
                writer.write(numbers.remove(0));
            } else {
                writer.write(numbers.get(numbers.size() - 1));
            }

        }

    }

}
