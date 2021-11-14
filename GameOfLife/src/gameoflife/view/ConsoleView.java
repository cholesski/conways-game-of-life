package gameoflife.view;

import gameoflife.model.Cell;
import gameoflife.model.Grid;
import gameoflife.utils.Console;

import java.util.Arrays;

public class ConsoleView implements View{
    @Override
    public void drawGrid(Grid grid) {
        int w = grid.getWidth();
        int h = grid.getHeight();

        Console.clear();
        char[] str = new char[w];
        Arrays.fill(str, '_');
        System.out.println(new String(str));
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                Cell c = grid.cellAt(i, j);
                if (c.isAlive())
                    System.out.print("O");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println(new String(str));
    }
}
