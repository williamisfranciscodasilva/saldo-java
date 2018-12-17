import javax.swing.JOptionPane;
class saldo
{
    public static void main(String args[])
    {
      float saldo_cliente, cheque;

      saldo_cliente = 500;
      JOptionPane.showMessageDialog(null,"Saldo do cliente: "+saldo_cliente);
      System.out.println("Saldo do cliente: "+saldo_cliente);

      cheque = Float.parseFloat(
      JOptionPane.showInputDialog("Digite o valor do cheque: "));

      saldo_cliente = saldo_cliente + cheque;
      JOptionPane.showMessageDialog(null,"Saldo do cliente: "+saldo_cliente);
      System.out.println("Saldo do cliente: "+saldo_cliente);


    }
}