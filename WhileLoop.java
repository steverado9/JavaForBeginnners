import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
//        int i = 5;
//        while (i > 0) {
//            System.out.println("Hello world " + i);
//            i--;
//        }
        //An example to check when a  user types quit
        Scanner scanner = new Scanner(System.in);
        String input = "";
        //we cannot use comparison operator cos string is a reference type
        //we use a string method
        while (!input.equals("quit")) {
            System.out.print("Input: ");
            input = scanner.next().toLowerCase();
            System.out.println(input);
        }
    }
}
