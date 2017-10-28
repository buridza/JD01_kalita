package taskFrom613;//package src;

import java.util.Arrays;

/**
 * Created by Denis on 23.10.2017.
 */
public class Main {

    public static void t1(int n) {
        //  1. Сумма двух первых цифр заданного четырехзначного числа равна сумме двух его последних цифр.
        System.out.println((n % 10 + n / 10 % 10) == (n / 1000 % 10 + n / 100 % 10));
    }

    public static void t2(int n) {
        //  2. Сумма цифр данного трехзначного числа N является четным числом.
        System.out.println((n % 10 + n / 10 % 10 + n / 100 % 10) % 2 == 0);
    }

    public static void t3(int x1, int x2, int x, int y) {
        // 3. Точка с координатами (х, у) принадлежит части плоскости, лежащей между прямыми х = т, х= п (т < п).
        System.out.println(x > x1 && x < x2);
    }

    public static void t4(int a) {
        //4. Квадрат заданного трехзначного числа равен кубу суммы цифр этого числа.
        System.out.println(Math.pow(a, 3) == (a % 10 + a / 10 % 10 + a / 100 % 10));
    }

    public static void t5(int n) {
        //   5. Целое число N является четным двузначным числом.
        System.out.println(n < 100 && n > 9 && n % 2 == 0);
    }

    public static void t6(int a, int b, int c) {
        // 6. Треугольник со сторонами а, b, с является равносторонним.
        System.out.println((a == b && b == c) && (a / Math.sin((double) a) == b / Math.sin((double) b)));
    }

    public static void t7(int a, int b, int c) {
        //  7. Треугольник со сторонами a, b, с является равнобедренным.
       /* boolean test= (a/Math.sin((double)a)==b/Math.sin((double)b))&&(a/Math.sin((double)a)==c/Math.sin((double)c));
        if(test) {
            if (a == b && a != c) {
                System.out.println(true);
            }
            if (a == c && a != b) {
                System.out.println(true);
            }
            if (c == b && a != c) {
                System.out.println(true);
            }
        }else System.out.println(false);*/
        System.out.println(!((a != b && a != c && c != b) || (a == b && a == c)));

         /*  int min = Math.min(a, Math.min(b, c));
           int max = Math.max(a, Math.max(b, c));
           a = b = max;
           c = min;*/

    }

    public static void t8(int a, int b, int c) {
        //  8. Среди чисел а, b, с есть хотя бы одна пара взаимно противоположных.
        System.out.println(a == -b || a == -c || b == -c);

    }

    public static void t9(int a, int b, int c, int d) {
        //9. Числа а и b выражают длины катетов одного прямоугольного треугольника, а с и d — другого. Эти треугольники являются подобными.
        System.out.println(a - c == b - d);
    }

    public static void t10(int a, int b, int c, int d, int e, int f) {
        // 10. Даны три стороны одного и три стороны другого треугольника. Эти треугольники равновеликие, т.е. имеют равные площади.
        double p1 = (a + b + c) / 2;
        double p2 = (d + e + f) / 2;
        System.out.println(Math.sqrt(p1 * (p1 - a) * (p1 - b) * (p1 - c)) == Math.sqrt(p2 * (p2 - d) * (p2 - e) * (p2 - f)));
    }

    public static void t11(int a, int b, int c) {
        //  11. Данная тройка натуральных чисел а, b, с является тройкой Пифагора, т.е. c2 = a2 + b2.
        System.out.println(c * c == (a * a + b * b));
    }

    public static void t12(int n) {
        //12. Все цифры данного четырехзначного числа N различны.
        int a = n % 10;
        int b = n / 10 % 10;
        int c = n / 1000 % 10;
        int d = n / 100 % 10;
        int[] arr = {a, b, c, d};
        Arrays.sort(arr);
        System.out.println(arr[0] < arr[1] && arr[1] < arr[2] && arr[2] < arr[3]);
    }

