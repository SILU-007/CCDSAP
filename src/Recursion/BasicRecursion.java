package Recursion;

public class BasicRecursion {

    public static String subsequences(String word) {
            if (word.isEmpty()) {
                    return ""; // base case
                 } else {
                     char firstLetter = word.charAt(0);
                     String restOfWord = word.substring(1);

                     String subsequencesOfRest = subsequences(restOfWord);
                System.out.println("REturned: "+subsequencesOfRest);
                     String result = "";
                     for (String subsequence : subsequencesOfRest.split(",", -1)) {
                         result += "," + subsequence;
                             result += "," + firstLetter + subsequence;
                         }
                System.out.println("REsult  :"+result);
                     result = result.substring(1); // remove extra leading comma
                System.out.println("Formatted:"+result);
                return result;
                 }
         }
    public static void main(String[] args) {
      subsequences("abc");
    }

}
