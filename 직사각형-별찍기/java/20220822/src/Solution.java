import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int column = sc.nextInt();
        int row = sc.nextInt();


        for (int i = 0; i < row; i += 1) {
            for (int j = 0; j < column; j += 1) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}

