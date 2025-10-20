public class reverseString {
    public static void main(String[] args) {

        // using String Builder class Reversed String

        StringBuilder sb = new StringBuilder("Adi");
        for (int i = 0; i < sb.length() / 2; i++) {
            int front = i;
            int back = sb.length() - 1 - i;
            char frontChar = sb.charAt(front);
            char backChar = sb.charAt(back);
            sb.setCharAt(front, backChar);
            sb.setCharAt(back, frontChar);
        }
        System.out.println(sb);

        // without using using String Builder class Reversed String
        // String str = "Adi";
        // char charArr[] = str.toCharArray();
        // int start = 0;
        // int end = charArr.length - 1;
        // while (start < end) {
        //     char temp = charArr[start];
        //     charArr[start] = charArr[end];
        //     charArr[end] = temp;
        //     start++;
        //     end--;
        // }
        // String reversedString = new String(charArr);
        // System.out.println(reversedString);
    }
}
