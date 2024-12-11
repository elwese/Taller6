import java.util.List;

public class BuscadorEmpleado {
    public static Empleado buscarEmpleadoPorNombre(String nombre, List<Empleado> empleados) {
        for (Empleado empleado : empleados) {
            if (empleado.getNombre().equals(nombre)) {
                return empleado;
            }
        }
        return null;
    }

    //Pull Up Method
    //En el caso del método imprimirDetalles, cada subclase (EmpleadoFijo, EmpleadoPorHoras, EmpleadoTemporario) tenía una versión similar del método. 
    //Este se movió a la clase base Empleado, ya que gran parte de la lógica era común entre las subclases.

    // Más metodos
}
