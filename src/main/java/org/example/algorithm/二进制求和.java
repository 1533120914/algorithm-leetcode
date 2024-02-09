package org.example.algorithm;

public class 二进制求和 {
    public static String addBinary(String a, String b) {
        StringBuffer sb = new StringBuffer();
        int carray = 0;
        int i = a.length() - 1, j = b.length() - 1;//控制循环
        while(i>=0||j>=0||carray>0)
        {
            int sum = (i>=0?a.charAt(i)-'0' :0)   + (j>=0?b.charAt(j) - '0' : 0)  +carray;
            sb.insert(0, sum%2);
            carray = sum /2;
            i--;
            j--;
        }
        return sb.toString();
    }
}
