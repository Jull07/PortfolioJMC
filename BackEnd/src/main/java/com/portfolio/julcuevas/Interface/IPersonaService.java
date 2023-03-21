package com.portfolio.julcuevas.Interface;

import com.portfolio.julcuevas.Entity.Persona;
import java.util.List;

public interface IPersonaService {
    //Traer una lista de personas
    public List<Persona> getPersona();
    
    //Guardar obj de tipo persona
    public void savePersona(Persona persona);
    
    //Eliminar un obj pero buscamos por ID
    public void deletePersona(Long Id);
    
    //Buscar persona por id
    
    public Persona findPersona(Long Id);
}
