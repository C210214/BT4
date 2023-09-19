import java.util.Scanner;

public class BT8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chuỗi: ");
        String str = scanner.nextLine();
        System.out.print("Nhập ký tự cần đếm: ");
        char kyTuCanDem = scanner.next().charAt(0);
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == kyTuCanDem) {
                count++;
            }
        }
        System.out.println("Số lần xuất hiện của ký tự '" + kyTuCanDem + "' trong chuỗi là: " + count);
        scanner.close();
    }
}
