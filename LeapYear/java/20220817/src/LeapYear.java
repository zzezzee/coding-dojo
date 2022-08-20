import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("연도: ");
        int year = scanner.nextInt();

        if(year>=1900 && year<=2022){
            if (year % 400 == 0) {
                System.out.println(true);
                return;
            }
            if (year % 4 == 0 && year % 100 == 0){
                System.out.println(false);
                return;
            }
            if (year % 4 == 0) {
                System.out.println(true);
                return;
            }
            System.out.println(false);
        }
    }
}
