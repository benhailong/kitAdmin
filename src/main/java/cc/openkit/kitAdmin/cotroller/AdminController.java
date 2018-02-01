package cc.openkit.kitAdmin.cotroller;

import com.jfinal.core.Controller;

public class AdminController extends Controller{
    public void index(){
        render("/admin/login.html");
    }
}
