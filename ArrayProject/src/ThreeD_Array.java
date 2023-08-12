public class ThreeD_Array {
    public static void main(String[] args) {
        int[][][] a={{{10,20},{30,40,50,60},{70,80,90}}};

        //System.out.println(a);  //Output= Third dimention array class name , [[[I@___--hash value

       // System.out.println(a[0]); //Output= It represent two dimention array class, [[I@__--hash value

       //System.out.println(a[0][0]); //Output= One dimention array class, [I@----hash value

       //System.out.println(a[0][0][0]); //Output=10

       //System.out.println(a[0][0][1]); //Output=20

       //Print all the elements of the array
       for(int i=0;i<a.length;i++)
       {
          for(int j=0;j<a[i].length;j++)
         {
            for(int k=0; k<a[i][j].length;k++)
            {
                System.out.println(a[i][j][k]+" ");
            }
            System.out.println();
         }
       }
    }  
}
