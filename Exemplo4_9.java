package capitulo4;
import javax.swing.JOptionPane;
public class Exemplo4_9 {
  public static void main(String[] args){
    String codigo;
    codigo = JOptionPane.showInputDialog("Digite o c�digo");
    switch (codigo)
    {
    case "001": JOptionPane.showMessageDialog
    (null,"O Produto � Caderno");
    break;
    case "002": JOptionPane.showMessageDialog
    (null,"O Produto � L�pis");
    break;
    case "003": JOptionPane.showMessageDialog
    (null,"O Produto � Borracha");
    break;
    default: JOptionPane.showMessageDialog(null,"Diversos");
    }
  }
}