package org.example.Repository;

import org.example.Model.Cars;
import org.example.Util.SessionManager;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class CarRepositoryImpl implements CarRepository {

    @Override
    public Optional<Cars> findById(int id) {
        try (Session session = SessionManager.getSessionFactory().openSession()) {
            return Optional.ofNullable(session.find(Cars.class, id));
        } catch (Exception e) {
            e.printStackTrace();
            return Optional.empty();
        }
    }

    @Override
    public Optional<Cars> findByIdAndLoadCars(int id) {
        try (Session session = SessionManager.getSessionFactory().openSession()) {
            Optional<Cars> car = Optional.ofNullable(session.find(Cars.class, id));
            if (car.isPresent()) {
                System.out.println(car.get().getCarId());
            }
            return car;
        } catch (Exception e) {
            e.printStackTrace();
            return Optional.empty();
        }
    }

    @Override
    public void create(Cars car) {
        Transaction transaction = null;
        try (Session session = SessionManager.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();

            session.save(car);

            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

    @Override
    public void update(Cars car) {
        Transaction transaction = null;
        try (Session session = SessionManager.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();

            session.update(car);

            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

    @Override
    public void delete(Cars car) {
        Transaction transaction = null;
        try (Session session = SessionManager.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();

            session.delete(car);

            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

    @Override
    public List<Cars> findAll() {
        try (Session session = SessionManager.getSessionFactory().openSession()) {
            return session.createQuery("select c from Cars c", Cars.class).list();

        } catch (Exception e) {
            e.printStackTrace();
            return new ArrayList<>();
        }
    }
}
