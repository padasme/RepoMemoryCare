package cl.persistencia;

import java.sql.Connection;

public class Usuario_grupoDAO {

    private Connection connection;

    public Usuario_grupoDAO(Connection connection) {
        this.connection = connection;
    }
}
