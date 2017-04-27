package com.sigmeyc.entities;

import com.sigmeyc.entities.Rol;
import com.sigmeyc.entities.Solicitud;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-04-26T19:19:33")
@StaticMetamodel(Usuario.class)
public class Usuario_ { 

    public static volatile SingularAttribute<Usuario, String> segundoNombre;
    public static volatile SingularAttribute<Usuario, String> clave;
    public static volatile SingularAttribute<Usuario, String> primerNombre;
    public static volatile SingularAttribute<Usuario, String> primerApellido;
    public static volatile SingularAttribute<Usuario, String> tipoIdentificacion;
    public static volatile SingularAttribute<Usuario, String> segundoApellido;
    public static volatile ListAttribute<Usuario, Rol> rolList;
    public static volatile ListAttribute<Usuario, Solicitud> solicitudList;
    public static volatile SingularAttribute<Usuario, String> razonSocial;
    public static volatile SingularAttribute<Usuario, Integer> codigoUsuario;
    public static volatile SingularAttribute<Usuario, String> celular;
    public static volatile SingularAttribute<Usuario, String> telefono;
    public static volatile SingularAttribute<Usuario, String> email;

}