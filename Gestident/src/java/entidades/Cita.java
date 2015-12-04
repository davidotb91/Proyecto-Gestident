/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
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
@Table(name = "cita")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Cita.findAll", query = "SELECT c FROM Cita c"),
    @NamedQuery(name = "Cita.findByIdCita", query = "SELECT c FROM Cita c WHERE c.idCita = :idCita"),
    @NamedQuery(name = "Cita.findByFechaCitaMedica", query = "SELECT c FROM Cita c WHERE c.fechaCitaMedica = :fechaCitaMedica"),
    @NamedQuery(name = "Cita.findByHoraCitaMedica", query = "SELECT c FROM Cita c WHERE c.horaCitaMedica = :horaCitaMedica"),
    @NamedQuery(name = "Cita.findByCodigoCitaMedica", query = "SELECT c FROM Cita c WHERE c.codigoCitaMedica = :codigoCitaMedica")})
public class Cita implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_CITA")
    private Integer idCita;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FECHA_CITA_MEDICA")
    @Temporal(TemporalType.DATE)
    private Date fechaCitaMedica;
    @Basic(optional = false)
    @NotNull
    @Column(name = "HORA_CITA_MEDICA")
    @Temporal(TemporalType.TIME)
    private Date horaCitaMedica;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "CODIGO_CITA_MEDICA")
    private String codigoCitaMedica;
    @OneToMany(mappedBy = "idCita")
    private List<Paciente> pacienteList;
    @JoinColumn(name = "ID_DOCTOR", referencedColumnName = "ID_DOCTOR")
    @ManyToOne
    private Doctor idDoctor;
    @JoinColumn(name = "ID_PACIENTE", referencedColumnName = "ID_PACIENTE")
    @ManyToOne
    private Paciente idPaciente;

    public Cita() {
    }

    public Cita(Integer idCita) {
        this.idCita = idCita;
    }

    public Cita(Integer idCita, Date fechaCitaMedica, Date horaCitaMedica, String codigoCitaMedica) {
        this.idCita = idCita;
        this.fechaCitaMedica = fechaCitaMedica;
        this.horaCitaMedica = horaCitaMedica;
        this.codigoCitaMedica = codigoCitaMedica;
    }

    public Integer getIdCita() {
        return idCita;
    }

    public void setIdCita(Integer idCita) {
        this.idCita = idCita;
    }

    public Date getFechaCitaMedica() {
        return fechaCitaMedica;
    }

    public void setFechaCitaMedica(Date fechaCitaMedica) {
        this.fechaCitaMedica = fechaCitaMedica;
    }

    public Date getHoraCitaMedica() {
        return horaCitaMedica;
    }

    public void setHoraCitaMedica(Date horaCitaMedica) {
        this.horaCitaMedica = horaCitaMedica;
    }

    public String getCodigoCitaMedica() {
        return codigoCitaMedica;
    }

    public void setCodigoCitaMedica(String codigoCitaMedica) {
        this.codigoCitaMedica = codigoCitaMedica;
    }

    @XmlTransient
    public List<Paciente> getPacienteList() {
        return pacienteList;
    }

    public void setPacienteList(List<Paciente> pacienteList) {
        this.pacienteList = pacienteList;
    }

    public Doctor getIdDoctor() {
        return idDoctor;
    }

    public void setIdDoctor(Doctor idDoctor) {
        this.idDoctor = idDoctor;
    }

    public Paciente getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(Paciente idPaciente) {
        this.idPaciente = idPaciente;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCita != null ? idCita.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cita)) {
            return false;
        }
        Cita other = (Cita) object;
        if ((this.idCita == null && other.idCita != null) || (this.idCita != null && !this.idCita.equals(other.idCita))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.Cita[ idCita=" + idCita + " ]";
    }
    
}
