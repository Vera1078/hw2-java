import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Sem2_task2 {

    public static void main(String[] args) {
        Equation();
    }

    public static String GetString() {
        Scanner str = new Scanner(System.in);
        String equation;
        System.out.println("Введите формулу: ");
        equation = str.nextLine();
        return equation;
    }

    public static void Equation() {
        states.put("0", 0);
        //Map<String, Integer> states = new HashMap<String, Integer>();
        Scanner str = new Scanner(System.in);
        // a + b + c + d + c
        String equation = GetString();
        equation = String.format(equation).replace(" ", ""); //заменяем все пробелы на устоты, т е убираем пробелы
        String[] st1 = equation.split("\\+");
        //int[] numbers = new int[st1.length];
        int sum = 0;
        for (int i = 0; i < st1.length; i++) {
            for (Map.Entry<String, Integer> item : states.entrySet()) {
                //System.out.print(item.getKey());
                if (item.getKey() != st1[i]) {
                    //int num = str.nextInt();
                    states.put(st1[i], str.nextInt());
                    //sum += num;
                    break;
                }
            }

        }
        for (Map.Entry<String, Integer> item : states.entrySet()) {
            sum += item.getValue();


            System.out.print(sum);


        }
    }
}

