package org.esa.ptr23.qualification;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;

public class Verifier {
    private Map<Character, changeChar> translate;

    private interface changeChar {
        String change(String str);
    }

    /* renamed from: org.esa.ptr23.qualification.Verifier$a */
    private class C0464a implements changeChar {
        public String change(String str) {
            return "😸";
        }

        private C0464a() {
        }
    }

    /* renamed from: org.esa.ptr23.qualification.Verifier$c */
    private class C0466c implements changeChar {
        public String change(String str) {
            return "😹";
        }

        private C0466c() {
        }
    }

    /* renamed from: org.esa.ptr23.qualification.Verifier$b */
    private class C0465b implements changeChar {
        public String change(String str) {
            return "🐱";
        }

        private C0465b() {
        }
    }

    /* renamed from: org.esa.ptr23.qualification.Verifier$e */
    private class C0468e implements changeChar {
        public String change(String str) {
            return "😻";
        }

        private C0468e() {
        }
    }

    /* renamed from: org.esa.ptr23.qualification.Verifier$d */
    private class C0467d implements changeChar {
        public String change(String str) {
            return "😺";
        }

        private C0467d() {
        }
    }

    /* renamed from: org.esa.ptr23.qualification.Verifier$g */
    private class C0470g implements changeChar {
        public String change(String str) {
            return "😽";
        }

        private C0470g() {
        }
    }

    /* renamed from: org.esa.ptr23.qualification.Verifier$f */
    private class C0469f implements changeChar {
        public String change(String str) {
            return "😼";
        }

        private C0469f() {
        }
    }

    /* renamed from: org.esa.ptr23.qualification.Verifier$i */
    private class C0472i implements changeChar {
        public String change(String str) {
            return "😿";
        }

        private C0472i() {
        }
    }

    /* renamed from: org.esa.ptr23.qualification.Verifier$h */
    private class C0471h implements changeChar {
        public String change(String str) {
            return "😾";
        }

        private C0471h() {
        }
    }

    /* renamed from: org.esa.ptr23.qualification.Verifier$k */
    private class C0474k implements changeChar {
        public String change(String str) {
            return "🐆";
        }

        private C0474k() {
        }
    }

    /* renamed from: org.esa.ptr23.qualification.Verifier$j */
    private class C0473j implements changeChar {
        public String change(String str) {
            return "🙀";
        }

        private C0473j() {
        }
    }

    /* renamed from: org.esa.ptr23.qualification.Verifier$m */
    private class C0476m implements changeChar {
        public String change(String str) {
            return "🦍";
        }

        private C0476m() {
        }
    }

    /* renamed from: org.esa.ptr23.qualification.Verifier$l */
    private class C0475l implements changeChar {
        public String change(String str) {
            return "🐅";
        }

        private C0475l() {
        }
    }

    /* renamed from: org.esa.ptr23.qualification.Verifier$o */
    private class C0478o implements changeChar {
        public String change(String str) {
            return "🦑";
        }

        private C0478o() {
        }
    }

    /* renamed from: org.esa.ptr23.qualification.Verifier$n */
    private class C0477n implements changeChar {
        public String change(String str) {
            return "🐍";
        }

        private C0477n() {
        }
    }

    /* renamed from: org.esa.ptr23.qualification.Verifier$q */
    private class C0480q implements changeChar {
        public String change(String str) {
            return "🐊";
        }

        private C0480q() {
        }
    }

    /* renamed from: org.esa.ptr23.qualification.Verifier$p */
    private class C0479p implements changeChar {
        public String change(String str) {
            return "🐌";
        }

        private C0479p() {
        }
    }

    /* renamed from: org.esa.ptr23.qualification.Verifier$s */
    private class C0482s implements changeChar {
        public String change(String str) {
            return "🙈";
        }

        private C0482s() {
        }
    }

    /* renamed from: org.esa.ptr23.qualification.Verifier$r */
    private class C0481r implements changeChar {
        public String change(String str) {
            return "🦎";
        }

