package capitulo4;
import javax.swing.JOptionPane;
public class Exemplo4_8{
  public static void main (String[] args){
    int A, B, C;
    A = Integer.parseInt(JOptionPane.showInputDialog("Lado A "));
    B = Integer.parseInt(JOptionPane.showInputDialog("Lado B "));
    C = Integer.parseInt(JOptionPane.showInputDialog("Lado C "));
    if (A != 0 && B != 0 && C != 0)
      {
      if (A + B > C && A + C > B && B + C > A)
        {
        if (A != B && A != C && B != C)
          {
          JOptionPane.showMessageDialog(null, "Escaleno");
          }
          else
          {
          if (A == B && B == C)
            {
            JOptionPane.showMessageDialog(null, "Equil�tero");
            }
            else
            {
            JOptionPane.showMessageDialog(null, "Is�sceles");
            }
          }
        }
        else
        {
          JOptionPane.showMessageDialog(null, "N�o forma um tri�ngulo");
        }
      }
      else
      {
        JOptionPane.showMessageDialog(null, "N�o forma um tri�ngulo");
      }
  }
}