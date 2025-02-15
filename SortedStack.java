import java.util.Stack;       // Reusing Java's built-in Stack implementation.
import java.util.Collections; // Reusing the Collections utility class for sorting the stack.
import java.util.Scanner;     // Reusing the Scanner class to efficiently read input from the console.

/**
 * The {@code SortedStack} class demonstrates how to:
 * <ul>
 *   <li>Read a series of integers from the standard input.</li>
 *   <li>Store them in a {@code Stack} (reusing the Java Collections Framework's implementation).</li>
 *   <li>Sort the stack in ascending order using {@code Collections.sort()} (reusing existing, efficient sorting logic).</li>
 *   <li>Print the sorted stack to the console.</li>
 * </ul>
 *
 * <p>
 * This class leverages multiple pre-built Java API components:
 * <ol>
 *   <li><b>Stack:</b> Instead of writing a custom stack implementation, we reuse {@code java.util.Stack}.</li>
 *   <li><b>Scanner:</b> Instead of implementing custom input parsing logic, we reuse {@code java.util.Scanner}.</li>
 *   <li><b>Collections.sort():</b> Rather than writing our own sorting algorithm, we reuse {@code Collections.sort()},
 *   a well-tested and efficient sorting method.</li>
 * </ol>
 *
 * <pre>
 * Sample Input and Output:
 * Input: 5 3 8 1 2 a
 * Output: Sorted stack: 1 2 3 5 8
 * Note: The program stops reading input when a non-integer (in this example, 'a') is encountered.
 *
 * Compilation and Execution:
 * To Generate javadoc: javadoc -d docs SortedStack.java
 * To Compile: javac SortedStack.java
 * To execute: java SortedStack
 * 
 * </pre>
 *
 * @author Karthik Thirugnanasampantham
 * @version 1.1
 */
public class SortedStack {

    /**
     * The entry point of the program.
     *
     * <p>
     * Execution Flow:
     * <ol>
     *   <li>Instantiate a {@code Scanner} to read input from the console.</li>
     *   <li>Create a {@code Stack<Integer>} to hold integer values.</li>
     *   <li>Prompt the user for integer inputs. Each valid integer is pushed onto the stack until a non-integer is encountered.</li>
     *   <li>Sort the stack using {@code Collections.sort()}, which reuses Java's built-in sorting mechanism.</li>
     *   <li>Iterate over the sorted stack using an enhanced for-loop and print each integer.</li>
     * </ol>
     *
     * @param args Command-line arguments (not used in this program)
     */
    public static void main(String[] args) {
        // Create a Scanner object to read from standard input.
        // Reused from java.util.Scanner for efficient input parsing.
        Scanner scanner = new Scanner(System.in);

        // Create a Stack to store integer values.
        // Reused from java.util.Stack, which is a LIFO data structure.
        Stack<Integer> numbers = new Stack<>();

        // Prompt the user to enter integers.
        System.out.println("Enter integer numbers separated by spaces. To finish, enter any non-integer input:");

        // Read integers from input until a non-integer is encountered.
        // The scanner.hasNextInt() method is used to determine if the next token is an integer.
        while (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            numbers.push(number); // Push the integer onto the Stack.
        }

        // Close the scanner to free up system resources.
        scanner.close();

        // Sort the Stack in ascending order.
        // Although Stack is a subclass of Vector (which implements List), we can sort it using Collections.sort().
        Collections.sort(numbers);

        // Print the sorted stack.
        // The enhanced for-loop is used for simple iteration over the collection.
        System.out.println("Sorted stack:");
        for (Integer num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println(); // Print a newline for clean output formatting.
    }
}
