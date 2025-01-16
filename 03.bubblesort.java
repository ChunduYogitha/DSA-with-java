1)Bubble Sort Example
2)BubbleSort using function
---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
1)Bubble Sort Example
  
import java.util.Arrays;
public class Main{
    public static void main(String[] args){
        int[] arr = {9, 4, 0, 3, 5};
        int n = arr.length;
        System.out.println("Length : "+n);
        for(int i=0; i<n-1; i++){
            boolean swap = false;
            for(int j=0; j<n-1-i; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swap = true;
                }
            }
            if(!swap){
                break;
            }
        }
        System.out.print(Arrays.toString(arr));
    }
}
output : 
Length : 5
[0, 3, 4, 5, 9]
---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
2)BubbleSort using function
  
  import java.util.Arrays;
public class Main{
    public static void main(String[] args){
        int[] arr = {2,8,7,5,1};
        int n = arr.length-1;
        System.out.println("Length : "+n);
        System.out.println("Input : "+Arrays.toString(arr));
        bubble(arr, n);
        System.out.print("Sorted : "+Arrays.toString(arr));
    }
    static void bubble(int[] arr, int n){
        for(int i=0; i<n; i++){
            boolean swap = false;
            for(int j=0; j<n-i; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swap = true;
                }
            }
            if(!swap){
                break;
            }
        }
    }
}
