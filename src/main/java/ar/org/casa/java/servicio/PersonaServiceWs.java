package ar.org.casa.java.servicio;

import ar.org.casa.java.domain.Persona;
import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface PersonaServiceWs {
    
    @WebMethod
    public List<Persona> listarPersonas();
}
