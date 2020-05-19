package MVC;

import Controller.ControllerAddSimpanan;
import Model.ModelSimpanan;
import View.ViewAddSimpanan;

public class MVC_AddSimpanan {
    public MVC_AddSimpanan(){
        ViewAddSimpanan viewAddSimpanan = new ViewAddSimpanan();
        ModelSimpanan modelSimpanan = new ModelSimpanan();
        ControllerAddSimpanan controllerAddSimpanan = new ControllerAddSimpanan(viewAddSimpanan, modelSimpanan);
    }
}
