package Arraynew;

public class array1 {
    public static void main(String[] args) {
        int ar[]={12,10,5,4,7,2,1};//create
        System.out.println(ar[0]);//read
        System.out.println("Accessing using foreach");
        for (int a:ar){
            System.out.println(a+"");//read
        }
        System.out.println("Accessing with normal for loop");
        for(int i=0; i<ar.length; i++){
            System.out.println(ar[i]+"");
        }

        //update all even number to -1
        System.out.println("\n\n Array after update");
        for(int i=0; i<ar.length; i++){
            //    System.out.print(ar[i]+" ");//read
            if(ar[i]%2==0){
                ar[i]=-1; //update
            }

        }
        for (int i=0;i<ar.length;i++){
            System.out.print(ar[i]+" ");//read
        }
    }
}
