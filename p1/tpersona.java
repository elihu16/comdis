public class tpersona {
//atributos
    private String nombre;
    private int edad;
    private char genero;
    
//metodos
//metodo constructor
    tpersona(){
        nombre = "";
        edad = 0;
        genero = 'i';
    }
//metodos set
    public void SetNombre(String nombre){
        this.nombre = nombre;
    }
    public void SetEdad(int edad){
        this.edad = edad;
    }
    public void SetGenero(char genero){
        this.genero=genero;
    }  
    
//metodos get
    public String GetNombre(){
        return nombre;
    }
    public int GetEdad(){
        return edad;
    }
    
    public char GetGenero(){
        return genero;
    }
    
    @Override
    public String toString(){
        String mensaje;
        
        mensaje = "Nombre; " + nombre + "\nEdad " + edad + "\nGenero: " + genero + "\n";
        return mensaje;
    }
    
}
