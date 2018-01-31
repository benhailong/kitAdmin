package cc.openkit.kitAdmin.common;

import cc.openkit.kitAdmin.cotroller.HelloController;
import com.jfinal.config.*;
import com.jfinal.core.JFinal;
import com.jfinal.template.Engine;

public class MyConfig extends JFinalConfig{
    @Override
    public void configConstant(Constants constants) {
        constants.setDevMode(true);
    }
    @Override
    public void configRoute(Routes routes) {
        routes.add("/hello",HelloController.class);
    }
    @Override
    public void configEngine(Engine engine) {

    }
    @Override
    public void configPlugin(Plugins plugins) {

    }
    @Override
    public void configInterceptor(Interceptors interceptors) {

    }
    @Override
    public void configHandler(Handlers handlers) {

    }

    public static void main(String[] args) {
        JFinal.start("src/main/webapp",8080,"/");
    }

    // jfinal 框架启动后，你可以启动你自己的东西
    @Override
    public void afterJFinalStart(){

    }
}
