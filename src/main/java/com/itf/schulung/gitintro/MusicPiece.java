package com.itf.schulung.gitintro;

public class MusicPiece {

	double Länge;
	String Titel;
	String Autornamen;

	public MusicPiece(double länge, String titel, String autornamen) {

		Länge = länge;
		Titel = titel;
		Autornamen = autornamen;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		return sb.append("MusicPiece: Länge=").append(this.Länge).append(" Titel=").append(this.Titel)
				.append(" Autornamen=").append(this.Autornamen).toString();

	}

}
