package testplay;

public class TestPlay {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		TestProxy testProxy = new ProxyImpFactory().newInstance(TestProxy.class);
		testProxy.did();

	}

}
