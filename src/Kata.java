import java.util.*;
import java.util.stream.*;

public class Kata {
    public static String createPhoneNumber(int[] numbers) {
        String[] postalCode = Arrays.stream(numbers).mapToObj(String::valueOf).toArray(String[]::new);
        String firstPart = Arrays.stream(postalCode).limit(3).collect(Collectors.joining());
        int[] middle = Arrays.copyOfRange(numbers, 3, 6);
        String thirdPart = Arrays.stream(postalCode).skip(6).collect(Collectors.joining());
        String middlePart = Arrays.stream(middle).mapToObj(String::valueOf).collect(Collectors.joining());
        return "(" + firstPart + ")" + " " + middlePart + "-" + thirdPart;
    }
}
