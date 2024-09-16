public class SpiralMatrix {


    public static void  spiralmatrix(int m, int n, int[][] matrix)
    {
        int top=0, bottom = m-1, left = 0, right = n-1;

        while(top <= bottom && left <= right)
        {
            for(int i=0; i<=right;i++)
            {
                System.out.print(matrix[top][i] +" ");
            }
            top = top+1;

            for (int i=top;i<=bottom;i++)
            {
                System.out.print(matrix[i][right]+ " ");
            }
            right = right -1;

            if(top<=bottom)
            {
                for (int i=right;i>=left;i--)
                {
                    System.out.print(matrix[bottom][i] + " ");
                }
                bottom = bottom -1;
            }

            if(left<=right)
            {
                for (int i=bottom;i>=top;i--)
                {
                    System.out.print(matrix[i][left] + " ");
                }
                left = left+1;
            }


        }



    }


    public static void main(String[] args) {

        int[][] matrix = {{1,2,3,4},
                         {5,6,7,8},
                         {9,10,11,12},
                         {13,14,15,16}
        };

        spiralmatrix(matrix.length, matrix[0].length, matrix);

    }


}
