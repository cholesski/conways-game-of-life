package gameoflife.model.conf;

import java.util.Random;

public class RandomConfiguration implements Configuration{
    private final Random rng = new Random();

    @Override
    public boolean isCellALiveAt(int x, int y) {
        return rng.nextBoolean();
    }
}
