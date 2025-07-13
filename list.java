import java.util.Arrays;

public class list {
    public static void main(String[] args) {
        //accessing an array
//        int[] numbers = new int[5];
//        numbers[0] = 1;
//        numbers[1] = 2;
//System.out.println(Arrays.toString(numbers));
        int [] numbers = {2, 3, 5, 1, 4};
        Arrays.sort(numbers);
        System.out.println(numbers.length);
        System.out.println(Arrays.toString(numbers));

        //two by 3 matrix
        //two rows and 3 colums
        int[][] matrixs = {{1,2 ,3 }, {4, 5, 6}};
        matrixs[0][0] = 1;
        System.out.println(Arrays.deepToString(matrixs));

    }
}
