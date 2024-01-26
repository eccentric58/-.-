package ru.liga.ppr.exam.task_2_emailchecker;

import java.util.regex.Pattern;

public class Task2 {
    private static final String EMAIL_PATTERN = "^[a-zA-Z0-9]{1,15}@(teta|tetaent|tetacomp)\\.(ru|org|com)$";

    public boolean checkEmail(String address) {
        if (address == null || address.isEmpty()) {
            return false;
        }
        Pattern p = Pattern.compile(EMAIL_PATTERN);
        return p.matcher(address).matches();
    }
}
