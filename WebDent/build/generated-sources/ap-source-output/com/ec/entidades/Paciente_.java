package com.ec.entidades;

import com.ec.entidades.Cita;
import com.ec.entidades.HistoriaClinica;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-12-10T16:07:12")
@StaticMetamodel(Paciente.class)
public class Paciente_ { 

    public static volatile SingularAttribute<Paciente, Cita> idCita;
    public static volatile CollectionAttribute<Paciente, Cita> citaCollection;
    public static volatile SingularAttribute<Paciente, String> apellidosPaciente;
    public static volatile SingularAttribute<Paciente, String> tipoSangrePaciente;
    public static volatile SingularAttribute<Paciente, Integer> passwordPaciente;
    public static volatile SingularAttribute<Paciente, String> ciPaciente;
    public static volatile SingularAttribute<Paciente, Integer> idPaciente;
    public static volatile SingularAttribute<Paciente, String> emailPaciente;
    public static volatile SingularAttribute<Paciente, String> alergiasPaciente;
    public static volatile SingularAttribute<Paciente, String> nombresPaciente;
    public static volatile SingularAttribute<Paciente, HistoriaClinica> idHistoriaClinica;
    public static volatile SingularAttribute<Paciente, Date> telefonoFijoPaciente;
    public static volatile SingularAttribute<Paciente, Integer> celularPaciente;

}