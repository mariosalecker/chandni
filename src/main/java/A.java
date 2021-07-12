public class A {

    public Token processRequest() {
        // this real method is still being called
        System.out.println("processRequest");
        Token myToken = null;
        myToken = getToken();
        return myToken;
    }


    public Token getToken() {
        // this gets mocked away on the spy. You will never see a "getToken" in the output
        System.out.println("getToken");
        Context ctx = B.getStaticMethod().getContext();
        return ctx.getToken();

    }

    public Token someRealMethod() {
        // Also all other real methods get called normally on the spy
        System.out.println("someRealMethod");
        return processRequest();
    }

}
