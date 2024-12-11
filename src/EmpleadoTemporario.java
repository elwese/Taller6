public class EmpleadoTemporario extends Empleado {
    //nombre existe en Empleado
    //genero fue subido (pull up atribute)
    //salario existe en Empleado
    // horasTrabajadas existe en Empleado
    //departamento existe en empleado
    private int mesesContrato;

    public EmpleadoTemporario(String nombre, double salarioBase, int horasTrabajadas, String departamento, int mesesContrato, String genero) {
        this.nombre = nombre;
        this.salarioBase = salarioBase;
        this.horasTrabajadas = horasTrabajadas;
        this.departamento = departamento;
        this.mesesContrato = mesesContrato;
        this.genero = genero;
    }
    
    //imprimir detalles fue movido para Empleado (pull up method)

    // Más metodos
}
