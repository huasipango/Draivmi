package interfaces;

import java.io.EOFException;
import java.util.*;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
public class Sistema {
	
	public void escribeFicheroAgencia()
    {
		 try
	        {
	            ObjectOutputStream oos = new ObjectOutputStream(
	                    new FileOutputStream("L:/agencia.dat"));
	            Agencia p = new Agencia(1001,"Agencia Latacunga");
	            oos.writeObject(p);
	            p = new Agencia(1001,"Agencia Latacunga");
	            oos.writeObject(p);
	            p = new Agencia(1002,"Agencia Ambato");
	            oos.writeObject(p);
	            p = new Agencia(1003,"Agencia Quito");
	            oos.writeObject(p);
	            p = new Agencia(1004,"Agencia Riobamba");
	            oos.writeObject(p);
	            p = new Agencia(1005,"Agencia Cuenca");
	            oos.writeObject(p);
	            oos.close();
	        } catch (Exception e)
	        {
	            e.printStackTrace();
	        }
    }
  	public void escribeFicheroGarage()
    {
		 try
	        {
	            ObjectOutputStream oos = new ObjectOutputStream(
	            new FileOutputStream("L:/garage.dat"));
	            Garage p = new Garage(2001,"Garage 1",10);
	            oos.writeObject(p);
	            p = new Garage(2002,"Garage 2",20);
	            oos.writeObject(p);
	            p = new Garage(2003,"Garage 3",30);
	            oos.writeObject(p);
	            p = new Garage(2004,"Garage 4",40);
	            oos.writeObject(p);
	            p = new Garage(2005,"Garage 5",50);
	            oos.writeObject(p);
	            oos.close();
	        } catch (Exception e)
	        {
	            e.printStackTrace();
	        }
    }
	public void escribeFicheroVehiculo()
    {
		 try
	        {
	            ObjectOutputStream oos = new ObjectOutputStream(
	            new FileOutputStream("L:/Vehiculo.dat"));
	            Vehiculo p = new Vehiculo(3001,"QWE-123","ROJO","Chevrolet",150,true,2002);
	            oos.writeObject(p);
	            p = new Vehiculo(3002,"ASD-123","BLANCO","Mazda",130,false,2004);
	            oos.writeObject(p);
	            p = new Vehiculo(3003,"ZXC-123","NEGRO","Vitara",170,true,2001);
	            oos.writeObject(p);
	            p = new Vehiculo(3004,"RTY-456","AZUL","Mercedes Benz",180,true,2003);
	            oos.writeObject(p);
	            p = new Vehiculo(3005,"FGH-456","GRIS","Ferrari",160,false,2002);
	            oos.writeObject(p);
	            oos.close();
	        } catch (Exception e)
	        {
	            e.printStackTrace();
	        }
    }
	public void escribeFicheroCliente()
    {
		 try
	        {
	            ObjectOutputStream oos = new ObjectOutputStream(
	            new FileOutputStream("L:/Cliente.dat"));
	    Cliente p = new Cliente(4001,"Juan Lopez","1805436728","Santo Domingo","045678893","afiliado");
	            oos.writeObject(p);
	            p = new Cliente(4002,"Carlos Sanchez","1456786728","Latacunga","345621393","no afiliado");
	            oos.writeObject(p);
	            p = new Cliente(4003,"Hernan Murillo","1800987628","Ambato","0678764893","no afiliado");
	            oos.writeObject(p);
	            p = new Cliente(4004,"Jipson Perez","0987636728","Quito","089987653","afiliado");
	            oos.writeObject(p);
	            p = new Cliente(4005,"Hitler Camaro","1234566728","Latacunga","089987693","afiliado");
	            oos.writeObject(p);
	            oos.close();
	        } catch (Exception e)
	        {
	            e.printStackTrace();
	        }
    }
	public void escribeFicheroUsuario()
    {
		 try
	        {
	            ObjectOutputStream oos = new ObjectOutputStream(
	            new FileOutputStream("L:/Usuario.dat"));
	            Usuario p = new Usuario(4001,"Juan Lopez","1805436728","Santo Domingo","045678893","pepito123","jesusesamor","Vendedor",354);
	            oos.writeObject(p);
	            oos.close();
	        } catch (Exception e)
	        {
	            e.printStackTrace();
	        }
    }
	
