import java.util.Scanner;

public class FahrenheitToCelsius {
   public int Cel;
    public double Celsius(int[] array, int i) {
//        for(i=0; i<array.length; i++){
//            System.out.print(array[i]+ " ");
//        }
//        for (int i=0; i<array.length; i++) {
//            Cel = (((array[i] - 32) * 5) / 7);
//
//        }
//
//
//    }
        return (array[i] - 32) / 1.8;
    }
    public static void main (String [] args){
        Scanner in = new Scanner(System.in);

        System.out.println("Input data: ");
        int size = in.nextInt();
        int [] array = new int[size];



        for(int i=0; i<array.length; i++){
            array[i] = in.nextInt();
        }

        FahrenheitToCelsius ob = new FahrenheitToCelsius();
        for(int i=0; i<array.length; i++)
        System.out.print(Math.round(ob.Celsius(array,i))+ " ");

    }
  }
