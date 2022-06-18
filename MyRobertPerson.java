public class MyRobertPerson {
    public static void main(String []args){
        
    Robot r1 = new Robot("Jerry","red", 30);
   //r1.introduceSelf();
    Person p1 = new Person("Alice", "Aggresive", true);
    p1.owned=r1;
    p1.owned.introduceSelf();
    }
}
class Robot{
String name;
String color;
int weight;
 
Robot(String name, String color, int weight ){
this.name = name;
this.color = color;
this.weight = weight;
 }
void introduceSelf(){
    System.out.println("My name is:" + this.name);
}

}

class Person{
    String name;
    String personality;
    boolean isSitting;
    Robot owned;
Person(String name, String personality, boolean isSitting){
    this.name = name;
    this.personality= personality;
    this.isSitting = isSitting;
}
void standUp(){
    isSitting=false;
}


}


