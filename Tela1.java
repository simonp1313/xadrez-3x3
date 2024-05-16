
import java.awt.event.*;
import javax.swing.*;

public class Tela1 extends JFrame implements ActionListener{

    public void login(){
  
    JFrame Login = new JFrame();
    Login.setSize(300,300);
    Login.setLayout(null);
    Login.setLocationRelativeTo(null);
    Login. setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    Login.setTitle("Xadrez 3x3");

    JLabel txt1 = new JLabel("Bem-Vindo!");
    txt1.setBounds(100, 20, 80, 20);
    
    JButton bt1 = new JButton("Jogar");
    bt1.setBounds(90,60,100,20);

    JButton bt2 = new JButton("Sair");
    bt2.setBounds(90,100,100,20);
    bt1.addActionListener(this);
   




    Login.add(txt1);
    Login.add(bt1);
    Login.add(bt2);
    Login.setVisible(true);
 }

 public void actionPerformed(ActionEvent e) {
    
     Xadrez x1 = new Xadrez();
     x1.Tabuleiro();
}
   
}
