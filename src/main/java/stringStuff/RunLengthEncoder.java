package stringStuff;

public class RunLengthEncoder {
    public String encode(String word) {
        if (word.isEmpty()) return "";
        StringBuilder sb = new StringBuilder();
        char akt = word.charAt(0);
        int count = 1;
        for (int i=1; i < word.length(); i++){
            if(word.charAt(i) == akt){
                count++;
            } else{
                sb.append(count).append(akt);
                akt = word.charAt(i);
                count = 1;
            }
        }
        sb.append(count).append(akt);

        return sb.toString();
    }

    public String decode(String s) {
    StringBuilder sb = new StringBuilder();
    for (int i=0; i< s.length(); i+=2){
        int n = Character.getNumericValue(s.charAt(i));
        char c = s.charAt(i+1);
        sb.append(String.valueOf(c).repeat(Math.max(0, n)));
    }
    return sb.toString();
    }
}
