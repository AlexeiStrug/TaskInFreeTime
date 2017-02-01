import java.util.Arrays;
import java.util.Scanner;
import java.math.*;
import java.lang.Math.*;

public class Rounding {

    public static void main (String [] args){
        Scanner in = new Scanner(System.in);

        System.out.println("input data: ");
        int size = in.nextInt();
        double[][] number = new double[size][2];


        for (int i = 0; i < number.length; i++) {
            for (int j = 0; j < number[i].length; j++) {
                number[i][j] = in.nextInt();

            }
        }
        in.close();

       double [] result = new double [size];
        for( int i = 0; i < number.length; i++) {
                 result[i] = (number[i][0] / number[i][1]);
        }


        for( int i = 0; i < result.length; i++) {

            System.out.print(Math.round(result[i])+ " ");
        }


    }
}
