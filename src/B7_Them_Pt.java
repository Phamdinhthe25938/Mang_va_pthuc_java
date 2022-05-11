import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;

public class B7_Them_Pt {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,3,2};
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vi tri muon them:");
        int index = sc.nextInt();
        System.out.println("Nhap so can chen:");
        int number = sc.nextInt();
        System.out.println("Mang sau khi them :");
        boolean check = false;
        for(int i=0;i<array.length;i++){
            if(0<=index && index<array.length){
                check = true;
            }
        }
        int newArray [] = new int[array.length+1];
        int x=0;
        try {
            if(check){
                for(int i=0;i<=array.length;i++){
                    if(i<index){
                        newArray[x]= array[i];
                        x++;
                    }
                    else if(i==index){
                        newArray[index]=number;
                        x++;
                    }
                    else if(i>index){
                        newArray[x]=array[i-1];
                        x++;
                    }
                }
                System.out.println("Mang sau khi them la :");
                for (int i = 0; i < newArray.length; i++) {
                    System.out.println(newArray[i]);
                }
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
