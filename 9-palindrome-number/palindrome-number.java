class Solution {
    public boolean isPalindrome(int x) {

        /*
        Initialize reversed_number = 0
            Loop while number > 0
                Multiply reversed_number by 10 and add number % 10 to reversed_number
                 reversed_number = reversed_number*10 + number %10;
            Divide the number by 10
            Return reversed_number
         */
        int original = x;

        int reversed = 0;
        while (x > 0) {
            reversed = reversed * 10 + x % 10;
            x = x / 10;
        }

        if (original == reversed) {
            System.out.println("palindrome");
            return true;
        } else {
            System.out.println("not palindrome");
            return false;
        }

    }
}