package org.study;

import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;

public class CalculateTime {
    public int calculateTime(String keyboard, String word) {
        int time = 0, position = 0, prevPosition = 0;
        HashMap<Character, Integer> keyMap = new HashMap<>();
        AtomicInteger i = new AtomicInteger();
        keyboard.chars().forEach(e -> {
            keyMap.put((char) e, i.intValue());
            i.getAndIncrement();
        });
        for (Character c : word.toCharArray()) {
            position = keyMap.get(c);
            time +=Math.abs(position-prevPosition);
            prevPosition=position;
        }
        return time;
    }

    public static void main(String[] args) {
        System.out.println(new CalculateTime().calculateTime("pqrstuvwxyzabcdefghijklmno","leetcode"));
    }
}
