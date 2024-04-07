package org.example.algorithm;

import java.util.ArrayList;
import java.util.List;

public class 杨辉三角 {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> arrayList = new ArrayList<>(new ArrayList<>());
        for(int i = 0; i < numRows; i++)
        {
            List<Integer> list = new ArrayList<>();
            for(int j = 0; j <= i; j++)
            {
                if(j == 0 || j == i)
                {
                    list.add(1);
                }
                else
                {
                    list.add(arrayList.get(i - 1).get(j - 1) + arrayList.get(i - 1).get(j));
                }
            }
            arrayList.add(list);
        }
        return arrayList;

    }


}
