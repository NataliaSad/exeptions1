package org.example;

public class RegexChecker implements Checker {
    @Override
    public boolean isValid(String s) {
        return false;
    }

    @Override
    public boolean check(String s) {
        return s.matches("\\w+$");
        //[0-9] ~ \\d
        // A-Za-z ~ A-z

    }
}

