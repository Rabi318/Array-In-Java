public class Anonymous_array {
    public static void main(String[] args) {
       
        //Anonymous_array.sum(new int[]{10,20,30}); //1D array

         Anonymous_array.sum2(new int[][]{{10,20,30},{40,50}}); //2D array
    }
    
    static void sum(int[] no){
        int total=0;
        for(int i:no){
            total +=i;
        }
        System.out.println(total); //Output=60
    }

    static void sum2(int[][] no){
        int total=0;
        for(int ii[]:no){
            for(int i:ii){
                total +=i;
            }
        }
        System.out.println(total);
    }
}
