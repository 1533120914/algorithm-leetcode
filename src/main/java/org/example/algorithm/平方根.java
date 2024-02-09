package org.example.algorithm;

public class 平方根 {
    public static int mySqrt(int x) {
        //n 的平方是x
        int left = 0;
        int right = x<1?1:x;
        while(left<=right)
        {
            int mid = left-(left-right)/2;
            if(mid*mid>x)
            {
                right = mid - 1;
            }else if(mid*mid < x)
            {
                left = mid + 1;
            }else
            {
                left = mid;
                break;
            }
        }
        return left;
    }
}
