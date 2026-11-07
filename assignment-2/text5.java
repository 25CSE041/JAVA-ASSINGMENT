class Reverse
{
    public static void main(String args[])
    {
        int a[][] = new int[2][2];

        a[0][0] = Integer.parseInt(args[0]);

        a[0][1]

        a[1][0]

        a[1][1]

        System.out.println("reverse array");

        for (int i=1; i>=0; i--)
        {
            for (int j=i; j>=0; j--)
            {
                System.out.print(a[i][j] + " ");
            }

            System.out.println();
        }
    }
}