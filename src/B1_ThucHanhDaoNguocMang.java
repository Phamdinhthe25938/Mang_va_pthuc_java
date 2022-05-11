import java.util.Scanner;

public class B1_ThucHanhDaoNguocMang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.println("nhap so luong phan tu:");
             n = sc.nextInt();
        }
        while (n<0);
        int [] array= new int[n];
        for (int i =0;i<n;i++){
            System.out.print("Array["+i+"]=");
             array[i]= sc.nextInt();
        }
        System.out.println("Mang sau khi nhap la :");
        for (int i=0;i<n;i++){
            System.out.print(array[i]+ " ");
        }
        System.out.println("");
        System.out.println("Mang sau khi dao nguoc la:");
        for(int i=array.length-1;i>=0;i--){
            System.out.print(array[i]+" ");
        }
    }
}
