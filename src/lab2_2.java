import java.nio.charset.StandardCharsets;
import java.util.InputMismatchException;
import java.util.Scanner;

public class lab2_2 {

    public static void SetArray(int[] arr){
        Scanner sc = new Scanner(System.in, StandardCharsets.UTF_8);
        try {
            for (int i = 0; i < arr.length; i++) {
                System.out.println("Element " + (i + 1));
                arr[i] = sc.nextByte();
            }
        } catch (InputMismatchException e){
            System.err.println("Your element wasn't int type.");
        }
    }

    public static int MaxWrong(int max){
        if (max != 0) {
            if (max > 2147483647 || max < ( -2147483648)) {
                throw new IllegalArgumentException("Int type supports digits in range from -2,147,483,648 to 2,147,483,647, your is " + max);
            } else {
                System.out.println("Max: " + max);
                return max;
            }
        }
        return 0;
    }
    public static int MaxElem(int[] arr){
        int max = 0;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 3 == 0) {
                count++;
                if (arr[i] > max && arr[i] % 3 == 0) {
                    max = arr[i];
                }
            }
        }
        if (count != 0) {
            return max;
        }
        return 0;
    }

    public static int MaxIndex(int[] arr) {
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
        if (count != 0) {
            return maxindex;
        }
        return 0;
    }

    public static void main(String[] args) {
        try {
            Scanner ns = new Scanner(System.in, StandardCharsets.UTF_8);
            System.out.println("Enter length of array: ");
            int numbers = ns.nextByte();

            int[] arr = new int[numbers];

            SetArray(arr);

            int max = MaxWrong(MaxElem(arr));
            int maxindex = MaxIndex(arr);
            System.out.println("Max index: " + (maxindex + 1));
            if (max == 0) {
                System.out.println("The elements that divide into 3 are missing.");
            }
        } catch (InputMismatchException e){
            System.err.println("Your element wasn't int type.");
        }
    }
}
