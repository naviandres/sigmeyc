package com.sigmeyc.entities;

import com.sigmeyc.entities.Permiso;
import com.sigmeyc.entities.Usuario;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-04-26T19:19:33")
@StaticMetamodel(Rol.class)
public class Rol_ { 

    public static volatile ListAttribute<Rol, Usuario> usuarioList;
    public static volatile SingularAttribute<Rol, String> nombreRol;
    public static volatile SingularAttribute<Rol, String> detalleRol;
    public static volatile SingularAttribute<Rol, Integer> identificadorRol;
    public static volatile ListAttribute<Rol, Permiso> permisoList;

}