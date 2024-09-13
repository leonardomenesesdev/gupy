package QuestUm;

import java.util.Scanner;

public class Fibonacci {
    public static boolean verificar(int n) {
        int p;
        int a = 0;
        int b = 1;
        if (n == a || n == b) {
            return true;
        }
        while (b < n) {
            p = a + b;
            a = b;
            b = p;
        }
        return b == n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (verificar(n)) {
            System.out.println(n + " está contido na sequência fibonacci");
        } else {
            System.out.println(n + " não está na sequência fibonacci");
        }
    }
}




