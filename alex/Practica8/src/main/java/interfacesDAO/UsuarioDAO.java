package interfacesDAO;

import clases.Usuario;

public interface UsuarioDAO {//operaciones que implementan los usuarios

	public Usuario encontrarUsuario(String contrase�a,String usuario);
	
}
