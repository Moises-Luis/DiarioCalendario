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
    
    private JPanel panelPrincipal,panelNorth, panelCenter;
    private JLabel hora;
    
    public VentanaPrincipal(){
        this.setBounds(0,0,500,500);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        
        
        panelPrincipal = new JPanel();
        panelPrincipal.setBackground(Color.BLACK);
        panelPrincipal.setLayout(new BorderLayout(10,10));
        this.getContentPane().add(panelPrincipal);
        
        
        panelNorth = new JPanel();
        panelNorth.setBackground(Color.red);
        panelPrincipal.add(panelNorth, BorderLayout.NORTH);
        
        panelCenter = new JPanel();
        panelCenter.setLayout(new GridLayout(7,7));
        panelCenter.setBackground(Color.BLUE);
        panelPrincipal.add(panelCenter, BorderLayout.CENTER);
        
        hora = new JLabel(" 00:00:00 ");
        hora.setOpaque(true);
        hora.setFont(new Font("Quicksand Medium",3,40));
        hora.setBounds(0,0,300,100);
        hora.setBackground(Color.GREEN);
        panelNorth.add(hora);
        
        for(int i= 0; i<7; i++){
            for(int j = 0; j<7; j++){
                Casilla casilla = new Casilla();
                panelCenter.add(casilla);
                
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
    
    public void colocarDiaAlBoton(){
        Calendar calendario = new GregorianCalendar();
        int dia = calendario.get(Calendar.DAY_OF_MONTH);
        int diaOf = calendario.get(Calendar.DAY_OF_WEEK_IN_MONTH);
        int dia3 = calendario.get(Calendar.DAY_OF_YEAR);
        int dia4 = calendario.get(Calendar.DAY_OF_WEEK);
        int dia5 = calendario.get(Calendar.MONDAY);
        int dia6 = calendario.get(Calendar.WEEK_OF_MONTH);
        int dia7 = calendario.get(Calendar.DATE);
        
        System.out.println("dia: "+dia);
        System.out.println("dia de la semana: "+diaOf);
        System.out.println("dia3: "+dia3);
        System.out.println("dia4: "+dia4);
        System.out.println("mes: "+dia5);
        System.out.println("semanas del mes: "+dia6);
        System.out.println("semanas del mes: "+dia7);
        LocalDate fecha = LocalDate.now();
        
        System.out.println("fecha: "+fecha);
        
        
    }
}
