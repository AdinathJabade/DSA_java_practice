public class reverseArray {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        int first = 0, last = arr.length - 1;
        while (first < last) {
            int temp = arr[first];
            arr[first] = arr[last];
            arr[last] = temp;
            first++;
            last--;
        }
        System.out.print("The reverse array:");
        for (int i : arr) {
            System.out.print(i + "");
        }
    }
}
