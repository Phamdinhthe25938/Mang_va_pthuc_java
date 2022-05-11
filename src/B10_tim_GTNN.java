public class B10_tim_GTNN {
    public static void main(String[] args) {
        int array []= {4,2,6,1,9,3,5};
        int min=array[0];
        for(int i=0;i<array.length;i++){
            if(min>array[i]){
                min=array[i];
            }
        }
        System.out.println("min="+min);
    }
}
