package calendariodiario;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.*;

public class VentanaPrincipal extends JFrame {
    
    ListaTablero mesesLista = new ListaTablero();
    private JPanel panelPrincipal,panelNorth, panelCenter;
    private JLabel hora;
    private String nomMes;
    
    public VentanaPrincipal(){
        this.setBounds(0,0,500,500);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        panelPrincipal = new JPanel();
        panelPrincipal.setBackground(Color.BLACK);
        panelPrincipal.setLayout(new BorderLayout(10,10));
        this.getContentPane().add(panelPrincipal);
        
        
        panelNorth = new JPanel();
        panelNorth.setBackground(Color.red);
        panelPrincipal.add(panelNorth, BorderLayout.NORTH);
        
        panelCenter = new JPanel();
        panelCenter.setLayout(new GridLayout(1,1));
        panelCenter.setBackground(Color.BLUE);
        panelPrincipal.add(panelCenter, BorderLayout.CENTER);
        
        hora = new JLabel(" 00:00:00 ");
        hora.setOpaque(true);
        hora.setFont(new Font("Quicksand Medium",3,40));
        hora.setBounds(0,0,300,100);
        hora.setBackground(Color.GREEN);
        panelNorth.add(hora);
        
        crearMeses();
        panelCenter.add(mostrarTableroActual());
        this.setTitle(nomMes);
        colocarDiaAlBoton();
        
    }
    
    public void colocarDiaAlBoton(){
        int numDia = 1;
        Tablero tableroInicio = mesesLista.getInicio();
        if(tableroInicio == mesesLista.getInicio()){
            for(int i = 1; i<7; i++){
                for(int j = 3; j<7; j++){
                    if(numDia <=31){
                        tableroInicio.setDia(i, j, numDia);
                    }else{
                        break;
                    }
                    numDia++;
                }
            }
        }
    }
    
    public void crearMeses(){
        
        for(int i = 0; i<12; i++){
            Tablero nuevo = new Tablero();
            if(i == 0 || i == 2 || i == 4 || i== 6 || i == 7 || i == 9 || i == 11){
                nuevo.setDias(31);
            }else if(i == 1){
                nuevo.setDias(29);
            }else{
                nuevo.setDias(30);
            }
            mesesLista.agregar(nuevo);
        }
    }
    
    public Tablero mostrarTableroActual(){
        Calendar calendario = new GregorianCalendar();
        int mes = calendario.get(Calendar.MONDAY);
        Tablero buscado = mesesLista.getTablero(mes);
        nomMes = String.valueOf(mes);
        return buscado;
    }
}

/**
 * Calendar calendario = new GregorianCalendar();
        int dia = calendario.get(Calendar.DAY_OF_MONTH);
        int diaOf = calendario.get(Calendar.DAY_OF_WEEK_IN_MONTH);
        int dia3 = calendario.get(Calendar.DAY_OF_YEAR);
        int dia4 = calendario.get(Calendar.DAY_OF_WEEK);
        
        int dia6 = calendario.get(Calendar.WEEK_OF_MONTH);
        int dia7 = calendario.get(Calendar.DATE);
        
        System.out.println("dia: "+dia);
        System.out.println("dia de la semana: "+diaOf);
        System.out.println("dia3: "+dia3);
        System.out.println("dia4: "+dia4);
        System.out.println("semanas del mes: "+dia6);
        System.out.println("semanas del mes: "+dia7);
        LocalDate fecha = LocalDate.now();
        
        System.out.println("fecha: "+fecha);
 */