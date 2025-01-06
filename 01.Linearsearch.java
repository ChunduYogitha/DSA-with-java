1)Searching target using linear search
2) Searching target using linear search with Scanner and call method

-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
1)Searching target using linear search
class Main{
    public static void main(String[] args){
        int[] arr = {18, 19, 23, 45, 20};
        int target = 23;
        int a = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]==target){
                a ++;
                break;
            }
        }
        if(a!=0){
            System.out.println("Found target - "+a);
        }
        else{
            Syste.out.println("Not Found");
        }
    }
}
output
Found target

-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
2) Searching target using linear search with Scanner and call method
    
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the  array size : ");
        int n = sc.nextInt();
        System.out.println("Enter "+n+" Values");
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Printing array : ");
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.print("Enter target : ");
        int target = sc.nextInt();
        int a = LinearSearch(n, arr, target);
        if(a!=-1){
            System.out.println("Found target "+target+" - "+a+" index");
        }
        else {
            System.out.println("Not Found");
        }
        
    }
        static int LinearSearch(int n, int[] arr, int target){
            if(arr.length == 0){
                return -1;
            }
            for(int i=0;i<n;i++){
                if(arr[i]==target){
                    return i;
                }
            }
            return -1;
        }
    
}
output
    Enter the  array size : 4
    Enter 4 Values
    12
    22
    44
    66
    Printing array : 
    12 22 44 66 
    Enter target : 44
    Found target 44 - 2 index

-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

