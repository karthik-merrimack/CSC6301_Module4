import java.util.LinkedList;   // Reusing the robust implementation of a doubly-linked list from the Java Collections Framework.
import java.util.Collections;  // Reusing the Collections utility class for sorting the list.
import java.util.Scanner;      // Reusing the Scanner class to efficiently read input from the console.

/**
 * The {@code SortedLinkedList} class demonstrates how to:
 * <ul>
 *   <li>Read a series of integers from the standard input.</li>
 *   <li>Store them in a {@code LinkedList} (reusing the Java Collections Framework's implementation).</li>
 *   <li>Sort the list in ascending order using {@code Collections.sort()} (reusing existing, efficient sorting logic).</li>
 *   <li>Print the sorted list to the console.</li>
 * </ul>
 *
 * <p>
 * This class leverages multiple pre-built Java API components:
 * <ol>
 *   <li><b>LinkedList:</b> Instead of writing a custom linked list implementation, we reuse {@code java.util.LinkedList}.</li>
 *   <li><b>Scanner:</b> Instead of implementing custom input parsing logic, we reuse {@code java.util.Scanner}.</li>
 *   <li><b>Collections.sort():</b> Rather than writing our own sorting algorithm, we reuse {@code Collections.sort()},
 *   a well-tested and efficient sorting method.</li>
 * </ol>
 * This design adheres to best practices by reusing established components, thereby increasing reliability,
 * reducing potential bugs, and making the code more maintainable.
 *
 * <pre>
 * Sample Input and Output:
 * Input: 5 3 8 1 2 a
 * Output: Sorted list: 1 2 3 5 8
 * Note: The program stops reading input when a non-integer (in this example, 'a') is encountered.
 * </pre>
 *
 * @author Karthik Thirugnanasampantham
 * @version 1.0
 */
public class SortedLinkedList {

    /**
     * The entry point of the program.
     *
     * <p>
     * Execution Flow:
     * <ol>
     *   <li>Instantiate a {@code Scanner} to read input from the console.</li>
     *   <li>Create a {@code LinkedList<Integer>} to hold integer values.</li>
     *   <li>Prompt the user for integer inputs. Each valid integer is added to the list until a non-integer is entered.</li>
     *   <li>Sort the list using {@code Collections.sort()}, which reuses Java's built-in sorting mechanism.</li>
     *   <li>Iterate over the sorted list using an enhanced for-loop and print each integer.</li>
     * </ol>
     *
     * @param args Command-line arguments (not used in this program)
     */
    public static void main(String[] args) {
        // Create a Scanner object to read from standard input.
        // Reused from java.util.Scanner for efficient input parsing.
        Scanner scanner = new Scanner(System.in);

        // Create a LinkedList to store integer values.
        // Reused from java.util.LinkedList, which provides a dynamic data structure for storing objects.
        LinkedList<Integer> numbers = new LinkedList<>();

        // Prompt the user to enter integers.
        System.out.println("Enter integer numbers separated by spaces. To finish, enter any non-integer input:");

        // Read integers from input until a non-integer is encountered.
        // The scanner.hasNextInt() method is used to determine if the next token is an integer.
        while (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            numbers.add(number); // Add the integer to the LinkedList.
        }

        // Close the scanner to free up system resources.
        scanner.close();

        // Sort the LinkedList in ascending order.
        // Instead of implementing our own sort algorithm, we reuse Collections.sort() which is optimized and reliable.
        Collections.sort(numbers);

        // Print the sorted list.
        // The enhanced for-loop is used for simple iteration over the collection.
        System.out.println("Sorted list:");
        for (Integer num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println(); // Print a newline for clean output formatting.
    }
}
