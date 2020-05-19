package MVC;

import Controller.ControllerAddKategori;
import Model.ModelAddKategori;
import View.ViewAddKategori;

public class MVC_AddKategori {
    public MVC_AddKategori(){
        ViewAddKategori viewAddKategori = new ViewAddKategori();
        ModelAddKategori modelAddKategori= new ModelAddKategori();
        ControllerAddKategori controllerAddKategori = new ControllerAddKategori(viewAddKategori, modelAddKategori);
    }
}
