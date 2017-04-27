package com.sigmeyc.entities;

import com.sigmeyc.entities.Vehiculo;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-04-26T19:19:33")
@StaticMetamodel(Conductor.class)
public class Conductor_ { 

    public static volatile SingularAttribute<Conductor, String> tipoLicencia;
    public static volatile SingularAttribute<Conductor, Vehiculo> vehiculosplacaVehiculo;
    public static volatile SingularAttribute<Conductor, Integer> identificacionConductor;

}