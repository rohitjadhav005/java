
public class stringop3 {

    public static void main(String[] args) {

        String name = "MADAM";

        int start = 0;
        int end = name.length() - 1;

        boolean isPalindrome = true;

        while (start < end) {

            if (name.charAt(start) != name.charAt(end)) {
                isPalindrome = false;
                break;
            }

            start++;
            end--;
        }

        if (isPalindrome) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }

}
