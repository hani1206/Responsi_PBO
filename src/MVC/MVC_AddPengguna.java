package MVC;

import Controller.ControllerAddPengguna;
import Model.ModelAddPengguna;
import View.ViewAddPengguna;

public class MVC_AddPengguna {
    public MVC_AddPengguna(){
        ViewAddPengguna viewAddPengguna = new ViewAddPengguna();
        ModelAddPengguna modelAddPengguna = new ModelAddPengguna();
        ControllerAddPengguna controllerAddPengguna = new ControllerAddPengguna(viewAddPengguna,modelAddPengguna);
    }
}
