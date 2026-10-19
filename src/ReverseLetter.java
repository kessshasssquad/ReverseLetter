public class ReverseLetter {
    public static String reverseLetters(String text) {
        char[] chars = text.toCharArray();
        int left = 0;
        int right = chars.length - 1;
        while (left < right) {
            if (!Character.isLetter(chars[left])) {
                left++;
                continue;
            }
            if (!Character.isLetter(chars[right])) {
                right--;
                continue;
            }
            char tmp = chars[left];
            chars[left] = chars[right];
            chars[right] = tmp;
            left++;
            right--;
        }
        return new String(chars);

        //System.out.println(new String(chars));

    }
    public static void main(String[] args) {
        String text = "J@va the be$t!123";
        System.out.println(reverseLetters(text));

    }
}
