public class DiffString{
    public static void main(String[] args) {

    // 1. Different ways creating a string
        String s1 = "Mohd";
        @SuppressWarnings("RedundantStringConstructorCall")
        String s2 = new String("Mohib Uddin");
        System.out.println("1. s1: " + s1);
        System.out.println("   s2: " + s2);

    // 2. Concatenating two strings using + operator
        String s3 = s1 + " " + s2;
        System.out.println("\n2. Concatenated String: " + s3);

    // 3. Finding the length of the string
        System.out.println("\n3. Length of s3: " + s3.length());

        // 4. Extract a string using Substring
        String sub = s3.substring(0, 5);
        System.out.println("\n4. Substring: " + sub);

        // 5. Searching in strings using indexOf()
        int index = s3.indexOf("Mohib");
        System.out.println("\n5. Index of 'Mohib': " + index);

    // 6. Matching a String Against a Regular Expression With matches()
        String patternStr = "aBc123";
        boolean isMatch = patternStr.matches("[a-z]+[0-9]+");
        System.out.println("\n6. Matches pattern [a-z]+[0-9]+: " + isMatch);

    // 7. Comparing strings using equals()
        String strA = "Java";
        String strB = "Java";
        System.out.println("\n7. equals(): " + strA.equals(strB));

        // 8. equalsIgnoreCase(), startsWith(), endsWith(), compareTo()
        String strC = "Mohib";
        String strD = "mohib";
        System.out.println("\n8. equalsIgnoreCase(): " + strC.equalsIgnoreCase(strD));
        System.out.println("   startsWith(\"Mo\"): " + strC.startsWith("Mo"));
        System.out.println("   endsWith(\"ib\"): " + strC.endsWith("ib"));
        System.out.println("   compareTo(): " + strC.compareTo(strD)); 

    // 9. Trimming strings with trim()
        String untrimmed = "   Java is powerful   ";
        System.out.println("\n9. Before trim: '" + untrimmed + "'");
        System.out.println("   After trim: '" + untrimmed.trim() + "'");

        // 10. Replacing characters in strings with replace()
        String replaced = untrimmed.replace("powerful", "awesome");
        System.out.println("\n10. Replaced: " + replaced.trim());

        // 11. Splitting strings with split()
        String fruits = "Apple,Orange,Banana";
        String[] fruitArray = fruits.split(",");
        System.out.println("\n11. Splitted fruits:");
        for (String fruit : fruitArray) {
            System.out.println("   " + fruit);
        }

    // 12. Converting Numbers to Strings with valueOf()
        int number = 100;
        String numStr = String.valueOf(number);
        System.out.println("\n12. Number to String using valueOf(): " + numStr);

    // 13. Converting Integer objects to Strings
        Integer objNum = 200;
        String objStr = objNum.toString();
        System.out.println("13. Integer object to String: " + objStr);

    // 14. Converting to uppercase and lowercase
        String mixed = "Java Programming";
        System.out.println("\n14. Uppercase: " + mixed.toUpperCase());
        System.out.println("    Lowercase: " + mixed.toLowerCase());
    }
}
