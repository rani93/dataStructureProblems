// problem Statement:

// You are given an 'N * N' matrix of integers where each row and each column is sorted in increasing order. You are given a target integer 'X'.



// Find the position of 'X' in the matrix. If it exists then return the pair {i, j} where 'i' represents the row and 'j' represents the column of the array, otherwise return {-1,-1}



// For example:
// If the given matrix is:
// [ [1, 2, 5],
//   [3, 4, 9],
//   [6, 7, 10]] 
// We have to find the position of 4. We will return {1,1} since A[1][1] = 4.



import java.util.* ;
import java.io.*; 
/*************************************
 
    Following is the Pair Class structure.
    
    class Pair{
        int x; int y;
        
        Pair(int x, int y){
            this.x = x;
            this.y = y;
        }
    }

*************************************/

class Search{

    public static Pair search(int [][] matrix, int x) {
		// Write your code here.
        Pair answer = new Pair(-1, -1);
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==x){
                    answer.x = i;
                    answer.y = j;
                    return answer;
                }
            }
        }
        return answer;
	}


}