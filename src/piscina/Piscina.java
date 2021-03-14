/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package piscina;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Piscina extends JFrame implements ActionListener{
    JLabel lbllargura, lblprofund, lblcompriment, lblresult;
    JTextField txtlargura, txtprofund,txtcompriment, txtresult;
    JButton btncalcular, btnlimpar;
    
    public static void main(String[] args) {
    JFrame janela = new Piscina();
    janela.setUndecorated(true);
    janela.getRootPane().setWindowDecorationStyle(JRootPane.FRAME);
    janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    janela.setVisible(true);
    }
    
Piscina()
{
    setTitle("Calculo de Piscina");
    setBounds(300,50,300,200);
    getContentPane().setBackground(new Color(183,234,255));
    getContentPane().setLayout(new GridLayout(5,2));

    lbllargura = new JLabel("Largura");
    lbllargura.setFont(new Font("Press Start 2P",Font.ITALIC, 10));
    lbllargura.setForeground(Color.black);
    lblprofund = new JLabel("Profundidade");
    lblprofund.setFont (new Font("Press Start 2P",Font.ITALIC, 10));
    lblprofund.setForeground(Color.black);
    lblcompriment = new JLabel("Comprimento");
    lblcompriment.setFont(new Font("Press Start 2P",Font.ITALIC, 10));
    lblcompriment.setForeground(Color.black);
    lblresult = new JLabel("Total");
    lblresult.setFont (new Font("Press Start 2P",Font.ITALIC, 10));
    lblresult.setForeground(Color.black);
    
    btncalcular = new JButton("Calcular");btncalcular.addActionListener(this);      
    btnlimpar = new JButton("Limpar");btnlimpar.addActionListener(this);          
    
    txtlargura = new JTextField();
    txtprofund = new JTextField();
    txtcompriment = new JTextField();
    txtresult = new JTextField();
    txtresult.setEditable(false);
    
    getContentPane().add(lbllargura);getContentPane().add(txtlargura);
    getContentPane().add(lblprofund);getContentPane().add(txtprofund);
    getContentPane().add(lblcompriment);getContentPane().add(txtcompriment);
    getContentPane().add(lblresult);getContentPane().add(txtresult);
    getContentPane().add(btncalcular);
    getContentPane().add(btnlimpar);
    
}
public void actionPerformed(ActionEvent e)
{
    if (e.getSource()==btnlimpar)
    {
        txtlargura.setText("");
        txtprofund.setText("");
        txtcompriment.setText("");
        txtresult.setText("");
        return;
    }
    double largura=0, profund=0, compriment=0, result=0;
    try
    {
        largura = Double.parseDouble(txtlargura.getText());
        profund = Double.parseDouble(txtprofund.getText());
        compriment = Double.parseDouble(txtcompriment.getText());
    }
    catch(NumberFormatException erro)
    {
        txtresult.setText("Só Números!");
        return;
    }
    if(e.getSource()==btncalcular) result = (largura*profund*compriment)*300;
    txtresult.setText("" + result);
}

}
