package com.cg.service;

import com.cg.dao.CertificateDaoImp;
import com.cg.dao.ICertificateDao;

import com.cg.entites.Certificate;

public class CertificateServiceImp implements ICertificateService{

	private ICertificateDao dao;
	
	public CertificateServiceImp() {
		super();
		dao=new CertificateDaoImp();
	}

	@Override
	public Certificate addCertificate(Certificate certificate) {
		dao.beginTransaction();
		dao.addCertificate(certificate);
		dao.commitTransaction();
		return certificate;
	}

	@Override
	public Certificate updateCertificate(Certificate certificate) {
		dao.beginTransaction();
		dao.updateCertificate(certificate);
		dao.commitTransaction();
		return certificate;
	}

	@Override
	public Certificate searchCertificate(int id) {
		Certificate certificate=dao.searchCertificate(id);
		return certificate;
	}

	@Override
	public Certificate deleteCertificate(int id) {
		Certificate certificate=dao.searchCertificate(id);
				return certificate;
	

	}
	


	
	

}
