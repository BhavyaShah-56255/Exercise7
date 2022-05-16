package pl.vistula;

public class Dog extends Mammal{
    private String breedBhavya56255;

    Dog(){
        super();
        breedBhavya56255= "NN";
    }

    public Dog(String nameBhavya56255 , int ageBhavya56255,int weightBhavya56255,String rzadBhavya56255, String breedBhavya56255){
        super(nameBhavya56255,ageBhavya56255,weightBhavya56255,rzadBhavya56255);
        this.breedBhavya56255=breedBhavya56255;
    }

    public Dog(int ageBhavya56255, String rzadBhavya56255, String breedBhavya56255){
        super(ageBhavya56255,rzadBhavya56255);
        this.breedBhavya56255=breedBhavya56255;
    }

    public void sportBhavya56255(){
        System.out.println("The dog is retrieving.");
    }

    @Override
    public void drinkMilkBhavya56255() {
        System.out.println("The dog is drinking milk.");
    }

    @Override
    public void getVoiceBhavya56255() {
        System.out.println("The dog is barking.");
    }

    @Override
    public void eatBhavya56255(String FoodName) {
        System.out.println("The dog is eating: "+ FoodName);
    }

    public String getBreedBhavya56255() {
        return breedBhavya56255;
    }

    public void setBreedBhavya56255(String breedBhavya56255) {
        this.breedBhavya56255 = breedBhavya56255;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "breedBhavya56255='" + breedBhavya56255 + '\'' +
                '}';
    }
}

