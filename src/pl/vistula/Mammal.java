package pl.vistula;

public class Mammal extends Animal {

    private String orderBhavya56255;

    public Mammal(){
        super();
        orderBhavya56255 = "NN";
    }

    public Mammal(String nameBhavya56255, int ageBhavya56255 , int weightBhavya56255, String orderBhavya56255){
        super(nameBhavya56255, ageBhavya56255, weightBhavya56255);
        this.orderBhavya56255=orderBhavya56255;
    }

    public Mammal(int ageBhavya56255 , String orderBhavya56255){
        super(ageBhavya56255);
        this.orderBhavya56255=orderBhavya56255;
    }

    public void drinkMilkBhavya56255(){
        System.out.println("Gulp gulp");
    }


    @Override
    public void getVoiceBhavya56255() {
        System.out.println("Mammal is making sounds");
    }

    @Override
    public void eatBhavya56255(String FoodName) {
        System.out.println("Mammal is eating: " + FoodName);
    }

    public String getOrderBhavya56255() {
        return orderBhavya56255;
    }

    public void setOrderBhavya56255(String orderBhavya56255) {
        this.orderBhavya56255 = orderBhavya56255;
    }

    @Override
    public String toString() {
        return "Mammal{" +
                "orderBhavya56255='" + orderBhavya56255 + '\'' +
                '}';
    }
}

