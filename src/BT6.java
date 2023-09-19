import java.util.Scanner;

public class BT6 {
    public static void main(String[] args) {
        int[][] arr2Side = {{1,2,3,10}, {4,19,6,7}, {8,9,11,12}};
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập cột muốn tính tổng: ");
        int cot = sc.nextInt();
        int index = cot - 1;
        int sum = 0;
        for (int i = 0; i < arr2Side.length; i++) {
                sum += arr2Side[i][index];
        }
        System.out.println(sum);
    }
}
