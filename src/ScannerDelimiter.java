import java.util.Scanner;

public class ScannerDelimiter {
    public static void main(String[] args) {

        System.out.println("args[0]"+args[0]);
        Scanner s= new Scanner(",12,45,345,6,7,3");
        s.useDelimiter("\\s*,\\s*");
            while (s.hasNextInt()) {
                System.out.println(s.nextInt());
            }
        }
}

