package com.sigmeyc.entities;

import com.sigmeyc.entities.Mercancia;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-04-26T19:19:33")
@StaticMetamodel(Novedad.class)
public class Novedad_ { 

    public static volatile SingularAttribute<Novedad, String> descripcion;
    public static volatile SingularAttribute<Novedad, String> tipoNovedad;
    public static volatile SingularAttribute<Novedad, Integer> codigoNovedad;
    public static volatile SingularAttribute<Novedad, String> prioridad;
    public static volatile SingularAttribute<Novedad, Mercancia> mercanciascodigoMercancia;
    public static volatile SingularAttribute<Novedad, String> detalle;

}