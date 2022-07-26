class students{ // super class
    String name;
    int roll;
}
class details1 extends students{ //sub class 1
    void getInfo(){
        name = "Imam Hassan Rimon";
        roll = 489341;
        System.out.println("Student1");
        System.out.println("Name: "+name);
        System.out.println("Roll No: "+roll);
    }
}
class details2 extends students{ //sub class 2
    void getInfo(){
        name = "Saptapan Barua";
        roll = 494303;
        System.out.println("\nStudent2");
        System.out.println("Name: "+name);
        System.out.println("Roll No: "+roll);
    }
}
class details3 extends students{ //sub class 3
    void getInfo(){
        name = "Tanmoy Barua";
        roll = 489354;
        System.out.println("\nStudent3");
        System.out.println("Name: "+name);
        System.out.println("Roll No: "+roll);
    }
}
public class hierarchicalInherit {
    public static void main(String[] args) {
        details1 S1 = new details1();
        S1.getInfo();
        details2 S2 = new details2();
        S2.getInfo();
        details3 S3 = new details3();
        S3.getInfo();
    }
}
