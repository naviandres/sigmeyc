package com.sigmeyc.entities;

import com.sigmeyc.entities.Ciudad;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-04-26T19:19:33")
@StaticMetamodel(Localidad.class)
public class Localidad_ { 

    public static volatile SingularAttribute<Localidad, String> nombreLocalidad;
    public static volatile ListAttribute<Localidad, Ciudad> ciudadList;
    public static volatile SingularAttribute<Localidad, Integer> idLocalidad;

}