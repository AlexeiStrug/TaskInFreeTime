import java.util.Scanner;

public class problemMediaa {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);

        int[][] Mas= new int[3][3];
        int[] N= new int [3];

        int tmp,c1=0;
        for (int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                Mas[i][j]=sc.nextInt();
            }
        }

        for (int k = 0; k <3; k++){
            for(int i = 0;i <3; i++){
                for (int j = 3-1; j > i; j--)
                    if (Mas[k][j] < Mas[k][j-1]){
                        tmp = Mas[k][j];
                        Mas[k][j] = Mas[k][j-1];
                        Mas[k][j-1] = tmp;
                    }
                if (i==1)
                    N[k]=Mas[k][i];
            }
        }
        for(int i=0;i<3;i++){
            for(int j=i+1;j<3;j++){
                if(N[i]>N[j]){
                    tmp=N[i];
                    N[i]=N[j];
                    N[j]=tmp;}
            }

        }
        for(int i=0; i < 3; i++)
        System.out.println(N[i]);
    }
}