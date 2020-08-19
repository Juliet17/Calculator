import java.util.List;

public class Converter {
    public static int romanToArabic(String input) {
        String romanNumber = input.toUpperCase();
        int result = 0;

        List<RomanNumbers> romanNumbers = RomanNumbers.getReversedValues();

        int i = 0;

        while ((romanNumber.length() > 0) && (i < romanNumbers.size())) {
            RomanNumbers symbol = romanNumbers.get(i);
            if (romanNumber.startsWith(symbol.name())) {
                result += symbol.getValue();
                romanNumber = romanNumber.substring(symbol.name().length());
            } else {
                i++;
            }
        }

        return result;
    }

    public static String arabicToRoman(int number) {
        if ((number < 0) || (number > 100)) {
            throw new IllegalArgumentException(number + " is not in the range, please, enter another number");
        }

        List<RomanNumbers> romanNumbers = RomanNumbers.getReversedValues();

        int i = 0;

        StringBuilder sb = new StringBuilder();

        while ((number > 0) && (i < romanNumbers.size())) {
            RomanNumbers currentSymbol = romanNumbers.get(i);
            if (currentSymbol.getValue() <= number) {
                sb.append(currentSymbol.name());
                number -= currentSymbol.getValue();
            } else {
                i++;
            }
        }
        return sb.toString();
    }
}
