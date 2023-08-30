import java.util.Random;

public class Main {
    public static void main(String[] args) {

        //Arreglos

        int[] a;
        int b[];

        int[] c = new int[10];
        int[] d = {1,2,3,4,5};

        int[] arreglo = new int[20];
        int[] arreglo2 = new int[] {1,2,3,4,5,6};

        arreglo[5] = 16;
        System.out.println(arreglo[5]);

        for (int i = 0; i < 6; i++){
            System.out.println(arreglo2[i]);
        }

        //Arreglo con elementos random
        Random rand = new Random();

        int[] ranArray = new int[10];
        for (int i = 0;i < 10;i++){
            ranArray[i] = rand.nextInt(1000);
        }
        for(int i: ranArray){
            System.out.println(i);
        }
    }
}
