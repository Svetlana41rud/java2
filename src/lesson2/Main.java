package lesson2;

import static lesson2.ArraySize.getArray;

public class Main {

    public static void main(String[] args) {
        String[][] stringmassiv = new String[3][4];
        for (int i = 0; i < stringmassiv.length; i++) {
            for (int j = 0; j < stringmassiv[i].length; j++) {
                stringmassiv[i][j] = String.valueOf(i + j);
                System.out.println(stringmassiv[i][j]);
            }
            System.out.println();
        }
        try {
            getArray(stringmassiv);
        } catch (MyArraySizeException | MyArrayDataException e) {
            e.printStackTrace();
        }
        try {
            System.out.println("sum " + getArray(stringmassiv));
        } catch (MyArraySizeException e) {
            e.printStackTrace();
        } catch (MyArrayDataException e) {
            e.printStackTrace();
        }
    }


}
