
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		   
		        // Crear categorías
		        Categoria cat1 = new Categoria(1, "Electrónica");
		        Categoria cat2 = new Categoria(2, "Ropa");

		        // Crear productos
		        Producto p1 = new Producto(1, "Auriculares", 15.00, 30.00, cat1);
		        p1.setCantidadMax(100);
		        p1.setCantidadMin(5);

		        Producto p2 = new Producto(2, "Camiseta", 5.00, 12.00, cat2);
		        p2.setCantidadMax(200);
		        p2.setCantidadMin(10);

		        // Crear cliente
		        Cliente cliente = new Cliente(1, "Juan Pérez", "7777-1234");
		        cliente.setDireccion("Avenida Principal, Sonzacate");

		        // Crear empleado
		        Empleado empleado = new Empleado(1, "María López", "Vendedora");
		        empleado.setFechaIngreso("2023-01-15");
		        empleado.setHorarioEntrada("08:00");
		        empleado.setHorarioSalida("17:00");

		        // Crear venta
		        Venta venta = new Venta(1, "2026-06-15", cliente, empleado);

		        // Agregar detalles
		        DetalleVenta det1 = new DetalleVenta(1, 2, p1);
		        DetalleVenta det2 = new DetalleVenta(2, 3, p2);
		        venta.agregarDetalle(det1);
		        venta.agregarDetalle(det2);

		        // Mostrar resultados
		        System.out.println("=== SISTEMA DE VENTAS ===");
		        System.out.println("\n-- Categorías --");
		        System.out.println(cat1);
		        System.out.println(cat2);

		        System.out.println("\n-- Productos --");
		        System.out.println(p1);
		        System.out.println(p2);

		        System.out.println("\n-- Cliente --");
		        System.out.println(cliente);

		        System.out.println("\n-- Empleado --");
		        System.out.println(empleado);

		        System.out.println("\n-- Venta --");
		        System.out.println(venta);

		        System.out.println("\n-- Detalles de Venta --");
		        for (DetalleVenta d : venta.getDetalles()) {
		            System.out.println(d);
		        }

		        System.out.println("\nTOTAL DE LA VENTA: $" + venta.calcularTotal());
		    }
		}


