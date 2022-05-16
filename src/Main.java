import  java.util.Scanner;
import java.util.Arrays;

public class Main {


    public static void main(String[] args) {

        int[] array = new int[20];
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < array.length; i++) {
            System.out.println("input digit:  ");
            int digit = scan.nextInt();
            array[i] = digit;
        }
        int[] array1 = new int[10];
        int[] array2 = new int[10];
        System.arraycopy(array, 0, array1, 0, 10);
        for (int i = 0; i < array1.length; i++)
        System.out.println("First: " + array1[i]);
        System.arraycopy(array, 10, array2, 0, 10);
        for (int i = 0; i < array2.length; i++)
        System.out.println("Second: " + array2[i]);
    }
}
