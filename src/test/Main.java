package test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.FileWriter; // Import the FileWriter class
import java.io.IOException; // Import the IOException class to handle errors
import java.lang.reflect.Type;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import model.*;

public class Main {

	public static void main(String[] args) {

		// CREAMOS ALGUNOS LABORATORIOS
		Laboratorio laboratorio_Bayer = new Laboratorio(1);
		Laboratorio laboratorio_Nivea = new Laboratorio(2);
		Laboratorio laboratorio_Chanel = new Laboratorio(3);
		Laboratorio laboratorio_Roche = new Laboratorio(4);
		Laboratorio laboratorio_Pantene = new Laboratorio(5);
		Laboratorio laboratorio_Maybelline = new Laboratorio(6);
		Laboratorio laboratorio_3M = new Laboratorio(7);
		
		// CREAMOS ALGUNOS PRODUCTOS
		Producto paracetamol = new Producto(1, "Medicamento-Paracetamol", 1234, laboratorio_Bayer, false);
		Producto cremaFacial = new Producto(2, "Perfumería", 5678, laboratorio_Nivea, true);
		Producto perfume = new Producto(3, "Perfumería", 500, laboratorio_Chanel, true);
		Producto ibuprofeno = new Producto(4, "Medicamento-Ibuprofeno", 2468, laboratorio_Roche, false);
		Producto champu = new Producto(5, "Cuidado personal", 1357, laboratorio_Pantene, false);
		Producto maquillaje = new Producto(6, "Perfumería", 9999, laboratorio_Maybelline, true);
		Producto vendas = new Producto(7, "Equipo médico", 7777, laboratorio_3M, false);
		Producto locionCorporal = new Producto(8, "Cuidado personal", 8642, laboratorio_Nivea, false);

		// CREAMOS ALGUNOS CLIENTES
		Cliente cliente1 = new Cliente(11111111, "Gómez", "Juan", "afiliado-1", null,
				new Domicilio(1, "Calle 123", "12", "CABA"));
		Cliente cliente2 = new Cliente(22222222, "Pérez", "Ana", "afiliado-2", new ObraSocial(1, "OSDE"),
				new Domicilio(2, "Av. 456", "45", "La Plata"));

		// CREAMOS ALGUNOS EMPLEADOS
		Empleado empleado1 = new Empleado(33333333, "López", "María", "afiliado-3", 233333330,
				new ObraSocial(3, "PAMI"), new Domicilio(3, "Av. 789", "678", "Rosario"));
		Empleado empleado2 = new Empleado(44444444, "Fernández", "Carlos", "afiliado-4", 244444444,
				new ObraSocial(4, "Galeno"), new Domicilio(4, "Calle 456", "78", "CABA"));

		// CREAMOS UNA SUCURSAL CON SUS EMPLEADOS
		List<Empleado> empleadosSucursal = new ArrayList<Empleado>();
		empleadosSucursal.add(empleado1);
		empleadosSucursal.add(empleado2);
		Sucursal sucursal = new Sucursal(1, empleado1, empleadosSucursal);

		// CREAMOS UNA VENTA
		List<DetalleVenta> lstDetalleVenta = new ArrayList<DetalleVenta>();
		lstDetalleVenta.add(new DetalleVenta(paracetamol, 2, 150, 150 * 2));
		lstDetalleVenta.add(new DetalleVenta(cremaFacial, 1, 200, 200 * 2));
		Venta venta = new Venta("0001-00001234", LocalDate.now(), 500f, "FormaPago-TARJETA", empleado1, empleado2,
				sucursal, lstDetalleVenta);

		System.out.println("JSON VENTAS-----------------------------");
		Gson gson = new GsonBuilder().registerTypeAdapter(LocalDate.class, new LocalDateAdapter()).setPrettyPrinting().create();
		final String ventasJSON = gson.toJson(venta);
		System.out.println(ventasJSON);

		try {
			FileWriter myWriter = new FileWriter("ventas.json");
			myWriter.write(ventasJSON);
			myWriter.close();
			System.out.println("Successfully wrote to the file.");
		} catch (IOException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}

	}
	
	

}
