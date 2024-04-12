package org.example;

public class PuuttuvaLuku {
    public static int missingNumb(int[] numbers){
        int j = 1;
        int length = numbers.length;
        int missing = 0;

        for (int i = 0; i < length; i++) {
            if (j != numbers[i]){
                missing = j;
                break;
            }
            else{
                ++j;
            }
        }
        return missing;
    }
}
