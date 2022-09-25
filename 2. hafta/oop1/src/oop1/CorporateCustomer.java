package oop1;

public class CorporateCustomer extends Customer { //customer da eklenen bilgilerin üstüne ekstra bilgileri ekliyoruz.

	private String CompanyName;

	public String getCompanyName() {
		return CompanyName;
	}

	public void setCompanyName(String companyName) {
		CompanyName = companyName;
	}

	public String getTaxNumber() {
		return TaxNumber;
	}

	public void setTaxNumber(String taxNumber) {
		TaxNumber = taxNumber;
	}

	private String TaxNumber;
}
