package entities;

import entities.Employee;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2022-05-12T21:00:51")
@StaticMetamodel(Timesheet.class)
public class Timesheet_ { 

    public static volatile SingularAttribute<Timesheet, Employee> workerId;
    public static volatile SingularAttribute<Timesheet, String> task;
    public static volatile SingularAttribute<Timesheet, Integer> totalTime;
    public static volatile SingularAttribute<Timesheet, String> project;
    public static volatile SingularAttribute<Timesheet, Date> startTime;
    public static volatile SingularAttribute<Timesheet, Integer> id;
    public static volatile SingularAttribute<Timesheet, Date> endTime;

}