package Array;
//find duplicate element if find print true or not;
import java.util.*;
public class fifth {
    public static void comp(int nums[]) {
        int n = nums.length;
    for(int i = 0;i<n;i++){
        for(int j =i+1; j<n;j++){
            if(nums[i]==nums[j]){
                System.out.println("True" +nums[i]);
                return;
            }
        }
        
    }
    System.out.println("False");
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many data are you want to store : ");
        int n = sc.nextInt();
        System.out.print("Start entering data in for of String : ");
        int nums[] = new int[n];
        for(int i=0;i<n;i++){
            nums[i]= sc.nextInt();
        }
        comp(nums);
    }

    
}
