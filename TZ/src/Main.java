public class Main {

    private static char sort;

    private static char data;

    private static boolean defaultSort;

    public static void main(String[] args){
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
        for (int i = 0; i < args.length; i++){

        }
    }
}
