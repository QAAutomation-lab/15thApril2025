package day17.encapsulationExamples;
class Sample1
{
    double test1()
    {
        System.out.println("Running test1");
        return 4;//widening-implicit
    }     
}
public class PrimitiveCasting6 {
    public static void main(String[] args) {
        System.out.println("Program starts");
        Sample1 s=new Sample1();
        int res=(int)s.test1();//narrowing
        System.out.println("raturn value="+res);
        System.out.println("Program ends");
    }
}