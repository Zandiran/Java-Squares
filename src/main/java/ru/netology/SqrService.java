package ru.netology;

public class SqrService {

    public int numbers(int face, int back) {
        int counter = 0;
        for (int i = 10; i <= 99; i++)
            if (i * i <= face && i * i >= back)
                counter++;
        System.out.println(counter);
        return counter;
    }
}