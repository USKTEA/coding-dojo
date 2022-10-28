import java.util.Arrays;

public class Solution {
    private Decryptor decryptor = new Decryptor();

    public int solution(String s) {
        return decrypt(toArray(s));
    }

    public String[] toArray(String word) {
        return word.split("");
    }

    public int decrypt(String[] password) {
        Arrays.stream(password).forEach((word) -> decryptor.decrypt(word));

        return decryptor.result();
    }
}
