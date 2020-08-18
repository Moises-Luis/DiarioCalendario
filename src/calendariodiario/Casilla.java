package calendariodiario;

import javax.swing.JButton;

public class Casilla extends JButton{
    
    private int dia;

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
        this.setText(""+dia);
    }
    
}
