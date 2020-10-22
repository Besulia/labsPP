import java.util.Scanner;

public class Class4 {
    public int num1, num2, odd=0, even=0;
    /**метод interval для введення інтервалу користувачем*/
    public void interval(){
        System.out.print("Введіть перше число з інтервалу: ");
        Scanner scan = new Scanner(System.in);
        num1=scan.nextInt();
        System.out.print("Введіть останнє число з інтервалу: ");
        num2=scan.nextInt();
    }
    /**метод evenNum для перевірки на парність і виведення за спаданням*/
    public void evenNum(){
        for(int i=num2; i>=num1; --i)
            if(i%2==0)
                System.out.print(i+ " ");
        System.out.println();
    }
    /**метод oddNum для перевірки на НЕпарність і виведення за зростанням*/
    public void oddNum() {
        for (int i = num1; i <= num2; ++i)
            if (i % 2 != 0)
                System.out.print(i + " ");
        System.out.println();
    }
    /**метод SumEvenNum для обчислення суми парних чисел */
    public int SumEvenNum(){
        int sum=0;
        for(int i=num1; i<=num2; ++i)
            if(i%2==0)
                sum+=i;
        return sum;
    }
    /**метод SumOddNum для обчислення суми НЕпарних чисел */
    public int SumOddNum(){
        int sum=0;
        for (int i = num1; i <= num2; ++i)
            if (i % 2 != 0)
                sum+=i;
        return sum;
    }
    /**метод FibRange для побудови ряду Фібоначчі за такими критеріями:
     * 1-е число найбільше НЕпарне число
     * 2-е число найбільше парне число
     * */
    public int FibRange(int length){
        int maxOdd=num1;
        int maxEven=num2;
        int fib;
        if (num2 % 2 != 0) {
            maxOdd = num2;
            maxEven=num2-1;
        }
        else if(num2%2==0) {
            maxOdd = num2-1;
            maxEven = num2;
        }
        for(int i=0; i<length; ++i){
            fib=maxOdd+maxEven;
            maxOdd=maxEven;
            maxEven=fib;
        }
        if(maxEven%2!=0)
            odd++;
        else if(maxEven%2==0)
            even++;
        return maxEven;
    }
    /**методи percentOdd та percentEven для обчислення відсотку НЕпарних і парних чисел ряду Фібоначчі */
    public int percentOdd(int length){
        return odd*100/length;
    }
    public int percentEven(int length){
        return even*100/length;
    }
}
