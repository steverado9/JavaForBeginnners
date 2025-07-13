public class LogicalOperator {
    public static void main(String[] args) {
        int temperature = 22;
        boolean isWarm = temperature > 20 && temperature < 30;
        System.out.println(isWarm);

        boolean hasHighIncome = true;
        boolean hasGoodCredit = true;
        boolean hasCriminalRecord = false;
        boolean isEligoble = (hasHighIncome || hasGoodCredit) && !hasCriminalRecord;
        System.out.println(isEligoble);
    }
}
