package com.itf.schulung.gitintro;

import java.util.ArrayList;
import java.util.List;

public class MusicPieceDatabase {

//	public void musicHinfuegen(List<MusicPiece> list) {
//
//		System.out.println(list);
//
//	}
	
	List<MusicPiece> list = new ArrayList<MusicPiece>();
	
	public void musicHinfuegen(MusicPiece music) {
		
		list.add(music);
	}

	public void ListPrint() {
		
		for (MusicPiece music: list)

		System.out.println(list);
		
		

	}
}
