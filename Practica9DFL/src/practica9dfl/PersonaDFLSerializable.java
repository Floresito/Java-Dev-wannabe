package practica9dfl;

import java.io.*;

public class PersonaDFLSerializable implements Serializable {
    private String nombre;
    private int edad;
    private transient String contraseña;

    public PersonaDFLSerializable(String nombre, int edad, String contraseña) {
        this.nombre = nombre;
        this.edad = edad;
        this.contraseña = contraseña;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Edad: " + edad + ", Contraseña: " + contraseña;
    }

    // Serializacion del objeto
    public void serializar(String ruta) throws IOException {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(ruta))) {
            out.writeObject(this);
        }
    }

    // Deserializacion desde un ARCHIVO
    public static PersonaDFLSerializable deserializar(String ruta) throws IOException, ClassNotFoundException {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(ruta))) {
            return (PersonaDFLSerializable) in.readObject();
        }
    }

    public String getNombre() { return nombre; }
    public int getEdad() { return edad; }
    public String getContraseña() { return contraseña; }
    
}

