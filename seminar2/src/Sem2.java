import java.util.Scanner;

public class Sem2
{
    public static void main (String[] args){

        Equation();
    }
    public static int GetNumber()
    {
        Scanner numbers = new Scanner(System.in); //получение чего-то с клавиатуры
        int number;
        while (true)
        {
            try {                        // пробуем получить целое число от пользователя
                System.out.print("Введите число: ");
                number = numbers.nextInt();   //получаем целое число
                break;
            } catch (Exception e) {      //если что-то пошло не так, сообщаем об ошибке и предлагаем попробовать снова
                System.out.print("Ошибка ввода.");
            }

        }
        return number;
    }
    public static String GetString()
    {
        Scanner str = new Scanner(System.in);
        String equation;
        System.out.print("Введите формулу: ");
        equation = str.nextLine();
        return equation;
    }
    public static void Equation()
    {
        String equation = GetString();
        equation = String.format(equation).replace(" ", ""); //заменяем все пробелы на устоты, т е убираем пробелы
        System.out.print(equation);
        String[] st1 = equation.split("\\+");   //отделяем в уравнении часть до "+" и часть после "+", т.е.сохранили первое слагаемое в выражении
        String[] st2 = st1[1].split("=");    //теперь оделили часть до знака "=" и после, наприме, при сложении сохранили второе слаг. и сумму
        String[] st3 = new String[3];

        st3[0] = st1[0];
        st3[1] = st2[0];
        st3[2] = st2[1];
        for (int i = 0; i <3; i ++)
        {
           st3[i] = String.format(st3[i]).replace("?", "");

        }
        int number = GetNumber();
        int num = Integer.parseInt(st3[0]) * number + number * Integer.parseInt(st3[1]);
        if (num != Integer.parseInt(st3[2])) {
           System.out.print ("Число не подходит");
       }else {
            System.out.print("Всё хорошо");
        }
    }
}
