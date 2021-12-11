package controlador;
import modelo.Nombres;
import modelo.Proyectos;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Arrays;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.PrintWriter;

public class Trabajador {
  public static void main(String[] args) { 

    int count=0, id=1;
    String datos[] = new String[49];
    
    Nombres nom = new Nombres();
    Proyectos proy = new Proyectos();
    System.out.printf("%-5s | %-15s  %-15s  %-15s | %-12s | %n","Id","Nombre","Apellido P.","Apellido M.","Edad");


    try
    {
      FileWriter fw = new FileWriter("Trabajadores.csv");
      BufferedWriter bw = new BufferedWriter(fw);
      PrintWriter salida = new PrintWriter(bw);

      datos[0]="ID Trabajador ";datos[1]=" Nombre "; datos[2]=" Apellido M. "; datos[3]=" Apellido P. ";
      datos[4]=" Antiguedad "; datos[5]=" Calle "; datos[6]=" Colonia "; datos[7]=" Municipio "; datos[8]=" Proyectos Vigentes "; datos[11]=" Proyectos Historicos ";

      salida.println(Arrays.toString(datos));


      for(int i=0;i<100;i++)
      {
        datos = new String[datos.length];

        int a = (int) (Math.random() * 20);
        int b = (int) (Math.random() * 20);
        int c = (int) (Math.random() * 40 + 1);
        int d = (int) (Math.random() *489);

        System.out.printf("%-5s | %-15s  %-15s  %-15s | %-12s | %n",id,nom.getNombres()[a],nom.getApellidos()[a],nom.getApellidos()[b],c);
        datos[0] = String.valueOf(id); 
        id++;
        datos[1] = nom.getNombres()[a];
        datos[2] = nom.getApellidos()[a]; 
        datos[3] = nom.getApellidos()[b]; 
        datos[4] = String.valueOf(c); 

        try
        {
          FileReader fr = new FileReader("direcciones.csv");
          BufferedReader br = new BufferedReader(fr);
          while(count<=d)
          {
            String linea = br.readLine();
            count++;
            if(count==d)
            {
              datos[5] = linea;
              String datosDireccion[] = linea.split(","); 
              String calle = datosDireccion[0];
              String colonia = datosDireccion[1];
              String municipio = datosDireccion[2];
              System.out.println("Direccion: "+calle+" "+colonia+" "+municipio);
              datosDireccion=null; 
            }
          }
          count=0;
        }
        catch(FileNotFoundException ex)
        {
          System.out.println(ex.getMessage());
        }
        catch(IOException ex)
        {
          System.out.println(ex.getMessage());
        }


        int e = (int) (Math.random() * 3 + 1);
        int f = (int) (Math.random() *41);
        int numProyect = e+f;

        System.out.println("Numero total de Proyectos: "+numProyect);
        System.out.println("Proyectos Vigentes: "+e);
        for(int j=0;j<e;j++)
        {
          int g = (int) (Math.random() * 9);
          System.out.println("\t"+proy.getProyectosVigentes()[g]);
          datos[j+6] = proy.getProyectosVigentes()[g]; 
        }

        System.out.println("Proyectos Historicos: "+f);
        for(int k=0;k<f;k++)
        {
          int h = (int) (Math.random() * 39);
          System.out.println("\t"+proy.getProyectosHistoricos()[h]);
          datos[k+9] = proy.getProyectosHistoricos()[h]; 
        }      

        System.out.println("\n\n");
        
        salida.println(Arrays.toString(datos));
      }
      salida.close();
    }
    catch(IOException ex)
    {
      System.out.println(ex.getMessage());
    }
 
  
}
}