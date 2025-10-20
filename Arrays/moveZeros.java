public class moveZeros {
    public static void main(String[] args) {
        int arr[] = { 1, 0, 2, 0, 3, 0, 0, 5, 4 };
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[count] = arr[i];
                count++;
            }
        }
        while (count < arr.length) {
            arr[count] = 0;
            count++;
        }
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
