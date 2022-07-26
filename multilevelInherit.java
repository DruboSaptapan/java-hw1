class student1{
    void khata1(){
        System.out.println("Load-shedding means the discontinuation of the supply of electricity.");
    }
}
class student2 extends student1{
    void khata2(){
        System.out.println("Load-shedding means the discontinuation of the ");
    }
}
class student3 extends student2{
    void khata3(){
        System.out.println("Load-shedding means ");
    }
}
public class multilevelInherit {
    public static void main(String[] args) {
        student3 S = new student3();
        S.khata1();
        S.khata2();
        S.khata3();
    }
}