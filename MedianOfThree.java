import java.util.Arrays;
import java.util.Scanner;

public class MedianOfThree {
    public static int size;

    static public void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("input data:");
        size = sc.nextInt();
        int[][] MatrixArray = new int[size][3];

        for (int i = 0; i < MatrixArray.length; i++) {
            for (int j = 0; j < MatrixArray[i].length; j++) {
                MatrixArray[i][j] = sc.nextInt();
            }
        }
        Median(MatrixArray);
    }

    public static void Median(int[][] array) {
        int newArr[] = new int[3];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < 3; j++) {
                newArr[j] = array[i][j];
            }
            System.out.print(Math.round(Median(newArr)) + " ");
        }
    }

    public static float Median(int[] array) {
            Arrays.sort(array);
            int middle = array.length / 2;
            if (array.length % 2 == 1) {
                return array[middle];
            } else {
                return (array[middle - 1] + array[middle]) / 2.0f;
            }
        }


}
