public class TwoDimensionArray {
    public static void main(String[] args) {
        
        //Methode 1
        
        int[][] matrix = new int[3][4];

        matrix[0][0] = 1; matrix[0][1] = 2; matrix[0][2] = 3; matrix[0][3] = 4;
        matrix [1][0] = 5; matrix[1][1] = 6; matrix[1][2] = 7; matrix[1][3] = 8;
        matrix[2][0] = 9; matrix[2][1] = 10; matrix[2][2] = 11; matrix[2][3] = 12;


        for (int row=0; row<matrix.length; row++){                 //initiate (converted to row numbers)
            for(int col=0; col<matrix[row].length; col++){         //converted from row number thats why its matrix[row] to column number
                System.out.println(matrix[row][col]);
            }
        }

        //--------------------------------------------------------/////

        //Methode 2

        int[][] arrays = {
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12}
        };

        //breaking down the matrix 
        for (int[] array: arrays){                 //make it horizontal
            for (int number: array){               //make it vertical 
                System.out.println(number);
            }
        }
    }
}
