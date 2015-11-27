/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entitis;

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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author david
 */
@Entity
@Table(name = "ficha_clinica")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "FichaClinica.findAll", query = "SELECT f FROM FichaClinica f"),
    @NamedQuery(name = "FichaClinica.findByIdFichaClinica", query = "SELECT f FROM FichaClinica f WHERE f.idFichaClinica = :idFichaClinica"),
    @NamedQuery(name = "FichaClinica.findByFechaFichaClinica", query = "SELECT f FROM FichaClinica f WHERE f.fechaFichaClinica = :fechaFichaClinica"),
    @NamedQuery(name = "FichaClinica.findByNumFichaClinica", query = "SELECT f FROM FichaClinica f WHERE f.numFichaClinica = :numFichaClinica")})
public class FichaClinica implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_FICHA_CLINICA")
    private Integer idFichaClinica;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FECHA_FICHA_CLINICA")
    @Temporal(TemporalType.DATE)
    private Date fechaFichaClinica;
    @Basic(optional = false)
    @NotNull
    @Column(name = "NUM_FICHA_CLINICA")
    private int numFichaClinica;
    @JoinColumn(name = "ID_HISTORIA_CLINICA", referencedColumnName = "ID_HISTORIA_CLINICA")
    @ManyToOne
    private HistoriaClinica idHistoriaClinica;
    @OneToMany(mappedBy = "idFichaClinica")
    private Collection<HistoriaClinica> historiaClinicaCollection;

    public FichaClinica() {
    }

    public FichaClinica(Integer idFichaClinica) {
        this.idFichaClinica = idFichaClinica;
    }

    public FichaClinica(Integer idFichaClinica, Date fechaFichaClinica, int numFichaClinica) {
        this.idFichaClinica = idFichaClinica;
        this.fechaFichaClinica = fechaFichaClinica;
        this.numFichaClinica = numFichaClinica;
    }

    public Integer getIdFichaClinica() {
        return idFichaClinica;
    }

    public void setIdFichaClinica(Integer idFichaClinica) {
        this.idFichaClinica = idFichaClinica;
    }

    public Date getFechaFichaClinica() {
        return fechaFichaClinica;
    }

    public void setFechaFichaClinica(Date fechaFichaClinica) {
        this.fechaFichaClinica = fechaFichaClinica;
    }

    public int getNumFichaClinica() {
        return numFichaClinica;
    }

    public void setNumFichaClinica(int numFichaClinica) {
        this.numFichaClinica = numFichaClinica;
    }

    public HistoriaClinica getIdHistoriaClinica() {
        return idHistoriaClinica;
    }

    public void setIdHistoriaClinica(HistoriaClinica idHistoriaClinica) {
        this.idHistoriaClinica = idHistoriaClinica;
    }

    @XmlTransient
    public Collection<HistoriaClinica> getHistoriaClinicaCollection() {
        return historiaClinicaCollection;
    }

    public void setHistoriaClinicaCollection(Collection<HistoriaClinica> historiaClinicaCollection) {
        this.historiaClinicaCollection = historiaClinicaCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idFichaClinica != null ? idFichaClinica.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof FichaClinica)) {
            return false;
        }
        FichaClinica other = (FichaClinica) object;
        if ((this.idFichaClinica == null && other.idFichaClinica != null) || (this.idFichaClinica != null && !this.idFichaClinica.equals(other.idFichaClinica))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entitis.FichaClinica[ idFichaClinica=" + idFichaClinica + " ]";
    }
    
}
