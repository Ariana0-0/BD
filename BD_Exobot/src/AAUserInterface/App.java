package AAUserInterface;

import AABusinessLogic.AAEntities.*;
import AADataAccess.AADTO.*;

public class App {

    public static void main(String[] args) {

        try {
            // ================== SEXO ==================
            System.out.println("===== SEXO =====");
            AASexoBL sexoBL = new AASexoBL();

            for (AASexoDTO s : sexoBL.getAll()) {
                System.out.println(s);
            }

            // ================== ESTADO CIVIL ==================
            System.out.println("\n===== ESTADO CIVIL =====");
            AAEstadoCivilBL estadoCivilBL = new AAEstadoCivilBL();

            for (AAEstadoCivilDTO ec : estadoCivilBL.getAll()) {
                System.out.println(ec);
            }

            // ================== TIPO DE PERSONA ==================
            System.out.println("\n===== TIPO DE PERSONA =====");
            AAPersonaTipoBL personaTipoBL = new AAPersonaTipoBL();

            for (AAPersonaTipoDTO pt : personaTipoBL.getAll()) {
                System.out.println(pt);
            }

        } catch (Exception e) {
            System.out.println("Error en la aplicación:");
            System.out.println(e.getMessage());
        }
    }
}
