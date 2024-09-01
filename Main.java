import java.util.*;

class Solution {
    public int[][] construct2DArray(int[] original, int m, int n) {
        // Step 1: Check if it's possible to create an m x n 2D array with the given original array
        if (original.length != m * n) {
            // If the number of elements in original does not match m * n, return an empty array
            return new int[0][0];
        }

        // Step 2: Initialize the 2D array with m rows and n columns
        int[][] result = new int[m][n];

        // Step 3: Fill the 2D array using the elements from the original array
        for (int i = 0; i < original.length; i++) {
            // Calculate the row index by dividing the current index by the number of columns
            int row = i / n;
            // Calculate the column index by taking the remainder of the current index divided by the number of columns
            int col = i % n;
            // Assign the value from the original array to the corresponding position in the 2D array
            result[row][col] = original[i];
        }

        // Step 4: Return the constructed 2D array
        return result;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] original1 = {1, 2, 3, 4};
        int[][] result1 = solution.construct2DArray(original1, 2, 2);
        System.out.println(Arrays.deepToString(result1)); // Output: [[1, 2], [3, 4]]

        int[] original2 = {1, 2, 3};
        int[][] result2 = solution.construct2DArray(original2, 1, 3);
        System.out.println(Arrays.deepToString(result2)); // Output: [[1, 2, 3]]

        int[] original3 = {1, 2};
        int[][] result3 = solution.construct2DArray(original3, 1, 1);
        System.out.println(Arrays.deepToString(result3)); // Output: []
    }
}