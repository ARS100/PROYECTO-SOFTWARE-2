package com.example.demo.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "malteadas", schema = "proyecto_software", catalog = "")
public class MalteadasEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_malteada", nullable = false)
    private int idMalteada;
    @Basic
    @Column(name = "tipo_Malteada", nullable = true, length = 15)
    private String tipoMalteada;
    @Basic
    @Column(name = "nombre_Malteada", nullable = true, length = 15)
    private String nombreMalteada;

    public int getIdMalteada() {
        return idMalteada;
    }

    public void setIdMalteada(int idMalteada) {
        this.idMalteada = idMalteada;
    }

    public String getTipoMalteada() {
        return tipoMalteada;
    }

    public void setTipoMalteada(String tipoMalteada) {
        this.tipoMalteada = tipoMalteada;
    }

    public String getNombreMalteada() {
        return nombreMalteada;
    }

    public void setNombreMalteada(String nombreMalteada) {
        this.nombreMalteada = nombreMalteada;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MalteadasEntity that = (MalteadasEntity) o;
        return idMalteada == that.idMalteada && Objects.equals(tipoMalteada, that.tipoMalteada) && Objects.equals(nombreMalteada, that.nombreMalteada);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idMalteada, tipoMalteada, nombreMalteada);
    }
}
