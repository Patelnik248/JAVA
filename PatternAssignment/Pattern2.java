//program to Print Triangle using pattern programming logic

package PatternAssignment;

public class Pattern2 {
    public static void main(String[] args) {
        int n=11;
        for(int i=0;i<=(n-1)/2;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i==(n-1)/2 || i+j>=(n-1)/2 && j<=(n-1)/2 || j>=(n-1)/2 && j-i<=(n-1)/2 ){
                    System.out.print("* ");
                }
                else
                {
                    System.out.print("  ");
                }

            }
            System.out.println(" ");
        }
    }
}
