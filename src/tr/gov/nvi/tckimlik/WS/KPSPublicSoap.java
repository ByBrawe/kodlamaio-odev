/**
 * KPSPublicSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package tr.gov.nvi.tckimlik.WS;

public interface KPSPublicSoap client = new KPSPublicSoapProxy();
boolean result = true;
try {
	result = client.TCKimlikNoDogrula(Long.parseLong(customer.getNationalityId()), customer.getFirstName(), customer.getLastName(), customer.getDateOfBirth());
}
catch(NumberFormatException e){
	e.printStackTrace();
}
catch(RemoteException e) {
	e.printStackTrace();
}
return result; extends java.rmi.Remote {
    public boolean TCKimlikNoDogrula(long TCKimlikNo, java.lang.String ad, java.lang.String soyad, int dogumYili) throws java.rmi.RemoteException;
}
