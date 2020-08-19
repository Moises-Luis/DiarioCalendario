package calendariodiario;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.*;

public class VentanaPrincipal extends JFrame implements ActionListener{
    
    ListaTablero mesesLista = new ListaTablero();
    private JPanel panelPrincipal,panelNorth, panelCenter;
    private JLabel hora;
    private String nomMes;
    private Tablero nuevo;
    private Casilla arreglo[][];
    private int posColumnFinal;
    private JButton mesAnterior, mesSiguiente;
    
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
        
        
        mesAnterior = new JButton("Anterior");
        mesAnterior.setBounds(0,0,100,100);
        mesAnterior.addActionListener(this);
        panelNorth.add(mesAnterior);
        
        hora = new JLabel(" 00:00:00 ");
        hora.setOpaque(true);
        hora.setFont(new Font("Quicksand Medium",3,40));
        hora.setBounds(0,0,300,100);
        hora.setBackground(Color.GREEN);
        panelNorth.add(hora);
        
        mesSiguiente = new JButton("Siguiente");
        mesSiguiente.setBounds(0,0,100,100);
        mesSiguiente.addActionListener(this);
        panelNorth.add(mesSiguiente);
        
        crearMeses();
        panelCenter.add(mostrarTableroFechaActual());
        this.setTitle(nomMes);
        colocarDiaAlBoton();
        
    }
    
    public void colocarDiaAlBoton(){
        int numDia = 1;
        Tablero tableroInicio = mesesLista.getInicio();
        arreglo = tableroInicio.getArreglo();
        
            for (int i = 1; i < 7; i++) {
            if (i == 1) {
                for (int j = 3; j < 7; j++) {

                    if (numDia <= 31) {
                        tableroInicio.setDia(i, j, numDia);
                        if (numDia == 31) {
                            posColumnFinal = j;

                        }
                    } else {
                        break;
                    }
                    numDia++;
                }
            } else {
                for (int j = 0; j < 7; j++) {

                    if (numDia <= 31) {
                        tableroInicio.setDia(i, j, numDia);
                        if (numDia == 31) {
                            posColumnFinal = j;

                        }
                    } else {
                        break;
                    }
                    numDia++;
                }
            }

        }
            
            

     
            Tablero aux = tableroInicio.getSiguiente();
            
            while(aux != tableroInicio){
                numDia = 1;
                arreglo = aux.getArreglo();
                if (aux.getDias() == 0 || aux.getDias() == 2 || aux.getDias() == 4 || aux.getDias() == 6 || aux.getDias() == 7 || aux.getDias() == 9 || aux.getDias() == 11) {
                    
                    for (int i = 1; i < 7; i++) {
                        if (posColumnFinal < 6) {
                            
                            if(i == 1){
                                for (int j = posColumnFinal + 1; j < 7; j++) {
                                if(numDia<=31) {
                                    arreglo[i][j].setDia(numDia);
                                
                                }if(numDia == 31){
                                    posColumnFinal = j;
                                    
                                }
                                numDia++;
                            }
                            }else{
                                for (int j = 0; j < 7; j++) {
                                if(numDia<=31) {
                                    arreglo[i][j].setDia(numDia);
                                
                                }if(numDia == 31){
                                    posColumnFinal = j;
                                    
                                }
                                numDia++;
                            }
                            }
                            
                        } else {
                            for (int j = 0; j < 7; j++) {
                                if(numDia<=31){
                                     arreglo[i][j].setDia(numDia);
                                if(numDia == 31){
                                    posColumnFinal = j;
                                }
                                }
                               numDia++;
                            }
                        }

                    }
                    
                } else if (aux.getDias() == 1) {
                    for (int i = 1; i < 7; i++) {
                        if (posColumnFinal < 6) {
                            
                            if(i == 1){
                                for (int j = posColumnFinal + 1; j < 7; j++) {
                                if(numDia<=29) {
                                    arreglo[i][j].setDia(numDia);
                                
                                }if(numDia == 29){
                                    posColumnFinal = j;
                                    
                                }
                                numDia++;
                            }
                            }else{
                                for (int j = 0; j < 7; j++) {
                                if(numDia<=29) {
                                    arreglo[i][j].setDia(numDia);
                                
                                }if(numDia == 29){
                                    posColumnFinal = j;
                                    
                                }
                                numDia++;
                            }
                            }
                            
                        } else {
                            for (int j = 0; j < 7; j++) {
                                if (numDia <= 29) {
                                    arreglo[i][j].setDia(numDia);

                                    if (numDia == 30) {
                                        posColumnFinal = j;
                                    }
                                }
                                numDia++;
                            }
                        }

                    }
                } else {
                    if (numDia <= 30) {
                        for (int i = 1; i < 7; i++) {
                            if (posColumnFinal < 6) {

                                if (i == 1) {
                                    for (int j = posColumnFinal + 1; j < 7; j++) {
                                        if (numDia <= 30) {
                                            arreglo[i][j].setDia(numDia);

                                        }
                                        if (numDia == 30) {
                                            posColumnFinal = j;

                                        }
                                        numDia++;
                                    }
                                } else {
                                    for (int j = 0; j < 7; j++) {
                                        if (numDia <= 30) {
                                            arreglo[i][j].setDia(numDia);
                                            if (numDia == 30) {
                                                posColumnFinal = j;

                                            }
                                        }
                                        
                                        numDia++;
                                    }
                                }

                            } else {
                                for (int j = 0; j < 7; j++) {
                                    if (numDia <= 30) {
                                        arreglo[i][j].setDia(numDia);

                                        if (numDia == 30) {
                                            posColumnFinal = j;
                                        }
                                    }
                                    numDia++;
                                }
                            }

                        }
                    }

                }
                aux = aux.getSiguiente();
            }
            
  
    }
    
    public void crearMeses(){
        
        for(int i = 0; i<12; i++){
            nuevo = new Tablero();
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
    
    public Tablero mostrarTableroFechaActual(){
        Calendar calendario = new GregorianCalendar();
        int mes = calendario.get(Calendar.MONDAY);
        Tablero buscado = mesesLista.getTablero(mes);
        nomMes = String.valueOf(mes);
        return buscado;
    }
    
    
    public Tablero mostrarTableroActual(){
        int mesTableroActual = Integer.parseInt(this.getTitle());
        Tablero buscado = mesesLista.getTablero(mesTableroActual);
        nomMes = String.valueOf(buscado.getMes());
        this.setTitle(nomMes);
        return buscado;
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == mesAnterior){
            Tablero mesCambiado = mesesLista.getAnterior(mostrarTableroActual());
            int mesCambiad = mesCambiado.getMes();
            panelCenter.removeAll();
            panelCenter.add(mesesLista.getAnterior(mostrarTableroActual()));
            
            nomMes = String.valueOf(mesCambiad);
            this.setTitle(nomMes);
            panelCenter.updateUI();
        }
        if(e.getSource() == mesSiguiente){
            
            Tablero mesCambiado = mesesLista.getSiguiente(mostrarTableroActual());
            int mesCambiad = mesCambiado.getMes();
            panelCenter.removeAll();
            panelCenter.add(mesesLista.getSiguiente(mostrarTableroActual()));
            nomMes = String.valueOf(mesCambiad);
            this.setTitle(nomMes);
            panelCenter.updateUI();
        }
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