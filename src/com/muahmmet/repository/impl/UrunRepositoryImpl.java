package com.muahmmet.repository.impl;

import com.muahmmet.repository.UrunRepository;

import com.muahmmet.repository.entity.Urun;

/**
 * Bir interface nas�l miras al�n�r?
 * extends -> s�n�f�n s�n�ftan miras almas�nda kullan�l�r. 
 *  NOT: bir interface de di�er bir interface e geni�leye bilir bu nedenle extends 
 *  interfaceler aras�nda da kullan�labilir.
 * implements -> bir s�n�f�n bir interface i miras almas�nda kullan�l�r.
 * @author MuhammetAli
 *
 */
public class UrunRepositoryImpl implements UrunRepository {


	public void Kaydet(String ad) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void Kaydet() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public boolean Duzenle() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void Sil() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Listele() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Ara() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public boolean Guncelle(Object o) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public Urun getUrun(long id) {
		// TODO Auto-generated method stub
		return null;
	}


	
}
