package com.sigmeyc.entities;

import com.sigmeyc.entities.Departamento;
import com.sigmeyc.entities.Guia;
import com.sigmeyc.entities.Novedad;
import com.sigmeyc.entities.Solicitud;
import com.sigmeyc.entities.Vehiculo;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-04-26T19:19:33")
@StaticMetamodel(Mercancia.class)
public class Mercancia_ { 

    public static volatile SingularAttribute<Mercancia, Double> peso;
    public static volatile SingularAttribute<Mercancia, Double> volumen;
    public static volatile SingularAttribute<Mercancia, Solicitud> solicitudescodigoSolicitud;
    public static volatile SingularAttribute<Mercancia, Departamento> departamentosIddepartamento;
    public static volatile ListAttribute<Mercancia, Novedad> novedadList;
    public static volatile SingularAttribute<Mercancia, Double> longitud;
    public static volatile SingularAttribute<Mercancia, Integer> codigoMercancia;
    public static volatile SingularAttribute<Mercancia, Double> altura;
    public static volatile SingularAttribute<Mercancia, String> embalaje;
    public static volatile SingularAttribute<Mercancia, Double> ancho;
    public static volatile SingularAttribute<Mercancia, Double> valorDeclarado;
    public static volatile SingularAttribute<Mercancia, Vehiculo> vehiculosplacaVehiculo;
    public static volatile SingularAttribute<Mercancia, Integer> cantidad;
    public static volatile SingularAttribute<Mercancia, Guia> guiacodigoBarras;
    public static volatile SingularAttribute<Mercancia, String> tipoMercancia;

}