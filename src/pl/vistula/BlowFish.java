package pl.vistula;

public class BlowFish extends Fish {
    private int diameterBhavya56255;

    BlowFish() {
        super();
        diameterBhavya56255 = 10;
    }

    public BlowFish(String nameBhavya56255String, int ageBhavya56255, int weightBhavya56255, String scaleColorBhavya56255, int diameterBhavya56255) {
        super(nameBhavya56255String, ageBhavya56255, weightBhavya56255, scaleColorBhavya56255);
        this.diameterBhavya56255 = diameterBhavya56255;

    }

    public BlowFish(int ageBhavya56255, String scaleColorBhavya56255, int diameterBhavya56255) {
        super(ageBhavya56255, scaleColorBhavya56255);
        this.diameterBhavya56255 = diameterBhavya56255;
    }

    public void swimBhavya56255() {
        System.out.println("The BlowFish is swimming upstream");
    }

    @Override
    public void eatBhavya56255(String FoodName) {
        System.out.println("The BlowFish is eating: " + FoodName);
    }

    @Override
    public void getVoiceBhavya56255() {
        System.out.println("The blowfish is howling");
    }

    public int getDiameterBhavya56255() {
        return diameterBhavya56255;
    }

    public void setDiameterBhavya56255(int diameterBhavya56255) {
        this.diameterBhavya56255 = diameterBhavya56255;
    }

    @Override
    public String toString() {
        return "BlowFish{" +
                "diameterBhavya56255=" + diameterBhavya56255 +
                '}';
    }
}



