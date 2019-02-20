public class clase{
    //atributos de la clase heredada
    private String nombre;
    
    //****************metodos
    //metodo constructor
    clase(){
    //super();//mandamos a llamar al constructor del padre
    nombre="";   
    }
    //metodo set
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    //metodos get
    public String getNombre(){
        return nombre;
    }
    
    public String  toString(){
        String mensaje;
        mensaje = super.toString();
        mensaje = mensaje + "Matricula: " + matricula + "\ncuatrimestre: " + cuatrimestre +
                "\nSeccion: " + seccion + "\n";
        return mensaje;
    }
    
}//fin clase alumno
