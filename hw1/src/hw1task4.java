import java.util.Scanner;
public class hw1task4 {
            public static void main(String[] args) {
            double num1;
            double num2;
            double ans;
            char op;
            Scanner reader = new Scanner(System.in);
            System.out.print("Введите первое число: ");
            num1 = reader.nextDouble();
            System.out.print("\nВведите второе число: ");
            num2 = reader.nextDouble();
            System.out.print("\nВыберите действие (+, -, *, :): ");
            op = reader.next().charAt(0);
            switch(op) {
                case '+': ans = num1 + num2;
                    break;
                case '-': ans = num1 - num2;
                    break;
                case '*': ans = num1 * num2;
                    break;
                case ':': ans = num1 / num2;
                    break;
                default:  System.out.printf("Ошибка! Выберите математическое действие правильно.");
                    return;
            }
            System.out.print("\nРезультат вычислений:\n");
            System.out.printf(num1 + " " + op + " " + num2 + " = " + ans);
        }
    }


