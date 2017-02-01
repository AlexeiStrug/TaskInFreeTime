import java.util.Scanner;
import java.math.*;

public class SearchLine {

    public static void main (String [] args){
        Scanner in = new Scanner(System.in);

        int[] array = new int [300];
        System.out.println("input data: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = in.nextInt();
        }
       int max = 0;
        max = array[0];
       int min = 0;
        min = array[0];
        for (int i = 0; i < array.length; i++)
        {

            if (max < array[i])
                max = array[i];
            if (min > array[i])
                min = array[i];
        }
        int a = Integer.MAX_VALUE;



        System.out.println("output data: "+ a + " " + min);


    }
}
