1)Searching target using linear search


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
