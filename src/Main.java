public class Main {
    public static void main(String[] args) {
            Cliente cliente = new Cliente();
            cliente.setEdad(23);
            cliente.setNombre("Juan Martinez");
            cliente.setTelefono("3512322323");
            cliente.setCredito(245000);

            // Mostrar cliente
            System.out.println("Cliente");
            System.out.println("Nombre: " + cliente.getNombre() + "\nEdad: " + cliente.getEdad() +
                    "\nTelefono: " + cliente.getTelefono() + "\nCredito: " + cliente.getCredito());

            Trabajador trabajador = new Trabajador();
            trabajador.setEdad(37);
            trabajador.setNombre("Alvin Ardilla");
            trabajador.setTelefono("3512000001");
            trabajador.setSalario(15000);

            // Mostrar trabajador
            System.out.println("\nTrabajador");
            System.out.println("Nombre: " + trabajador.getNombre() + "\nEdad: " + trabajador.getEdad() +
                "\nTelefono: " + trabajador.getTelefono() + "\nSalario: " + trabajador.getSalario());
    }
}

abstract class Persona{
    int edad;
    String nombre;
    String telefono;

    public String getNombre() {
        return nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public int getEdad() {
        return edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}

class Cliente extends Persona{
    int credito;

    public void setCredito(int credito) {
        this.credito = credito;
    }

    public int getCredito() {
        return credito;
    }
}

class Trabajador extends Persona{
    int salario;

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public int getSalario() {
        return salario;
    }
}
