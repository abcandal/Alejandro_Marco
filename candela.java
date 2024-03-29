import java.util.Scanner;
public class candela{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        System.out.println(x);
        System.out.println("Hola Mundo");
        System.out.println("Probando a hacer cambios");
        sc.close();
        String cadena = sc.nextLine();
        if(cadena.equals("Marco")){
        system.out.println("Ese es el verdadero tanke");

         int matriz[][], nfilas, ncolumnas;
        Scanner sc = new Scanner(System.in);
        nfilas = Integer.parseInt(JOptionPane.showInputDialog(null, "Escriba el numero de filas"));
        ncolumnas = Integer.parseInt(JOptionPane.showInputDialog(null, "Escriba el numero de columnas"));

        matriz = new int[nfilas][ncolumnas];
        System.out.println("Escriba la Matriz:");
        for (int i = 0; i < nfilas; i++) {
            for (int j = 0; j < ncolumnas; j++) {
                System.out.print("Matriz[" + i + "][" + j + "]: ");
                matriz[i][j] = sc.nextInt();
            }
        }
        System.out.println("\nLa matriz es: ");
        for (int i = 0; i < nfilas; i++) {
            for (int j = 0; j < ncolumnas; j++) {
                System.out.print(matriz[i][j]);
            }
            System.out.println("");
        }
        
        
        
        
        
        
        
        }
    }
}
