package Project_OOPS;
public abstract class P2_Marks {
    double math;
    double science;
    double english;
    double computers;
    P2_Marks(double math, double science, double computers){
        this.math = math;
        this.science = science;
        this.computers = computers;
    }
    P2_Marks(double math, double science, double computers, double english){
        this(math,science,computers);
        this.english=english;
    }
    abstract double getPercentage();
}
class A extends P2_Marks {
    public A(double math, double science, double computers) {
        super(math,science,computers);
    }
    @Override
    double getPercentage() {
        double avg = (math + science + computers) / 3;
        return avg;
    }
}
class B extends P2_Marks {
    public B(double math, double science, double computers, double english) {
       super(math,science,computers,english);
    }
    @Override
    double getPercentage() {
        double avg = (math + science + computers+ english) / 4;
        return avg;
    }
}
class MarkTest {
    public static void main(String[] args) {
        A obj1 = new A(100,100,100);
        System.out.println(obj1.getPercentage());
        B obj2 = new B(89,78,88, 67);
        System.out.println(obj2.getPercentage());

        P2_Marks[] average = {new A(100,100,100),new B(80,90,100,99)};
        for (P2_Marks avg : average) {
            System.out.println(avg.getPercentage());
        }
    }
}