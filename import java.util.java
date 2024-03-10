
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the number of rows
        System.out.print("Enter the number of rows: ");
        int numRows = scanner.nextInt();

        // Nested loop to display the pattern
        for (int i = 1; i <= numRows; i++) {
            // Print spaces before the asterisks
            for (int j = 1; j <= numRows - i; j++) {
                System.out.print(" ");
            }

            // Print asterisks for the current row
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }

            // Move to the next line for the next row
            System.out.println();
        }

        scanner.close();
    }
}
