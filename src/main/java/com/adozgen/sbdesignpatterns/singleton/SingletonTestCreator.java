package com.adozgen.sbdesignpatterns.singleton;

import com.adozgen.sbdesignpatterns.singleton.example2.DatabaseConnectionPool;
import com.adozgen.sbdesignpatterns.singleton.example1.SingletonExample;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

import java.sql.Connection;

@Component
public class SingletonTestCreator {
    public SingletonExample createSingleton(){
        return SingletonExample.getInstance();
    }

    public DatabaseConnectionPool createDatabaseConnectionPool(){
        return DatabaseConnectionPool.getInstance();
    }

    @PostConstruct
    public void init() {
        //example1 test
        SingletonExample singletonExample1 = createSingleton();
        SingletonExample singletonExample2 = createSingleton();
        System.out.println(singletonExample1.hashCode());
        System.out.println(singletonExample2.hashCode());
        if (singletonExample1 == singletonExample2){
            System.out.println("SingletonExample1 and SingletonExample2 are the same instance");
        } else {
            System.out.println("SingletonExample1 and SingletonExample2 are different instances");
        }
        //example2 test
        DatabaseConnectionPool databaseConnectionPool = createDatabaseConnectionPool();
        Connection connection = databaseConnectionPool.getConnection();
        int maxConnection = databaseConnectionPool.getMaxConnections();
        System.out.println("Max Connection: " + maxConnection); //Sonuç: 9
        databaseConnectionPool.releaseConnection(connection);
        maxConnection = databaseConnectionPool.getMaxConnections();
        System.out.println("Max Connection: " + maxConnection); // Sonuç 10
    }

}
