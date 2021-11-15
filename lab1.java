import java.util.Scanner;

public class lab1 {

    public static void main(String[] args) {
        Scanner in1 = new Scanner(System.in);
        System.out.print("Введите число: ");
        int a = in1.nextInt();

        Scanner in2 = new Scanner(System.in);
        System.out.print("Введите число: ");
        int b = in2.nextInt();

        Scanner in3 = new Scanner(System.in);
        System.out.print("Введите число: ");
        int c = in3.nextInt();

        Scanner in4 = new Scanner(System.in);
        System.out.print("Введите число: ");
        int d = in4.nextInt();

        if (a<b & a<b & a<c) {
            System.out.print ("Наименьшее число = " + a);
        }
        if (b<a & b<c & b<d) {
            System.out.print ("Нименьшее число = " + b);
        }
        if (c<a & c<b & c<d) {
            System.out.print ("Наименьшее число = " + c);
        }
        if (d<a & d<b & d<c) {
            System.out.print("Наименьшее число = " + d);
        }
        in1.close();
        in2.close();
        in3.close();
        in4.close();
        }
}
