public class Hash {
    public static void main (String[] args){

        Catedratico.tamanio = 35;
        Catedratico []arrCat = new Catedratico[Catedratico.tamanio];

        Catedratico c = new Catedratico(10925, "Luis Chavez");
        arrCat[c.hashCode()]=c;
        c = new Catedratico(35000, "Moises Velasquez");
        arrCat[c.hashCode()]=c;
        c = new Catedratico(12000, "Jerremy Garcia");
        arrCat[c.hashCode()]=c;

        Alumno.tamanio = 101;
        Alumno []arrAlum = new Alumno[Alumno.tamanio];
        Alumno a = new Alumno("2024-123", "Jose Gonzalez");
        arrAlum[a.hashCode()]=a;
        a = new Alumno("2024-456", "Enrique Perez");
        a = new Alumno("2024-789", "Maria Enriquez");
    }


}
