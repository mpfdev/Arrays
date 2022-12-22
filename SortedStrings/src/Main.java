import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a list of strings separated by spaces: ");
        String input = sc.nextLine();
        String[] inArr = input.split(" ");

        System.out.println("String list: " + Arrays.toString(inArr));
        Arrays.sort(inArr);
        System.out.println("String list: " + Arrays.toString(inArr));

    }
}