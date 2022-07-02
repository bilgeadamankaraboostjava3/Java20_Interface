package com.muahmmet.repository;

import com.muahmmet.repository.entity.Urun;

public interface UrunRepository extends Repository {

	/**
	 * 1- Sözleþmedir
	 * 2- Genel çerçeveyi belirler ve kodlarsýnýz.
	 * 3- sýnýflar gibi methodlar yazabilirsiniz.Ancak; burasý bir kalýpsal yapý
	 * olduðu için burada methodlarýn gövdesi yazýlmaz. 
	 */
		public Urun getUrun(long id);
}
