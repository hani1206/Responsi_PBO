package MVC;

import Controller.ControllerEditSimpanan;
import Model.ModelSimpanan;
import View.ViewEditSimpanan;

public class MVC_EditSimpanan {
    ViewEditSimpanan viewEditSimpanan = new ViewEditSimpanan();
    ModelSimpanan modelSimpanan = new ModelSimpanan();
    ControllerEditSimpanan controllerEditSimpanan = new ControllerEditSimpanan(viewEditSimpanan, modelSimpanan);
}
