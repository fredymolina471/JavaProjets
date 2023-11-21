
package herencia;

public class Empleado extends Persona{
        private int idEmpleado;
        private double salario;
        private static int contadorEmpleado;
                       
// para el static int no se requiere crear un objeto para modificar su valor             

    public Empleado(double salario, String nombre) {
        super(nombre);
        this.idEmpleado = ++Employee.contadorEmpleado;
        this.salario = salario;
    }

        
    public int getIdEmpleado() {
        return idEmpleado;
    }

    public double getSalario() {
        return salario;
    }

    public static int getContadorEmpleado() {
        return contadorEmpleado;
    }

    public String getNombre() {
        return nombre;
    }

    public char getGenero() {
        return genero;
    }

    public int getEdad() {
        return edad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public static void setContadorEmpleado(int contadorEmpleado) {
        Empleado.contadorEmpleado = contadorEmpleado;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Empleado{");
        sb.append("idEmpleado=").append(idEmpleado);
        sb.append(", salario=").append(salario);
        sb.append('}');
        return sb.toString();
    }
    
   
}
