package org.example.algorithm;

import java.util.ArrayList;
import java.util.List;

public  class 螺旋矩阵 {
    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> elements = new ArrayList<>();
        /**
         初始化坐标
         */
        int x = 0;
        int y = 0;
        int widthStart = 0;
        int width = matrix[0].length;
        int heightStart =1;
        int height = matrix.length;
        while(x != width/2 || y != height/2)
        {
            //向右移动
            for(x=widthStart;x<width;x++)
            {
                elements.add(matrix[y][x]);
            }
            x--;
            width--;
            //向下移动
            for(y=heightStart;y<height;y++)
            {
                elements.add(matrix[y][x]);
            }
            height--;
            y--;
            //向左移动
            for(;x>=widthStart;x--)
            {
                elements.add(matrix[y][x]);
            }
            x++;
            widthStart++;
            //向上移动
            for(;y>=heightStart;y--)
            {
                elements.add(matrix[y][x]);
            }
            y++;
            heightStart++;
        }
        return elements;
    }
}
