package singleton.ventanilla_de_pago;

public class Client {
    public static void main(String []args){
        Colegio colegio = new Colegio();
        colegio.setCashier(new Cajero("514023", "Juddith Merida"));

        colegio.payEnrollment(650, new Estudiante("290302","Claure Gabriel"));
        colegio.payEnrollment(650, new Estudiante("131200","Gutierréz Patrick"));
        colegio.payEnrollment(650, new Estudiante("121200","Entrambasaguas Rodrigo"));
        colegio.payEnrollment(650, new Estudiante("100600","Turizo Julian"));
        colegio.payEnrollment(650, new Estudiante("201000","Sánchez Ameluz"));
    }
}

