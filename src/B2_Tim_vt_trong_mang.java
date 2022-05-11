import java.sql.SQLOutput;
import java.util.Scanner;

public class B2_Tim_vt_trong_mang {
    public static void main(String[] args) {
        String [] nameSv ={"the","hoang","hau","tan","ngoc","duc"};
        Scanner sc = new Scanner(System.in);
        String input ;
        System.out.println("Nhap ten ban muon tim kiem:");
        input = sc.nextLine();
        boolean check=false;
        for (int i=0;i<nameSv.length;i++){
            if(nameSv[i].equals(input)){
                System.out.println("Ten ban nhap o vi tri:"+i);
                check =true;
                break;
            }
        }
        if(!check){
            System.out.println("Ten ban nhap k co !");
        }
    }
}
