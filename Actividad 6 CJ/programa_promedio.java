public class programa_promedio {
    private String nombreC;

    private int [] calificacion;

    private double promedio;
    
    private int suma_calif=0;
    //constructor
    public programa_promedio(String nombre,int []calificacion){
        nombreC = nombre;

        this.calificacion = calificacion;
    }
    //get
    public String getNombreC(){
        return nombreC;
    }
    //set
    public void setNombreC(String nombre){
        nombreC = nombre;
    }

    //comportamientos
    public void imprimir(){
        System.out.println("Nombre del estudiante: " + nombreC );
        System.out.println("Registro:");
        for(int i=0; i<calificacion.length; i++){
            System.out.println("Calificaion " + (i+1) + ": " + calificacion[i]);
            suma_calif+=calificacion[i];
        }
        promedio = (suma_calif/calificacion.length);
        System.out.println("Promedio: " + promedio);
        
        if(promedio >= 0 && promedio <=50 ){
            System.out.println("Nota: " + 'F');

        }else if(promedio >= 51 && promedio <=60){
            System.out.println("Nota: " + 'E');

        }else if(promedio >= 61 && promedio <=70){
            System.out.println("Nota: " + 'D');

        }else if(promedio >= 71 && promedio <=80){
            System.out.println("Nota: " + 'C');

        }else if(promedio >= 81 && promedio <=90){
            System.out.println("Nota: " + 'B');

        }else if(promedio >= 91 && promedio <=100){
            System.out.println("Nota: " + 'E');
        }

        System.out.println("");
    }
}
