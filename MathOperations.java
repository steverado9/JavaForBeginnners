public class MathOperations {
    public static void main(String[] args) {
        //converts a float to an integer
        int result = Math.round(1.1F);
        System.out.println(result);
        //converts a float to the nearest whole number
        int answer = (int) Math.ceil(1.1F);
        System.out.println(answer);

        int solution = (int)Math.floor(1.1F);
        System.out.println(solution);

        int maxNumber = Math.max(1, 2);
        System.out.println(maxNumber);

        //Math.random
        int randomNumber = (int) (Math.random() * 100);
        System.out.println(randomNumber);
    }
}
