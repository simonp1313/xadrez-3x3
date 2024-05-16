import java.awt.*;
import javax.swing.*;

public class Xadrez extends JFrame {

    public void Tabuleiro() {

        setTitle("Tabuleiro de Xadrez 3x3");
        setSize(300, 300);
        setLocationRelativeTo( null );
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container pane = getContentPane();
        pane.setLayout(new GridLayout(3, 3));

        // Posição do rei branco
        JPanel panel11 = new JPanel();
        panel11.setPreferredSize(new Dimension(100, 100));
        panel11.setBackground(Color.GREEN);
        JLabel label11 = new JLabel(new ImageIcon("rei_branco.png"));
        panel11.add(label11);
        pane.add(panel11);

        // Posição dos bispos brancos
        JPanel panel12 = new JPanel();
        panel12.setPreferredSize(new Dimension(100, 100));
        panel12.setBackground(Color.WHITE);
        JLabel label12 = new JLabel(new ImageIcon("bispo_branco.png"));
        panel12.add(label12);
        pane.add(panel12);

        JPanel panel13 = new JPanel();
        panel13.setPreferredSize(new Dimension(100, 100));
        panel13.setBackground(Color.GREEN);
        JLabel label13 = new JLabel(new ImageIcon("bispo_branco.png"));
        panel13.add(label13);
        pane.add(panel13);

        // Painel vazio para completar a última coluna
        JPanel panelEmpty = new JPanel();
        panelEmpty.setPreferredSize(new Dimension(100, 100));
        panelEmpty.setBackground(Color.WHITE);
        pane.add(panelEmpty);

        JPanel panelEmpty2 = new JPanel();
        panelEmpty2.setPreferredSize(new Dimension(100, 100));
        panelEmpty2.setBackground(Color.green);
        pane.add(panelEmpty2);

        JPanel panelEmpty3 = new JPanel();
        panelEmpty3.setPreferredSize(new Dimension(100, 100));
        panelEmpty3.setBackground(Color.white);
        pane.add(panelEmpty3);

        // Posição dos bispos pretos
        JPanel panel22 = new JPanel();
        panel22.setPreferredSize(new Dimension(100, 100));
        panel22.setBackground(Color.GREEN);
        JLabel label22 = new JLabel(new ImageIcon("bispo_preto.png"));
        panel22.add(label22);
        pane.add(panel22);

        JPanel panel23 = new JPanel();
        panel23.setPreferredSize(new Dimension(100, 100));
        panel23.setBackground(Color.WHITE);
        JLabel label23 = new JLabel(new ImageIcon("bispo_preto.png"));
        panel23.add(label23);
        pane.add(panel23);

        JPanel panel33 = new JPanel();
        panel33.setPreferredSize(new Dimension(100, 100));
        panel33.setBackground(Color.GREEN);
        JLabel label33 = new JLabel(new ImageIcon("rei_preto.png"));
        panel33.add(label33);
        pane.add(panel33);

        setVisible(true);
    }

    public static void main(String[] args) {

        Tela1 tela1 = new Tela1();
        tela1.login();
        
    }
}
