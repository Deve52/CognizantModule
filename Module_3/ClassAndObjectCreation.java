package Cognizant.Module_3;

class Car{
    private String make;
    private String model;
    private String year;
    Car(String make ,String model , String year){
        this.make = make;
        this.model = model;
        this.year = year;
    }
    public void displayDetails(){
        System.out.println("Details of car---");
        System.out.println("make: "+make);
        System.out.println("model: "+model);
        System.out.println("year: "+year);
    }

}
public class ClassAndObjectCreation {
    public static void main(String[] args) {
         Car obj = new Car("audi","S3","2004");
         obj.displayDetails();
    }
}
