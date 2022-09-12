package com.example.demo.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "cono", schema = "proyecto_software", catalog = "")
public class ConoEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_cono", nullable = false)
    private int idCono;
    @Basic
    @Column(name = "cantidad_Conos", nullable = true)
    private Integer cantidadConos;
    @Basic
    @Column(name = "precio", nullable = true)
    private Integer precio;
    @Basic
    @Column(name = "FK_id_helados", nullable = true)
    private Integer fkIdHelados;

    public int getIdCono() {
        return idCono;
    }

    public void setIdCono(int idCono) {
        this.idCono = idCono;
    }

    public Integer getCantidadConos() {
        return cantidadConos;
    }

    public void setCantidadConos(Integer cantidadConos) {
        this.cantidadConos = cantidadConos;
    }

    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    public Integer getFkIdHelados() {
        return fkIdHelados;
    }

    public void setFkIdHelados(Integer fkIdHelados) {
        this.fkIdHelados = fkIdHelados;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ConoEntity that = (ConoEntity) o;
        return idCono == that.idCono && Objects.equals(cantidadConos, that.cantidadConos) && Objects.equals(precio, that.precio) && Objects.equals(fkIdHelados, that.fkIdHelados);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idCono, cantidadConos, precio, fkIdHelados);
    }
}
