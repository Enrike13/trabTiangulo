package consola;

import javax.swing.JOptionPane;

public class PrincipalTriangulo {

    public static void main(String[] args) {

        Triangulo tri1, tri2;
        String eleccion = JOptionPane.showInputDialog("QUE DESEA CALCULAR");
        System.out.println("El mensaje ingresado es: " + eleccion);
        switch (eleccion) {
            case "perimetro":
                String ladA = JOptionPane.showInputDialog("Ingrese el 1er Lado del Triángulo:");
                String ladB = JOptionPane.showInputDialog("Ingrese el 2do Lado del Triángulo:");
                String ladC = JOptionPane.showInputDialog("Ingrese el 3er Lado del Triángulo:");
                tri1 = new Triangulo(Integer.parseInt(ladA), Integer.parseInt(ladB), Integer.parseInt(ladC));
                double perimetro = tri1.perimetro();
                System.out.println("El perímetro es: " + perimetro);
                break;
            case "area":
                tri2 = new Triangulo();
                String numBAse = JOptionPane.showInputDialog("Ingrese la base: ");
                String numAltura = JOptionPane.showInputDialog("Ingrese la altura: ");
                tri2.base = Integer.parseInt(numBAse);
                tri2.altura = Integer.parseInt(numAltura);
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

    }

}
