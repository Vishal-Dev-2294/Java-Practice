package in.KGcoding.Nested;

public class Car {

    private int noOfDoors;

    public void repair(){
        tire t = new tire();
    }

    protected  class tire{
        private double width;
        private double pressure;
        private String material;

        public void infalte(){
            noOfDoors = 4;
        }
    }
}
