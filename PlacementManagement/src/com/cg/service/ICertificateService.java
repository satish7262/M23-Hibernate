package com.cg.service;

import com.cg.entites.Certificate;
public interface ICertificateService 
{
	public abstract Certificate addCertificate(Certificate certificate);
	public abstract Certificate updateCertificate(Certificate certificate);
	public abstract Certificate searchCertificate(int id);
	public abstract Certificate deleteCertificate(int id);
	

}
