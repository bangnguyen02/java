import java.util.Scanner;

public class App74 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao so phan tu cua mang : ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        if(n > 0){
            for(int i = 0;i < n;i++){
                arr[i] = sc.nextInt();
            }

            int sum = 0;
            for(int i = 0;i < n;i++){
                if(arr[i] % 2 == 0){
                    sum += arr[i];
                }
            }

            System.out.println("Tong cua cac so chan la : " + sum);
        }
    
    }
}