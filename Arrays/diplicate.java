import java.util.HashSet;

public class diplicate {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 4, 5, 5, 6 };
        HashSet<Integer> set = new HashSet<>();
        for (int n : arr) {
            if (set.contains(n)) {
                System.out.println(n);
            } else {
                set.add(n);
            }
        }
    }
}
