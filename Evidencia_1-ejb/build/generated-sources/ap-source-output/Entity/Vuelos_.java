package Entity;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-05-02T11:35:16")
@StaticMetamodel(Vuelos.class)
public class Vuelos_ { 

    public static volatile SingularAttribute<Vuelos, Date> horaFin;
    public static volatile SingularAttribute<Vuelos, Integer> numeroPasajeros;
    public static volatile SingularAttribute<Vuelos, Date> fechaInicio;
    public static volatile SingularAttribute<Vuelos, Integer> id;
    public static volatile SingularAttribute<Vuelos, String> origen;
    public static volatile SingularAttribute<Vuelos, String> destino;
    public static volatile SingularAttribute<Vuelos, String> numeroAvion;
    public static volatile SingularAttribute<Vuelos, Date> fechaFin;
    public static volatile SingularAttribute<Vuelos, Date> horaInicio;
    public static volatile SingularAttribute<Vuelos, String> numeroVuelo;

}