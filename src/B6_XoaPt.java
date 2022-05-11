import java.util.Scanner;

public class B6_XoaPt {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,3,2,1,1,2,4,3};
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhap so can xoa");
        int delete = scanner.nextInt();
        int check = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i]==delete){
                check++;
            }
        }
        int[] array2 = new int[array.length-check];
        int x =0;
        for (int i = 0; i < array.length; i++) {
            if(array[i]!=delete){
                array2[x]=array[i];
                x++;
            }
        }
        System.out.println("mang sau khi xoa:");
        for (int j = 0; j <array2.length ; j++) {
            System.out.print(array2[j]+" ");
        }
    }
}
