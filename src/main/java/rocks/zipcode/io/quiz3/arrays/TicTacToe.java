package rocks.zipcode.io.quiz3.arrays;

/**
 * @author leon on 09/12/2018.
 */
public class TicTacToe {

    String[][] fullboard = new String[2][2];

    public TicTacToe(String[][] board) {
        this.fullboard = board;
    }

    public TicTacToe() {
    }

    public String[] getRow(Integer value) {

        return this.fullboard[value];
    }

    public String[] getColumn(Integer value) {
        String[] column = new String[3];

        for (int i = 0; i < 3; i++) {
            column[i] = fullboard[i][value];
        }

        return column;
    }

    public Boolean isRowHomogenous(Integer rowIndex) {
        Boolean retVal = false;

        String[] currentRow = getRow(rowIndex);

        if (currentRow[0].equals(currentRow[1]) && currentRow[0].equals(currentRow[2])) {
            retVal = true;
        }
        return retVal;
    }

    public Boolean isColumnHomogeneous(Integer columnIndex) {
        Boolean retVal = false;

        String[] currentCol = getColumn(columnIndex);

        if (currentCol[0].equals(currentCol[1]) && currentCol[0].equals(currentCol[2])) {
            retVal = true;
        }

        return retVal;
    }

    public Boolean isDiagonalHomogeneous() {
        Boolean retVal = false;

        if (fullboard[0][0].equals(fullboard[1][1]) && fullboard[0][0].equals(fullboard[2][2])) {
            retVal = true;
        }
        if (fullboard[2][0].equals(fullboard[1][1]) && fullboard[1][1].equals(fullboard[0][2])) {
            retVal = true;
        }

        return retVal;
    }

    public String getWinner() {
        String retVal = "";

        if (isDiagonalHomogeneous()) {
            retVal = fullboard[1][1];
        } else {
            for (int i = 0; i < 3; i++) {
                if (isRowHomogenous(i)) {
                    retVal = fullboard[i][i];
                } else if (isColumnHomogeneous(i)) {
                    retVal = fullboard[i][i];
                }
            }
        }

        return retVal;
    }

    public String[][] getBoard() {
        return this.fullboard;
    }
}
