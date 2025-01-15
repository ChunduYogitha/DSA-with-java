1)Searching a target
2)Searching a target using functions
3)Find a target 
---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
1)Searching a target
class Main{
    public static void main(String[] args){
        int[] arr = {10, 20, 30, 40,50};
        int target = 35;
        int s = 0;
        int e = arr.length-1;
        boolean a = false;
        while(s<=e){
            int mid = s+(e-s)/2;
            if(arr[mid] == target){
                System.out.println("Found");
                a=true;
            }
            else if(arr[mid]>target){
                e=mid-1;
            }
            else {
                s=mid+1;
            }
        }
        if(!a){
            System.out.println("Not Found");
        }
    }
}
output : Not Found

---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
2)Searching a target using functions
  class Main{
    public static void main(String[] args){
        int[] arr = {10, 20, 30, 40, 50};
        int target = 35;
        int s = 0;
        int e = arr.length-1;
        System.out.println(BinarySearch(target, arr, s,e));
    }
    static int BinarySearch(int target, int[] arr, int s, int e){
        while(s<=e){
            int mid = s+(e-s)/2;
            if(arr[mid] == target){
                return mid;
            }
            else if(arr[mid]>target){
                e=mid-1;
            }
            else{
                s=mid+1;
            }
        }
        return -1;
    }
}

output : -1


---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
3)Find a target
  
  class Main{
    public static void main(String[] args){
        int[] arr = {10, 20, 30, 40, 50};
        int target = 30;
        int s = 0;
        int e = arr.length-1;
        int c = BinarySearch(target, arr, s,e);
        if(c>=0){
            System.out.println("Found at place "+c);
        }
        else {
            System.out.println("Not found");
        }
    }
    static int BinarySearch(int target, int[] arr, int s, int e){
        while(s<=e){
            int mid = s+(e-s)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]>target){
                e=mid-1;
            }
            else{
                s=mid+1;
            }
        }
        return -1;
    }
}
output : Found at place 2
  
---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
  
