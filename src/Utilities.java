public class Utilities {

    public static int getFirstRepeatedCharacter(String text) {
        int textLength = text.length();
        for (int i = 0; i < textLength; i++) {
            char ch1 = text.charAt(i);
            for (int o = i + 1; o < textLength; o++) {
                char ch2 = text.charAt(o);
                if (ch1 == ch2) {
                    return o;
                }else {
                    break;
                }
            }
        }
        return 0;
    }



    public static int goDownToOne(int startNumber) {
        int number1 = startNumber;
        while (number1 != 1) {
            System.out.println(number1 + " ");
            if (number1 % 2 == 0) {
                number1 = number1 / 2;
            } else {
                number1 = number1+(number1 * 2 + 1);
            }

        }
        return number1;
    }

}