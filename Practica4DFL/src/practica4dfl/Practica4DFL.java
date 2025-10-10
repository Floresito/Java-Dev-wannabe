package practica4dfl;

public class Practica4DFL {

    public static void main(String[] args) {
        // TODO code application logic here
 
        Concesionaria6033 Concesionaria1 = new Concesionaria6033("Concesionaria Flores");
        
        /* formato:
        ... new ClaseHija(
            atributos Clase Hija...,
            atributos Clase Padre
        );
        */
        AutoFlores auto = new AutoFlores(
            4, true, AutoFlores.TipoCombustible.Hibrido,
            "Diego", 2022, 250000, VehiculoBaseDFL.Color.Negro, VehiculoBaseDFL.Tipo.Automatico
        );

        MotocicletaFlores moto = new MotocicletaFlores(
            600, true, MotocicletaFlores.TipoManillar.Deportivo,
            "Laura", 2021, 85000, VehiculoBaseDFL.Color.Rojo, VehiculoBaseDFL.Tipo.Manual
        );

        CamionFlores camion = new CamionFlores(
            15.5, 4, true,
            "Carlos", 2020, 480000, VehiculoBaseDFL.Color.Blanco, VehiculoBaseDFL.Tipo.Manual
        );

        Concesionaria1.agregarVehiculo(auto);
        Concesionaria1.agregarVehiculo(moto);
        Concesionaria1.agregarVehiculo(camion);

        Concesionaria1.mostrarInventario();

        double totalImpuestos = Concesionaria1.calcularTotalImpuestos();
        System.out.println("Total de impuestos calculados: $" + totalImpuestos);
        
        //Pruebas unitarias
        // Prueba 1: Verificar propietario
        if (auto.getPropietario().equals("Diego")) {
            System.out.println("Propietario del auto correcto");
        } else {
            System.out.println("Error en propietario del auto");
        }

        // Prueba 2: Verificar número de puertas
        if (auto.num_puertas == 4) {
            System.out.println("Número de puertas correcto");
        } else {
            System.out.println("Error en número de puertas");
        }

        // Prueba 3: Verificar cilindrada de la moto
        if (moto.cilindrada == 600) {
            System.out.println("Cilindrada de la moto correcta");
        } else {
            System.out.println("Error en cilindrada de la moto");
        }

        // Prueba 4: Verificar capacidad de carga del camión
        if (camion.capacidad_cargaTON == 15.5) {
            System.out.println("Capacidad de carga del camión correcta");
        } else {
            System.out.println("Error en capacidad de carga del camión");
        }

        // Prueba 5: Verificar búsqueda por propietario
        VehiculoBaseDFL encontrado = Concesionaria1.buscarPorPropietario("Carlos");
        if (encontrado != null && encontrado.getPropietario().equals("Carlos")) {
            System.out.println("Búsqueda por propietario exitosa");
        } else {
            System.out.println("Error en búsqueda por propietario");
        }
    }
}
