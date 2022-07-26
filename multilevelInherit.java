class student1{ //super class
    void khata1(){
        System.out.println("Load-shedding means the discontinuation of the supply of electricity.");
    }
}
class student2 extends student1{ // sub class extends subper class
    void khata2(){
        student1 S = new student1();
        S.khata1();
        System.out.println("Load-shedding means the discontinuation of the ");
    }
}
class student3 extends student2{ // sub class extends subper class
    void khata3(){
        student2 S = new student2();
        S.khata2();
        System.out.println("Load-shedding means ");
    }
}
public class multilevelInherit {
    public static void main(String[] args) {
        student3 S = new student3();
        S.khata3();
    }
}