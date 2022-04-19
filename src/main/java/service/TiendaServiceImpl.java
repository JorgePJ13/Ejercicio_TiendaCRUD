package service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import model.Tienda;

@Service
public class TiendaServiceImpl implements TiendaService {
	static ArrayList<Tienda> productos = new ArrayList<>(List.of(new Tienda("vino", "alimentación", 8.4, 25),
			new Tienda("leche", "alimentación", 1.2, 70), new Tienda("cable usb", "informática", 5.6, 30),
			new Tienda("arroz", "alimentación", 3.1, 16), new Tienda("silla", "hogar", 30.6, 10),
			new Tienda("monitor", "informática", 125.0, 5), new Tienda("escritorio", "hogar", 230, 4)));

	public TiendaServiceImpl() {

	}

	@Override
	public void alta(Tienda t) {
		productos.add(t);
	}

	@Override
	public void modificarPrecio(String nomProducto, double precio) {
		productos.forEach(t-> {
			if (t.getNombre().equals(nomProducto)) {
				t.setPrecio(precio);
			}
		});
	}

	@Override
	public void baja(String nomProducto) {
//		productos.forEach((t) -> {
//			if (t.getNombre().equals(nomProducto)) {
//				productos.remove(t);
//			}
//		});
		productos.removeIf(p->p.getNombre().equals(nomProducto)); // mejor removeIf
	}

	@Override
	public List<Tienda> buscar(String seccion) {
		return productos.stream().filter(p -> p.getSeccion().equals(seccion)).collect(Collectors.toList());
	}

}
