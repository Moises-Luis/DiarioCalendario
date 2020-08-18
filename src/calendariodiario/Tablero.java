
package calendariodiario;

import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.*;

public class Tablero extends JPanel{
    private Casilla arreglo[][];
    private Tablero siguiente;
    private Tablero anterior;
    private int mes;
    private int dias;
    
    public Tablero(){
        siguiente = null;
        anterior = null;
        mes = 0;
        this.setLayout(new GridLayout(7,7));
        arreglo = new Casilla[7][7];
        
        
        for(int i= 0; i<7; i++){
            for(int j = 0; j<7; j++){
                Casilla casilla = new Casilla();
                arreglo[i][j] = casilla;
                this.add(arreglo[i][j]);
                
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
