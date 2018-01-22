package Loop;

import java.util.Scanner;

public class Factorial {

    public static String fac(int num) {
        int ans = 1;
        int count = num;
        String result = "";

        while (count != 1) {
            ans *= count;
            result += count + "x";
            count--;
        }
        System.out.println(result + "1");
        System.out.println("result: " + ans);
        
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();
        String factorail = fac(num);

    }

}
