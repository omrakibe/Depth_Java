public class patternProgramming
{
    public static void main(String [] args)
    {
        int i,j;
        int n = 21;
        for (i=0; i<n; i++)
        {
            for(j=0; j<n; j++)
            {
                if( ( j==0 && i!=0 && i!=n-1 ) || ( i==0 && j!=0 && j!=n-1 ) || ( j==n-1 && i!=0 && i!=n-1  ) || ( i==n-1 && j!=0 && j!=n-1 )) {
                    System.out.print("*");
                } else
                {
                    System.out.print(" ");
                }
            }

            System.out.print("      ");

            for(j=0; j<n; j++)
            {
                if( j==0 || ( i==j && i<=(n-1)/2 ) || ( i+j==n-1 && i<=(n-1)/2 ) || j==n-1 )
                {
                    System.out.print("S");
                } else
                {
                    System.out.print(" ");
                }
            }

            System.out.print("    ");

            for(j=0; j<n; j++)
            {
                if( ( i+j==(n-1)/2 && i<=(n-1)/4 ) || ( j-i==(n-1)/2 && j<=(n-1)/4 * 3 ) || ( j==(n-1)/4 && i>(n-1)/4 && i<(n-1)/4 * 3 ) || ( j==(n-1)/4 * 3 && i>=(n-1)/4 && i<(n-1)/4 * 3 ) || ( i==(n-1)/4 && j>=(n-1)/4 && j<=(n-1)/4 * 3 )  )
                {
                    System.out.print("*");
                } else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
