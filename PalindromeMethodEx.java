public class PalindromeMethodEx {
    public void palindrome(int x) {
        int orignal = x;
        int rev = 0;
        while (x > 0) {
            int digit = x % 10;
            rev = rev * 10 + digit;
            x = x / 10;

        }
        if (orignal == rev) {
            System.out.println(orignal + " : Is a Palindrome Number..");
        } else {
            System.out.println(orignal + " : Is Not a palindrome number..");
        }
    }

    public static void main(String[] args) {
        PalindromeMethodEx pd = new PalindromeMethodEx();
        pd.palindrome(121);
    }
}
