package ar.com.codoacodo.repository;
import java.util.List;

import ar.com.codoacodo.entity.Orador;
public class MainOradorRepository {

	public static void main(String[] args) {
		OradorRepository repository = new MySqlOradorRepository();
		//DELETE
		repository.delete(11L);
		
	  /* Orador orador = repository.getById(4L);
		
		orador.setId(null);
		orador.setNombre("cacho");
		orador.setMail("otroemail@mail.com");
		orador.setId(4L);
		repository.update(orador);
		
		System.out.println(orador);
		
		lista todos
		
		
		List<Orador> oradores = repository.findAll();

        oradores.forEach(orador -> System.out.println(orador));
        
        */

	}

}
