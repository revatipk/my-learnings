package algorithms.recursion;

import java.util.Scanner;

public class ReverseString {
    public static void main(String []args)
    {
        Scanner read = new Scanner(System.in);
        System.out.println("Enter the String to be reversed : ");
        String input = read.nextLine();
        System.out.println("Reverse String : "+reverseStrRecur(input));
        System.out.println("Reverse String : "+reverseStrNonRecur(input));
    }

     static String reverseStrRecur(String input)
    {
        if(input.equals(""))
        {
            return "";
        }
        return reverseStrRecur(input.substring(1)) +input.charAt(0);
    }

    static String reverseStrNonRecur(String input)
    {
        char []strToChar = input.toCharArray();
        for(int i =0;i<(input.length()/2);i++)
        {
            char temp = strToChar[i];
            strToChar[i] = strToChar[(input.length()-1)-i];
            strToChar[(input.length()-1)-i] = temp;
        }
        return new String(strToChar);
    }
}
