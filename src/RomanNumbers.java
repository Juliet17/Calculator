import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public enum RomanNumbers {
    I(1), IV(4), V(5), IX(9), X(10), C(100);

    private int value;

    RomanNumbers(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public static List<RomanNumbers> getReversedValues() {
        return Arrays.stream(values())
                .sorted(Comparator.comparing((RomanNumbers e) -> e.value).reversed())
                .collect(Collectors.toList());
    }

}
