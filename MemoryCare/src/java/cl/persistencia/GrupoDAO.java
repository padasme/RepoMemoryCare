package cl.persistencia;

import java.sql.Connection;

public class GrupoDAO {

    private Connection connection;

    public GrupoDAO(Connection connection) {
        this.connection = connection;
    }
}
