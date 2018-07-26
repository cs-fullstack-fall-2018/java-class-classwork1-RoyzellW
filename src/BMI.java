public class BMI {

    public int weight = 0;
    public int height = 0;
    public int BMI = 0;

    public void changeWeight(int weight){
        if (weight < 3){
    System.out.println("Incorrect weight");
        }
        else {
            this.weight = weight;
        }
    }
}
