import java.util.Arrays;
import java.util.Scanner;

public class BT2 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số cần thêm: ");
        int n = sc.nextInt();
        System.out.println("Nhập vị trí cần thêm vào mảng (index):");
        int index = sc.nextInt();
        int[] newArr = new int[arr.length + 1];
        System.out.println(Arrays.toString(newArr));
        for (int i = 0; i < index; i++) {
            newArr[i] = arr[i];
        }
        newArr[index] = n;
        for (int i = index; i < arr.length; i++) {
            newArr[i + 1] = arr[i];
        }
        System.out.println(Arrays.toString(newArr));
    }
}
