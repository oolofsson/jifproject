package jif.principals;

public class Chuck extends jif.lang.ExternalPrincipal {
    public Chuck jif$principals$Chuck$() {
        this.jif$init();
        { this.jif$lang$ExternalPrincipal$("Chuck"); }
        return this;
    }
    
    private static Chuck P;
    
    public static jif.lang.Principal getInstance() {
        if (Chuck.P == null) { Chuck.P = new Chuck().jif$principals$Chuck$(); }
        return Chuck.P;
    }
    
    public static final String jlc$CompilerVersion$jif = "3.5.0";
    public static final long jlc$SourceLastModified$jif = 1523954084000L;
    public static final String jlc$ClassType$jif =
      ("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");
    
    public Chuck() { super(); }
    
    public void jif$invokeDefConstructor() { this.jif$principals$Chuck$(); }
    
    private void jif$init() {  }
    
    public static final String jlc$CompilerVersion$jl = "2.7.1";
    public static final long jlc$SourceLastModified$jl = 1523954084000L;
    public static final String jlc$ClassType$jl =
      ("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" +
       "lP+JU+UnylSLfdk9NYLyfwHpccBjFx8AAA==");
}
