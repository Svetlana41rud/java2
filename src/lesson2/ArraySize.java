package lesson2;

public class ArraySize {
    static int getArray(String[][] stringmassiv) throws MyArraySizeException, MyArrayDataException {
        if (stringmassiv.length == 4 && stringmassiv[0].length == 4) {
        } else {
            throw new MyArraySizeException("введена не корректная длина массива");
        }
        int sum = 0;
        for (int i = 0; i < stringmassiv.length; i++) {
            for (int j = 0; j < stringmassiv[i].length; j++) {
                try {
                    sum += Integer.parseInt(stringmassiv[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("нельзя преобразовать ячейку " + i + ", " + j);
                }
            }
        }
        return sum;
    }

}
