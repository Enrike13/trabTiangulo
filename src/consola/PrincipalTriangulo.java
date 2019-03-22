package consola;

import javax.swing.JOptionPane;

public class PrincipalTriangulo {

    public static void main(String[] args) {

        Triangulo tri1, tri2;
        String eleccion = JOptionPane.showInputDialog("QUE DESEA CALCULAR:"
                + "\na) perimetro"
                + "\nb) area");
        
            System.out.println("CALCULAR: " + eleccion.substring(0, 1).toUpperCase() + eleccion.substring(1) + " del triángulo:");

        switch (eleccion) {
            case "perimetro":
                String ladA = JOptionPane.showInputDialog("Perímetro del lado A :");
                System.out.println("Lado A = " + ladA);
                String ladB = JOptionPane.showInputDialog("Perímetro del lado B :");
                System.out.println("Lado B = " + ladB);
                String ladC = JOptionPane.showInputDialog("Perímetro del lado C :");
                System.out.println("Lado C = " + ladC);
                tri1 = new Triangulo(Integer.parseInt(ladA), Integer.parseInt(ladB), Integer.parseInt(ladC));
                if (tri1.validaTriangle() == 1) {
                    double perimetro = tri1.perimetro();
                    System.out.println("El perímetro es: " + perimetro);
                } else {
                    System.out.println("Los datos ingresados indican que NOSE TRATA DE UN TRIÁNGULO");
                }

                break;
            case "area":
                tri2 = new Triangulo();
                String numBAse = JOptionPane.showInputDialog("Ingrese la BASE: ");
                System.out.println("Base = " + numBAse);
                String numAltura = JOptionPane.showInputDialog("Ingrese la ALTURA: ");
                System.out.println("Altura = " + numAltura);
                tri2.base = Integer.parseInt(numBAse);
                tri2.altura = Integer.parseInt(numAltura);
                double area = tri2.area();
                System.out.println("El area es: " + area);
        }

//        System.out.println("HALLAMOS EL PERÍMETRO:");
//        tri1 = new Triangulo(15, 8, 3);
//        double perimetro = tri1.perimetro();
//        System.out.println("EL perímetro del Triangulo con lados"
//                + "\nA = 15, B = 8, C = 3"
//                + "\nEs: " + perimetro);
//
//        System.out.println("\nHALLAMOS EL ÁREA:");
//        tri2 = new Triangulo();
//        tri2.base = 8;
//        tri2.altura= 14;
//        double area = tri2.area();
//        System.out.println("El area del triángulo con"
//                + "\nBase: " + tri2.base
//                + "\nAltura: " + tri2.altura
//                + "\nEs: " + area);
        
// Triang Normal:  A=7 B=10 C=5
// Tiangulo NO EXISTE: A=
    }

}
