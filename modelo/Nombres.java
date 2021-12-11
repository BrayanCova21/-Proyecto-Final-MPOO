package modelo;

public class Nombres
{
  private String[] nombres = {"Victoria", "Alexander", "Renata", "Mateo", "Sofia", "Santiago", "Valeria", "Daniel", "Maria Jose", "Sebastian", "Maria Fernanda", "Miguel Angel",
 "Valentina", "Leonardo", "Ximena", "Diego", "Regina", "Matias", "Camila", "Emiliano"};

  private String[] apellidos = {"Garcia",	"Gonzalez", "Rodriguez", "Fernandez", "Lopez", "Martinez", "Sanchez", "Perez", "Gomez", "Jimenez", "Ruiz", "Hernandez", "Diaz","Munoz", "Alvarez",	"Romero", "Gutierrez", "Navarro", "Torres", "Dominguez"}; 

  public Nombres(){}

  public Nombres(String[] nombres, String[] apellidos)
  {
    this.nombres = nombres;
    this.apellidos = apellidos;
  }

  public void setNombres(String[] nombres)
  {
    this.nombres = nombres;
  }
  
  public String[] getNombres()
  {
    return nombres;
  }

  public void setApellidos(String[] apellidos)
  {
    this.apellidos = apellidos;
  }
  
  public String[] getApellidos()
  {
    return apellidos;
  }
}