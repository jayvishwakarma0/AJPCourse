package ajp_java.sept5.HomeWork;

public class TransposeMatrix {
    public static void main(String[] args) {
        int[][] matrix = {{0,0,0,0},
                {1,1,1,1},
                {2,2,2,2}};

        int[][] transpose = new int[matrix[0].length][matrix.length];
        for (int i = 0; i < transpose.length; i++) {
            for (int j = 0; j < transpose[0].length; j++) {
                transpose[i][j] = matrix[j][i];
            }
        }
        for (int i = 0; i < transpose.length; i++) {
            for (int j = 0; j < transpose[0].length; j++) {
                System.out.print( transpose[i][j]+" ");
            }
            System.out.println();
        }
    }
}
