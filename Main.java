/**
* @autor Equipo B
*/

import java.util.Scanner;
import controlador.Modificador;
import controlador.Trabajador;


public class Main 
{
  public static void main(String[] args) 
  {
    int a=1,b=1,c=1,resp1=0,resp2=0,resp3=0;

    Scanner sc =new Scanner(System.in);
    
   
    while(c==1)
    {
      System.out.print("\033\143");
      System.out.println("\t\tBIENVENIDO");
      System.out.println("\nSeleccione su puesto\n\t1.Trabajador\n\t2.Recursos Humanos\n\n\t3.Salir");
      resp1 = sc.nextInt();sc.nextLine();


      if(resp1==1)
      {
        System.out.print("\033\143");
        while(a==1)
        {
          System.out.println("Seleccione accion a realizar\n\t1.Imprimir lista de Trabajadores\n\t2.Salir");
          resp2 = sc.nextInt();sc.nextLine();
          if(resp2==1)
          {
            Trabajador.main(args);
          }
          if(resp2==2)
            a=2;
        }
      }


      if(resp1==2)
      {
        System.out.print("\033\143");
        while(b==1)
        {
          System.out.println("Seleccione accion a realizar\n\t1.Imprimir lista de Trabajadores\n\t2.Modificar Registros\n\t3.Salir");
          resp3 = sc.nextInt();sc.nextLine();
          if(resp3==1)
          {
            Trabajador.main(args);
          }
          if(resp3==2)
          {
            Modificador.main(args);
          }
          if(resp3==3)
            b=2;
        }

      }

      if(resp1==3)
        c=2;
    }


  }
}