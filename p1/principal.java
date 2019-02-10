public class principal {
    public static void main(String[] args) {
        talumno Deniz = new talumno();
        Deniz.SetNombre("Deniz Aniceto Marin");
        Deniz.SetEdad(15);
        Deniz.SetGenero('f');
        
        Deniz.setCuatrimestre(8);
        Deniz.setMatricula("201538499");
        Deniz.setSeccion(103);
        
        System.out.println(Deniz.toString());
        
        /*System.out.println("nombre: "+ Deniz.GetNombre());
        System.out.println("Edad: "+ Deniz.GetEdad());
        System.out.println("Genero: " + Deniz.GetGenero());*/
    }
}//fin  de la clase principal
