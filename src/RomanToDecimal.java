public class RomanToDecimal {
    public static int romanToDecimal(String roman) {
        // parse roman letter by letter
        // find raw point value based on the letter
        // sum point values
        // return decimal value of roman
        // "XI" ==> 11
        // "IV" ==> 6
        int sum = 0;
        // convert all to one case
        roman = roman.toUpperCase();
        // "XI".length() => 2
        // "MCMLXII".length() => 7
        //  0123456
        // "HAHA" ==> -1
        // "xliv"
        //  len(roman)
        //  string.length()
        //  array.length
        //  list.size(
        for (int i = 0; i < roman.length(); i++) {
            if (roman.charAt(i) == 'I') {
                sum += 1;
            } else if (roman.charAt(i) == 'V')
                sum += 5;
            else if (roman.charAt(i) == 'X')
                sum += 10;
            else if (roman.charAt(i) == 'L')
                sum += 50;
            else if (roman.charAt(i) == 'C')
                sum += 100;
            else if (roman.charAt(i) == 'D')
                sum += 500;
            else if (roman.charAt(i) == 'M')
                sum += 1000;
            else
                return -1;

        }
        // INVARIANTS
        if(roman.contains("IV"))
            sum -= 2;
        if(roman.contains("IX"))
            sum -= 2;
        if(roman.contains("XL"))
            sum -= 20;
        if(roman.contains("XC"))
            sum -= 20;
        if(roman.contains("CD"))
            sum -= 200;
        if(roman.contains("CM"))
            sum -= 200;
        return sum;
    }

    public static void main(String[] args) {
        for (String roman : args) { // for-each loop
            int decimal = romanToDecimal(roman);
            if(decimal != -1)
                System.out.println("Input: " + roman + " => output: " + romanToDecimal(roman));
            else
                System.out.println("Input: " + roman + " => output: invalid");
        }
    }
}