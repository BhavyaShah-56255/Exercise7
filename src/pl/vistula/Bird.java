package pl.vistula;


    public class Bird extends Animal{
        private String featherColorBhavya56255;



        public Bird(){
            super();
            featherColorBhavya56255="NN";

        }

        public Bird (String nameBhavya56255, int ageBhavya56255, int weightBhavya56255, String featherColorBhavya56255){
            super(nameBhavya56255, ageBhavya56255, weightBhavya56255);
            this.featherColorBhavya56255=featherColorBhavya56255;
        }

        public Bird(int ageBhavya56255 , String featherColorBhavya56255){
            super(ageBhavya56255);
            this.featherColorBhavya56255=featherColorBhavya56255;
        }

        public void takingFlightBhavya56255(){
            System.out.println("Flap flap");
        }

        @Override
        public void getVoiceBhavya56255() {
            System.out.println("Bird is making sounds");
        }

        @Override
        public void eatBhavya56255(String FoodName) {
            System.out.println("Bird is eating: " + FoodName);
        }

        public String getFeatherColorBhavya56255() {
            return featherColorBhavya56255;
        }

        public void setFeatherColorBhavya56255(String featherColorBhavya56255) {
            this.featherColorBhavya56255 = featherColorBhavya56255;
        }

        @Override
        public String toString() {
            return "Bird{" +
                    "featherColorBhavya56255='" + featherColorBhavya56255 + '\'' +
                    '}';
        }
    }



