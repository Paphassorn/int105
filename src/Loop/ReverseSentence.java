package Loop;

import java.util.Scanner;

public class ReverseSentence {
    
    public static String reSentence(String word){
        int i=0;
        String result = "";
        while(i<word.length()){
            char ch = word.charAt(i);
            result = ch+result;
            i++;       
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter word: ");
        String word = sc.nextLine();
        String reverse = reSentence(word);
        System.out.println("Reverse: "+reverse);
    }
}
