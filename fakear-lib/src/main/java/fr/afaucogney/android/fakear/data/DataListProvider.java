package fr.afaucogney.android.fakear.data;

import java.util.Random;

/**
 * Created by afaucogney on 12/12/2016.
 */

public class DataListProvider {

    public static int[] generateRandomValueTable(int size, int min, int max) {
        int[] result = new int[size];
        Random r = new Random();
        for (int i = 0; i < size; i++) {
            result[i] = r.nextInt(max - min) - min;
        }
        return result;
    }


    public static int[] generateRandomValueTable(int size, int min, int max, int maxSpeed) {
        int[] result = new int[size];
        Random r = new Random();
        result[0] = r.nextInt(max - min) - min;
        for (int i = 1; i < size; i++) {
            result[i] = r.nextInt(2 * maxSpeed) - maxSpeed + result[i - 1];
            while (result[i] < min || result[i] > max) {
                result[i] = r.nextInt(2 * maxSpeed) - maxSpeed + result[i - 1];
            }
        }
        return result;
    }
}
