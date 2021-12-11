package controlador;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;


public class Modificador {
  public static void main(String[] args) { 
    
    int count=0;


    String datos[] = new String[49];

    Scanner sc =new Scanner(System.in);
    System.out.println("Trabajador a modificar: ");
    int modificar = sc.nextInt();sc.nextLine();


    try
    {
      FileWriter fw = new FileWriter("Editor.csv");
      BufferedWriter bw = new BufferedWriter(fw);
      PrintWriter salida = new PrintWriter(bw);

      datos[0]="ID Trabajador ";datos[1]=" Nombre "; datos[2]=" Apellido P. "; datos[3]=" Apellido M. ";
      datos[4]=" Antiguedad "; datos[5]=" Calle "; datos[6]=" Colonia "; datos[7]=" Municipio "; datos[8]=" Proyectos Vigentes "; datos[11]=" Proyectos Historicos ";

      salida.println(Arrays.toString(datos));


      FileReader fr = new FileReader("Trabajadores.csv");
      BufferedReader br = new BufferedReader(fr);
      String linea = br.readLine();

      while(count<modificar-1)
      {
        linea = br.readLine();
        salida.println(linea);

        count++;
      }

      if(count==modificar-1)
      {
        linea = br.readLine();

        System.out.println("Nombre: ");
        String n = sc.nextLine();sc.nextLine();
        System.out.println("Apellido Paterno: ");
        String aP = sc.nextLine();sc.nextLine();
        System.out.println("Apellido Materno: ");
        String aM = sc.nextLine();sc.nextLine();
        System.out.println("Antiguedad: ");
        String an = sc.nextLine();sc.nextLine();
        System.out.println("Calle: ");
        String ca = sc.nextLine();sc.nextLine();
        System.out.println("Colonia: ");
        String col = sc.nextLine();sc.nextLine();
        System.out.println("Municipio: ");
        String mun = sc.nextLine();sc.nextLine();

        datos[0]=String.valueOf(modificar); datos[1]=n; datos[2]=aP; datos[3]=aM; datos[4]=an; datos[5]=ca; datos[6]=col; datos[7]=mun;

        System.out.println("Numero de proyectos Vigentes: ");
        int numPV = sc.nextInt();sc.nextLine();
        for(int i=0;i<numPV;i++)
        {
          System.out.println(i+1);
          String pV = sc.nextLine();sc.nextLine();
          datos[i+8]=pV;
        }

        System.out.println("Numero de proyectos Historicos: ");
        int numPH = sc.nextInt();sc.nextLine();
        for(int j=0;j<numPH;j++)
        {
          System.out.println(j+1);
          String pH = sc.nextLine();sc.nextLine();
          datos[j+11]=pH;
        }

        salida.println(Arrays.toString(datos));
        count++;

        System.out.println("Trabajador modificado: \n\tNombre: "+ n +"\n\tApellido Paterno: " + aP +"\n\tApellido Materno: "+aM+"\n\tAntigüedad: "+an+"\n\tCalle: "+ca+"\n\tColonia: "+col+"\n\tMunicipio: "+mun+"\n\tProyectos Vigentes: "+numPV+"\n\tProyectos Historicos: "+numPH);

      }


      while(count>modificar-1 && count<100)
      {
        linea = br.readLine();
        salida.println(linea);

        count++;
      }

      salida.close();

    }catch(IOException ex){
      System.out.println(ex.getMessage());
    }
    

    try
    {
      FileWriter fw = new FileWriter("Trabajadores.csv");
      BufferedWriter bw = new BufferedWriter(fw);
      PrintWriter salida = new PrintWriter(bw);

      FileReader fr = new FileReader("Editor.csv");
      BufferedReader br = new BufferedReader(fr);

      for(int k=0;k<101;k++)
      {
        String linea = br.readLine();
        salida.println(linea);
      }
      salida.close();

    }catch(IOException ex){
      System.out.println(ex.getMessage());
    }

}
}