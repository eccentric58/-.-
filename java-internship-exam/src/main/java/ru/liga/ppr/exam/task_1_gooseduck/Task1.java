package ru.liga.ppr.exam.task_1_gooseduck;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public List<String> gooseDuck(int n) {
        List<String> result = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                result.add("GooseDuck");
            } else if (i % 3 == 0) {
                result.add("Goose");
            } else if (i % 5 == 0) {
                result.add("Duck");
            } else {
                result.add(String.valueOf(i));
            }
        }
        return result;
    }


}
