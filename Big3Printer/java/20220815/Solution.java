import java.util.Scanner;

public class Solution{
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.print("할 일1: ");
        String Todo1 = scanner.nextLine();

        System.out.print("할 일2: ");
        String Todo2 = scanner.nextLine();
        
        System.out.print("할 일3: ");
        String Todo3 = scanner.nextLine();

        System.out.println("오늘 할 일 Big3는");

        System.out.println("1. "+ Todo1);
        System.out.println("2. "+ Todo2);
        System.out.println("3. "+ Todo3);
    }
}