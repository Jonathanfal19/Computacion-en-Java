import javax.swing.*;
public class Main{

    public static void main(String[]args){
        //Se crean las variables
        String nombre;
        int[] calificacion = new int[5]; //El arreglo es de 5 porque el profesor caprurara 5 calificaciones para promediar al alumno

        //Se crean las entradas
        nombre = JOptionPane.showInputDialog("Captura el nombre del alumno(a): ");
        //Se llena el arreglo
        for(int i=0; i<5; i++){
            calificacion[i]=Integer.parseInt(JOptionPane.showInputDialog("Escribe la calificacion numero: " + (i+1)));
        }
        
        //Se crea el objeto
        programa_promedio num1 = new programa_promedio(nombre,calificacion);

        num1.imprimir();

    }
}