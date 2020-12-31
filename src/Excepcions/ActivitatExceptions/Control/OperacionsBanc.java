package Excepcions.ActivitatExceptions.Control;

public class OperacionsBanc {
    private String dni;
    public boolean verifyDNI(String dni) {

        this.dni = dni;
        String letraMayuscula;

        if(dni.length() != 9 || !Character.isLetter(this.dni.charAt(8))) {
            return false;
        }

        letraMayuscula = (this.dni.substring(8)).toUpperCase();
        return soloNumeros() && letraDNI().equals(letraMayuscula);
    }
    private boolean soloNumeros() {
        int i, j = 0;
        String numero = "";
        String miDNI = "";
        String[] unoNueve = {"0","1","2","3","4","5","6","7","8","9"};

        for(i = 0; i < this.dni.length() - 1; i++) {
            numero = this.dni.substring(i, i+1);

            for(j = 0; j < unoNueve.length; j++) {
                if(numero.equals(unoNueve[j])) {
                    miDNI += unoNueve[j];
                }
            }
        }

        return miDNI.length() == 8;
    }
    private String letraDNI() {
        int miDNI = Integer.parseInt(this.dni.substring(0,8));
        int resto;
        String miLetra = "";
        String[] asignacionLetra = {"T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E"};

        resto = miDNI % 23;
        miLetra = asignacionLetra[resto];
        return miLetra;
    }
}

