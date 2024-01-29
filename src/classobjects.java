class Car{
  String model;
  String color;
  int purchaseyear;

  void turnOn(){
    System.out.println("car is turned on");
  }

  void turnOff(){
    System.out.println("car is turned off");
  }
  void playsong(){
    System.out.println("sun jara ...");
  }

}

public class classobjects {
  public static void main(String[] args) {
    Car creta=new Car();
    creta.color="blue";
    creta.model="kia";
    creta.purchaseyear=2025;

    creta.turnOn();
    creta.playsong();
    creta.turnOff();
    System.out.println(creta);


  }
}
