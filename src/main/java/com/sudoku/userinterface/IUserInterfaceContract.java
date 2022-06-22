package com.sudoku.userinterface;

import com.sudoku.problemdomain.SudokuGame;

public interface IUserInterfaceContract {
    interface EventListener {
        void onSudokuInput(int row, int column, int input);
        void onDialogClick();
    }

    interface View {
        void setListener(IUserInterfaceContract.EventListener listener);
        void updateSquare(int row, int column, int input);
        void updateBoard(SudokuGame game);
        void showDialog(String message);
        void showError(String message);
    }
}
