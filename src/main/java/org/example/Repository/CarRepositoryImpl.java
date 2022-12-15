package org.example.Repository;

import org.example.Model.Car;
import org.example.Util.SessionManager;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class CarRepositoryImpl implements CarRepository {

    @Override
    public Optional<Car> findById(int id) {
        try (Session session = SessionManager.getSessionFactory().openSession()) {
            return Optional.ofNullable(session.find(Car.class, id));
        } catch (Exception e) {
            e.printStackTrace();
            return Optional.empty();
        }
    }

    @Override
    public Optional<Car> findByIdAndLoadCars(int id) {
        try (Session session = SessionManager.getSessionFactory().openSession()) {
            Optional<Car> car = Optional.ofNullable(session.find(Car.class, id));
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
    public void create(Car car) {
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
    public void update(Car car) {
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
    public void delete(Car car) {
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
    public List<Car> findAll() {
        try (Session session = SessionManager.getSessionFactory().openSession()) {
            return session.createQuery("select e from Department e", Car.class).list();

        } catch (Exception e) {
            e.printStackTrace();
            return new ArrayList<>();
        }
    }
}
