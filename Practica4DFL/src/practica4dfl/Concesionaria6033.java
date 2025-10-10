package practica4dfl;

import java.util.ArrayList;

public class Concesionaria6033 {
    private String nombre;
    private ArrayList<VehiculoBaseDFL> inventario;

    public Concesionaria6033(String nombre) {
        this.nombre = nombre;
        this.inventario = new ArrayList<>();
    }

    public void agregarVehiculo(VehiculoBaseDFL vehiculo) {
        inventario.add(vehiculo);
    }

    public void mostrarInventario() {
        System.out.println("Inventario de la concesionaria " + nombre + ":");
        for (VehiculoBaseDFL v : inventario) {
            v.mostrarFichaTecnica();
            System.out.println("-------------------------");
        }
    }

    public VehiculoBaseDFL buscarPorPropietario(String propietario) {
        for (VehiculoBaseDFL v : inventario) {
            if (v.getPropietario().equalsIgnoreCase(propietario)) {
                return v;
            }
        }
        return null;
    }

    public double calcularTotalImpuestos() {
        double total = 0;
        for (VehiculoBaseDFL v : inventario) {
            total += v.calcularImpuesto();
        }
        return total;
    }
}
