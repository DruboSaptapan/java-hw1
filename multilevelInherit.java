class Student{ //super class
    String name;
    int roll;
    void getData(){
        name = "Saptapan Barua";
        roll = 494303;
    }
    void display(){
        System.out.println("Inside student class");
        System.out.println("Name: "+name);
        System.out.println("Roll: "+roll);
    }
}
class Exam extends Student{ // sub class
    float mark;
    void getData(){
        mark = 96.34f;
    }
    void display(){
        System.out.println("Inside exam class");
        System.out.println("Mark: "+mark);
    }
}
class Result extends Exam{ // another sub class
    Student S = new Student();
    Exam E = new Exam();
    void getData(){
        S.getData();
        E.getData();
    }
    void display(){
        S.display();
        E.display();
    }
}
public class multilevelInherit {
    public static void main(String[] args) {
        Result R = new Result();
        R.getData();
        R.display();
    }
}