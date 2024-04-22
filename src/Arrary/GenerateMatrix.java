package Arrary;

public class GenerateMatrix {
    public static void main(String[] args) {
        System.out.println( generate(5).toString() );
    }

    public static int[][] generate(int n) {
        int[][] matrix = new int[n][n];
        int startX = 0;
        int startY = 0;
        int round =1;
        int count = 1;
        int i,j;

        if ( n % 2 == 1){
            matrix[n/2][n/2] = n*n;
        }
        while ( round <= n/2  ){
            for ( j=startY ; j<n-round ; j++){
                matrix[startY][j] = count;
                count ++;
            }
            for (i=startX ; i<n-round ; i++){
                matrix[i][j] = count;
                count ++;
            }
            for ( ; j>startY ; j--){
                matrix[i][j] = count;
                count ++;
            }
            for ( ; i>startX ; i--){
                matrix[i][j] = count;
                count ++;
            }
            startX ++;
            startY ++;
            round ++;
        }

        return matrix;
    }
}
