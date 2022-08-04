package capitulo4;
import javax.swing.JOptionPane;
public class Exemplo4_6{
  public static void main (String[] args){
    float salario, bonus;
    int tempo;
    salario = Float.parseFloat(JOptionPane.showInputDialog
        ("Salário: "));
    tempo = Integer.parseInt(JOptionPane.showInputDialog
        ("Tempo na empresa: "));
    if (tempo >= 5)
    {
      bonus = salario * 0.20f;
    } 
    else
    {
      bonus = salario * 0.10f;
    }
    JOptionPane.showMessageDialog
    (null, "O valor do bônus é R$: " + bonus);
  }
}