	public Vector leeFicheroAgencia()
    {

        Vector v = new Vector(15,2);
        try
        {
            // Se crea un ObjectInputStream
            ObjectInputStream ois = new ObjectInputStream(
                    new FileInputStream("L:/agencia.dat"));
            
            // Se lee el primer objeto
            Object aux = ois.readObject();
            v.addElement(aux);
            // Mientras haya objetos
            while (aux!=null)
            {
                if (aux instanceof Agencia)
                aux = ois.readObject();
                v.addElement(aux);
            }
            ois.close();
        }
        catch (EOFException e1)
        {
            System.out.println ("Agencias cargadas");
        }
        catch (Exception e2)
        {
            e2.printStackTrace();
        }
        return v;
    }
	public Vector leeFicheroGarage()
    {

        Vector v = new Vector(15,2);
        try
        {
            // Se crea un ObjectInputStream
            ObjectInputStream ois = new ObjectInputStream(
                    new FileInputStream("L:/garage.dat"));
            
            // Se lee el primer objeto
            Object aux = ois.readObject();
            v.addElement(aux);
            // Mientras haya objetos
            while (aux!=null)
            {
                if (aux instanceof Garage)
                aux = ois.readObject();
                v.addElement(aux);
            }
            ois.close();
        }
        catch (EOFException e1)
        {
            System.out.println ("Garages cargadas");
        }
        catch (Exception e2)
        {
            e2.printStackTrace();
        }
        return v;
    }
	public Vector leeFicheroVehiculo()
    {

        Vector v = new Vector(15,2);
        try
        {
            // Se crea un ObjectInputStream
            ObjectInputStream ois = new ObjectInputStream(
                    new FileInputStream("L:/Vehiculo.dat"));
            
            // Se lee el primer objeto
            Object aux = ois.readObject();
            v.addElement(aux);
            // Mientras haya objetos
            while (aux!=null)
            {
                if (aux instanceof Vehiculo)
                aux = ois.readObject();
                v.addElement(aux);
            }
            ois.close();
        }
        catch (EOFException e1)
        {
            System.out.println ("Vehiculos Cargados");
        }
        catch (Exception e2)
        {
            e2.printStackTrace();
        }
        return v;
    }
	public Vector leeFicheroCliente()
    {

        Vector v = new Vector(15,2);
        try
        {
            // Se crea un ObjectInputStream
            ObjectInputStream ois = new ObjectInputStream(
                    new FileInputStream("L:/Cliente.dat"));
            
            // Se lee el primer objeto
            Object aux = ois.readObject();
            v.addElement(aux);
            // Mientras haya objetos
            while (aux!=null)
            {
                if (aux instanceof Cliente)
                aux = ois.readObject();
                v.addElement(aux);
            }
            ois.close();
        }
        catch (EOFException e1)
        {
            System.out.println ("Clientes Cargados");
        }
        catch (Exception e2)
        {
            e2.printStackTrace();
        }
        return v;
    }
	public Vector leeFicheroUsuario()
    {

        Vector v = new Vector(15,2);
        try
        {
            // Se crea un ObjectInputStream
            ObjectInputStream ois = new ObjectInputStream(
                    new FileInputStream("L:/Usuario.dat"));
            
            // Se lee el primer objeto
            Object aux = ois.readObject();
            v.addElement(aux);
            // Mientras haya objetos
            while (aux!=null)
            {
                if (aux instanceof Usuario)
                aux = ois.readObject();
                v.addElement(aux);
            }
            ois.close();
        }
        catch (EOFException e1)
        {
            System.out.println ("Usuario Cargado");
        }
        catch (Exception e2)
        {
            e2.printStackTrace();
        }
        return v;
    }
}
