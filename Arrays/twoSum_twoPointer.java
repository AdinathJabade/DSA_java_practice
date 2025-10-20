import java.util.Arrays;

public class twoSum_twoPointer {
    public static void main(String[] args) {
        int arr[]={2,5,1,3,7,8};
        int target=9;
        Arrays.sort(arr);
        int i=0,j=arr.length-1;
        while (i<j) {
            int sum=arr[i]+arr[j];
            if(sum==target){
                System.out.println("pair found: "+"("+arr[i]+", "+arr[j]+")");
                break;
            }
            else if(sum<target){
                i++;
            }
            else{
                j--;
            }
        }
    }
}
