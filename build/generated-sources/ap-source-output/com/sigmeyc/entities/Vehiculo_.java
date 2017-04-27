package com.sigmeyc.entities;

import com.sigmeyc.entities.Conductor;
import com.sigmeyc.entities.Mercancia;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-04-26T19:19:33")
@StaticMetamodel(Vehiculo.class)
public class Vehiculo_ { 

    public static volatile SingularAttribute<Vehiculo, String> marca;
    public static volatile SingularAttribute<Vehiculo, Integer> placaVehiculo;
    public static volatile SingularAttribute<Vehiculo, String> estadoVehiculo;
    public static volatile SingularAttribute<Vehiculo, String> tipoVehiculo;
    public static volatile SingularAttribute<Vehiculo, String> capacidadCarga;
    public static volatile ListAttribute<Vehiculo, Conductor> conductorList;
    public static volatile SingularAttribute<Vehiculo, String> modelo;
    public static volatile ListAttribute<Vehiculo, Mercancia> mercanciaList;

}