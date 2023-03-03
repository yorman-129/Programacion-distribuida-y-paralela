import controller.controllerAdministrativo;
import controller.controllerEstudiante;
import controller.controllerProfesor;
import controller.controllerSede;

public class Main {
    public static void main(String[] args) {
        controllerEstudiante controlEstudiante = new controllerEstudiante();
        controllerAdministrativo controlAdministrativo = new controllerAdministrativo();
        controllerProfesor controlProfesor = new controllerProfesor();
        controllerSede controlSede = new controllerSede();
    }
}