public class OneD_Array {
    public static void main(String[] args) {
        int[] a={10,20,30,40,50,60};  //Declaration, creation and initialization in one line


        //For loop for print the array elements
        // for(int i=0; i<a.length; i++){
        //     System.out.println(a[i]+",");
        // }
        

        //For-Each loop for print the array elements
        for(int i:a){
            System.out.println(i);
        }
    }
}
