package cc.openkit.kitAdmin.route;

import cc.openkit.kitAdmin.cotroller.AdminController;
import com.jfinal.config.Routes;

public class AdminRoute extends Routes{
    @Override
    public void config() {
//        setBaseViewPath("/WEB-INF");
        add("/adminsoft", AdminController.class); // 配置路由
    }
}
