public class TwoD_Array {
    public static void main(String[] args) {
        int [][] a={{10,20,30,40,},{50,60,},{70,80,90}};

        //System.out.println(a); // output=[[I@____--any hash value like 4617c264

        //System.out.println(a[0]);  //output=[I@___-any hash value

        //System.out.println(a[0][0]); //Output=10

        //System.out.println(a.length); //Output=3 , base size of the array a is 3

        //System.out.println(a[0].length); //Output=4, It provied the first row lenght which contain 10,20,30,40 i.e four elements

        
        //Print the elements of the array
        for(int i=0; i<a.length;i++){
            for(int j=0; j<a[i].length;j++){
                System.out.println(a[i][j]+" ");
            }
            System.out.println();
        }  
    }  
}
