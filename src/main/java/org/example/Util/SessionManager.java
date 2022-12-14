package org.example.Util;

import org.example.Model.*;

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
        configuration.addAnnotatedClass(Loan.class);
        configuration.addAnnotatedClass(Refund.class);
        configuration.addAnnotatedClass(Reservation.class);
    }
}
