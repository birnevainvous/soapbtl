package entities;

import entities.Employee;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2022-05-12T21:00:51")
@StaticMetamodel(History.class)
public class History_ { 

    public static volatile SingularAttribute<History, Employee> workerId;
    public static volatile SingularAttribute<History, String> task;
    public static volatile SingularAttribute<History, Integer> totalTime;
    public static volatile SingularAttribute<History, String> project;
    public static volatile SingularAttribute<History, Date> startTime;
    public static volatile SingularAttribute<History, Integer> id;
    public static volatile SingularAttribute<History, Date> endTime;
    public static volatile SingularAttribute<History, Boolean> accept;

}