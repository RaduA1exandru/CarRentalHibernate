package org.example.Util;

import org.example.Model.Branch;
import org.example.Model.Cars;

import org.example.Model.Customer;
import org.example.Model.Employee;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SessionManager extends AbstractSessionManager {
    private static final SessionManager INSTANCE = new SessionManager();

    private SessionManager() {
    }

    public static SessionFactory getSessionFactory() {
        return INSTANCE.getSessionFactory("car_rental");
    }

    public static void shutdown() {
        INSTANCE.shutdownSessionManager();
    }

    @Override
    protected void setAnnotatedClasses(Configuration configuration) {
        // add classes from model here
        configuration.addAnnotatedClass(Cars.class);
        configuration.addAnnotatedClass(Branch.class);
        configuration.addAnnotatedClass(Customer.class);
        configuration.addAnnotatedClass(Employee.class);
    }
}
