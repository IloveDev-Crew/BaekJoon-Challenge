// Authored by : choipureum
// Co-authored by : -
// Link : http://boj.kr/4ea0c0604cd04373a901ec2223db6b99

import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        FastReader rd = new FastReader();

        int a = rd.nextInt();
        int b = rd.nextInt();
        System.out.println(a + b);
    }

    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while(st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                }
                catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() { return Integer.parseInt(next()); }
        long nextLong() { return Long.parseLong(next()); }
        double nextDouble() { return Double.parseDouble(next()); }
        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            }
            catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
}
