package cl.dominio;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

/**
 * Clase que mapea la tabla Ficha
 */
public class Ficha implements Serializable {

    private String nombre;
    private String ap_paterno;
    private String ap_materno;
    private Date fecha_nac;
    private char sexo;
    private String actividad;
    private char estado_civil;
    private String telefono;
    private String direccion;
    private String ciudad;
    private int usuario_rut;

    public Ficha() {
    }

    public Ficha(String nombre, String ap_paterno, String ap_materno, Date fecha_nac, char sexo, String actividad, char estado_civil, String telefono, String direccion, String ciudad, int usuario_rut) {
        this.nombre = nombre;
        this.ap_paterno = ap_paterno;
        this.ap_materno = ap_materno;
        this.fecha_nac = fecha_nac;
        this.sexo = sexo;
        this.actividad = actividad;
        this.estado_civil = estado_civil;
        this.telefono = telefono;
        this.direccion = direccion;
        this.ciudad = ciudad;
        this.usuario_rut = usuario_rut;
    }
    
    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the ap_paterno
     */
    public String getAp_paterno() {
        return ap_paterno;
    }

    /**
     * @param ap_paterno the ap_paterno to set
     */
    public void setAp_paterno(String ap_paterno) {
        this.ap_paterno = ap_paterno;
    }

    /**
     * @return the ap_materno
     */
    public String getAp_materno() {
        return ap_materno;
    }

    /**
     * @param ap_materno the ap_materno to set
     */
    public void setAp_materno(String ap_materno) {
        this.ap_materno = ap_materno;
    }

    /**
     * @return the fecha_nac
     */
    public Date getFecha_nac() {
        return fecha_nac;
    }

    /**
     * @param fecha_nac the fecha_nac to set
     */
    public void setFecha_nac(Date fecha_nac) {
        this.fecha_nac = fecha_nac;
    }

    /**
     * @return the sexo
     */
    public char getSexo() {
        return sexo;
    }

    /**
     * @param sexo the sexo to set
     */
    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    /**
     * @return the actividad
     */
    public String getActividad() {
        return actividad;
    }

    /**
     * @param actividad the actividad to set
     */
    public void setActividad(String actividad) {
        this.actividad = actividad;
    }

    /**
     * @return the estado_civil
     */
    public char getEstado_civil() {
        return estado_civil;
    }

    /**
     * @param estado_civil the estado_civil to set
     */
    public void setEstado_civil(char estado_civil) {
        this.estado_civil = estado_civil;
    }

    /**
     * @return the telefono
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * @param telefono the telefono to set
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /**
     * @return the direccion
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * @param direccion the direccion to set
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * @return the ciudad
     */
    public String getCiudad() {
        return ciudad;
    }

    /**
     * @param ciudad the ciudad to set
     */
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    /**
     * @return the usuario_rut
     */
    public int getUsuario_rut() {
        return usuario_rut;
    }

    /**
     * @param usuario_rut the usuario_rut to set
     */
    public void setUsuario_rut(int usuario_rut) {
        this.usuario_rut = usuario_rut;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.nombre);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Ficha other = (Ficha) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        return true;
    }

}
