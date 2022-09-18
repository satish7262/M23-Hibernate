package com.cg.dao;

import com.cg.entites.Certificate;

public interface ICertificateDao 
{
	public abstract Certificate addCertificate(Certificate certificate);
	public abstract Certificate updateCertificate(Certificate certificate);
	public abstract Certificate searchCertificate(int id);
	public abstract Certificate deleteCertificate(int id);
	
	public abstract void commitTransaction();
	public abstract void beginTransaction();

}

