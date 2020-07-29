package FactoryMethod;

public class MenuFactory {
	public static Menu createMenu (TipoMenu tipo) {
		switch (tipo) {
		case ORIGINAL: {
			return new MenuOriginal();
		}
		case VEGGIE:{
			return new MenuVeggie();
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + tipo);
		}
	}
}
