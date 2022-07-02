package com.muahmmet.repository;



public interface Repository {
	public void Kaydet();
	public boolean Duzenle();
	public void Sil();
	public void Listele();
	public void Ara();
	public boolean Guncelle(Object o);

	
}
