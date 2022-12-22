import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a list of integers separated by spaces: ");
        String input = sc.nextLine();
        String[] inArr = input.split(" ");
        int[] numbers = new int[inArr.length];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(inArr[i]);
        }

        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }

        double average = sum / (double) numbers.length;

        System.out.println("The average value is " + average);
    }
}