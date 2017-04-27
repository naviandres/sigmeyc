package com.sigmeyc.entities;

import com.sigmeyc.entities.Mercancia;
import com.sigmeyc.entities.Usuario;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-04-26T19:19:33")
@StaticMetamodel(Solicitud.class)
public class Solicitud_ { 

    public static volatile SingularAttribute<Solicitud, String> telefonoDestinatario;
    public static volatile SingularAttribute<Solicitud, String> tipoServicio;
    public static volatile SingularAttribute<Solicitud, Date> fechaSolicitud;
    public static volatile SingularAttribute<Solicitud, String> direcciónDestino;
    public static volatile SingularAttribute<Solicitud, String> prioridad;
    public static volatile SingularAttribute<Solicitud, Usuario> usuarioscodigoUsuario;
    public static volatile SingularAttribute<Solicitud, String> nombreDestinatario;
    public static volatile SingularAttribute<Solicitud, String> tiempoEntrega;
    public static volatile SingularAttribute<Solicitud, String> apellidoDestinatario;
    public static volatile SingularAttribute<Solicitud, Date> fechaEntrega;
    public static volatile SingularAttribute<Solicitud, String> origenDeMercancia;
    public static volatile SingularAttribute<Solicitud, Integer> codigoSolicitud;
    public static volatile SingularAttribute<Solicitud, String> ciudadDestino;
    public static volatile ListAttribute<Solicitud, Mercancia> mercanciaList;

}