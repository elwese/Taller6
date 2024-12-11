public class EmpleadoFijo extends Empleado {
    private double bonoAnual;

    public EmpleadoFijo(String nombre, double salarioBase, int horasTrabajadas, String departamento, double bonoAnual, String genero) {
        super(nombre, salarioBase, horasTrabajadas, departamento, genero);
        this.bonoAnual = bonoAnual;
    }

    //Pull Up Method
    //En el caso del método imprimirDetalles, cada subclase (EmpleadoFijo, EmpleadoPorHoras, EmpleadoTemporario) tenía una versión similar del método. 
    //Este se movió a la clase base Empleado, ya que gran parte de la lógica era común entre las subclases.

    // Más metodos
}

