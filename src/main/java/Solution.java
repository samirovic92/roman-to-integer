

public class Solution {

    public int romanToInt(String s) {
        int sum = 0;
        int i = 0;

        while( i < s.length()) {
            char currentNumber = s.charAt(i);
            if( i + 1 < s.length()) {
                char nextNumber =s.charAt(i + 1);
                if( currentNumber == 'C' && (nextNumber == 'D' || nextNumber == 'M') ||
                        currentNumber == 'X' && (nextNumber == 'L' || nextNumber == 'C') ||
                        currentNumber == 'I' && (nextNumber == 'V' || nextNumber == 'X')) {
                    sum += value(nextNumber) - value(currentNumber);
                    i+=2;
                    continue;
                }
            }
            sum += value(currentNumber) ;
            i+=1;
        }

        return sum;
    }

    private int value(char r) {
        switch(r) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default :
                return 0;
        }
    }

}
