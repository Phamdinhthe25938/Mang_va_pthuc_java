import java.sql.SQLOutput;

public class B5_timGTNT_PThuc {
    static int tim_GTNT(int newArray[]){
        int min= newArray[0];
        for (int i=0;i<newArray.length;i++){
            if(min>newArray[i]){
                min=newArray[i];
            }
        }
        return min;
    }
    public static void main(String[] args) {
        int array []={5,6,2,8,3,12,6,9};
        int min = tim_GTNT(array);
        System.out.println("Gia tri nho nhat trong mang la:"+min);
    }
}
