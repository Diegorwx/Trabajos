package co.edu.uniquindio.poo.EjerciciosClase;

import java.util.Objects;

public class Cliente {

    private String nombre;
    private String identificacion;

    public Cliente(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Cliente cliente = (Cliente) o;
        return Objects.equals(nombre, cliente.nombre) && Objects.equals(identificacion, cliente.identificacion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, identificacion);
    }
}
