package lesson2;

public class Main {

    public static void main(String[] args) {
        String[][] stringmassiv = new String[4][4];
        for (int i = 0; i < stringmassiv.length; i++) {
            for (int j = 0; j <stringmassiv[i].length; j++) {
                stringmassiv[i][j] = String.valueOf(i + j);
                System.out.println(stringmassiv[i][j]);
                }
            System.out.println();
        }
            try {
                ArraySize.getArray(stringmassiv);
            } catch (MyArraySizeException | MyArrayDataException e) {
                e.printStackTrace();
            }

}
}
