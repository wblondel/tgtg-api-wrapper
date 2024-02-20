public final class C11700b implements InterfaceC4884w {

    /* renamed from: a */
    public final C9987b1 f36430a;

    /* renamed from: b */
    public final String f36431b;

    /* renamed from: c */
    public final C8711c f36432c;

    public C11700b(C9987b1 tokenManager, String correlationId, C8711c applicationConfig) {
        Intrinsics.checkNotNullParameter(tokenManager, "tokenManager");
        Intrinsics.checkNotNullParameter(correlationId, "correlationId");
        Intrinsics.checkNotNullParameter(applicationConfig, "applicationConfig");
        this.f36430a = tokenManager;
        this.f36431b = correlationId;
        this.f36432c = applicationConfig;
    }

    @Override // p131dp.InterfaceC4884w
    public final C4867i0 intercept(InterfaceC4883v chain) {
        String m3924a;
        Intrinsics.checkNotNullParameter(chain, "chain");
        C6593g c6593g = (C6593g) chain;
        C4861f0 c4861f0 = c6593g.f20252e;
        boolean m7549a = Intrinsics.m7549a(c4861f0.f14060c.m10756b("withoutAuthorization"), "true");
        C4859e0 c4859e0 = new C4859e0(c4861f0);
        String property = System.getProperty("http.agent");
        c4859e0.m10797b("User-Agent", "TGTG/24.2.1 " + property);
        c4859e0.m10797b("Content-Type", "application/json");
        c4859e0.m10797b("X-Correlation-ID", this.f36431b);
        C8711c c8711c = this.f36432c;
        String string = c8711c.f27090a.getResources().getString(R.string.app_language);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        c4859e0.m10797b("Accept-Language", string);
        if (!m7549a && (m3924a = this.f36430a.m3924a()) != null) {
            c4859e0.m10797b("Authorization", m3924a);
        }
        C4882u c4882u = c4861f0.f14058a;
        if (!Intrinsics.m7549a(c4882u.f14176d, "meta.apptoogoodtogo.com")) {
            Server server = c8711c.f27092c;
            C4881t m10740f = c4882u.m10740f();
            m10740f.m10748c(server.getDomain());
            if (server.getPort() != null) {
                m10740f.m10746e(server.getPort().intValue());
            }
            C4882u url = m10740f.m10750a();
            Intrinsics.checkNotNullParameter(url, "url");
            c4859e0.f14053a = url;
        }
        return c6593g.m8426b(new C4861f0(c4859e0));
    }
}
