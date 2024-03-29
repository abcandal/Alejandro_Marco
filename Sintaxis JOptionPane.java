import javax.swing.JOptionPane;

public class JOptionPane {
    public static void main(String[] args) {
        String cadena;
        int entero;
        double decimal;
        char letra;

        cadena = JOptionPane.showInputDialog("Escriba una oración: ");
        entero = Integer.parseInt(JOptionPane.showInputDialog("Escriba un entero: "));
        decimal = Double.parseDouble(JOptionPane.showInputDialog("Ingrese numero decimal:"));
        letra = JOptionPane.showInputDialog("Escriba una letra: ").charAt(0);

        JOptionPane.showMessageDialog(null, "La oración es: " + cadena);
        JOptionPane.showMessageDialog(null, "El numero entero es: " + entero);
        JOptionPane.showMessageDialog(null, "El numero decimal es: " + decimal);

    }
}
