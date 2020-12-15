package fr.diginamic.json;

import java.util.List;

public class ParseJson {
	
	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {

		ObjectMapper mapper = new ObjectMapper();
		CollectionType collType = mapper.getTypeFactory().constructCollectionType(List.class, Societe.class);
		List<Societe> listeEntreprise = mapper.readValue(
				new File("/Users/moussa/Desktop/societe.json"), collType);

		
		Object listeSociete;
		for (Societe societe : listeSociete) {
			System.out.println(societe.getNom());
			for (Fondateurs maSociete : societe.getFondateurs()) {
				System.out.println(maSociete.getNom());
				System.out.println(maSociete.getPrenom());
				System.out.println(maSociete.getDateDeNaissance());
				System.out.println(maSociete.getLieux());
				
			}
			
			System.out.println(societe.getSiegeSocial());
			System.out.println(societe.getChiffreAffaire());	
			}

	}

}
