import java.util.*;

class Main {

    public static void main(String[] args)  {

        Scanner s = new Scanner(System.in);

        String str = s.next();
        String result = "";
        boolean[] check = new boolean[26]; // Boolean 과 boolean 은 다른 것 

        for (char x : str.toCharArray()) {

            if (check[x - 'a'] == false) { // 중복되는지 boolean함수 이용하여 체크 
                result += x;
                check[x - 'a'] = true;
            }
        }
        System.out.println(result);
    }
}

