import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a list of integers separated by spaces: ");
        String input = sc.nextLine();
        String[] inArr = input.split(" ");
        int[] numbers = new int[inArr.length];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(inArr[i]);
        }

        Arrays.sort(numbers);

        System.out.println("The array: " + Arrays.toString(numbers));
        System.out.println("The maximum value: " + numbers[numbers.length - 1]);
    }
}