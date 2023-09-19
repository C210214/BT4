
public class BT7 {
    public static void main(String[] args) {
        int[][] arr2Side = {{1,2,3,10}, {4,19,6,7}, {8,9,11,12}};
        int sum = 0;
        for (int i = 0; i < arr2Side.length; i++) {
            sum += arr2Side[i][i];
        }
        System.out.println(sum);
    }
}
