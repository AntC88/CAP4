package capitulo4;
import javax.swing.JOptionPane;
public class Exemplo4_5{
  public static void main(String[] args){
    int numero;
    numero = Integer.parseInt(JOptionPane.showInputDialog
        ("N�mero: "));
    if (numero % 2 == 1){
      JOptionPane.showMessageDialog(null, "O n�mero � �mpar.");
    }
  }
}