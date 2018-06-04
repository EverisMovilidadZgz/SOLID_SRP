package victordev.es.solidsrp;

public class RegisterStatus {
    //ENUMERADO PARA INDICAR LAS POSIBILIDADES A LA HORA DE MOSTRAR EL STADO DEL LOGIN
    enum ShowStatus {TERMINAL, TOAST}

    public static void showRegisterStatus(RegisterStatus status, ShowStatus type) {
        switch (type) {
            case TERMINAL:
                showRegisterStatusInTerminal(status);
                break;
            case  TOAST:
                showRegisterStatusWithToast(status);
                break;
        }
    }

    private static void showRegisterStatusInTerminal(RegisterStatus status) {
        //TODO clase con la lógica del status de un registro por terminal

    }

    private static void showRegisterStatusWithToast(RegisterStatus status) {
        //TODO clase con la lógica del status de un registro con un Toast

    }
}
