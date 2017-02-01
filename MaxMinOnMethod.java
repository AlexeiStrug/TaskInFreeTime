import java.util.Arrays;
import java.util.Scanner;
import java.math.*;
import java.lang.Math.*;

public class MaxMinOnMethod {

    public static void main (String [] args){
        Scanner in = new Scanner(System.in);

        int[] array = new int [300];
        System.out.println("input data: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = in.nextInt();
        }
        in.close();

        int min = Arrays.stream(array).min().getAsInt();
        int max = Arrays.stream(array).max().getAsInt();


        System.out.println("output data: "+ max + " " + min);


    }
}
