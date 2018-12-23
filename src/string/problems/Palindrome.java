package string.problems;

public class Palindrome {
    public static void main(String[] args) {
        String originalStr = "CAT";
        String reverseStr = ""; // Objects of String class

        int length = originalStr.length();
        for ( int i = length - 1; i >= 0; i-- )
            reverseStr = reverseStr + originalStr.charAt(i);

        if (originalStr.equals(reverseStr))
            System.out.println(originalStr + " -- word is a palindrome");
        else
            System.out.println(originalStr + " -- word is not a palindrome");
    }
}


