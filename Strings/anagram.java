import java.util.Arrays;

public class anagram {
    public static void main(String[] args) {
        String a = "listen", b = "silent";
        char arr1[] = a.toCharArray();
        char arr2[] = b.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        System.out.println(Arrays.equals(arr1, arr2));
    }
}
