package practica4dfl;

/**
 *
 * @author a
 */
public class PruebasUnitariasFlores {
    public static void main(String[] args){
        testVehiculoBase();
        testAutoFlores();
        testMotocicletaFlores();
        testCamionFlores();
        testConcesionaria();
    }
    
    public static void testVehiculoBase() {
        VehiculoBaseDFL v = new VehiculoBaseDFL("Diego", 2022, 200000, VehiculoBaseDFL.Color.Negro, VehiculoBaseDFL.Tipo.Manual);
        System.out.println("Test VehiculoBaseDFL:");
        System.out.println(v.getPropietario().equals("Diego") ? "Propietario correcto" : "Propietario incorrecto");
        System.out.println(v.getAnio() == 2022 ? "Año correcto" : "Año incorrecto");
        System.out.println(v.getPrecio_base() == 200000 ? "Precio correcto" : "Precio incorrecto");
        System.out.println();
    }

    public static void testAutoFlores() {
        AutoFlores auto = new AutoFlores(4, true, AutoFlores.TipoCombustible.Hibrido,
            "Laura", 2021, 250000, VehiculoBaseDFL.Color.Rojo, VehiculoBaseDFL.Tipo.Automatico);
        System.out.println("Test AutoFlores:");
        System.out.println(auto.num_puertas == 4 ? "Puertas correctas" : "Puertas incorrectas");
        System.out.println(auto.tiene_AC ? "A/C correcto" : "A/C incorrecto");
        System.out.println(auto.combustible == AutoFlores.TipoCombustible.Hibrido ? "Combustible correcto" : "Combustible incorrecto");
        System.out.println();
    }

    public static void testMotocicletaFlores() {
        MotocicletaFlores moto = new MotocicletaFlores(600, true, MotocicletaFlores.TipoManillar.Deportivo,
            "Carlos", 2020, 85000, VehiculoBaseDFL.Color.Cafe, VehiculoBaseDFL.Tipo.Manual);
        System.out.println("Test MotocicletaFlores:");
        System.out.println(moto.cilindrada == 600 ? "Cilindrada correcta" : "Cilindrada incorrecta");
        System.out.println(moto.tieneParabrisas ? "Parabrisas correcto" : "Parabrisas incorrecto");
        System.out.println(moto.manillar == MotocicletaFlores.TipoManillar.Deportivo ? "Manillar correcto" : "Manillar incorrecto");
        System.out.println();
    }

    public static void testCamionFlores() {
        CamionFlores camion = new CamionFlores(15.5, 4, true,
            "Ana", 2019, 480000, VehiculoBaseDFL.Color.Blanco, VehiculoBaseDFL.Tipo.Manual);
        System.out.println("Test CamionFlores:");
        System.out.println(camion.capacidad_cargaTON == 15.5 ? "Carga correcta" : "Carga incorrecta");
        System.out.println(camion.num_ejes == 4 ? "Ejes correctos" : "Ejes incorrectos");
        System.out.println(camion.tiene_remolque ? "Remolque correcto" : "Remolque incorrecto");
        System.out.println();
    }

    public static void testConcesionaria() {
        Concesionaria6033 c = new Concesionaria6033("Concesionaria Flores");
        AutoFlores auto = new AutoFlores(2, false, AutoFlores.TipoCombustible.Gasolina,
            "Luis", 2023, 180000, VehiculoBaseDFL.Color.Rojo, VehiculoBaseDFL.Tipo.Manual);
        c.agregarVehiculo(auto);

        boolean encontrado = c.buscarPorPropietario("Luis") != null;
        System.out.println("Test Concesionaria:");
        System.out.println(encontrado ? "Vehículo encontrado por propietario" : "Vehículo no encontrado");

        double totalImpuestos = c.calcularTotalImpuestos();
        System.out.println(totalImpuestos > 0 ? "Impuestos calculados: $" + totalImpuestos : "Impuestos incorrectos");
        System.out.println();
    }
}