package EC;

/**
 * ============================================================================
 * CLASS: String_char
 * ============================================================================
 * Description:
 *   Demonstrates String to Character Array conversion (`toCharArray()`),
 *   character traversal, and finding unique/non-repeating characters in a String.
 * 
 * Logic:
 *   1. Convert String to `char[]`.
 *   2. Iterate over each character and count occurrences across the array.
 *   3. If count == 1, print the unique non-repeating character.
 * ============================================================================
 */
public class String_char {

    public static void main(String[] args) {
        String str = "Hieehhhiii";
        System.out.println("========== String to Char Array & Frequency Analysis ==========");
        System.out.println("Original String: " + str);

        // 1. Converting String to char array and printing characters
        char[] ch = str.toCharArray();
        System.out.print("Character Elements: ");
        for (int i = 0; i < ch.length; i++) {
            System.out.print(ch[i] + " ");
        }
        System.out.println("\n--------------------------------------------------------------");

        // 2. Finding non-repeating unique characters (frequency count == 1)
        System.out.println("Unique (Non-repeating) Characters in String:");
        for (int i = 0; i < ch.length; i++) {
            int count = 0;
            for (int j = 0; j < ch.length; j++) {
                if (ch[i] == ch[j]) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.println("-> " + ch[i]);
            }
        }
    }
}
