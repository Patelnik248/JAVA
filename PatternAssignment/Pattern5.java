// Printing My Full Name With Star pattern

package PatternAssignment;

public class Pattern5 {
    public static void main(String[] args) {
        int n = 15;

        System.out.println("");
        System.out.println("");
        System.out.println("");
        for (int i = 0; i < n; i++) {

            // N
            for (int j = 0; j < n; j++) {
                if (j == 0 || j == (n - 1) || i == j) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.print("        ");
            // I
            for (int j = 0; j < n; j++) {
                if (j == (n - 1) / 4 || j < (n - 1) / 2 && (i == 0 || i == (n - 1))) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            System.out.print("");

            // K
            for (int j = 0; j < n; j++) {
                if (j == 0 || i + j == (n - 1) / 2 || i - j == (n - 1) / 2) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            System.out.print("");

            // H
            for (int j = 0; j < n; j++) {
                if (j == 0 || j == (n - 1) / 2 || i == (n - 1) / 2 && j < (n - 1) / 2) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            System.out.print(" ");

            // I
            for (int j = 0; j < n; j++) {
                if (j == (n - 1) / 4 || j < (n - 1) / 2 && (i == 0 || i == (n - 1))) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            System.out.print("");

            // L
            for (int j = 0; j < n; j++) {
                if (j == 0 || i == n - 1 && j < (n - 1) / 2) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            System.out.println("");
        }
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");

        for (int i = 0; i < n; i++) {

             // P
             for (int j = 0; j < n; j++) {
                if (i == 0 && j < (n - 3) / 2 || i == (n - 1) / 2 && j < (n - 3) / 2 || j == 0
                        || i == (n - 3) / 2 && j == (n - 3) / 2 || j == (n - 1) / 2 && i > 1 && i < (n - 3) / 2
                        || i == 1 && j == (n - 3) / 2) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            System.out.print(" ");

            // A
            for (int j = 0; j < n; j++) {
                if (i == 0 && j > 0 && j < (n - 1) / 2 || i == (n - 1) / 2 && j < (n - 1) / 2 || j == 0 && i > 0
                        || j == (n - 1) / 2 && i > 0) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            // R
            for (int j = 0; j < n; j++) {
                if (i == 0 && j < (n - 3) / 2 || i == (n - 1) / 2 && j < (n - 3) / 2 || j == 0
                        || i == (n - 3) / 2 && j == (n - 3) / 2 || j == (n - 1) / 2 && i > 1 && i < (n - 3) / 2
                        || i == 1 && j == (n - 3) / 2 || i - j == (n - 1) / 2) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.print("");
            // E
            for (int j = 0; j < n; j++) {
                if (i == 0 && j < (n - 1) / 2 || i == n - 1 && j < (n - 1) / 2 || j == 0
                        || i == (n - 1) / 2 && j < (n - 1) / 2) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.print("");

            // S
            for(int j=0;j<n;j++)
            {
                if(i==0 && j>1 && j<(n-1)/2 || i==(n-1)/2 && j>1 && j<(n-3)/2 || i==n-1 && j<(n-3)/2 && j>0 || j==0 && i>1 && i<(n-3)/2 || j==(n-1)/2 && i>(n+1)/2 && i<n-2 || i==1 && j==1 ||j==(n-3)/2 && (i==n-2 || i==(n+1)/2 ) || j==0 && i==n-2 || j==(n-1)/2 && i==1 || j==1 && i==(n-3)/2)
                {
                    System.out.print("* ");
                }
                else
                {
                    System.out.print("  ");
                }
            }

            // H
            for (int j = 0; j < n; j++) {
                if (j == 0 || j == (n - 1) / 2 || i == (n - 1) / 2 && j < (n - 1) / 2) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            System.out.print(" ");

            // B
            for(int j=0;j<n;j++)
            {
                if(i==0 && j<(n-1)/2|| i==n-1 && j<(n-1)/2 || i==(n-1)/2 && j<(n-1)/2 ||
                    j==0 || j==(n-1)/2 && i>0 && i<(n-1) && i!=(n-1)/2)
                {
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.print(" ");
            // H
            for (int j = 0; j < n; j++) {
                if (j == 0 || j == (n - 1) / 2 || i == (n - 1) / 2 && j < (n - 1) / 2) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.print(" ");


            // A
            for (int j = 0; j < n; j++) {
                if (i == 0 && j > 0 && j < (n - 1) / 2 || i == (n - 1) / 2 && j < (n - 1) / 2 || j == 0 && i > 0
                        || j == (n - 1) / 2 && i > 0) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.print(" ");

            //I
            for(int j=0;j<n;j++)
            {
                if(j==(n-1)/4 || j<(n-1)/2 &&(i==0 || i==(n-1))) 
                {
                    System.out.print("* ");
                }
                else
                {
                    System.out.print("  ");
                }
            }


            System.out.println("");
        }
        
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
            
        for (int i = 0; i < n; i++) {
            // P
            for (int j = 0; j < n; j++) {
                if (i == 0 && j < (n - 3) / 2 || i == (n - 1) / 2 && j < (n - 3) / 2 || j == 0
                        || i == (n - 3) / 2 && j == (n - 3) / 2 || j == (n - 1) / 2 && i > 1 && i < (n - 3) / 2
                        || i == 1 && j == (n - 3) / 2) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            System.out.print(" ");

            // A
            for (int j = 0; j < n; j++) {
                if (i == 0 && j > 0 && j < (n - 1) / 2 || i == (n - 1) / 2 && j < (n - 1) / 2 || j == 0 && i > 0
                        || j == (n - 1) / 2 && i > 0) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.print(" ");

            // R
            for (int j = 0; j < n; j++) {
                if (i == 0 && j < (n - 3) / 2 || i == (n - 1) / 2 && j < (n - 3) / 2 || j == 0
                        || i == (n - 3) / 2 && j == (n - 3) / 2 || j == (n - 1) / 2 && i > 1 && i < (n - 3) / 2
                        || i == 1 && j == (n - 3) / 2 || i - j == (n - 1) / 2) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.print("");
            // E
            for (int j = 0; j < n; j++) {
                if (i == 0 && j < (n - 1) / 2 || i == n - 1 && j < (n - 1) / 2 || j == 0
                        || i == (n - 1) / 2 && j < (n - 1) / 2) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.print("");
            // j
            for (int j = 0; j < n; j++) {
                if (i==0 && j<(n-1)/2 || i==n-1 && j>0 && j<(n-3)/4 || j==(n-1)/4 && i<n-1 || j==0 && i<n-1 && i>(n+3)/2) 
                {
                    System.out.print("* ");
                } 
                else
                {
                    System.out.print("  ");
                }
            }

            System.out.print(" ");

            // I
            for (int j = 0; j < n; j++) {
                if (j == (n - 1) / 4 || j < (n - 1) / 2 && (i == 0 || i == (n - 1))) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            System.out.print(" ");

            // Y
            for (int j = 0; j < n; j++) {
                if ( i==j && i<=(n-1)/2 || i+j==n-1 && i<=(n-1)/2 || j==(n-1)/2 && i>(n-1)/2) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            System.out.print("          ");

            // A
            for (int j = 0; j < n; j++) {
                if (i == 0 && j > 0 && j < (n - 1) / 2 || i == (n - 1) / 2 && j < (n - 1) / 2 || j == 0 && i > 0
                        || j == (n - 1) / 2 && i > 0) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            System.out.println(" ");
        }

        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
    }
}
