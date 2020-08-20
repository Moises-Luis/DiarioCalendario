package calendariodiario;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

public class Casilla extends JButton implements ActionListener{
    
    private int dia;

    public Casilla(){
        //this.setOpaque(false);
        this.setBackground(Color.red);
        this.setForeground(Color.red);
        this.setFont(new Font("MathJax_Typewriter",2,20));
        this.setBackground(new Color(0,0,0,60));
        this.setVisible(true);
        addActionListener(this);
    }
    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
        this.setText(""+dia);
    }
 
     @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == this){
            System.out.println("Presiono");
        }
    }
}