        private C0481r() {
        }
    }

    /* renamed from: org.esa.ptr23.qualification.Verifier$u */
    private class C0484u implements changeChar {
        public String change(String str) {
            return "🎮";
        }

        private C0484u() {
        }
    }

    /* renamed from: org.esa.ptr23.qualification.Verifier$t */
    private class C0483t implements changeChar {
        public String change(String str) {
            return "🦗";
        }

        private C0483t() {
        }
    }

    /* renamed from: org.esa.ptr23.qualification.Verifier$w */
    private class C0486w implements changeChar {
        public String change(String str) {
            return "℡";
        }

        private C0486w() {
        }
    }

    /* renamed from: org.esa.ptr23.qualification.Verifier$v */
    private class C0485v implements changeChar {
        public String change(String str) {
            return "🎛";
        }

        private C0485v() {
        }
    }

    /* renamed from: org.esa.ptr23.qualification.Verifier$y */
    private class C0488y implements changeChar {
        public String change(String str) {
            return "🖪";
        }

        private C0488y() {
        }
    }

    /* renamed from: org.esa.ptr23.qualification.Verifier$x */
    private class C0487x implements changeChar {
        public String change(String str) {
            return "💿";
        }

        private C0487x() {
        }
    }

    /* renamed from: org.esa.ptr23.qualification.Verifier$z */
    private class C0489z implements changeChar {
        public String change(String str) {
            return "🎥";
        }

        private C0489z() {
        }
    }

    private class curlybracketopen implements changeChar {
        public String change(String str) {
            return "🦈";
        }

        private curlybracketopen() {
        }
    }

    private class curlybracketclose implements changeChar {
        public String change(String str) {
            return "🧸";
        }

        private curlybracketclose() {
        }
    }

    private class unchanged implements changeChar {
        public String change(String str) {
            return str;
        }

        private unchanged() {
        }
    }

    private Verifier() {
        HashMap hashMap = new HashMap();
        this.translate = hashMap;
        hashMap.put('a', new C0464a());
        this.translate.put('b', new C0465b());
        this.translate.put('c', new C0466c());
        this.translate.put('d', new C0467d());
        this.translate.put('e', new C0468e());
        this.translate.put('f', new C0469f());
        this.translate.put('g', new C0470g());
        this.translate.put('h', new C0471h());
        this.translate.put('i', new C0472i());
        this.translate.put('j', new C0473j());
        this.translate.put('k', new C0474k());
        this.translate.put('l', new C0475l());
        this.translate.put('m', new C0476m());
        this.translate.put('n', new C0477n());
        this.translate.put('o', new C0478o());
        this.translate.put('p', new C0479p());
        this.translate.put('q', new C0480q());
        this.translate.put('r', new C0481r());
        this.translate.put('s', new C0482s());
        this.translate.put('t', new C0483t());
        this.translate.put('u', new C0484u());
        this.translate.put('v', new C0485v());
        this.translate.put('w', new C0486w());
        this.translate.put('x', new C0487x());
        this.translate.put('y', new C0488y());
        this.translate.put('z', new C0489z());
        this.translate.put('{', new curlybracketopen());
        this.translate.put('}', new curlybracketclose());
    }

    private String doit(String str) {
        StringBuilder sb = new StringBuilder();
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i = 0;
        while (i < length) {
            char c = charArray[i];
            try {
                sb.append(this.translate.get(Character.valueOf(c)).change(String.valueOf(c)));
                i++;
            } catch (NullPointerException unused) {
                return "";
            }
        }
        return sb.toString().trim();
    }

    public static boolean verifyPassword(Context context, String str) {
        return new Verifier().doit(str.toLowerCase()).equals("🐌🦗🦎🦈😿🦍😸😽😿🐍😻🦗😾😻🦎😻🙈🐍🦑😾😻😸🎛😻🐍🧸");
    }
}
