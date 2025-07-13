public class typeConversion {
    public static void main(String[] args) {
        //implicit casting
        // byte > short > int > long > float > double
        short x = 1;
        int y = x + 2;
        System.out.println(y);
        //convert an int to a double, happens under the hood automatically
        double a = 1.1;
        double b = a + 2;
        System.out.println(b);
        //Explicit casting
        double v = 1.1;
        int z = (int) v + 2;
        System.out.println(z);
    }
}
