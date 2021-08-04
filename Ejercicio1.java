import java.util.Scanner;

public class Ejercicio1 {
    public static double volumen_esfera (double r_esfera){
        double v_esfera= (4.0/3.0)*(Math.PI*Math.pow(r_esfera,3));
        return v_esfera ;
    }
    public static double volumen_cono (double r_cono, double alt_cono){
        double v_cono=(1.0/3.0)*(Math.PI*Math.pow(r_cono,2)*alt_cono);
        return v_cono;
    }
    
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Ingrese el radio de la esfera: \n");
    double r_esfera=sc.nextDouble();
    System.out.print("Ingrese el radio del cono: \n");
    double r_cono=sc.nextDouble();
    System.out.print("Ingrese la altura del cono: \n");
    double alt_cono= sc.nextDouble();
    double volumen_total= volumen_esfera(r_esfera)+volumen_cono(r_cono, alt_cono);
    System.out.print("El volumen del solido es: "+ volumen_total);
    }
}
