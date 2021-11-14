package gameoflife.model.conf.predefined;

import gameoflife.model.conf.ManualConfiguration;

public class GliderConfiguration extends ManualConfiguration {
    public GliderConfiguration() {
        super(new char[][] {
                { ' ', ' ', ' ', ' ', ' ' },
                { ' ', ' ', 'O', ' ', ' ' },
                { 'O', ' ', 'O', ' ', ' ' },
                { ' ', 'O', 'O', ' ', ' ' },
                { ' ', ' ', ' ', ' ', ' ' },
        });
    }
}
