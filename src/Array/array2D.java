package Array;

public class array2D {
    public static void main(String[] args) {

        int x[][]={{2,3,4},{5,6,7},{96,75,43}},i,j;

        for (i=0;i<x.length;i++)
        {
            for (j=0;j<x.length;j++)
            {
                System.out.print(x[i][j]);
            }
            System.out.println();
        }
    }
}
