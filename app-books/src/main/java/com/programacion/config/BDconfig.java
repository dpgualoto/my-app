package com.programacion.config;

import com.zaxxer.hikari.HikariDataSource;
import io.helidon.config.Config;
import io.helidon.dbclient.DbClient;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Produces;

@ApplicationScoped
public class BDconfig {


    @ApplicationScoped
    @Produces
    public DbClient dbClient(){
        Config config = Config.create();
        DbClient dbClient = DbClient.builder().config(config.get("db")).build();
        return dbClient;
    }
}
