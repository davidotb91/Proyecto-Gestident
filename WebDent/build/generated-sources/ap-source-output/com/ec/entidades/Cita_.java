package com.ec.entidades;

import com.ec.entidades.Doctor;
import com.ec.entidades.Paciente;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-12-10T16:07:12")
@StaticMetamodel(Cita.class)
public class Cita_ { 

    public static volatile SingularAttribute<Cita, Integer> idCita;
    public static volatile SingularAttribute<Cita, Paciente> idPaciente;
    public static volatile SingularAttribute<Cita, Doctor> idDoctor;
    public static volatile SingularAttribute<Cita, Date> fechaCitaMedica;
    public static volatile SingularAttribute<Cita, String> codigoCitaMedica;
    public static volatile CollectionAttribute<Cita, Paciente> pacienteCollection;
    public static volatile SingularAttribute<Cita, Date> horaCitaMedica;

}