package bo4e.com;

import bo4e.ZusatzAttribut;
import bo4e.enums.ComTyp;
import bo4e.enums.Profilart;
import bo4e.enums.Profilverfahren;

import java.util.List;

/**
* Informationen zum Lastprofil.
*
* .. raw:: html
*
* <object data="../_static/images/bo4e/com/Lastprofil.svg" type="image/svg+xml"></object>
*
* .. HINT::
* `Lastprofil JSON Schema
* <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/Hochfrequenz/BO4E-Schemas/{__gh_version__}/src/bo4e_schemas/com/Lastprofil.json>`_
    */
    public class Lastprofil extends COM {
        private final ComTyp _typ = ComTyp.LASTPROFIL;
        private String bezeichnung;
        private String herausgeber;
        private Boolean istEinspeisung;
        private Profilart profilart;
        private String profilschar;
        private Tagesparameter tagesparameter;
        private Profilverfahren verfahren;

        public Lastprofil() {
        }

        private Lastprofil(LastprofilBuilder builder) {
            super(builder);
            this.bezeichnung = builder.bezeichnung;
            this.herausgeber = builder.herausgeber;
            this.istEinspeisung = builder.istEinspeisung;
            this.profilart = builder.profilart;
            this.profilschar = builder.profilschar;
            this.tagesparameter = builder.tagesparameter;
            this.verfahren = builder.verfahren;
        }

        public ComTyp get_typ() {
            return _typ;
        }

        public String getBezeichnung() {
            return bezeichnung;
        }

        public void setBezeichnung(String bezeichnung) {
            this.bezeichnung = bezeichnung;
        }

        public String getHerausgeber() {
            return herausgeber;
        }

        public void setHerausgeber(String herausgeber) {
            this.herausgeber = herausgeber;
        }

        public Boolean getIstEinspeisung() {
            return istEinspeisung;
        }

        public void setIstEinspeisung(Boolean istEinspeisung) {
            this.istEinspeisung = istEinspeisung;
        }

        public Profilart getProfilart() {
            return profilart;
        }

        public void setProfilart(Profilart profilart) {
            this.profilart = profilart;
        }

        public String getProfilschar() {
            return profilschar;
        }

        public void setProfilschar(String profilschar) {
            this.profilschar = profilschar;
        }

        public Tagesparameter getTagesparameter() {
            return tagesparameter;
        }

        public void setTagesparameter(Tagesparameter tagesparameter) {
            this.tagesparameter = tagesparameter;
        }

        public Profilverfahren getVerfahren() {
            return verfahren;
        }

        public void setVerfahren(Profilverfahren verfahren) {
            this.verfahren = verfahren;
        }

        public static LastprofilBuilder builder() {
            return new LastprofilBuilder();
        }

        public static class LastprofilBuilder extends COMBuilder {
            private String bezeichnung;
            private String herausgeber;
            private Boolean istEinspeisung;
            private Profilart profilart;
            private String profilschar;
            private Tagesparameter tagesparameter;
            private Profilverfahren verfahren;

            private LastprofilBuilder() {
            }

            public LastprofilBuilder setBezeichnung(String bezeichnung) {
                this.bezeichnung = bezeichnung;
                return this;
            }

            public LastprofilBuilder setHerausgeber(String herausgeber) {
                this.herausgeber = herausgeber;
                return this;
            }

            public LastprofilBuilder setIstEinspeisung(Boolean istEinspeisung) {
                this.istEinspeisung = istEinspeisung;
                return this;
            }

            public LastprofilBuilder setProfilart(Profilart profilart) {
                this.profilart = profilart;
                return this;
            }

            public LastprofilBuilder setProfilschar(String profilschar) {
                this.profilschar = profilschar;
                return this;
            }

            public LastprofilBuilder setTagesparameter(Tagesparameter tagesparameter) {
                this.tagesparameter = tagesparameter;
                return this;
            }

            public LastprofilBuilder setVerfahren(Profilverfahren verfahren) {
                this.verfahren = verfahren;
                return this;
            }

            public LastprofilBuilder set_id(String _id) {
                super.set_id(_id);
                return this;
            }

            public LastprofilBuilder setZusatzAttribute(List<ZusatzAttribut> zusatzAttribute) {
                super.setZusatzAttribute(zusatzAttribute);
                return this;
            }

            public Lastprofil build() {
                return new Lastprofil(this);
            }
        }
    }