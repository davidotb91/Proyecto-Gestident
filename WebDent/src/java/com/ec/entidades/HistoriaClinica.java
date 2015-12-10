/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ec.entidades;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author angel
 */
@Entity
@Table(name = "historia_clinica")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "HistoriaClinica.findAll", query = "SELECT h FROM HistoriaClinica h"),
    @NamedQuery(name = "HistoriaClinica.findByIdHistoriaClinica", query = "SELECT h FROM HistoriaClinica h WHERE h.idHistoriaClinica = :idHistoriaClinica"),
    @NamedQuery(name = "HistoriaClinica.findByFechaHistoriaClinica", query = "SELECT h FROM HistoriaClinica h WHERE h.fechaHistoriaClinica = :fechaHistoriaClinica"),
    @NamedQuery(name = "HistoriaClinica.findByMotivoHistoriaClinica", query = "SELECT h FROM HistoriaClinica h WHERE h.motivoHistoriaClinica = :motivoHistoriaClinica"),
    @NamedQuery(name = "HistoriaClinica.findByNumHistoriaClinica", query = "SELECT h FROM HistoriaClinica h WHERE h.numHistoriaClinica = :numHistoriaClinica"),
    @NamedQuery(name = "HistoriaClinica.findByCodicoHistoriaClinica", query = "SELECT h FROM HistoriaClinica h WHERE h.codicoHistoriaClinica = :codicoHistoriaClinica"),
    @NamedQuery(name = "HistoriaClinica.findByRegistroDentalFichaDental", query = "SELECT h FROM HistoriaClinica h WHERE h.registroDentalFichaDental = :registroDentalFichaDental"),
    @NamedQuery(name = "HistoriaClinica.findByDiagnosticoFichaDental", query = "SELECT h FROM HistoriaClinica h WHERE h.diagnosticoFichaDental = :diagnosticoFichaDental")})
public class HistoriaClinica implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_HISTORIA_CLINICA")
    private Integer idHistoriaClinica;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FECHA_HISTORIA_CLINICA")
    @Temporal(TemporalType.DATE)
    private Date fechaHistoriaClinica;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "MOTIVO_HISTORIA_CLINICA")
    private String motivoHistoriaClinica;
    @Basic(optional = false)
    @NotNull
    @Column(name = "NUM_HISTORIA_CLINICA")
    private int numHistoriaClinica;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "CODICO_HISTORIA_CLINICA")
    private String codicoHistoriaClinica;
    @Size(max = 20)
    @Column(name = "REGISTRO_DENTAL_FICHA_DENTAL")
    private String registroDentalFichaDental;
    @Size(max = 250)
    @Column(name = "DIAGNOSTICO_FICHA_DENTAL")
    private String diagnosticoFichaDental;
    @OneToMany(mappedBy = "idHistoriaClinica")
    private Collection<FichaClinica> fichaClinicaCollection;
    @OneToMany(mappedBy = "idHistoriaClinica")
    private Collection<Paciente> pacienteCollection;
    @JoinColumn(name = "ID_DOCTOR", referencedColumnName = "ID_DOCTOR")
    @ManyToOne
    private Doctor idDoctor;
    @JoinColumn(name = "ID_FICHA_CLINICA", referencedColumnName = "ID_FICHA_CLINICA")
    @ManyToOne
    private FichaClinica idFichaClinica;

    public HistoriaClinica() {
    }

    public HistoriaClinica(Integer idHistoriaClinica) {
        this.idHistoriaClinica = idHistoriaClinica;
    }

    public HistoriaClinica(Integer idHistoriaClinica, Date fechaHistoriaClinica, String motivoHistoriaClinica, int numHistoriaClinica, String codicoHistoriaClinica) {
        this.idHistoriaClinica = idHistoriaClinica;
        this.fechaHistoriaClinica = fechaHistoriaClinica;
        this.motivoHistoriaClinica = motivoHistoriaClinica;
        this.numHistoriaClinica = numHistoriaClinica;
        this.codicoHistoriaClinica = codicoHistoriaClinica;
    }

    public Integer getIdHistoriaClinica() {
        return idHistoriaClinica;
    }

    public void setIdHistoriaClinica(Integer idHistoriaClinica) {
        this.idHistoriaClinica = idHistoriaClinica;
    }

    public Date getFechaHistoriaClinica() {
        return fechaHistoriaClinica;
    }

    public void setFechaHistoriaClinica(Date fechaHistoriaClinica) {
        this.fechaHistoriaClinica = fechaHistoriaClinica;
    }

    public String getMotivoHistoriaClinica() {
        return motivoHistoriaClinica;
    }

    public void setMotivoHistoriaClinica(String motivoHistoriaClinica) {
        this.motivoHistoriaClinica = motivoHistoriaClinica;
    }

    public int getNumHistoriaClinica() {
        return numHistoriaClinica;
    }

    public void setNumHistoriaClinica(int numHistoriaClinica) {
        this.numHistoriaClinica = numHistoriaClinica;
    }

    public String getCodicoHistoriaClinica() {
        return codicoHistoriaClinica;
    }

    public void setCodicoHistoriaClinica(String codicoHistoriaClinica) {
        this.codicoHistoriaClinica = codicoHistoriaClinica;
    }

    public String getRegistroDentalFichaDental() {
        return registroDentalFichaDental;
    }

    public void setRegistroDentalFichaDental(String registroDentalFichaDental) {
        this.registroDentalFichaDental = registroDentalFichaDental;
    }

    public String getDiagnosticoFichaDental() {
        return diagnosticoFichaDental;
    }

    public void setDiagnosticoFichaDental(String diagnosticoFichaDental) {
        this.diagnosticoFichaDental = diagnosticoFichaDental;
    }

    @XmlTransient
    public Collection<FichaClinica> getFichaClinicaCollection() {
        return fichaClinicaCollection;
    }

    public void setFichaClinicaCollection(Collection<FichaClinica> fichaClinicaCollection) {
        this.fichaClinicaCollection = fichaClinicaCollection;
    }

    @XmlTransient
    public Collection<Paciente> getPacienteCollection() {
        return pacienteCollection;
    }

    public void setPacienteCollection(Collection<Paciente> pacienteCollection) {
        this.pacienteCollection = pacienteCollection;
    }

    public Doctor getIdDoctor() {
        return idDoctor;
    }

    public void setIdDoctor(Doctor idDoctor) {
        this.idDoctor = idDoctor;
    }

    public FichaClinica getIdFichaClinica() {
        return idFichaClinica;
    }

    public void setIdFichaClinica(FichaClinica idFichaClinica) {
        this.idFichaClinica = idFichaClinica;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idHistoriaClinica != null ? idHistoriaClinica.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof HistoriaClinica)) {
            return false;
        }
        HistoriaClinica other = (HistoriaClinica) object;
        if ((this.idHistoriaClinica == null && other.idHistoriaClinica != null) || (this.idHistoriaClinica != null && !this.idHistoriaClinica.equals(other.idHistoriaClinica))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ec.entidades.HistoriaClinica[ idHistoriaClinica=" + idHistoriaClinica + " ]";
    }
    
}
