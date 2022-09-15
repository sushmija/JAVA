import java.io.*; 
   
 class Matrixaddition { 
  
     static void printMatrix(int S[][], 
                             int rowSize, 
                             int colSize) 
     { 
         for (int i = 0; i < rowSize; i++) { 
             for (int j = 0; j < colSize; j++) 
                 System.out.print(S[i][j] + " "); 
   
             System.out.println(); 
         } 
     } 
   
     static int[][] add(int A[][], int I[][], 
                        int size) 
     { 
         int i, j; 
         int V[][] = new int[size][size]; 
   
         for (i = 0; i < size; i++) 
             for (j = 0; j < size; j++) 
                 V[i][j] = A[i][j] + I[i][j]; 
   
         return V; 
     } 
     public static void main(String[] args) 
     { 
         int size = 2; 
   
         int A[][] = { { 1, 2}, 
                       { 5, 3}};  
         System.out.println("\nMatrix A:"); 
         printMatrix(A, size, size); 
   
         int I[][] = { { 2, 3}, 
                       { 4, 1}}; 
         System.out.println("\nMatrix B:"); 
         printMatrix(I, size, size); 
  
         int V[][] = add(A, I, size); 
  
         System.out.println("\nResultant Matrix:"); 
         printMatrix(V, size, size); 
     } 
}