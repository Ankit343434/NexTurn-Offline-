public class StringMethod {
    public static void main(String[] args) {
        String str = "  Hello World  "; // Sample string with spaces
        String anotherStr = "hello world";

        // 1. String Length & Character Access
        System.out.println("Length of str: " + str.length()); // Get string length
        System.out.println("Character at index 1: " + str.charAt(1)); // Get character at index 1

        // 2. String Comparison
        System.out.println("Equals (case-sensitive): " + str.equals(anotherStr)); // Case-sensitive comparison
        System.out.println("Equals (ignore case): " + str.equalsIgnoreCase(anotherStr)); // Case-insensitive comparison
        System.out.println("CompareTo: " + str.compareTo(anotherStr)); // Lexicographic comparison
        System.out.println("CompareTo Ignore Case: " + str.compareToIgnoreCase(anotherStr)); // Lexicographic ignoring case

        // 3. String Searching
        System.out.println("Contains 'World': " + str.contains("World")); // Check if contains substring
        System.out.println("Starts with '  He': " + str.startsWith("  He")); // Check if starts with
        System.out.println("Ends with 'ld  ': " + str.endsWith("ld  ")); // Check if ends with
        System.out.println("Index of 'o': " + str.indexOf('o')); // First occurrence of 'o'
        System.out.println("Last index of 'o': " + str.lastIndexOf('o')); // Last occurrence of 'o'

        // 4. String Modification
        System.out.println("Lowercase: " + str.toLowerCase()); // Convert to lowercase
        System.out.println("Uppercase: " + str.toUpperCase()); // Convert to uppercase
        System.out.println("Trimmed: '" + str.trim() + "'"); // Remove spaces at start and end
        System.out.println("Replace 'o' with 'X': " + str.replace('o', 'X')); // Replace characters
        System.out.println("Replace 'World' with 'Java': " + str.replaceAll("World", "Java")); // Replace words

        // 5. Substring Extraction
        System.out.println("Substring from index 2: " + str.substring(2)); // Extract from index 2
        System.out.println("Substring from 2 to 7: " + str.substring(2, 7)); // Extract between 2 and 7

        // 6. String Splitting & Joining
        String[] words = str.trim().split(" "); // Split by space
        System.out.println("Split words: ");
        for (String word : words) {
            System.out.println(word);
        }
        System.out.println("Joined words: " + String.join("-", words)); // Join words with '-'

        // 7. String Conversion
        int number = 123;
        System.out.println("String value of 123: " + String.valueOf(number)); // Convert number to string
        char[] charArray = str.toCharArray(); // Convert string to character array
        System.out.println("Character Array: ");
        for (char ch : charArray) {
            System.out.print(ch + " ");
        }
    }
}
