import java.util.ArrayList;
import java.util.List;

public class SpiralMatrixTraversal {
     public static List<Integer> spirallyTraverse(int[][] matrix, int r, int c) {
        List<Integer> result = new ArrayList<>();

        int topRow = 0, bottomRow = r - 1;
        int leftCol = 0, rightCol = c - 1;

        while (topRow <= bottomRow && leftCol <= rightCol) {
            // Traverse the top row
            for (int col = leftCol; col <= rightCol; col++) {
                result.add(matrix[topRow][col]);
            }
            topRow++;

            // Traverse the right column
            for (int row = topRow; row <= bottomRow; row++) {
                result.add(matrix[row][rightCol]);
            }
            rightCol--;

            // Traverse the bottom row
            if (topRow <= bottomRow) {
                for (int col = rightCol; col >= leftCol; col--) {
                    result.add(matrix[bottomRow][col]);
                }
                bottomRow--;
            }

            // Traverse the left column
            if (leftCol <= rightCol) {
                for (int row = bottomRow; row >= topRow; row--) {
                    result.add(matrix[row][leftCol]);
                }
                leftCol++;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3, 4},
                          {5, 6, 7, 8},
                          {9, 10, 11, 12},
                          {13, 14, 15, 16}};
        int r = 4;
        int c = 4;

        List<Integer> result = spirallyTraverse(matrix, r, c);
        for (int num : result) {
            System.out.print(num + " ");
        }
        // Output: 1 2 3 4 8 12 16 15 14 13 9 5 6 7 11 10
    }
}







