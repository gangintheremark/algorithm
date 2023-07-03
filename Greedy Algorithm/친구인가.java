import java.util.*;

public class Main {
    static int[] unf;
    public static int Find(int v) { // v번 학생의 인덱스 번호를 return
        if (v == unf[v]) return v;
        else return unf[v] = Find(unf[v]); // 핵심!! 같이 연결되어있는 정점들을 압축시키는과정
    }
    public static void Union(int a, int b) { // a와 b를 하나의 집합으로 만드는 함수
        int fa = Find(a); // a번 학생의 인덱스번호 찾기
        int fb = Find(b); // b번 학생의 인덱스번호 찾기
        if (fa != fb) unf[fa] = fb; // 서로 다르면 같은 집합으로
    }

    public static void main(String[] args) {
        Scanner s = new Scanner((System.in));
        int n = s.nextInt();
        int m = s.nextInt();
        unf = new int[n+1];  // 1번학생 ~ n번학생
        for (int i = 1 ; i <=n ; i++)  //본인의 번호를 인덱스번호로 하는 초기집합 설정
            unf[i] = i;
        for (int i = 1; i <=m ; i++) {
            int a = s.nextInt();
            int b= s.nextInt();
            Union(a,b); // 둘은 친구사이므로 집합 만들기
        }
        int a = s.nextInt();
        int b = s.nextInt();
        int fa = Find(a);
        int fb = Find(b);
        if (fa == fb) System.out.println("YES");
        else System.out.println("NO");
    }

}
