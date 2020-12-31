package Excepcions.ActivitatExceptions.Model;

import Excepcions.ActivitatExceptions.ClientAccountException;
import Excepcions.ActivitatExceptions.Control.OperacionsBanc;
import Excepcions.ActivitatExceptions.Exceptions.ExceptionMessage;

public class Client {
    private String Nom;
    private String Cognoms;
    private String DNI;

    OperacionsBanc operacionsBanc = new OperacionsBanc();
    public Client(String nom, String cognoms, String DNI) throws ClientAccountException {
        Nom = nom;
        Cognoms = cognoms;
        if(!operacionsBanc.verifyDNI(DNI)) {
            throw new ClientAccountException(ExceptionMessage.WRONG_DNI);
        }else this.DNI = DNI;
    }

    public String getNom() {
        return Nom;
    }

    public void setNom(String nom) {
        Nom = nom;
    }

    public String getCognoms() {
        return Cognoms;
    }

    public void setCognoms(String cognoms) {
        Cognoms = cognoms;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        if(!operacionsBanc.verifyDNI(DNI)) {
            try {
                throw new ClientAccountException(ExceptionMessage.WRONG_DNI);
            } catch (ClientAccountException e) {
                e.printStackTrace();
            }
        }else this.DNI = DNI;
    }



}
