import java.util.Scanner;

public class B14_DemChuoi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String object;
        System.out.println("Nhap vao 1 chuoi ky tu :");
        object = sc.nextLine();
        char kytu='c';
        int dem =0;
        for(int i=0;i<object.length();i++){
            if(object.charAt(i)==kytu){
                dem++;
            }
        }
        System.out.println("so lan xuat hien trong chuoi cua ky tu la:"+dem);
    }
}
