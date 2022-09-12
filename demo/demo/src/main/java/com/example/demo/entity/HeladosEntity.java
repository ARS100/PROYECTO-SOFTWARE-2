package com.example.demo.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "helados", schema = "proyecto_software", catalog = "")
public class HeladosEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_helado", nullable = false)
    private int idHelado;
    @Basic
    @Column(name = "nombre_Helado", nullable = true, length = 20)
    private String nombreHelado;
    @Basic
    @Column(name = "tipo_Helado", nullable = true, length = 20)
    private String tipoHelado;
    @Basic
    @Column(name = "costo_Helado", nullable = true)
    private Integer costoHelado;

    public int getIdHelado() {
        return idHelado;
    }

    public void setIdHelado(int idHelado) {
        this.idHelado = idHelado;
    }

    public String getNombreHelado() {
        return nombreHelado;
    }

    public void setNombreHelado(String nombreHelado) {
        this.nombreHelado = nombreHelado;
    }

    public String getTipoHelado() {
        return tipoHelado;
    }

    public void setTipoHelado(String tipoHelado) {
        this.tipoHelado = tipoHelado;
    }

    public Integer getCostoHelado() {
        return costoHelado;
    }

    public void setCostoHelado(Integer costoHelado) {
        this.costoHelado = costoHelado;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HeladosEntity that = (HeladosEntity) o;
        return idHelado == that.idHelado && Objects.equals(nombreHelado, that.nombreHelado) && Objects.equals(tipoHelado, that.tipoHelado) && Objects.equals(costoHelado, that.costoHelado);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idHelado, nombreHelado, tipoHelado, costoHelado);
    }
}
