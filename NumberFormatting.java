import java.text.NumberFormat;

public class NumberFormatting {
    public static void main(String[] args) {
        //formatting numbers in currency format
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String result =  currency.format(1234567.891);
        System.out.println(result);

        //formatting numbers in percentage and method chaining
        String answer = NumberFormat.getPercentInstance().format(0.1);
        System.out.println(answer);
    }
}
