public class principal {
    public static void main(String[] args) {
        talumno elihu = new talumno();
        elihu.SetNombre("elihu Baltazar Diaz");
        elihu.SetEdad(22);
        elihu.SetGenero('m');
        
        elihu.setCuatrimestre(8);
        elihu.setMatricula("201535188");
        elihu.setSeccion(103);
        
        System.out.println(elihu.toString());
        
        /*System.out.println("nombre: "+ elihu.GetNombre());
        System.out.println("Edad: "+ elihu.GetEdad());
        System.out.println("Genero: " + elihu.GetGenero());*/
    }
}//fin  de la clase principal
