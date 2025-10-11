package practica6dfl;

public class Practica6DFL {

    public static void main(String[] args) {
                EmpresaTID6033 empresa = new EmpresaTID6033();
        
        GerenteFlores gerente = new GerenteFlores("Diego", "Flores", 20, 80000);
        DesarrolladorFlores dev = new DesarrolladorFlores("Luis", "SegoBia", 28, 60000);
        VendedorFlores vendedor = new VendedorFlores("Rodrigo", "Zacatenko", 50, 43000);
        
        empresa.agregarEmpleados(gerente);
        empresa.agregarEmpleados(dev);
        empresa.agregarEmpleados(vendedor);
        
        empresa.mostrarTodos();
                
        gerente.recibirBono(10000);
        dev.recibirBono(1000);
        vendedor.recibirBono(100);
        
        gerente.evaluarDesempeño();
        dev.evaluarDesempeño();
        vendedor.evaluarDesempeño();
        
        gerente.promover();
        dev.promover();
        vendedor.promover();
    }
    
}
