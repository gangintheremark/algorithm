import java.util.*;

class Main {

    public static void main(String[] args) {
       Scanner s = new Scanner(System.in);

       String str = s.next();
       String result = "";

       for(char x : str.toCharArray()){
           if(Character.isDigit(x)) // 숫자냐?
               result += x; 
       }
        System.out.println(Integer.valueOf(result)); // "0125" -> 125
    }
}

