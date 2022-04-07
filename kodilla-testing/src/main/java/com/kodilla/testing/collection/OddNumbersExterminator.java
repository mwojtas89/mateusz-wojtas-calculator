package com.kodilla.testing.collection;

import java.util.ArrayList;
import java.util.List;

public class OddNumbersExterminator {
    public List<Integer> exterminate(List<Integer> numbers) {
        List<Integer> odd = new ArrayList<>();
        List<Integer> even = new ArrayList<>();
        for (Integer numb : numbers) {
            if (numb % 2 != 0) {
                odd.add(numb);
            } else {
                even.add(numb);
            }
        }
        return even;
    }
}
