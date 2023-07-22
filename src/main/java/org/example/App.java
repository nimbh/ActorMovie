package org.example;

import org.example.model.Actor;
import org.example.model.Movie;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {
        Configuration configuration = new Configuration()
                .addAnnotatedClass(Actor.class)
                .addAnnotatedClass(Movie.class);

        SessionFactory sessionFactory = configuration.buildSessionFactory();

        //try with resources
        try (sessionFactory){
            Session session = sessionFactory.getCurrentSession();
            session.beginTransaction();

            //cсоздание и добавление
//            Movie movie = new Movie("Sun day", 1993);
//            Actor a1 = new Actor("Jully Hopps", 35);
//            Actor a2 = new Actor("Stive Bobby", 39);
//
//            movie.setActors(new ArrayList<>(List.of(a1, a2)));
//
//            a1.setMovies(new ArrayList<>(Collections.singletonList(movie)));
//            a2.setMovies(new ArrayList<>(Collections.singletonList(movie)));
//
//            session.save(movie);
//            session.save(a1);
//            session.save(a2);

            //получить актеров фильма
//            Movie m = session.get(Movie.class,1);
//            System.out.println(m.getActors());

            //обавление фильма актеру
//            Movie movie = new Movie("Ugly dogs", 2001);
//            Actor a = session.get(Actor.class,2);
//
//            movie.setActors(new ArrayList<>(Collections.singleton(a)));
//            a.getMovies().add(movie);
//
//            session.save(movie);

            // удаление актера у фильма
//            Actor a = session.get(Actor.class,2);
//            System.out.println(a.getMovies());
//
//            Movie mRemove = a.getMovies().get(0);
//
//            a.getMovies().remove(0);
//            mRemove.getActors().remove(a);

            session.getTransaction().commit();
        }
    }
}
