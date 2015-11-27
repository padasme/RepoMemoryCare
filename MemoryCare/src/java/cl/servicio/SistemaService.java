package cl.servicio;

import cl.dominio.Antecedente;
import cl.dominio.Tipo_antecedente;
import cl.persistencia.AntecedenteDAO;
import cl.persistencia.Tipo_antecedenteDAO;
import java.sql.Connection;
import java.util.List;

public class SistemaService {
    private AntecedenteDAO antecedenteDAO;
    private Tipo_antecedenteDAO tipo_antecedenteDAO;
    
    public SistemaService(Connection cnx){
        antecedenteDAO=new AntecedenteDAO(cnx);
        tipo_antecedenteDAO= new Tipo_antecedenteDAO(cnx);
    }        
    
    public List<Tipo_antecedente> ListarTipoAntecedente(){
        return tipo_antecedenteDAO.buscarTodos();
    }
    
    public List<Antecedente> ListarAntecedente(int id, char estado){
        return antecedenteDAO.buscarPorId(id, estado);
    }
    
    public void agregarAntecedente(Antecedente nuevoAntecedente) throws ServicioException{        
        Antecedente bd=antecedenteDAO.buscarPorDescripcion(nuevoAntecedente.getDescripcion(),nuevoAntecedente.getTipo_antecedente_id());
        if (bd != null) {
            throw new ServicioException("Ya existe antecedente con la descripción: "+nuevoAntecedente.getDescripcion());
        }
        antecedenteDAO.agregar(nuevoAntecedente);
    }
     
    public void cambioEstado(Antecedente antecedente){
        antecedenteDAO.actualizarEstado(antecedente);
    }
    
    public void modificarAntecedente(Antecedente antecedente){
        antecedenteDAO.modificar(antecedente);
    }
}
