
package calendariodiario;

public class ListaTablero {
    private Tablero inicio;
    private int tamaño;
    
    public ListaTablero(){
        this.inicio = null;
        this.tamaño = 0;
    }

    public Tablero getInicio() {
        return inicio;
    }

    public void setInicio(Tablero inicio) {
        this.inicio = inicio;
    }

    public int getTamaño() {
        return tamaño;
    }

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }
    
    public void agregar(Tablero nuevoTablero){
        if(tamaño == 0){
            inicio = nuevoTablero;
            inicio.setAnterior(nuevoTablero);
            inicio.setSiguiente(nuevoTablero);
        }else{
            Tablero tableroAux = inicio;
            while(tableroAux.getSiguiente() != inicio){
                tableroAux = tableroAux.getSiguiente();
                
            }
            
            tableroAux.setSiguiente(nuevoTablero);
            nuevoTablero.setAnterior(tableroAux);
            nuevoTablero.setSiguiente(inicio);
            inicio.setAnterior(nuevoTablero);
            
        }
        tamaño++;
        nuevoTablero.setMes(tamaño);
    }
    public Tablero getTablero(int mes){
        Tablero aux = inicio;
        for(int i = 0; i<12; i++){
            if(aux.getMes() == mes){    
                break;
            }
            aux = aux.getSiguiente();
        }
        return aux;
    }
}
