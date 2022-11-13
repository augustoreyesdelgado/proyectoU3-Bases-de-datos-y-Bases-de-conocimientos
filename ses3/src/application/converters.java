package application;

import javafx.util.StringConverter;

public class converters {

}

class PrevioticConverter extends StringConverter<Previotic>{

	@Override
	public String toString(Previotic object) {
		// TODO Auto-generated method stub
		return object.getName();
	}

	@Override
	public Previotic fromString(String string) {
		// TODO Auto-generated method stub
		return null;
	}
	
}