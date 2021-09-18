// The CodeBots refuse to stay in any of the free rooms, or any of the rooms below any of the free rooms.
// Given matrix, a rectangular matrix of integers, where each value represents the cost of the room, your task is to return the total sum of all rooms that are suitable for the CodeBots.

final class MatrixElementsSum {
 
    int matrixElementsSum(int[][] matrix) {
        int iResult = 0;
        for (int j = 0; j < matrix[0].length; j++)
        {
            for(int i = 0; i < matrix.length && matrix[i][j] > 0; i++)
            {
                iResult += matrix[i][j];
            }
        }
        return iResult;
    }
}