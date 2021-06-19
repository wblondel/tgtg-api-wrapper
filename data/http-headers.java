/* renamed from: e.a.a.h.f.c */
public final class TooGoodToGoApi implements Interceptor {

    /* renamed from: a */
    public final /* synthetic */ boolean f9664a;

    public TooGoodToGoApi(boolean z) {
        this.f9664a = z;
    }

    @Override // p766r1.Interceptor
    /* renamed from: a */
    public Response mo172a(Interceptor.AbstractC7712a aVar) {
        String str;
        C7527j.m605f(aVar, "chain");
        RealInterceptorChain gVar = (RealInterceptorChain) aVar;
        C7616d0.C7617a aVar2 = new C7616d0.C7617a(gVar.f25005f);
        StringBuilder u = outline.m7639u("TGTG/21.4.0 ");
        u.append(System.getProperty("http.agent"));
        aVar2.m470c("User-Agent", u.toString());
        aVar2.m470c("Content-Type", "application/json");
        Objects.requireNonNull(AppSettingsManager.f9456i);
        aVar2.m470c("Accept-Language", AppSettingsManager.f9455h.m8216a());
        if (this.f9664a) {
            UserDataManager.C3398a aVar3 = UserDataManager.f9511j;
            UserDataManager e0Var = UserDataManager.f9510i;
            if (e0Var.m8206a() == null) {
                str = null;
            } else {
                StringBuilder u2 = outline.m7639u("Bearer ");
                u2.append(e0Var.m8206a());
                str = u2.toString();
            }
            if (str == null) {
                str = "";
            }
            aVar2.m470c("Authorization", str);
        }
        return gVar.m336b(aVar2.m471b());
    }
}
