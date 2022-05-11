public class B9_GTLN_mang2chieu {
    public static void main(String[] args) {
        int array[][]= {{3,4,2,8,3},{3,9,6,2,1},{8,3,9,4}};
        int max = array[0][0];
        System.out.print("MAX= ");
        for(int i =0;i<array.length;i++){
            for(int j=0;j< array[i].length;j++){
                if(array[i][j]>max){
                   max=array[i][j];
                }
            }
        }
        System.out.print(max);
    }
}
