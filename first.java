//linear search question in array
import java.util.*;

public class first {
    public static int linser(int tar,int arr[]) {
        for(int i =0;i<arr.length;i++){
            if(arr[i]==tar){
                // System.out.println("Target element are found");
                return i ;

            }else{
                // System.out.println("Target element are not found");
            }
        }
        return -1 ;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many data are you want to add");
         int n = sc.nextInt();
         System.out.println("Start entry of data");
        int arr[]= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();       
        }
        System.out.println("which element are you target");

        int tar = sc.nextInt();

        System.out.println("Element are found at index : "+linser(tar, arr));
        


    }
}
