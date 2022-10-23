package Project2;

public abstract class Marks {
    double chemistry;
    double eng;
    double math;
    Marks(double chemistry, double eng, double math) {
        this.chemistry = chemistry;
        this.eng = eng;
        this.math = math;
    }
    abstract double getPercentage();
}

class A extends Marks {
    A (double chemistry, double eng, double math) {
        super(chemistry, eng, math);
    }
    @Override
    double getPercentage() {
        return (chemistry + eng + math) / 3;
    }
}

class B extends Marks {
    double biology;

    B (double chemistry, double eng, double math, double biology) {
        super(chemistry, eng, math);
        this.biology = biology;
    }

    @Override
    double getPercentage() {
        return (chemistry + eng + math + biology) / 4;
    }
}

class testStudent {
    public static void main(String[] args) {
        Marks studentA = new A(22.2, 58.0, 69.0);
        System.out.println("This is average score for student A: "+studentA.getPercentage());

        Marks studentB = new B(90.0, 76.0, 55.5, 79.0);
        System.out.println("This is average score for student B: "+studentB.getPercentage());
    }
}