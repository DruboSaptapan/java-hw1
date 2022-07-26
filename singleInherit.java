class Student{ //super class
    int roll;
    float mark;
    String name;
}
class Result extends Student{ //sub class
    void getData(){
        name = "Saptapan Barua";
        roll = 494303;
        mark = 89.96f;
    }
    void display(){
        System.out.println("Name :"+name);
        System.out.println("Roll no :"+roll);
        System.out.println("Mark :"+mark);
    }

}
public class singleInherit {
    public static void main(String[] args) {
        Result R = new Result();
        R.getData();
        R.display();
    }
}