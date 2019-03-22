package consola;

public class Triangulo {

    double ladoA;
    double ladoB;
    double ladoC;
    double base;
    double altura;

    public Triangulo(double ladoA, double ladoB, double ladoC) {
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.ladoC = ladoC;
    }

    Triangulo() {
        base = 0.0;
        altura = 0.0;
    }

    double validaTriangle() {
        boolean res1 = (ladoA + ladoB) > ladoC;
        boolean res2 = (ladoA + ladoC) > ladoB;
        boolean res3 = (ladoB + ladoC) > ladoA;
        int resFinal = 0;
        if (res1 == true && res2 == true && res3 == true) {
            resFinal = 1;
        }
        return resFinal;
    }

    double perimetro() {
        double per = 0;
        per = ladoA + ladoB + ladoC;
        return per;
    }

    double area() {
        double are = 0;
        are = (base * altura) / 2;
        return are;
    }

    //Area por fórmula de HERON
//    double areaHeron () {
//        double heron = perimetro()/2;
//        return Math.sqrt (heron *(heron - ladoA)* (heron - ladoB)* (heron - ladoC));
//    }
}
