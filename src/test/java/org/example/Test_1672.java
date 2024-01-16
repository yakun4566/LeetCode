package org.example;

public class Test_1672 {

    public static void main(String[] args) {

    }

    public int maximumWealth(int[][] accounts) {
        int result = 0;
        for (int[] account : accounts) {
            int temp = 0;
            for (int i : account) {
                temp += i;
            }
            result = Math.max(temp, result);
        }
        return result;
    }
}
