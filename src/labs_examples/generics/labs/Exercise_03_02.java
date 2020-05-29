package labs_examples.generics.labs;

// 2) Write a generic method to count the number of elements in a "Collection" of Strings that are palindromes
public class Exercise_03_02 {
    public static <S extends String> void palindrome(S pali) {
        int count = 0;

        if (isPalindrome(pali) == true) {
            for (int i = 0; i < pali.length(); i++) {
                count++;
            }
            System.out.println(pali +" is palindrome and it has " + count + " elements .");
        }
        else{
            System.out.println(pali + " is not a palindrome");
        }
    }

    // Check if the string is palindrome or not
    public static boolean isPalindrome(String myString){
        int i = 0; // To point to the beginning of the string myString
        int j = myString.length() - 1; // TO point to the end of the string myString

        // Use the wile loop to go through all the character in the string to compare them
        while (i < j) {
            // if the characters do not match
            if(myString.charAt(i) != myString.charAt(j)){
                return false;
            }
            i++ ; // Increment i
            j--;  // decrement j
        }
        return true;
    }


    public static void main(String[] args) {
        String newString = "123321";
        palindrome(newString);

        String str = "noon";
        palindrome(str);

        String aStr = "farida";
        palindrome(aStr);

        String aStr1 = "12345";
        palindrome(aStr1);



    }

}
