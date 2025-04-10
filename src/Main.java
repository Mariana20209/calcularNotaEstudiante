import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el nombre del estudiante: ");
        String nombreEstudiante = "";
        nombreEstudiante = sc.nextLine();
        /*string nombreEstudiante = sc.nextLine(); otra forma de hacerlo*/
        System.out.println("Ingrese el documento del estudiante");
        String documentoEstudiante = sc.nextLine();
        System.out.println("Seleccione el programa: \n1 - Desarollo de Software\n2 - Diseño Gráfico\n3 - Gastronomía");
        String programa = sc.nextLine();
        switch (programa){
            case "1":
                System.out.println("Programa de desarrollo de Software");
                System.out.println("Seleccione la materia:\n1 - Lógica de programación\n2 - Metodologías ágiles\n 3 - Itrodcción a la programación");
                String materia = sc.nextLine();
                switch () {
                    case "1"
                        System.out.println("Nota de Lógica de programación");
                    break;
                    case "2"
                        System.out.println("Nota de metodologías ágiles");
                    break;
                    case "3"
                        System.out.println("Nota de introducción");
                    break;

                }
                break;
            case "2":
                System.out.println("Programa de diseño gráfico");
                break;
            case "3":
                System.out.println("Programa de gastronomía");
                break;
        }

        sc.close();
    }
}