package com.sigmeyc.entities;

import com.sigmeyc.entities.Mercancia;
import com.sigmeyc.entities.Planilla;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-04-26T19:19:33")
@StaticMetamodel(Guia.class)
public class Guia_ { 

    public static volatile SingularAttribute<Guia, String> direccionDeEnvio;
    public static volatile SingularAttribute<Guia, String> conductorAsignado;
    public static volatile SingularAttribute<Guia, String> serial;
    public static volatile SingularAttribute<Guia, String> vehiculoDesignado;
    public static volatile SingularAttribute<Guia, Integer> codigoBarras;
    public static volatile SingularAttribute<Guia, String> detalleMercancia;
    public static volatile ListAttribute<Guia, Mercancia> mercanciaList;
    public static volatile SingularAttribute<Guia, Planilla> planillascodigoPlanilla1;

}