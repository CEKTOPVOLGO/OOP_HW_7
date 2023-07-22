import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a, b, c;
        System.out.println("Введите первое число в виде z1 = a1 + b1 * i.");
        InputNumber inputNumber = new InputNumber();
        a = inputNumber.input("a1");
        b = inputNumber.input("b1");
        NumComplex z1 = new NumComplex(a, b);
        System.out.println("Введите второе число в виде z2 = a2 + b2 * i.");
        a = inputNumber.input("a2");
        b = inputNumber.input("b2");
        NumComplex z2 = new NumComplex(a, b);
        System.out.println("Что Вы хотите сделать с числами? 1: z1 + z2, 2: z1 - z2, 3: z1 * z2.");
        c = inputNumber.input("c");
        Complex complex = new Complex(z1, z2, c);
        complex.Parse();
    }

}
