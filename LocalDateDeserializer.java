package fr.diginamic.json;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;


public class LocalDateDeserializer extends StdDeserializer<LocalDate> {
	
	protected LocalDateDeserializer() {
		super(LocalDate.class);
	}


	@Override
	public LocalDate deserialize(JsonParser p, DeserializationContext ctxt)
			throws IOException, JsonProcessingException {
		String dateString = p.readValueAs(String.class);
		return LocalDate.parse(dateString, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
	}
	

}
