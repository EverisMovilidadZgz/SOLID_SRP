package victordev.es.solidsrp;

import android.util.Log;

/**
 * ROMPLE EL SRP PORQUE ADEMÁS DE LA LÓGICA NECESARIA PARA REGISTRAR UN USUARIO
 * TIENE LA LÓGICA DE MOSTRAR EL RESULTADO DEL REGISTRO. ACTUALMENTE LO HACE POR
 * TERMINAL, PERO EN UN FUTURO PODRÍA SER ALMACENARLO EN UNA BD, ENVIARLO A ALGÚN
 * SERVICIO, MOSTRARLO CON UN TOAST O ELEMENTO SIMILAR ETC.
 *
 * UN CAMBIO EN LA FORMA DE MOSTRAR EL RESULTADO DEL REGISTRO IMPLICARÍA UN CAMBIO
 * EN LA CLASE
 *
 */
public class UserRegister {

    public static void register(User user) throws UserRegisterException {
            if (user != null) {
                showRegisterStatus(callToRegisterProcess(user)); //Muestra el estado del registro.
            } else {
                throw new UserRegisterException();
            }
    }

    private static RegisterStatus callToRegisterProcess(User user) {
        //TODO LÓGICA NECESARIA PARA LA LLAMADA AL SERVICIO
        return new RegisterStatus();
    }

    private static void showRegisterStatus(RegisterStatus status) {
        Log.d("REGISTER_STATUS", status.toString());
    }
}


