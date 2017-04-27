package com.sigmeyc.entities;

import com.sigmeyc.entities.Rol;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-04-26T19:19:33")
@StaticMetamodel(Permiso.class)
public class Permiso_ { 

    public static volatile SingularAttribute<Permiso, String> descripcion;
    public static volatile SingularAttribute<Permiso, Integer> identificadorPermisos;
    public static volatile ListAttribute<Permiso, Rol> rolList;

}