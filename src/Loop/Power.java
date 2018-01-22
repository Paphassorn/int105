package Loop;

import java.util.Scanner;

public class Power {

    public static void bp(int base, int pow) {
        int count = 0;
        int ans = 1;
        while (count < pow) {
            ans = ans * base;
            count++;
        }
        System.out.println("result: " + ans);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base: ");
        int base = sc.nextInt();
        System.out.print("Enter power: ");
        int pow = sc.nextInt();
        bp(base, pow);

    }
}
