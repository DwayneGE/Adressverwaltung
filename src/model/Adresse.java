package model;

public class Adresse {

	private int id = -1;
	
	private String vorname;
	
	private String nachname;
	
	private String strasse;
	
	private String hausnummer;
	
	private String plz;
	
	private String ort;
	
	
	public Adresse () {
		super();
	}

	public Adresse (String vorname, String nachname, String strasse, String hausnummer, String plz, String ort) {
		this.vorname = vorname;
		this.nachname = nachname;
		this.hausnummer = hausnummer;
		this.plz = plz;
		this.ort = ort;
	}
	
	public int getId() {
		return id;
	}
	
}