    public static void t13(int x, int y) {
        // 13. Данные числа х, у являются координатами точки, лежащей в первой координатной четверти.
        System.out.println(x > 0 && y > 0);
    }

    public static void t14(int x1, int y1, int x2, int y2, int ax, int ay) {
        //14. (x1, y1) и (х2, y2) — координаты левой верхней и правой нижней вершин прямоугольника. Точка А(х, у) принадлежит прямоугольнику.
        System.out.println(ax > x1 && ax < x2 && ay < y1 && ay > y2);
    }

    public static void t15(double a, double b, double c) {
        //   15. Число с является средним арифметическим чисел а и b.
        System.out.println((a + b) / 2 == c);
    }

    public static void t16(int n) {
        //16. Натуральное число N является точным квадратом.
        System.out.println(Math.sqrt(n) * 10 % 10 == 0);
    }

    public static void t17(int n) {
        //17. Цифры данного четырехзначного числа N образуют строго возрастающую последовательность.
        int d = n % 10;
        int c = n / 10 % 10;
        int b = n / 100 % 10;
        int a = n / 1000 % 10;
        //int[] arr = {a,b,c,d};
        //Arrays.sort(arr);
        System.out.println(d > c && c > b && b > a);
    }

    public static void t18(int n) {
        //18. Цифры данного трехзначного числа N являются членами арифметической прогрессии.
        int d = n % 10;
        int c = n / 10 % 10;
        int b = n / 100 % 10;
        //int a=n/1000%10;
        System.out.println((d - c) == (c - b));
    }


    public static void t19(int n) {
        // 19. Цифры данного трехзначного числа N являются членами геометрической прогрессии.
        int d = n % 10;
        int c = n / 10 % 10;
        int b = n / 100 % 10;
        //int a=n/1000%10;
        System.out.println((d - c) == (c - b));
    }

    public static void t20(int a, int b, int c) {
        // 20. Данные числа с и d являются соответственно квадратом и кубом числа а.
        System.out.println(a == c * c && a == b * b * b);
    }

    public static void t21(int n, int m) {
        // 21. Цифра М входит в десятичную запись четырехзначного числа N.
        System.out.println(m == n / 10 % 10);
    }

    public static void t22(int n) {
        //  22. Данное четырехзначное число читается одинаково слева направо и справа налево.
        System.out.println(n / 1000 % 10 == n % 10 && n / 100 % 10 == n / 10 % 10);
    }

    public static void t23(int x, int y, int x1, int y1) {
        // 23. Шахматный конь за один ход может переместиться с одного заданного поля на другое (каждое поле задано двумя координатами — целыми числами от 1 до 8).
        System.out.println((x == x1 - 2 || x == x1) && (y == y1 - 1 || y == y1 + 1));
    }

    public static void t24(int n) {
        // 24. В заданном натуральном трехзначном числе N имеется четная цифра.
        System.out.println(0 == n % 10 % 2 || n / 100 % 10 % 2 == 0 || 0 == n / 10 % 10 % 2);
    }

    public static void t25(int n) {
        // 25. Сумма каких-либо двух цифр заданного трехзначного натурального числа N равна третьей цифре.
        int a = n % 10;
        int b = n / 10 % 10;
        // int c=n/1000%10;
        int d = n / 100 % 10;
        int[] arr = {a, b, d};
        Arrays.sort(arr);
        for (int h : arr
                ) {
            System.out.println(h);

        }
        System.out.println(arr[2] == (arr[1] + arr[0]));
        String s1=null;
        System.out.println(s1);
    }

    public static void t26(int N, int a) {
        //  26. Заданное число N является степенью числа а (показатель степени может находиться в диапазоне от 0 до 4).
        System.out.println(Math.pow(a, 0) == N || Math.pow(a, 1) == N || Math.pow(a, 2) == N || Math.pow(a, 3) == N || Math.pow(a, 4) == N);
    }

    public static void main(String[] args) {
        t25(523);

        //System.out.println();
    }
}
