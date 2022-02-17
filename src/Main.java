import java.util.PriorityQueue;
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int m = kb.nextInt();
        PriorityQueue<Long> pQ = new PriorityQueue<>();

        for (int i = 0; i < n; i++) {
            pQ.offer(kb.nextLong());
        }

        for (int i = 0; i < m; i++) {
            if (pQ.size() > 1) {
                long a = pQ.poll();
                long b = pQ.poll();
                pQ.offer(a + b);
                pQ.offer(a + b);
            }
        }

        long answer = 0;
        for (long tmp : pQ) {
            answer += tmp;
        }

        System.out.println(answer);

    }

}