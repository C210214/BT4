public class BT5 {
    public static void main(String[] args) {
            int[][] arr2Side = {{1,2,3}, {4,19,6,7}};
            int min = 1;
            for (int i = 0; i < arr2Side.length; i++){
                for (int j = 0; j < arr2Side[i].length; j++){
                    if(arr2Side[i][j] < min){
                        min = arr2Side[i][j];
                    }
                }
            }
            System.out.println(min);
    }
}
