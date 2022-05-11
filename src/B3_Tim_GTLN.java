public class B3_Tim_GTLN {
    public static void main(String[] args) {
        int array[]={4,2,8,9,5,10,12,6,5};
        int max =array[0];
        System.out.print("Gias tri lon nhat trong mang la:");
        for (int i=0;i< array.length;i++){
            if(array[i]>max){
                max=array[i];
            }
        }
        System.out.print(max);
    }
}
