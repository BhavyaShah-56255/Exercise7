package pl.vistula;

public class Pigeon extends Bird{
    private String speciesBhavya56255;

    Pigeon(){
        super();
        speciesBhavya56255="NN";
    }

    public Pigeon(String nameBhavya56255, int ageBhavya56255, int weightBhavya56255, String featherColorBhavya56255, String speciesBhavya56255){
        super(nameBhavya56255, ageBhavya56255, weightBhavya56255,featherColorBhavya56255);
        this.speciesBhavya56255= speciesBhavya56255;
    }

    public Pigeon(int ageBhavya56255, String featherColorBhavya56255, String speciesBhavya56255){
        super(ageBhavya56255, featherColorBhavya56255);
        this.speciesBhavya56255=speciesBhavya56255;
    }

    public void peckingWoodBhavya56255(){
        System.out.println("The Pigeon is pecking wood");
    }

    @Override
    public void getVoiceBhavya56255() {
        System.out.println("The Pigeon chirps");
    }

    @Override
    public void eatBhavya56255(String FoodName) {
        System.out.println("The Pigeon is eating: "+ FoodName);
    }

    public String getSpeciesBhavya56255() {
        return speciesBhavya56255;
    }

    public void setSpeciesBhavya56255(String speciesBhavya56255) {
        this.speciesBhavya56255 = speciesBhavya56255;
    }

    @Override
    public String toString() {
        return "Pigeon{" +
                "speciesBhavya56255='" + speciesBhavya56255 + '\'' +
                '}';
    }
}

