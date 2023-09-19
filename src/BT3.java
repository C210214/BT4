import java.util.Arrays;

public class BT3 {
    public static void main(String[] args) {
        int[] arr1 = {1,2};
        int[] arr2 = {3,4};
        int length = arr1.length + arr2.length;
        int[] newArr = new int[length];
        int index = 0;
        for (int i = 0; i < arr1.length; i++) {
            newArr[index] = arr1[i];
            index++;
        }
        for (int i = 0; i < arr2.length; i++) {
            newArr[index] = arr2[i];
            index++;
        }
        System.out.println(Arrays.toString(newArr));

    }
}
