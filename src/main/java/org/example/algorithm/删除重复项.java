package org.example.algorithm;

/**
 * @author changxinglong
 * @version 1.0.0
 * @apiNote
 * @since 2024/01/18
 */
public class 删除重复项 {
    /**
     * @param nums
     * @return int
     */
    public static int removeDuplicates(int[] nums) {
            if(nums.length==1){return 1;}
            int index=0;//检测到非重复元素的位置
            int fast =1;
            int slow = 0;
            while(fast < nums.length)
            {
                if(nums[slow]!=nums[fast])
                {
                    nums[++index]=nums[fast++];
                    slow=fast-1;
                }else{fast++;}

            }
            return index+1;
        }
}
