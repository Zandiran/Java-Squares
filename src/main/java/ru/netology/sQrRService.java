package ru.netology;

public class sQrRService
// ctrl shift t
 {

    public int Numbers(int face, int back ) {
        int counter = 0 ;
        for (int i = 10; i <= 99; i++) {
            if (i * i <= face) {
                if (i * i >= back) {
                    counter++;
                }
            }
        }
        System.out.println(counter);
        return counter;
    }
}
