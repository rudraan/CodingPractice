package StringProblems;

public class SumOfNumbersFromMixedString {
    public static void main(String[]args){
        String input = "12abc34xyz56lmn10";
        StringBuilder sb = new StringBuilder();
        int sum = 0;
        for(char c: input.toCharArray()){
            if(Character.isDigit(c)) {
                sb.append(c);
            }else{
                if(sb.length() > 0){
                    sum = sum + Integer.parseInt(sb.toString());
                    sb.setLength(0);
                }
            }
        }
        if(sb.length() > 0){ //for the case where number is at the end
            sum = sum + Integer.parseInt(sb.toString());
        }
        System.out.println(sum);
    }
}
