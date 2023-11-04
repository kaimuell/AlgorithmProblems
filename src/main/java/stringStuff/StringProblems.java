package stringStuff;

import java.util.ArrayList;
import java.util.List;

public class StringProblems {
    public boolean isPalindrome(String word) {
        word = word.toLowerCase();
        for (int i = 0; i < (word.length()/2); i++){
            if (word.charAt(i) != word.charAt(word.length() -1 -i)){
                return false;
            }
        }
        return true;
    }

    public List<String> validIpAddresses(String number) {
        List<String> results = new ArrayList<>();
        if (number.length() < 4 || number.length() > 12){
            return results;
        }
        for (int i = 0; i < 4; i++){
            final String first = number.substring(0, i);
            if (isValidIpPart(first)){
                for (int j= 1; i+j< number.length() && j < 4; j++){
                    final String second = number.substring(i, i+j);
                    if(isValidIpPart(second)){
                        for (int k= 1; i+j+k< number.length() && k < 4; k++){
                            final String third = number.substring(i+j, i+j+k);
                            final String fourth = number.substring(i+j+k);
                            if (isValidIpPart(third) && isValidIpPart(fourth)){
                                results.add(first + "." + second + "." + third + "." + fourth);
                            }
                        }
                    }
                }
            }
        }

        return results;
    }

    private boolean isValidIpPart(String s) {
        if (s.length() > 3) return false;
        if (s.startsWith("0") && s.length() > 1) return false;
        if (s.isEmpty()) return false;
        try {
            int value = Integer.parseInt(s);
            return value <= 255 && value >= 0;
        } catch (Exception e){
            e.printStackTrace();
            System.out.println(s);
            return false;

        }


    }
}
