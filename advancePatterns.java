public class advancePatterns {
    public static void betterFly() {
        // upper half of betterfly pattern
        for (int i = 1; i <= 4; i++) {
            // 1st halfs stars
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            // spaces
            int spaces = 2 * (4 - i);
            for (int j = 1; j <= spaces; j++) {
                System.out.print("  ");
            }
            // 2nd halfs stars
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // lower part of betterfly pattern
        for (int i = 4; i >= 1; i--) {
            // 1st halfs stars
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            // spaces
            int spaces = 2 * (4 - i);
            for (int j = 1; j <= spaces; j++) {
                System.out.print("  ");
            }
            // 2nd halfs stars
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }

    public static void solidRhombus() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5 - i; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j < 5; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void numberPyramid() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }

            System.out.println();
        }
    }

    public static void palindromicPattern() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print(" ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            for (int j = 2; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void diamondPattern() {
        // upper half
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 4 - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
        // lower half
        for (int i = 4; i >= 1; i--) {
            for (int j = 1; j <= 4 - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

    }

    public static void swastikPattern() {
        int n = 7;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j == 3 || i == 3) {
                    System.out.print("* ");
                } else if (i == 0 && j == 0 || i == 0 && j == 1 || i == 0 && j == 2) {
                    System.out.print("* ");
                } else if (i == 4 && j == 0 || i == 5 && j == 0 || i == n - 1 && j == 0) {
                    System.out.print("* ");
                } else if (i == 0 && j == n - 1 || i == 1 && j == n - 1 || i == 2 && j == n - 1) {
                    System.out.print("* ");
                } else if (i == n - 1 && j == 4 || i == n - 1 && j == 5 || i == n - 1 && j == n - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // betterFly();
        // solidRhombus();
        // numberPyramid();
        palindromicPattern();
        // diamondPattern();
        // swastikPattern();
    }
}
