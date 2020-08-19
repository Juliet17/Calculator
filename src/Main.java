import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        final Scanner scanner = new Scanner(System.in);

        if (scanner.hasNextInt()) {
            try {
                int a = scanner.nextInt();
                char oper = scanner.next().charAt(0);
                int b = scanner.nextInt();

                if (a > 0 && a <= 10 && b > 0 && b <= 10) {

                    int result = Calculator.calculate(a, oper, b);

                    System.out.println(result);
                } else {
                    System.out.println("Please, enter positive integer numbers from 0 to 10");
                }

            } catch (InputMismatchException e) {
                System.out.println("Wrong number! Please, enter integer numbers");
            }
        } else {
            String problem = scanner.nextLine();  // getting the string with roman numbers
            String[] symbols = problem.split("\\s");
            String a = String.valueOf(symbols[0]);
            String b = String.valueOf(symbols[2]);
            String oper_s = symbols[1];
            char oper = oper_s.charAt(0);

            int arabic_a = Converter.romanToArabic(a);
            int arabic_b = Converter.romanToArabic(b);

            if (arabic_a > 0 && arabic_a <= 10 && arabic_b > 0 && arabic_b <= 10) {
                int result = Calculator.calculate(arabic_a, oper, arabic_b);
                String result_roman = Converter.arabicToRoman(result);
                System.out.println(result_roman);
            } else {
                System.out.println("Please, enter a roman number from I to X");
            }
        }



    }
}
