import java.util.Scanner;

public class OneTimeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("급할 때 사용하는 일회용 계산기 숫자를 입력해 주세요: ");

        double number1 = scanner.nextDouble();

        System.out.println("연산자를 선택해주세요:");
        System.out.println("1. + (더하기)");
        System.out.println("2. - (빼기)");
        System.out.println("3. * (곱하기)");
        System.out.println("4. / (나누기)");

        double calculate = scanner.nextDouble();

        System.out.println("숫자를 입력해주세요: ");

        double number2 = scanner.nextDouble();

        double result;

        if(calculate == 1){
            result = number1+number2;

            System.out.print("계산 결과");
            System.out.println(result);
        }

        if(calculate == 2){
            result = number1-number2;

            System.out.print("계산 결과");
            System.out.println(result);
        }

        if(calculate == 3){
            result = number1*number2;

            System.out.print("계산 결과");
            System.out.println(result);
        }

        if(calculate == 4){
            result = number1/number2;

            System.out.print("계산 결과");
            System.out.println(result);
        }
    }
}

