import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a binary number");
        int binaryNum = sc.nextInt();
        System.out.println("Output: " + binaryToDecimal(binaryNum));
    }

    public static int binaryToDecimal(int binaryNum) {
        int output = Integer.parseInt(String.valueOf(binaryNum), 2);
        return output;

    }
}