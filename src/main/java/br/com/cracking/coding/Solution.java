package br.com.cracking.coding;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.StringTokenizer;

/**
 * Template class for CodeForces
 * */
public class Solution {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter out = new PrintWriter(System.out);
    static StringTokenizer st;

    static String next() throws IOException {
        while (st == null || !st.hasMoreTokens()) {
            String line = br.readLine();
            if (line == null) throw new IOException("Fim da entrada inesperado");
            st = new StringTokenizer(line);
        }
        return st.nextToken();
    }

    static int nextInt() throws IOException {
        return Integer.parseInt(next());
    }

    static long nextLong() throws IOException {
        return Long.parseLong(next());
    }

    static double nextDouble() throws IOException {
        return Double.parseDouble(next());
    }

    static String nextLine() throws IOException {
        return br.readLine();
    }

    static int[] readIntArray(int n) throws IOException {
        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = nextInt();
        return a;
    }


    public static void solve() throws IOException {
        int[] ints = readIntArray(nextInt());
        out.println(ints);
    }

    public static void main(String[] args) throws IOException {
        boolean multipleTests = false;
        int t = multipleTests ? nextInt() : 1;

        while (t-- > 0) {
            solve();
        }

        out.flush();
        out.close();
    }
}