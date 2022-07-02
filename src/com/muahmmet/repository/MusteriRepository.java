package com.muahmmet.repository;

import com.muahmmet.repository.entity.Musteri;

public interface MusteriRepository extends Repository {
	public Musteri getMusteri(String uuid);
}
