package com.muahmmet.repository.impl;

import com.muahmmet.repository.UrunRepository;

import com.muahmmet.repository.entity.Urun;

/**
 * Bir interface nasýl miras alýnýr?
 * extends -> sýnýfýn sýnýftan miras almasýnda kullanýlýr. 
 *  NOT: bir interface de diðer bir interface e geniþleye bilir bu nedenle extends 
 *  interfaceler arasýnda da kullanýlabilir.
 * implements -> bir sýnýfýn bir interface i miras almasýnda kullanýlýr.
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
