package com.ec.entidades;

import com.ec.entidades.Doctor;
import com.ec.entidades.FichaClinica;
import com.ec.entidades.Paciente;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-12-10T16:07:12")
@StaticMetamodel(HistoriaClinica.class)
public class HistoriaClinica_ { 

    public static volatile SingularAttribute<HistoriaClinica, String> registroDentalFichaDental;
    public static volatile SingularAttribute<HistoriaClinica, Doctor> idDoctor;
    public static volatile SingularAttribute<HistoriaClinica, String> codicoHistoriaClinica;
    public static volatile SingularAttribute<HistoriaClinica, Date> fechaHistoriaClinica;
    public static volatile SingularAttribute<HistoriaClinica, String> motivoHistoriaClinica;
    public static volatile SingularAttribute<HistoriaClinica, Integer> idHistoriaClinica;
    public static volatile SingularAttribute<HistoriaClinica, Integer> numHistoriaClinica;
    public static volatile CollectionAttribute<HistoriaClinica, Paciente> pacienteCollection;
    public static volatile SingularAttribute<HistoriaClinica, String> diagnosticoFichaDental;
    public static volatile CollectionAttribute<HistoriaClinica, FichaClinica> fichaClinicaCollection;
    public static volatile SingularAttribute<HistoriaClinica, FichaClinica> idFichaClinica;

}