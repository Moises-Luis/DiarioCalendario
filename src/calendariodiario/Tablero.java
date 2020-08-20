
package calendariodiario;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.*;

public class Tablero extends JPanel{
    private Casilla arreglo[][];
    private Tablero siguiente;
    private Tablero anterior;
    private int mes;
    private int dias;
    
    
    public Tablero(){
        
        this.setOpaque(false);
        siguiente = null;
        anterior = null;
        mes = 0;
        this.setLayout(new GridLayout(7,7));
      //  this.setBackground(new Color(0,0,0,180));
        arreglo = new Casilla[7][7];
        
        
        
        for(int i= 0; i<7; i++){
            for(int j = 0; j<7; j++){
                Casilla casilla = new Casilla();
                arreglo[i][j] = casilla;
                //arreglo[i][j].setOpaque(false);
                this.add(arreglo[i][j]);
                if(i == 0){
                    
                    casilla.setBackground(Color.ORANGE);
                    switch(j){
                        case 0: casilla.setText("D");
                        arreglo[i][j].setFont(new Font("MathJax_Typewriter",Font.BOLD,25));
                        arreglo[i][j].setForeground(Color.RED);
                        setForeground(Color.red);
                        arreglo[i][j].setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

                            break;
                        case 1: casilla.setText("L");
                        arreglo[i][j].setFont(new Font("MathJax_Typewriter",Font.BOLD,25));
                        arreglo[i][j].setForeground(Color.BLACK);
                        arreglo[i][j].setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
                            break;
                        case 2: casilla.setText("M");
                        arreglo[i][j].setFont(new Font("MathJax_Typewriter",Font.BOLD,25));
                        arreglo[i][j].setForeground(Color.BLACK);
                        arreglo[i][j].setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
                            break;
                        case 3: casilla.setText("M");
                        arreglo[i][j].setFont(new Font("MathJax_Typewriter",Font.BOLD,25));
                        arreglo[i][j].setForeground(Color.BLACK);
                        arreglo[i][j].setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
                            break;
                        case 4: casilla.setText("J");
                        arreglo[i][j].setFont(new Font("MathJax_Typewriter",Font.BOLD,25));
                        arreglo[i][j].setForeground(Color.BLACK);
                        arreglo[i][j].setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
                            break;
                        case 5: casilla.setText("V");
                        arreglo[i][j].setFont(new Font("MathJax_Typewriter",Font.BOLD,25));
                        arreglo[i][j].setForeground(Color.BLACK);
                        arreglo[i][j].setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
                            break;
                        case 6: casilla.setText("S");
                        arreglo[i][j].setFont(new Font("MathJax_Typewriter",Font.BOLD,25));
                        arreglo[i][j].setForeground(Color.RED);
                        arreglo[i][j].setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
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

    public int getDias() {
        return dias;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }

    public Casilla[][] getArreglo() {
        return arreglo;
    }

    public void setArreglo(Casilla[][] arreglo) {
        this.arreglo = arreglo;
    }
    
    public void setDia(int filIni, int columIni, int dia){
        arreglo[filIni][columIni].setDia(dia);
    }
    
    
}
