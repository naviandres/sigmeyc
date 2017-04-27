package com.sigmeyc.entities;

import com.sigmeyc.entities.Ciudad;
import com.sigmeyc.entities.Mercancia;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-04-26T19:19:33")
@StaticMetamodel(Departamento.class)
public class Departamento_ { 

    public static volatile SingularAttribute<Departamento, Integer> idDepartamento;
    public static volatile SingularAttribute<Departamento, Ciudad> ciudadesIdciudades;
    public static volatile SingularAttribute<Departamento, String> nombreDepartamento;
    public static volatile ListAttribute<Departamento, Mercancia> mercanciaList;

}