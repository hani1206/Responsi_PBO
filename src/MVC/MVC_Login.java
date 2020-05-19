package MVC;
import Controller.ControllerLogin;
import Model.ModelLogin;
import View.ViewLogin;
public class MVC_Login {
    ViewLogin viewLogin = new ViewLogin();
    ModelLogin modelLogin = new ModelLogin();
    ControllerLogin controllerLogin = new ControllerLogin(modelLogin,viewLogin);
}
