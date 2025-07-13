public class EscapeSequence {
    public static void main(String[] args) {
        //escaping double quotes
        String message = "isaac\"stephen\"";
        System.out.println(message);
        //escaping backslash
        String path = "c\\Windows\\...";
        System.out.println(path);
        //add a new line
        String newLine = "c\nWindows";
        System.out.println(newLine);
        //adding tab
        String aTab = "c\tWindow";
        System.out.println(aTab);
    }
}
