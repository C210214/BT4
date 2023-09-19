import java.util.Arrays;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Array - mảng là khái niệm dùng để lưu trữ danh sách các giá trị cùng kiểu dữ liệu
        // Cú pháp: tường minh
        int[] array = {1,2,3,4,5,6};
        System.out.println(Arrays.toString(array));
        // Cú pháp: sử dụng từ khóa new
        int[] arrayInt = new int[10];
        System.out.println(Arrays.toString(arrayInt));
        // truy cập phần tử theo vị trí
        System.out.println("Phần tử tại vị trí index = 0 là " + array[0]);
        // gán lại giá trị
        array[0]= 10;
        System.out.println("Phần tử tại vị trí index = 0 là " + array[0]);
        // duyệt mảng
        for(int i = 0; i < array.length; i++){ // duyệt theo index
            System.out.printf("Phần tử tại vị trí index = %d là %d \n",i,array[i]);
        }
        // duyệt theo foreach : duyệt theo giá trị
        for (int value:array){
            System.out.println(value);
        }

        // bài toán : kiểm tra trong mảng và hiển thị các số chia hết cho 2
        System.out.println("Các số chia hết cho 2 là :");
        for (int value:array){
            if(value%2==0){
                System.out.println(value);
            }
        }
        for(int i = 0; i < array.length; i++){
            int value = array[i];
            if(value%2==0){
                System.out.println(i);
            }
        }
        // Mảng hai chiều là gì: mảng chứa danh sách các mảng khác
        int[][] array2Side = {{1,2,3}, {4,5,6,7}};
        for (int[] arr: array2Side){
            System.out.println(Arrays.toString(arr));
        }
        int [][] arr2Side = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        for(int[] arr: arr2Side){
            System.out.println(Arrays.toString(arr));
        }

        // duyệt theo ma trận
        for (int i = 0; i < arr2Side.length; i++){
            for (int j = 0; j < arr2Side[i].length; j++){
                System.out.printf("%2d",arr2Side[i][j]);
            }
            System.out.println();
        }

        // Bài toán nhập xuất dữ liệu mảng 2 chiều
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào số hàng m =");
        int m = sc.nextInt();
        System.out.println("Nhập vào số cột n =");
        int n = sc.nextInt();
        int[][] matrix = new int[m][n];
        // nhập lần lượt giá trị cho mảng
        for (int i=0; i < m; i++){
            for (int j = 0; j< n; j++){
                System.out.printf("\n Nhập giá trị cho matrix[%d][%d]=",i,j);
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("Các giá trị vừa nhập là");
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++){
                System.out.printf("%2d",matrix[i][j]);
            }
            System.out.println();
        }
    }
}