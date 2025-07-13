import java.util.Scanner;

public class ReadingInput {
    public static void main(String[] args) {
        //reading file from the terminal window using System.in
        //all the methods starts with .next
        //system.out used to print on the terminal
        // System.out.println allows you type in the next line;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Name: ");
        String name = scanner.nextLine().trim();
        System.out.println("You are " + name);
    }
}
