public class EmpleadoTemporario extends Empleado {
    //nombre existe en Empleado
    //genero fue subido (pull up atribute)
    //salario existe en Empleado
    // horasTrabajadas existe en Empleado
    //departamento existe en empleado
    private int mesesContrato;

    public EmpleadoTemporario(String nombre, double salarioBase, int horasTrabajadas, String departamento, int mesesContrato, String genero) {
        super(nombre, salarioBase, horasTrabajadas, 0, departamento)
        this.mesesContrato = mesesContrato;
    }
    
    //imprimir detalles fue movido para Empleado (pull up method)

    // Más metodos
}
