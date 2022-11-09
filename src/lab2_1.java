import java.nio.charset.StandardCharsets;
import java.util.InputMismatchException;
import java.util.Scanner;

public class lab2_1 {
    public static void main(String[] args) {
        Scanner ns = new Scanner(System.in, StandardCharsets.UTF_8);
        int num;
        try {
            System.out.println("Enter length of array: ");
            num = ns.nextByte();
            int[] arr = new int[num];
            for (int i = 0; i < arr.length; i++) {
                System.out.println("Element " + (i + 1));
                arr[i] = ns.nextByte();
            }
            int max = 0;
            int maxindex = 0;
            int count = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] % 3 == 0) {
                    count++;
                    if (arr[i] > max && arr[i] % 3 == 0) {
                        max = arr[i];
                        maxindex = i;
                    }
                }
            }
            if (count == 0) {
                System.out.println("The elements that divide into 3 are missing");
            } else {
                System.out.println("Max: " + max + " Max index: " + maxindex);
            }
        } catch(InputMismatchException e){
            System.out.println("-");
        }
    }
}
