package victordev.es.solidsrp;

/**
 * ROMPLE EL SRP PORQUE ADEMÁS DE LA LÓGICA NECESARIA PARA REGISTRAR UN USUARIO
 * TIENE LA LÓGICA DE MOSTRAR EL RESULTADO DEL REGISTRO. ACTUALMENTE LO HACE POR
 * TERMINAL, PERO EN UN FUTURO PODRÍA SER ALMACENARLO EN UNA BD, ENVIARLO A ALGÚN
 * SERVICIO, MOSTRARLO CON UN TOAST O ELEMENTO SIMILAR ETC.
 *
 * UN CAMBIO EN LA FORMA DE MOSTRAR EL RESULTADO DEL REGISTRO IMPLICARÍA UN CAMBIO
 * EN LA CLASE
 *
 * LO HEMOS SOLUCIONADO CREANDO UNA CLASE EN LA QUE DELEGAR LAS POSIBLES FORMAS DE
 * MOSTRAR EL RESULTADO. SI EN UN FUTURO EXISTE O CAMBIA ALGUNA DE LAS MANERAS DE
 * MOSTRAR EL RESULTADO, SÓLO HEMOS DE MOFIDICAR ESA CLASE.
 *
 */
public class UserRegister {

    public static void register(User user, RegisterStatus.ShowStatus type) throws UserRegisterException {
        if (user != null) {
            RegisterStatus.showRegisterStatus(callToRegisterProcess(user), type);
        } else {
            throw new UserRegisterException();
        }
    }

    private static RegisterStatus callToRegisterProcess(User user) {
        //TODO LÓGICA NECESARIA PARA LA LLAMADA AL SERVICIO QUE NOS DEVOLVERÁ UN ESTADO DE REGISTRO
        return new RegisterStatus();
    }
}