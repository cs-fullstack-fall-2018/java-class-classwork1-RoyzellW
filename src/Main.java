import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;



public class Main {

    public static void main(String[] args) {

        Person Carl = new Person();
        Carl.setHeight(150);
        Carl.setWeight(50);
        Carl.bodyMassIndex();

        Person Bob = new Person();
        Bob.setHeight(180);
        Bob.setWeight(60);
        Bob.bodyMassIndex();

        Person Devin = new Person();
        Devin.setHeight(200);
        Devin.setWeight(100);
        Devin.bodyMassIndex();

        System.out.println(Carl.bodyMassIndex());
        System.out.println(Bob.bodyMassIndex());
        System.out.println(Devin.bodyMassIndex());

        ArrayList<Person> personList = new ArrayList<Person>();
        personList.addAll(Arrays.asList(Carl, Bob, Devin));

        personList.get(1).printPerson();
        System.out.print(personList.get(0).bodyMassIndex());

    }


//    public int weight = 0;
//    public int height = 0;
//    public int BMI = 0;
//
//    public void changeWeight(int weight) {
//        if (weight < 3) {
//            System.out.println("Incorrect weight");
//        } else {
//            this.weight = weight;
//        }
//    }
//
//    public int returnWeight(){
//        return this.weight;
//    }
//
//    public int returnHeight(){
//        return this.height;
//    }
//
//    public int returnBMI(){
//        return this.BMI;
//    }
//
//
//    public void changeHeight(int height) {
//        if (height < 30) {
//            System.out.println("Incorrect Height!");
//        } else {
//            this.height = height;
//        }
//
//    }
//
//
//    public void changeBMI(int BMI) {
//        if (BMI < 3) {
//            System.out.println("Underweight!");
//        } else {
//            this.BMI = BMI;
//
//        }
//    }
}