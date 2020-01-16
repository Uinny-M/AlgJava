package Less_5;

import java.util.List;

/**
 * Created by mma on 16.01.2020.
 */
public class Main {
    public static void main(String[] args) {
//        System.out.println(fact(5));
//        System.out.println(recFact(5));
//        System.out.println(fibo(47));
//        System.out.println(recFibo(10));
//        System.out.println(triangleNum(5));
//        System.out.println(recTriangleNum(5));
//        System.out.println(recMultipy(3, 8));
//        System.out.println(sumDigit(46723));
//        System.out.println(recSumDigit(46723));
        System.out.println(exponent(4, 3));
        System.out.println(recExponent(4, 3));

        //Задача о рюкзаке
        Backpack backpack1 = new Backpack(10);
        MyArray store = new MyArray(10);
        store.add(new Subject("Яблоко", 1, 100));
        store.add(new Subject("Гиря", 8, 100));
        store.add(new Subject("Планшет", 3, 2700));
        store.add(new Subject("кошелек", 2, 1000));
        store.add(new Subject("блокнот", 2, 100));
        store.add(new Subject("учебник", 2, 500));
        store.add(new Subject("свитер", 1, 300));
        store.add(new Subject("косметичка", 2, 2000));
        store.add(new Subject( 4, 600));


        backpack1.filling(store);

    }

    static int fact(int n) {
        int value = 1;
        for (int i = 1; i <= n; i++) {
            value *= i;
        }
        return value;
    }

    static int recFact(int n) {
        if (n <= 1) {
            return 1;
        }
        return recFact(n - 1) * n;
    }

    static long fibo(int n) {
        long a = 1;
        long b = 1;
        for (int i = 3; i <= n; i++) {
            b = b + a;
            a = b - a;
        }
        return b;
    }

    static long recFibo(int n) {
        System.out.print(n + " ");
        if (n < 3) {
            return 1;
        }
        return recFibo(n - 1) + recFibo(n - 2);
    }

    static int triangleNum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    static int recTriangleNum(int n) {
        if (n == 1) {
            return 1;
        }
        return recTriangleNum(n - 1) + n;
    }

    static int recMultipy(int a, int b) {
        if (b == 1) {
            return a;
        }
        return recMultipy(a, b - 1) + a;
    }

    static int sumDigit(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    static int recSumDigit(int n) {
        if (n < 10) {
            return n;
        }
        return recSumDigit(n / 10) + n % 10;
    }

    //Возведение в степень
    static int exponent(int a, int n) {
        int result = 1;
        while (n > 0) {
            result *= a;
            n--;
        }
        return result;
    }

    static int recExponent(int a, int n) {
        if (n == 0) {
            return 1;
        }
        return recExponent(a, n - 1) * a;
    }


}
