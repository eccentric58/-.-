package ru.liga.ppr.exam.task_4_stonks;
import java.util.Collections;
import java.util.List;

public class Task4 {

    public boolean checkEquals(List<String> stocks1, List<String> stocks2) {
        Collections.sort(stocks1);
        Collections.sort(stocks2);

        if (stocks1.size() != stocks2.size()) {
            return false;
        }

        for (int i = 0; i < stocks1.size(); i++) {
            if (!stocks1.get(i).equals(stocks2.get(i))){
                return false;
            }
        }
        return true;
    }
}