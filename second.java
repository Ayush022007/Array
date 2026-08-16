//binary search in Array
package Array;
import java.util.*;
public class second {
    public static int binarr(int arr[],int tar) {
        int end = arr.length-1;
        for(int start = 0; start<=end;start++){
        int mid =(start+end) /2;
        //comparison
        if(arr[mid] == tar){
            return mid;
        }
        if(arr[mid]<tar){
            start = mid+1;
        }
        else{
            end = mid-1;
        }
    }
    return -1;
    }
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter how many data are you want to add :");
    int n = sc.nextInt();
    System.out.println("Start entry of data: ");
    int arr[]= new int[n];
    for(int i = 0;i<n ; i++){
        arr[i]=sc.nextInt();
    }
    System.out.print("Enter a element you target : ");
    int tar = sc.nextInt();

    binarr(arr, tar);
}
}
