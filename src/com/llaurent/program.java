package com.llaurent;

import java.io.File;

public class program {

	public static void main(String[] args) {
		// C'est trop puissant !
		try {
			File.createTempFile("", null);
		} catch (Exception erreur) {
			erreur.printStackTrace();
		}

	}

}
