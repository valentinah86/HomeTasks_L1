package Task_3;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class task_3 {

    private static void drawRhomb(int s) {
        int n = 2*s-1;
        for(int i=0; i<n; i++)
        {
            for (int j=0;j<n;j++)
            {

                if (j==(n/2 + i) || j== (n/2-i) || j== (i-n/2) || j== (n-i+n/2-1) )
                {
                    System.out.print("*");

                    try {
                        Thread.sleep(200);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                } else
                    {
                        System.out.print(" ");
                    }
            }
            System.out.println();
        }
        System.out.println();

    }

     private static boolean isNumericValue(String X) throws NumberFormatException {
        try {
            Integer.parseInt(X);
            return true;
        }
        catch (Exception e)
        {
            return false;
        }
    }

    public static void main (String [] args)
    {
    Scanner str = new Scanner(System.in);
    String value ="";


   while (!(value.equals("X")||value.equals("x"))){
        System.out.println("Enter the size of the rhomb side");
        value = str.next();
        if (isNumericValue(value) && parseInt(value)>1) {
            int N = parseInt(value);
            // рисуем ромб со стороной N
            drawRhomb(N);
            break;
   } else if (value.equals("X") || value.equals("x")){
        break;
        }
        else {
       System.out.println("Incorrect or too low value. Please, try again or press X to exit");
           }
   }

    }

}
