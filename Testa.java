import java.util.*;

public class Testa {
    int num, b = 1, c = 0, d, x = 0;

    void adddigits() {
        Scanner scn = new Scanner(System.in);
        System.out.println("please Enter a number");
        num = scn.nextInt();
        for (int i = 1; i <= num; i++) {
            int a = i;
            for (int j = 1; j <= num; j++) {
                a = a / 10;
                if (a == 0) {
                    if (j % 2 == 1) {
                        b = j * 2;
                    }
                    if (j % 2 == 0) {
                        if (j % 4 != 0) {
                            b = j * 3;
                        }
                        if (j % 4 == 0) {
                            b = j * 4;
                        }
                    }
                    c = c + b;
                    break;
                }
            }
        }
        System.out.println(c);
        while (c != 0) {
            d = c % 10;
            x = x + d;
            c = c / 10;
            if (c == 0) {
                if (x > 9) {
                    c = x;
                    x = 0;
                }
            }
        }
        System.out.println("The Sum of numbers is= " + x);

    }

    public static void main(String[] args) {

        Testa t = new Testa();
        t.adddigits();
    }
}