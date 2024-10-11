// Problem Statement:
// You are given a 2-D array 'MATRIX' of dimensions N x M, of integers. You need to return the spiral path of the matrix.

// Example Of Spiral Path:


// Detailed explanation ( Input/output format, Notes, Images )
// Constraints:
// 1 <= T <= 5
// 1 <= N  <= 10 ^ 2
// 1 <= M <= 10 ^ 2
// -10 ^ 9 <= MATRIX[ i ][ j ] <= 10 ^ 9

// Time Limit: 1sec.
// Sample Input 1 :
// 2
// 4 4
// 1 2 3 4 
// 5 6 7 8 
// 9 10 11 12 
// 13 14 15 16
// 3 6
// 1 2 3 4 5 6 
// 7 8 9 10 11 12 
// 13 14 15 16 17 18
// Sample Output 1 :
// 1 2 3 4 8 12 16 15 14 13 9 5 6 7 11 10
// 1 2 3 4 5 6 12 18 17 16 15 14 13 7 8 9 10 11
// Explanation of the Sample Input 1 :
// The spiral path for the test case 2 is as shown below:

// Sample Input 2 :
// 2
// 1 1
// 4
// 1 5
// 1 2 3 4 5
// Sample Output 2 :
// 4
// 1 2 3 4 5
// Explanation of the Sample Input 2:
// In the first test case, there is only one element in the matrix, so the spiral path is only that element.

// In the second test case, there is only one row or 1-D matrix, so the spiral path is only the single traversal of the matrix.


import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    public static List<Integer> spiralPathMatrix(int[][] matrix, int lastrow, int lastcol) {
        // Write you code here.
        int StartRow = 0;
        int StartCol = 0;

        List<Integer> answer = new ArrayList<>();

        while (StartRow < lastrow && StartCol < lastcol) {
            // Traverse Right across the top row
            for (int i = StartCol; i < lastcol; i++) {
                answer.add(matrix[StartRow][i]);
            }
            StartRow++;  // Move to the next row

            // Traverse Down along the right column
            for (int i = StartRow; i < lastrow; i++) {
                answer.add(matrix[i][lastcol - 1]);
            }
            lastcol--;  // Move to the previous column

            // Traverse Left along the bottom row if there's still a row remaining
            if (StartRow < lastrow) {
                for (int i = lastcol - 1; i >= StartCol; i--) {
                    answer.add(matrix[lastrow - 1][i]);
                }
                lastrow--;  // Move to the previous row
            }

            // Traverse Up along the left column if there's still a column remaining
            if (StartCol < lastcol) {
                for (int i = lastrow - 1; i >= StartRow; i--) {
                    answer.add(matrix[i][StartCol]);
                }
                StartCol++;
            
        }

        
    }       
        return answer;
    }
}
