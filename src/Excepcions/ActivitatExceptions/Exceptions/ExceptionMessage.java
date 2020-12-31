package Excepcions.ActivitatExceptions.Exceptions;


import Excepcions.ActivitatExceptions.Model.*;
import Excepcions.ActivitatExceptions.Control.*;
import Excepcions.ActivitatExceptions.Exceptions.*;
public class ExceptionMessage extends Exception {

    //BANK ACCOUNT MESSAGES
    public static final String ACCOUNT_NOT_FOUND = "Cuenta inexsistente";
    public static final String ACCOUNT_OVERDRAFT = "Cuenta al descubierto";
    public static final String ACCOUNT_ZERO_USER = "Cuenta sin usuario";

    //CLIENT MESSAGES
    public static final String WRONG_DNI = "DNI incorrecto";

    //OPERATIONS
    public static final String TRANSFER_ERROR = "Error en la transferencia";


}
