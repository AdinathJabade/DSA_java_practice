public class practiceStringQue {
    public static void reverseString() {
        String str = "Adi";
        String newStr = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            newStr += str.charAt(i);
        }
        System.out.println(newStr);
    }

    public static void removeDuplicates(){
        String str="abcabc";
        String newStr = "";
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            if (newStr.indexOf(currentChar) == -1) {
                newStr += currentChar;
            }
        }
        System.out.println(newStr);
    }
    public static void anagramCheck() {
        String str1 = "listen";
        String str2 = "silent";

        if (str1.length() != str2.length()) {
            System.out.println("Not anagrams");
            return;
        }

        int[] charCount = new int[26]; // Assuming only lowercase letters a-z

        for (char c : str1.toCharArray()) {
            charCount[c - 'a']++;
        }

        for (char c : str2.toCharArray()) {
            charCount[c - 'a']--;
        }

        for (int count : charCount) {
            if (count != 0) {
                System.out.println("Not anagrams");
                return;
            }
        }
        System.out.println("Anagrams");
    }

    public static void main(String[] args) {
        // reverseString();
        // removeDuplicates();

    }

}
