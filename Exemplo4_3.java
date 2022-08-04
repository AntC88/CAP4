package capitulo4;

import javax.swing.JOptionPane;

public class Exemplo4_3 {
  public static void main(String[] args) {
    String nome;
    nome = JOptionPane.showInputDialog("Qual o seu Nome?");
    JOptionPane.showMessageDialog(null, "Seu nome �: " + nome);
  }
}