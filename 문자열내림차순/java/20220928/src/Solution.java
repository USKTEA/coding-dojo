public class Solution  {
    public String[] split(String text) {
        StringBuffer stringBuffer1 = new StringBuffer();
        StringBuffer stringBuffer2 = new StringBuffer();

        char[] textArray = text.toCharArray();

        for (char alphabet: textArray) {
            if (alphabet >= 97) {
                stringBuffer2.append(alphabet);

                continue;
            }

            stringBuffer1.append(alphabet);
        }

        return new String[] {stringBuffer2.toString(), stringBuffer1.toString()};
    }

    public String reverseSort(String string) {
        char[] text = string.toCharArray();

        int left = 0;
        int right = left + 1;

        while (left < text.length - 1) {
            char x = text[left];
            char y = text[right];

            if (y >= x) {
                text[left] = y;
                text[right] = x;
            }

            right += 1;

            if (right == text.length) {
                left += 1 ;
                right = left + 1;
            }
        }

        return String.valueOf(text);
    }

    public String join(String[] strings) {
        return String.join("", strings);
    }

    public String solution(String text) {
        String[] array = split(text);
        StringBuffer stringBuffer = new StringBuffer();

        for (String string : array) {
            stringBuffer.append(reverseSort(string));
        }

        return stringBuffer.toString();
    }
}
