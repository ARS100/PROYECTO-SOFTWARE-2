package com.example.demo.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "carrito", schema = "proyecto_software", catalog = "")
public class CarritoEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_carrito", nullable = false)
    private int idCarrito;
    @Basic
    @Column(name = "costo", nullable = true)
    private Integer costo;
    @Basic
    @Column(name = "FK_id_cono", nullable = true)
    private Integer fkIdCono;
    @Basic
    @Column(name = "FK_id_usuario", nullable = true)
    private Integer fkIdUsuario;
    @Basic
    @Column(name = "FK_id_malteada", nullable = true)
    private Integer fkIdMalteada;

    public int getIdCarrito() {
        return idCarrito;
    }

    public void setIdCarrito(int idCarrito) {
        this.idCarrito = idCarrito;
    }

    public Integer getCosto() {
        return costo;
    }

    public void setCosto(Integer costo) {
        this.costo = costo;
    }

    public Integer getFkIdCono() {
        return fkIdCono;
    }

    public void setFkIdCono(Integer fkIdCono) {
        this.fkIdCono = fkIdCono;
    }

    public Integer getFkIdUsuario() {
        return fkIdUsuario;
    }

    public void setFkIdUsuario(Integer fkIdUsuario) {
        this.fkIdUsuario = fkIdUsuario;
    }

    public Integer getFkIdMalteada() {
        return fkIdMalteada;
    }

    public void setFkIdMalteada(Integer fkIdMalteada) {
        this.fkIdMalteada = fkIdMalteada;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CarritoEntity that = (CarritoEntity) o;
        return idCarrito == that.idCarrito && Objects.equals(costo, that.costo) && Objects.equals(fkIdCono, that.fkIdCono) && Objects.equals(fkIdUsuario, that.fkIdUsuario) && Objects.equals(fkIdMalteada, that.fkIdMalteada);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idCarrito, costo, fkIdCono, fkIdUsuario, fkIdMalteada);
    }
}
