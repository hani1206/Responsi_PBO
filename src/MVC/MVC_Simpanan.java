package MVC;

import Controller.ControllerSimpanan;
import Model.ModelSimpanan;
import View.ViewSimpanan;


public class MVC_Simpanan {
    ViewSimpanan viewSimpanan = new ViewSimpanan();
    ModelSimpanan modelSimpanan = new ModelSimpanan();
    ControllerSimpanan controllerSimpanan = new ControllerSimpanan(viewSimpanan, modelSimpanan);
}
