package pl.vistula;

public class Fish extends Animal {
    private String scaleColorBhavya56255;

    public Fish(){
        super();
        scaleColorBhavya56255= "NN";
    }

    public Fish(String nameBhavya56255, int ageBhavya56255 , int weightBhavya56255, String scaleColorBhavya56255){
        super(nameBhavya56255, ageBhavya56255, weightBhavya56255);
        this.scaleColorBhavya56255= scaleColorBhavya56255;
    }

    public Fish(int ageBhavya56255 , String scaleColorBhavya56255){
        super(ageBhavya56255);
        this.scaleColorBhavya56255=scaleColorBhavya56255;
    }

    public void drinkWaterBhavya56255(){
        System.out.println("Gulp gulp");
    }

    @Override
    public void getVoiceBhavya56255() {
        System.out.println("Fish is making sounds");
    }

    @Override
    public void eatBhavya56255(String FoodName) {
        System.out.println("Fish is eating: "+ FoodName);
    }

    public String getScaleColorBhavya56255() {
        return scaleColorBhavya56255;
    }

    public void setScaleColorBhavya56255(String scaleColorBhavya56255) {
        this.scaleColorBhavya56255 = scaleColorBhavya56255;
    }

    @Override
    public String toString() {
        return "Fish{" +
                "scaleColorBhavya56255='" + scaleColorBhavya56255 + '\'' +
                '}';
    }
}

