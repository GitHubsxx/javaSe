package sxx.proxy.proxyTemp;
import java.lang.reflect.Method;
public class $Proxy1 implements sxx.proxy.proxyTemp.test.UserDAO{
    public $Proxy1(InvocationHandler h) {
        this.h = h;
    }
    sxx.proxy.proxyTemp.InvocationHandler h;
@Override
public void addUser() {
    try {
    Method md = sxx.proxy.proxyTemp.test.UserDAO.class.getMethod("addUser");
    h.invoke(this, md);
    }catch(Exception e) {e.printStackTrace();}
}}