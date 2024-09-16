public class MaxRowMatrix {

    public static void maxeelementlist(int num_of_rows, int[][] arr)
    {
        int i,j,max=0;
        int[] result = new int[num_of_rows];

        for(i=0;i< num_of_rows;i++)
        {
            for(j=0;j<arr[i].length;j++)
            {
                if(arr[i][j]> max)
                {
                    max = arr[i][j];
                }
            }

            result[i] = max;

            max = 0;


        }

        printArray(result);

    }

    public static void printArray(int[] f)
    {
        for (int i=0;i<f.length;i++)
        {
            System.out.println(f[i]);
        }

    }


    public static void main(String[] args) {

        int[][] arr = new int[][] {
                {3, 4, 1, 8},
                {1, 4, 9, 11},
                {76, 34, 21, 1},
                {2, 1, 4, 5}
        };

        maxeelementlist(4, arr);

    }

}
