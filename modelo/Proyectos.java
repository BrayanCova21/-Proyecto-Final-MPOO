package modelo;

public class Proyectos
{
  private String proyectosHistoricos[] = {"Urban Rigger - Residencias Flotantes para Estudiantes", "Wheelys 247 - Una Tienda de Conveniencia sin Empleados", "CycleWash - Una Innovadora Lavadora para Bicicletas", "Ulmer Nest - Refugios Inteligentes para Personas sin Hogar", "Time Off - El Reloj que elimina la Ansiedad digital", "Walkcar - El Vehículo Electrico que tiene el Tamaño de una Laptop", "Creator - El Robot que Fabrica Hamburguesas", "Bios - El Servicio que te Convierte en un Árbol Despues de Morir", "Mirror - El Gimnasio que cabe en un Espejo", "BVG Adidas - Los Sneakers que te dan Acceso Ilimitado al Transporte Publico", "Urban Cultivator - El Gadget que te Permite Crecer Hierbas en tu Cocina", "Aim - La Primer Generacion de Hospitales Ambulantes y Autonomos", "Sodapop - La Bocina que Convierte Botellas de Plastico en Amplificadores", "Zipline - Una Flotilla de Drones Transportadores de Sangre y Medicinas", "Twinkind - La Startup que te Inmortaliza en una Estatuilla", "Brewbot - La Maquina que te Permite Hacer tu Propia Cerveza en Casa", "PAL-V - El Auto Urbano que Vuela", "YouWho - El Kit que Revela tu Pasado a traves de la Saliva", "Cafe X - Una Cafeteria Completamente Automatizada", "Nuro - El Vehiculo que Entregara tus Compras", "Precious Plastic - Un Proyecto en Busca de que Todos Podamos Reciclar", "Proteon - La Maquina Expendedora que Prepara tu Shake de Proteina", "Infarm - Una Granja Techada", "O Wind - La Turbina que te Permite Generar Electricidad", "Mimica - Las Etiquetas Inteligentes que Reducen el Desperdicio de Alimentos", "Mashambas - El Rascacielos que Planea Alimentar a todo un Pueblo en Africa", "Tikku - El Edificio que Cabe en un Cajon de Estacionamiento", "Base - Una Cabina para Transportar a tu Mascota", "Lilium - proyecto que Convertir los Techos de la Ciudad en Aeropuertos", "Piestro - El Robot que Prepara Pizzas en 3 Minutos", "Eli - El Micro Vehículo que Va a Transformar la Movilidad Urbana","Plenty - La Startup que Crece Vegetales en Pequeños Espacios Techados", "At Skin - El Gagdet que Convierte tu Smartphone en Escaner de Piel", "Othalo - El Proyecto que Quiere Construir Comunidades de Plastico", "The Tyre Collective - El Dispositivo que Elimina la Contaminación de las Llantas", "Petit Pli - Ropa Infantil que Crece Junto con tus Hijos", "Microbial Home - Una Cocina que Funciona con Desperdicios Organicos", "Project Circleg - La Startup que crea Protesis Accesibles y Ecologicas", "AIRO - El Vehiculo que Limpia la Contaminacion de Otros Autos"};


  private String proyectosVigentes[] = {"Aura - La Sofisticada Computadora que no Tiene Monitor", "Robomart - El Supermercado Autonomo que Llega hasta tu Casa", "Mom - La Incubadora Economica que Salvara 1 Millon de Vidas", "Virtual Tours - Una Agencia de Turismo Virtual", "Senco - Un Innovador y Disruptivo Casco para Bomberos", "Bandi - El Robot que se Convertira en tu Guia Turistico", "SafetyNet - La Red que Salvara a Millones de Peces", "Magic Leap - Un Revolucionario Gadget de Realidad Mixta", "Gentlewasher - La Lavadora Portatil que No Utiliza Electricidad", "Loop - Un Transportador de Agua para Regiones en Desarrollo"};


  public Proyectos(){}

  public Proyectos(String[] proyectosHistoricos, String[] proyectosVigentes)
  {
    this.proyectosHistoricos = proyectosHistoricos;
    this.proyectosVigentes = proyectosVigentes;
  }

  public String[] getProyectosHistoricos()
  {
    return proyectosHistoricos;
  }

  public void setProyectosHistoricos(String[] proyectosHistoricos)
  {
    this.proyectosHistoricos = proyectosHistoricos;
  }

  public String[] getProyectosVigentes()
  {
    return proyectosVigentes;
  }

  public void setProyectosVigentes(String[] proyectosVigentes)
  {
    this.proyectosVigentes = proyectosVigentes;
  }

}