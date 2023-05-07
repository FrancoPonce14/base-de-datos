package test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import model.*;

public class Main {

	public static void main(String[] args) {
		
		// CREAMOS ALGUNOS LABORATORIOS
		Laboratorio laboratorio_Bayer = new Laboratorio(1);
		Laboratorio laboratorio_Nivea = new Laboratorio(2);
		Laboratorio laboratorio_Chanel = new Laboratorio(3);
		 // CREAMOS ALGUNOS PRODUCTOS
	    Producto paracetamol = new Producto(1,"Medicamento-Paracetamol",1234,laboratorio_Bayer, false);
	    Producto cremaFacial = new Producto(2,"Perfumería",5678,laboratorio_Nivea,true);
	    Producto perfume = new Producto(3,"Perfumería",500,laboratorio_Chanel,true);

	    // CREAMOS ALGUNOS CLIENTES
	    Cliente cliente1 = new Cliente(11111111,"Gómez", "Juan", "afiliado-1", null, new Domicilio(1,"Calle 123", "12", "CABA"));
	    Cliente cliente2 = new Cliente(22222222,"Pérez", "Ana", "afiliado-2", new ObraSocial(1,"OSDE"), new Domicilio(2,"Av. 456", "45", "La Plata"));

	    // CREAMOS ALGUNOS EMPLEADOS
	    Empleado empleado1 = new Empleado(33333333,"López", "María", "afiliado-3", 233333330, new ObraSocial(3,"PAMI"), new Domicilio(3,"Av. 789", "678", "Rosario"));
	    Empleado empleado2 = new Empleado(44444444,"Fernández", "Carlos", "afiliado-4", 244444444,new ObraSocial(4,"Galeno"), new Domicilio(4,"Calle 456", "78", "CABA"));

	    // CREAMOS UNA SUCURSAL CON SUS EMPLEADOS
	    List<Empleado> empleadosSucursal = new ArrayList<Empleado>();
	    empleadosSucursal.add(empleado1);
	    empleadosSucursal.add(empleado2);
	    Sucursal sucursal = new Sucursal(1, empleado1, empleadosSucursal);
	    
	    // CREAMOS UNA VENTA
	    List<DetalleVenta> lstDetalleVenta = new ArrayList<DetalleVenta>();
	    lstDetalleVenta.add(new DetalleVenta(paracetamol, 2, 150,150*2));
	    lstDetalleVenta.add(new DetalleVenta(cremaFacial, 1, 200,200*2));
	    Venta venta = new Venta("0001-00001234", LocalDate.now(), 500f, "FormaPago-TARJETA", empleado1, empleado2, sucursal, lstDetalleVenta);

	    
	    // TEST - CONSOLA - LOS TOSTRING EN LAS CLASES ESTAN SOLO PARA TESTEAR ESTO
	    System.out.println(laboratorio_Bayer.toString());
	    System.out.println(laboratorio_Nivea.toString());
	    System.out.println(laboratorio_Chanel.toString());
	    System.out.println(paracetamol.toString());
	    System.out.println(cremaFacial.toString());
	    System.out.println(perfume.toString());
	    System.out.println(cliente1.toString());
	    System.out.println(cliente2.toString());
	    System.out.println(empleado1.toString());
	    System.out.println(empleado2.toString());
	    System.out.println(venta.toString());
	    System.out.println(sucursal.toString());
	    

	}

}
