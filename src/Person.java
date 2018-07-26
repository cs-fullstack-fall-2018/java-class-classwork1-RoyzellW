public class Person {
    private String name;
    private int age;
    private int weight;
    private int height;

    public void setHeight(int newHeight) {
        this.height = newHeight;
    }

    public void setWeight(int newWeight) {
        this.weight = newWeight;
    }

    public double bodyMassIndex(){
        double heightDividedByHundred = this.height / 100.0;
        return this.weight / ( heightDividedByHundred * heightDividedByHundred );
    }

    public void printPerson() {
        System.out.println(this.name + ", age " + this.age + " years");
    }

    public void becomeOlder() {
        this.age = this.age + 1;
    }
}
