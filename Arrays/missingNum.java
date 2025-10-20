public class missingNum {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,10};
        int n=arr.length+1;
        int totalSum=n*(n+1)/2;
        int sum=0;
        for (int i : arr) {
            sum+=i;
        }
        int missingNum=totalSum-sum;
        System.out.println(missingNum);
    }
}
