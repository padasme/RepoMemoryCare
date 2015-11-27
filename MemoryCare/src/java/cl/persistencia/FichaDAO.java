package cl.persistencia;

import java.sql.Connection;

public class FichaDAO {

    private Connection connection;

    public FichaDAO(Connection connection) {
        this.connection = connection;
    }
}
