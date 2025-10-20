public class countVowelsConsonants {
    public static void main(String[] args) {
        String str = "hello would";
        str = str.toLowerCase();
        int vowels = 0, consonants = 0;
        for (char c : str.toCharArray()) {
            if ("aeiou".indexOf(c) != -1) {
                vowels++;
            } else if (Character.isLetter(c)) {
                consonants++;
            }
        }
        System.out.println("vowels:" + vowels + ", consonants:" + consonants);
    }
}
