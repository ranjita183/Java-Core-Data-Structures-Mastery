package EC;

/**
 * ============================================================================
 * CLASS: Pattern
 * ============================================================================
 * Description:
 *   Demonstrates fundamental Star Pattern printing using nested for-loops and
 *   matrix coordinate logic `(i, j)`.
 * 
 * Matrix Formulas Demonstrated:
 *   1. Solid Square Matrix: all `(i, j)`
 *   2. Lower Left Triangle: `i >= j`
 *   3. Upper Right Triangle: `i <= j`
 *   4. Lower Right Triangle: `i + j >= 3`
 *   5. Upper Left Triangle: `i + j <= 3`
 * ============================================================================
 */
public class Pattern {
    public static void main(String[] args) {
        int n = 4;

        System.out.println("========== 1. Solid Square Pattern ==========");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }

        System.out.println("\n========== 2. Lower Left Triangle (i >= j) ==========");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i >= j) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }

        System.out.println("\n========== 3. Upper Right Triangle (i <= j) ==========");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i <= j) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }

        System.out.println("\n========== 4. Lower Right Triangle (i + j >= 3) ==========");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i + j >= n - 1) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }

        System.out.println("\n========== 5. Upper Left Triangle (i + j <= 3) ==========");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i + j <= n - 1) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
}
