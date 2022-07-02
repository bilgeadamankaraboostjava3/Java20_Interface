package com.muahmmet.repository;

import com.muahmmet.repository.entity.Urun;

public interface UrunRepository extends Repository {

	/**
	 * 1- S�zle�medir
	 * 2- Genel �er�eveyi belirler ve kodlars�n�z.
	 * 3- s�n�flar gibi methodlar yazabilirsiniz.Ancak; buras� bir kal�psal yap�
	 * oldu�u i�in burada methodlar�n g�vdesi yaz�lmaz. 
	 */
		public Urun getUrun(long id);
}
