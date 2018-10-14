import java.util.Scanner; // Подключение сканнера

public class Lab1
{
    public static void main(String arg[])
    {

        long n, fact = 1;

        Scanner sc = new Scanner(System.in); // Объявление объекта сканнера

        System.out.println("Введите число: ");

        n = sc.nextLong(); // Метод для обработки данных в диапазоне long

        for (int i = 1; i <= n; i++)
        {
            fact = fact * i;
        }
        System.out.println("Факториал = " + fact);

    }
}