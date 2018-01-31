package cc.openkit.kitAdmin.cotroller;

import com.jfinal.core.Controller;

public class HelloController extends Controller{
    public void index(){
        renderText("Helow Jfinal World.");
    }
}
