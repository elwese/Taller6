public class EmpleadoPorHoras extends Empleado {
    //genero fue subido a Empleado (pull up atribute)

    public EmpleadoPorHoras(String nombre, int horasTrabajadas, double tarifaHora, String departamento, String genero) {
        super(nombre, 0, horasTrabajadas, tarifaHora, departamento);
        super.setSalarioBase(calcularSalario()); 
        this.genero = genero;
    }

    @Override
    public double calcularSalario() {
        //in line temp
        return super.getHorasTrabajadas() * super.getTarifaHora();;
    }

    //imprimir detalles fue movido para Empleado (pull up method)
    // Más metodos
}