package models;

public class Empresa {
    // Atributos de la clase Empresa
    private String razonSocial; // Nombre, razón social de la empresa
    private String direccion; // Dirección de la empresa
    private String cuil; // Número de CUIL de la empresa

    // Constructor completo
    public Empresa(String razonSocial, String direccion, String cuil) {
        this.razonSocial = razonSocial;
        this.direccion = direccion;
        this.cuil = cuil;
    }

    // Constructor vacío
    public Empresa() {
    }

    // Getter para la razón social de la empresa
    public String getRazonSocial() {
        return razonSocial;
    }

    // Setter para la razón social de la empresa
    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    // Getter para la dirección de la empresa
    public String getDireccion() {
        return direccion;
    }

    // Setter para la dirección de la empresa
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    // Getter para el CUIL de la empresa
    public String getCuil() {
        return cuil;
    }

    // Setter para el CUIL de la empresa
    public void setCuil(String cuil) {
        this.cuil = cuil;
    }

    // Método toString para mostrar la información de la empresa
    @Override
    public String toString() {
        return "Empresa{" +
                "razonSocial='" + razonSocial + '\'' +
                ", direccion='" + direccion + '\'' +
                ", cuil='" + cuil + '\'' +
                '}';
    }
}
