import java.util.Scanner;

/**
 * @author Yulia Bespalova
 * lab1
 */
public class Main {

    public static void main(String[] args) {
        Scanner arg1=new Scanner(System.in);
        //1 завдання
        System.out.println("Hello, world, I'm learning Java");
        //2 завдання
        Class_1 object=new Class_1();
        System.out.println(object.x);
        Class_1 object2=new Class_1();
        System.out.println(object.y);
        //3 завдання
        System.out.println("Напишіть 3 аргументи!");
        System.out.println("1 аргумент: " + arg1.nextInt());
        System.out.println("2 аргумент: " + arg1.nextInt());
        System.out.println("3 аргумент: " + arg1.nextInt());
        //4 завдання
        Class4 range=new Class4();
        range.interval();
        range.evenNum();
        range.oddNum();
        int savesum=range.SumEvenNum();
        System.out.println("Сума парних чисел: " + savesum);
        int savesum2= range.SumOddNum();
        System.out.println("Сума НЕпарних чисел: " +savesum2);
        System.out.print("Введіть довжину ряду Фібоначчі: " );
        int length=arg1.nextInt();
        if (range.num2 % 2 != 0) {
            System.out.print("Ряд Фібоначчі: " + range.num2 + " ");
            range.even++;
        }
        else if (range.num2 % 2 == 0) {
            System.out.print("Ряд Фібоначчі: " + (range.num2 - 1) + " ");
            range.odd++;
        }
        for(int i=0;i<length-1; ++i)
            System.out.print(range.FibRange(i)+" ");
        System.out.println("\nВідсоток НЕпарних чисел: " + range.percentOdd(length) + "%");
        System.out.println("Відсоток парних чисел: " + range.percentEven(length) + "%"); 
    }
}
