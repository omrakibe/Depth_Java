class index
{
    public static void main(String[] args)
    {
        int i,j;
        int n = 11;

        for (i=0; i<n; i++)
        {
            for(j=0; j<n; j++)
            {
                if( i+j>=(n-1)/2 && j-i<=(n-1)/2 && i<=(n-1)/2 )
                {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.print("    ");

            for(j=0; j<n; j++)
            {
                if( ((i+j>=(n-1)/2 ) && j-i<=(n-1)/2) && (i-j<=(n-1)/2) && i+j<=(n-1)/2+(n-1))
                {
                    System.out.print("*");
                } else
                {
                    System.out.print(" ");
                }
            }

            System.out.print("    ");

//            for(j=0; j<n; j++)
//            {
//
//            }

            System.out.println();
        }

//        switch(n) {
//            case 1, 3:
//                System.out.println("1");
//            case 2, 4:
//                    System.out.println("2");
//            default:
//                System.out.println("3");
//    }
    }
}