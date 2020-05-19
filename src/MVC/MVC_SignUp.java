package MVC;

import Controller.ControllerSignUp;
import Model.ModelLogin;
import View.ViewLogin;
import View.ViewSignUp;

public class MVC_SignUp {
    ModelLogin modelLogin = new ModelLogin();
    ViewLogin viewLogin  = new ViewLogin();
    ViewSignUp viewSignUp = new ViewSignUp();
    ControllerSignUp controller = new ControllerSignUp(modelLogin,viewLogin,viewSignUp);
}
