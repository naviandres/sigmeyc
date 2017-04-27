package com.sigmeyc.entities;

import com.sigmeyc.entities.Guia;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-04-26T19:19:33")
@StaticMetamodel(Planilla.class)
public class Planilla_ { 

    public static volatile SingularAttribute<Planilla, String> descripcion;
    public static volatile SingularAttribute<Planilla, String> ruta;
    public static volatile SingularAttribute<Planilla, Integer> cantidadGuias;
    public static volatile SingularAttribute<Planilla, Integer> codigoPlanilla;
    public static volatile ListAttribute<Planilla, Guia> guiaList;

}