package EC;

/**
 * ============================================================================
 * CLASS: RealPattern
 * ============================================================================
 * Description:
 *   Advanced pattern printing algorithms featuring combinations of numbers,
 *   alphabets, alternating rows, and conditional matrix coordinates.
 * ============================================================================
 */
public class RealPattern {

    public static void main(String[] args) {
        int rows = 4;

        System.out.println("========== 1. Number Lower-Left Triangle ==========");
        for (int i = 0; i < rows; i++) {
            int num = 1;
            for (int j = 0; j < rows; j++) {
                if (i >= j) {
                    System.out.print(num++ + " ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        System.out.println("\n========== 2. Repeating Row-Number Upper-Left Triangle ==========");
        int rowVal = 1;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < rows; j++) {
                if (i + j <= rows - 1) {
                    System.out.print(rowVal + " ");
                } else {
                    System.out.print("  ");
                }
            }
            rowVal++;
            System.out.println();
        }

        System.out.println("\n========== 3. Sequential Number Matrix (Modulo Wrap at 6) ==========");
        int seqNum = 1;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.print(seqNum++ + " ");
                if (seqNum > 6) {
                    seqNum = 1;
                }
            }
            System.out.println();
        }

        System.out.println("\n========== 4. Alternating Column (Number vs Alphabet) ==========");
        int countNum = 1;
        char countChar = 'a';
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < rows; j++) {
                if (j % 2 != 0) {
                    System.out.print(countChar++ + " ");
                } else {
                    System.out.print(countNum++ + " ");
                }
            }
            System.out.println();
        }

        System.out.println("\n========== 5. Alternating Row (Number vs Alphabet) ==========");
        countChar = 'a';
        for (int i = 0; i < rows; i++) {
            int lineNum = 1;
            for (int j = 0; j < rows; j++) {
                if (i % 2 != 0) {
                    System.out.print(countChar++ + " ");
                } else {
                    System.out.print(lineNum++ + " ");
                }
            }
            System.out.println();
        }

        System.out.println("\n========== 6. Mixed Triangle Pattern (Number vs Alphabet Rows) ==========");
        int numVal = 1;
        char charVal = 'a';
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < rows; j++) {
                if (i % 2 == 0) {
                    if (i >= j) {
                        System.out.print(numVal + " ");
                    } else {
                        System.out.print("  ");
                    }
                } else {
                    if (i >= j) {
                        System.out.print(charVal + " ");
                    } else {
                        System.out.print("  ");
                    }
                }
            }
            if (i % 2 == 0) {
                numVal++;
            }
            charVal++;
            System.out.println();
        }
    }
}
