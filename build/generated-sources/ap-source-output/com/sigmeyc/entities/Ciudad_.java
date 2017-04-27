package com.sigmeyc.entities;

import com.sigmeyc.entities.Departamento;
import com.sigmeyc.entities.Localidad;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-04-26T19:19:33")
@StaticMetamodel(Ciudad.class)
public class Ciudad_ { 

    public static volatile SingularAttribute<Ciudad, String> zona;
    public static volatile ListAttribute<Ciudad, Departamento> departamentoList;
    public static volatile SingularAttribute<Ciudad, Localidad> localidadidLocalidad;
    public static volatile SingularAttribute<Ciudad, String> nombreCiudad;
    public static volatile SingularAttribute<Ciudad, Integer> idCiudades;

}