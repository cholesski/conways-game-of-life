package gameoflife.app;

import gameoflife.model.Grid;
import gameoflife.model.conf.Configuration;
import gameoflife.model.conf.RandomConfiguration;
import gameoflife.model.conf.predefined.GliderConfiguration;
import gameoflife.view.ConsoleView;
import gameoflife.view.View;

public class GameOfLife {
    private  static  final int dim = 10;

    public static void main(String[] args) throws InterruptedException {
        //TODO don't hardcode options
        Configuration c = new RandomConfiguration();
        View v = new ConsoleView();
        Grid g = new Grid(c, dim);
        runGame(g, v);
    }

    private static void runGame(Grid g, View v) throws InterruptedException {
        while (true){
            g.advance();
            v.drawGrid(g);
            Thread.sleep(500);
        }
    }
}
