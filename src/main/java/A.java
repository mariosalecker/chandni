public class A {

    public Object processRequest() {
        Token myToken = null;
        myToken = getToken();
        return myToken;
    }


    public Token getToken() {

        Context ctx = B.getStaticMethod().getContext();
        return ctx.getToken();

    }



}
