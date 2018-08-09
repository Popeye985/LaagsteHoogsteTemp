package com.company;

public class MinMax {
    private int min;
    private int max;
    private boolean isEersteKeer = true;
    public void registreerTemperatuur(int temperatuur) {
        if (isEersteKeer) {
            min = temperatuur;
            max = temperatuur;
            isEersteKeer = false;
        } else {
            if (temperatuur > max) {
                max = temperatuur;


            }
            if (temperatuur < min) {
                min = temperatuur;

            }
        }
    }
        public int getMinimumTemperatuur() {
                return min;
            }



    public int getMaximumTemperatuur() {
        return max;

    }

}
