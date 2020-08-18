
package calendariodiario;

import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.*;

public class Tablero extends JPanel{
    
    private Tablero siguiente;
    private Tablero anterior;
    private int mes;
    
    public Tablero(){
        siguiente = null;
        anterior = null;
        mes = 0;
        this.setLayout(new GridLayout(7,7));
        
        for(int i= 0; i<7; i++){
            for(int j = 0; j<7; j++){
                Casilla casilla = new Casilla();
                this.add(casilla);
                
                if(i == 0){
                    casilla.setBackground(Color.ORANGE);
                    switch(j){
                        case 0: casilla.setText("D");
                            break;
                        case 1: casilla.setText("L");
                            break;
                        case 2: casilla.setText("M");
                            break;
                        case 3: casilla.setText("M");
                            break;
                        case 4: casilla.setText("J");
                            break;
                        case 5: casilla.setText("V");
                            break;
                        case 6: casilla.setText("S");
                            break;  
                    }
                }
            }
        }
        
    }

    public Tablero getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Tablero siguiente) {
        this.siguiente = siguiente;
    }

    public Tablero getAnterior() {
        return anterior;
    }

    public void setAnterior(Tablero anterior) {
        this.anterior = anterior;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }
    
    
}
