import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Parser {

    private static Integer maxValue = Integer.MIN_VALUE;
    private static Integer minValue = Integer.MAX_VALUE;

    private static Reader removingReader;

    private static boolean isDigit(String s) throws NumberFormatException {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static void parser(ArrayList<Reader> readers, char data, char sort, boolean defaultSort, Writer writer){

        HashMap<Reader, String> elements = new HashMap<>();

        outerLoop:
        while(!elements.isEmpty() || !readers.isEmpty()){
            for (Reader reader : readers){

                if(!elements.containsKey(reader)) {
                    String string = reader.read();
                    if(data == 'i' && string != null){
                        while (!isDigit(string)){
                            System.out.println("Найдено недопустимое значение: " + string);
                            string = reader.read();
                        }
                    }
                    if(string == null){
                        readers.remove(reader);
                        continue outerLoop;
                    }else {
                        elements.put(reader, string);
                    }
                }
                if (data == 'i') {
                    if (sort == 'd' && Integer.parseInt(elements.get(reader)) >= maxValue) {
                        maxValue = Integer.parseInt(elements.get(reader));
                        removingReader = reader;
                    } else if(sort == 'a' && Integer.parseInt(elements.get(reader)) <= minValue){
                        minValue = Integer.parseInt(elements.get(reader));
                        removingReader = reader;
                    }

                } else {
                    if (sort == 'd' && elements.get(reader).length() >= maxValue) {
                        maxValue = elements.get(reader).length();
                        removingReader = reader;
                    } else if(sort == 'a' && elements.get(reader).length() <= minValue){
                        minValue = elements.get(reader).length();
                        removingReader = reader;
                    }
                }
            }
            if(data == 'i') {
                if (sort == 'd') {
                    writer.write(maxValue.toString());
                    maxValue = Integer.MIN_VALUE;
                    elements.remove(removingReader);
                } else {
                    writer.write(minValue.toString());
                    minValue = Integer.MAX_VALUE;
                    elements.remove(removingReader);
                }
            }else{
                if (sort == 'd') {
                    writer.write(elements.get(removingReader));
                    maxValue = Integer.MIN_VALUE;
                    elements.remove(removingReader);
                } else {
                    writer.write(elements.get((removingReader)));
                    minValue = Integer.MAX_VALUE;
                    elements.remove(removingReader);
                }
            }



        }

    }

}
