import javax.xml.transform.Source;
import java.sql.SQLOutput;
import java.text.NumberFormat;
import java.util.Scanner;

public class MortgageCalculator {
    public static void main(String[] args) {
//        int principal = 100_000;
//        double monthlyInterestRate = 0.4704;
//        int period = 360;
//        int mortgage ;
//        int raiseTopower = (int) Math.pow(1.4704, 360);
//        System.out.println(raiseTopower);
//        int oneMinusRaiseTopower = raiseTopower - 1;
//        System.out.println(oneMinusRaiseTopower);
//        int dividedAnswer = raiseTopower/oneMinusRaiseTopower;
//        mortgage = principal * dividedAnswer;
//        NumberFormat currency = NumberFormat.getCurrencyInstance();
//        String result = currency.format(mortgage);
//        System.out.println(result);
        final byte MONTH_IN_YEAR = 12;
        final byte PERCENT = 100;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Principal: ");
        int principal = scanner.nextInt();

        System.out.print("Annual Interest Rate: ");
        float annualInterest = scanner.nextFloat();
        float monthlyInterst = annualInterest / PERCENT / MONTH_IN_YEAR;

        System.out.print("Period (Years): ");
        byte years = scanner.nextByte();
        int numberOfPayments = years * MONTH_IN_YEAR;

        double mortgage = principal
                * (monthlyInterst * Math.pow(1 + monthlyInterst, numberOfPayments))
                / (Math.pow(1 + monthlyInterst, numberOfPayments) - 1);
        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortgage: " + mortgageFormatted);


    }
}
