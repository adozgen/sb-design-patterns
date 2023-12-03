package com.adozgen.sbdesignpatterns.abstractfactory;

import com.adozgen.sbdesignpatterns.abstractfactory.example.DatabaseClient;
import com.adozgen.sbdesignpatterns.abstractfactory.example.DatabaseServiceFactory;
import com.adozgen.sbdesignpatterns.abstractfactory.example.NoSQLServiceFactory;
import com.adozgen.sbdesignpatterns.abstractfactory.example.SQLServiceFactory;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

@Component
public class AbstractFactoryTestCreator {

    public DatabaseClient createDatabaseClient(DatabaseServiceFactory factory) {
        return new DatabaseClient(factory);
    }


    @PostConstruct
    public void init() {
        //sql
        DatabaseClient databaseClient1 = new DatabaseClient(new SQLServiceFactory());
        databaseClient1.performDatabaseOperations();

        //No sql
        DatabaseClient databaseClient2 = new DatabaseClient(new NoSQLServiceFactory());
        databaseClient2.performDatabaseOperations();

    }

}
