package practica6dfl;

import java.util.ArrayList;

public class EmpresaTID6033 {
    private ArrayList<EmpleadoDF> empleados = new ArrayList<>();
    
    public void agregarEmpleados(EmpleadoDF empleado){
        empleados.add(empleado);
    }
    
    public void mostrarTodos(){
        for (EmpleadoDF e: empleados){
            e.mostrarInformacion();
            e.trabajar();
            System.out.println("------");
        }
    }
}
