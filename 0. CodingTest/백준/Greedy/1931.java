import java.io.*;
import java.util.*;

class Time implements Comparable<Time> {
    int st;
    int et;

    public Time(int st, int et){
        this.st = st;
        this.et = et;
    }
    @Override
    public int compareTo(Time o) {
        if (this.et == o.et) return this.st - o.st;
        return this.et - o.et;
    }
}
public class Main {
    static int n, m;
    public int solution(ArrayList<Time> arr) {
        int answer = 0;
        int endTime = 0;
        Collections.sort(arr);
        for(Time o : arr) {
            if (o.st >= endTime ) {
                answer++;
                endTime = o.et;
            }
        }
        return answer;
    }

    public static void main(String[] args) throws IOException {
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        ArrayList<Time> arr = new ArrayList<>();

        n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            arr.add(new Time(a,b));
        }
        bw.write(T.solution(arr) + "\n");
        bw.close();
    }
}
