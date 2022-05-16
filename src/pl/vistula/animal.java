package pl.vistula;



abstract class Animal {
    private String nameBhavya56255;
    private int ageBhavya56255;
    private int weightBhavya56255;

    public Animal(){
        ageBhavya56255 = weightBhavya56255 = 10;
        nameBhavya56255 = "NN";
    }

    public Animal(String nameBhavya56255 ,int ageBhavya56255 , int weightBhavya56255){
        this.nameBhavya56255 = nameBhavya56255;
        this.ageBhavya56255= ageBhavya56255;
        this.weightBhavya56255= weightBhavya56255;
    }

    public Animal(int ageBhavya56255){
        this.ageBhavya56255=ageBhavya56255;
    }

    public abstract void eatBhavya56255(String FoodName);

    public abstract void getVoiceBhavya56255();

    public String getNameBhavya56255() {
        return nameBhavya56255;
    }

    public void setNameBhavya56255(String nameBhavya56255) {
        this.nameBhavya56255 = nameBhavya56255;
    }

    public int getAgeBhavya56255() {
        return ageBhavya56255;
    }

    public void setAgeBhavya56255(int ageBhavya56255) {
        this.ageBhavya56255 = ageBhavya56255;
    }

    public int getWeightBhavya56255() {
        return weightBhavya56255;
    }

    public void setWeightBhavya56255(int weightBhavya56255) {
        this.weightBhavya56255 = weightBhavya56255;
    }
}

