class B {

    public static B getStaticMethod() {
        B bObj = new B();
        if (true) {
            throw new IllegalStateException();
        }
        return bObj;
    }


    public Context getContext() {

        Context context = new Context();
        return context;
    }
}