import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Solution {
    public boolean solution(String[] phoneBook) {
        if (phoneBook.length == 1) {
            return false;
        }

        List<PhoneNumber> phoneNumbers = toPhoneNumber(phoneBook);

        return verifyPrefixNotExists(phoneNumbers);
    }

    public List<PhoneNumber> toPhoneNumber(String[] strings) {
        List<PhoneNumber> phoneNumbers = new ArrayList<>();

        Arrays.asList(strings)
                .stream()
                .forEach((phoneNumber) -> phoneNumbers.add(new PhoneNumber(phoneNumber)));;

        return phoneNumbers;
    }

    public boolean verifyPrefixNotExists(List<PhoneNumber> numbers) {
        for (int i = 0; i < numbers.size() - 1; i += 1) {
            for (int j = i + 1; j < numbers.size(); j += 1) {
                if (numbers.get(j).isPrefix(numbers.get(i))) {
                    return false;
                }
            }
        }

        return true;
    }
}
