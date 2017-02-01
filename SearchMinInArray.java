import java.util.Scanner;

public class SearchMinInArray {
    public int min;

    public int MinInArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            min = array[i][0];
            for (int j = 0; j < array[i].length; j++) {


                if (min > array[i][j])
                    min = array[i][j];

            }

        }
        return min;
    }


    static public void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("input data:");
        int size = sc.nextInt();
        int[][] array = new int[size][3];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = sc.nextInt();

            }
        }
        SearchMinInArray min = new SearchMinInArray();
        min.MinInArray(array);

    }

}

















