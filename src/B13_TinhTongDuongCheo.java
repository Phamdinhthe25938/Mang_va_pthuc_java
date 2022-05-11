import java.util.Scanner;

public class B13_TinhTongDuongCheo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b;
        System.out.println("Nhap so hang:");
        a = sc.nextInt();
        System.out.println("Nhap so cot (cot= hang):");
        b = sc.nextInt();
        do{
            if(b!=a){
                System.out.println("Nhap lai so cot(cot = hang):");
                b= sc.nextInt();
            }
        }
        while (b!=a);
        int [][] array= new int[a][b];
        for(int i=0;i<a;i++){
            for (int j=0;j<b;j++){
                System.out.println("array["+i+"]"+"["+j+"]= ");
                array[i][j]=sc.nextInt();
            }
        }
        int t1=0;int t2=0;
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array[i].length;j++){
                if(i==j){
                    t1+=array[i][j];
                }
                else if(i+j==array.length-1){
                    t2+=array[i][j];
                }
            }
        }
        int t = t1+t2;
        System.out.println("Tong hai duong cheo la :"+t);
    }
}
