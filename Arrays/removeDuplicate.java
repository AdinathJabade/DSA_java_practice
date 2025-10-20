import java.util.HashSet;

public class removeDuplicate {
    public static void main(String[] args) {
        int arr[] = { 1, 1, 2, 2, 3, 3, 4, 4, 5, 6, 7, 7, 8 };
        HashSet<Integer> set = new HashSet<>();
        for (int i : arr) {
            set.add(i);
        }
        for (int i : set) {
            System.out.println(i);
        }
    }
}
