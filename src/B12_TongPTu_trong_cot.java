import java.util.Scanner;

public class B12_TongPTu_trong_cot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b;
            System.out.println("Nhap so hang:");
             a = sc.nextInt();
            System.out.println("Nhap so cot:");
            b = sc.nextInt();
        do{
            if(a<0){
                System.out.println("Nhap laij so hang:");
                a= sc.nextInt();
            }
             if(b<0){
                 System.out.println("Nhap lai so cot:");
                 b= sc.nextInt();
             }
        }
        while (a<0||b<0);
        int array [][]= new int [a][b];
        for(int i=0;i<a;i++){
            for (int j=0;j<b;j++){
                System.out.println("array["+i+"]"+"["+j+"]= ");
                array[i][j]=sc.nextInt();
            }
        }
        int tong=0;
        System.out.print("Nhap so cot ban muon tinh tong:");
        int c= sc.nextInt();
        for(int i =0;i<array.length;i++){
            tong +=array[i][c];
        }
        System.out.print("Tong phan tu trong cot "+c+": ");
        System.out.print(tong);
    }
}
