package sxx.proxy.proxyTemp.test;

import sxx.proxy.proxyTemp.InvocationHandler;
import sxx.proxy.proxyTemp.Proxy;

public class Client {
	public static void main(String[] args) throws Exception {
		UserDAO user = new UserDAOImpl();
		InvocationHandler inh = new TransactionHandler(user);
		UserDAO dao = (UserDAO) Proxy.newProxyInstance(UserDAO.class, inh);
		dao.addUser();
	}
}
