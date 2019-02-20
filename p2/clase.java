public class talumno extends tpersona {
    //atributos de la clase heredada
    private String matricula;
    private int cuatrimestre;
    private int seccion;
    
    //****************metodos
    //metodo constructor
    talumno(){
    super();//mandamos a llamar al constructor del padre
    matricula="";
    cuatrimestre = seccion = 0;    
    }
    //metodo set
    public void setMatricula(String matricula){
        this.matricula=matricula;
    }
    public void setCuatrimestre(int cuatrimestre){
        this.cuatrimestre=cuatrimestre;
    }
    public void setSeccion(int seccion){
        this.seccion=seccion;
    }
    //metodos get
    public String getMatricula(){
        return matricula;
    }
    public int getCuatrimestre(){
        return cuatrimestre;
    }
    public int getSeccion(){
        return seccion;
    }
    
    @Override
    public String  toString(){
        String mensaje;
        mensaje = super.toString();
        mensaje = mensaje + "Matricula: " + matricula + "\ncuatrimestre: " + cuatrimestre +
                "\nSeccion: " + seccion + "\n";
        return mensaje;
    }
    
}//fin clase alumno
