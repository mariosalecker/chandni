class B {

    public static B getStaticMethod() {
        System.out.println("getStaticMethod");
        B bObj = new B();
        return bObj;
    }


    public Context getContext() {
        System.out.println("getContext");
        Context context = new Context();
        return context;
    }
}