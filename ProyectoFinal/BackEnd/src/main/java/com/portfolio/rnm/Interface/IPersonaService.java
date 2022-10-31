package com.portfolio.rnm.Interface;

import com.portfolio.rnm.Entity.Persona;
import java.util.List;

public interface IPersonaService {
    //Traer lista de personas
    public List<Persona> getPersona ();
    //Guardar un objeto de tipo persona
    public void savePersona (Persona, persona)
   //Eliminar objeto y buscarlo por ID
    public void deletePersona (Long id);
    //Buscar un persona por ID
    public Persona findPersona (Long id);   
}
