package clases;
import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="usuarios")//nombre de la tabla en la bd
public class Usuario implements Serializable{
  private static final long serialVersionUID = 1L;
  @Id@GeneratedValue
  private Long idUsuario;//id por ahora no lo uso
  private String usuario;
  private String contrase�a;
  
  
  
  public Usuario(String contrase�a,String usuario){
	  this.usuario=usuario;
	  this.contrase�a=contrase�a;
  }
  public Usuario(){
	  
  }
  public Long getId() {
	return idUsuario;
  }
  public void setId(Long id) {
	this.idUsuario = id;
  }
  public String getUsuario() {
	return usuario;
  }
  public void setUsuario(String usuario) {
	  this.usuario = usuario;
  }
  public String getContrase�a() {
	  return contrase�a;
  }
  public void setContrase�a(String contrase�a) {
	  this.contrase�a = contrase�a;
  }

}
