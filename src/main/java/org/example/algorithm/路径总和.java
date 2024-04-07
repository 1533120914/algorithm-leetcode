package org.example.algorithm;


import org.example.entity.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class 路径总和 {
    public static boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) {
            return false;
        }
        List<Integer> indexArray = new ArrayList<>();
        return summation(root, indexArray, targetSum);
    }

    private static boolean summation(TreeNode root, List<Integer> indexArray, int targetSum) {
        int sum = indexArray.stream().mapToInt(Integer::intValue).sum();
        if (sum == targetSum) {
            return true;
        }
        if (root == null) {
            return false;
        }
        if(sum > targetSum){
            indexArray.remove(indexArray.size()-1);
            return false;
        }
        indexArray.add(root.val);
        return summation(root.left, indexArray, targetSum)||summation(root.right, indexArray, targetSum);
    }
}
