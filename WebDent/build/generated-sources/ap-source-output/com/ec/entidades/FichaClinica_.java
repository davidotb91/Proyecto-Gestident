package com.ec.entidades;

import com.ec.entidades.HistoriaClinica;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-12-10T16:07:12")
@StaticMetamodel(FichaClinica.class)
public class FichaClinica_ { 

    public static volatile CollectionAttribute<FichaClinica, HistoriaClinica> historiaClinicaCollection;
    public static volatile SingularAttribute<FichaClinica, HistoriaClinica> idHistoriaClinica;
    public static volatile SingularAttribute<FichaClinica, Integer> numFichaClinica;
    public static volatile SingularAttribute<FichaClinica, Integer> idFichaClinica;
    public static volatile SingularAttribute<FichaClinica, Date> fechaFichaClinica;

}