package bo4e.bo;

import bo4e.ZusatzAttribut;
import bo4e.com.Zeitreihenwert;
import bo4e.enums.Medium;
import bo4e.enums.Mengeneinheit;
import bo4e.enums.Messart;
import bo4e.enums.Messgroesse;
import bo4e.enums.Typ;
import bo4e.enums.Wertermittlungsverfahren;

import java.util.List;

/**
* Abbildung einer allgemeinen Zeitreihe mit einem Wertvektor.
* Die Werte können mit wahlfreier zeitlicher Distanz im Vektor abgelegt sein.
*
* .. raw:: html
*
* <object data="../_static/images/bo4e/bo/Zeitreihe.svg" type="image/svg+xml"></object>
*
* .. HINT::
* `Zeitreihe JSON Schema
* <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/BO4E/BO4E-Schemas/v202401.6.0/src/bo4e_schemas/bo/Zeitreihe.json>`_
*/
public class Zeitreihe extends Geschaeftsobjekt {
    private final Typ _typ = Typ.ZEITREIHE;
    private String beschreibung;
    private String bezeichnung;
    private Mengeneinheit einheit;
    private Medium medium;
    private Messart messart;
    private Messgroesse messgroesse;
    private String version;
    private List<Zeitreihenwert> werte;
    private Wertermittlungsverfahren wertherkunft;

    public Zeitreihe() {
    }

    private Zeitreihe(ZeitreiheBuilder builder) {
        super(builder);
        this.beschreibung = builder.beschreibung;
        this.bezeichnung = builder.bezeichnung;
        this.einheit = builder.einheit;
        this.medium = builder.medium;
        this.messart = builder.messart;
        this.messgroesse = builder.messgroesse;
        this.version = builder.version;
        this.werte = builder.werte;
        this.wertherkunft = builder.wertherkunft;
    }

    public Typ get_typ() {
        return _typ;
    }

    /**
    * Beschreibt die Verwendung der Zeitreihe
    */
    public String getBeschreibung() {
        return beschreibung;
    }

    /**
    * Beschreibt die Verwendung der Zeitreihe
    */
    public void setBeschreibung(String beschreibung) {
        this.beschreibung = beschreibung;
    }

    /**
    * Bezeichnung für die Zeitreihe
    */
    public String getBezeichnung() {
        return bezeichnung;
    }

    /**
    * Bezeichnung für die Zeitreihe
    */
    public void setBezeichnung(String bezeichnung) {
        this.bezeichnung = bezeichnung;
    }

    /**
    * Alle Werte in der Tabelle haben die Einheit, die hier angegeben ist
    */
    public Mengeneinheit getEinheit() {
        return einheit;
    }

    /**
    * Alle Werte in der Tabelle haben die Einheit, die hier angegeben ist
    */
    public void setEinheit(Mengeneinheit einheit) {
        this.einheit = einheit;
    }

    /**
    * Medium, das gemessen wurde (z.B. Wasser, Dampf, Strom, Gas)
    */
    public Medium getMedium() {
        return medium;
    }

    /**
    * Medium, das gemessen wurde (z.B. Wasser, Dampf, Strom, Gas)
    */
    public void setMedium(Medium medium) {
        this.medium = medium;
    }

    /**
    * Beschreibt die Art der Messung (z.B. aktueller Wert, mittlerer Wert, maximaler Wert)
    */
    public Messart getMessart() {
        return messart;
    }

    /**
    * Beschreibt die Art der Messung (z.B. aktueller Wert, mittlerer Wert, maximaler Wert)
    */
    public void setMessart(Messart messart) {
        this.messart = messart;
    }

    /**
    * Beschreibt, was gemessen wurde (z.B. Strom, Spannung, Wirkleistung, Scheinleistung)
    */
    public Messgroesse getMessgroesse() {
        return messgroesse;
    }

    /**
    * Beschreibt, was gemessen wurde (z.B. Strom, Spannung, Wirkleistung, Scheinleistung)
    */
    public void setMessgroesse(Messgroesse messgroesse) {
        this.messgroesse = messgroesse;
    }

    /**
    * Version der Zeitreihe
    */
    public String getVersion() {
        return version;
    }

    /**
    * Version der Zeitreihe
    */
    public void setVersion(String version) {
        this.version = version;
    }

    /**
    * Hier liegen jeweils die Werte
    */
    public List<Zeitreihenwert> getWerte() {
        return werte;
    }

    /**
    * Hier liegen jeweils die Werte
    */
    public void setWerte(List<Zeitreihenwert> werte) {
        this.werte = werte;
    }

    /**
    * Kennzeichnung, wie die Werte entstanden sind, z.B. durch Messung
    */
    public Wertermittlungsverfahren getWertherkunft() {
        return wertherkunft;
    }

    /**
    * Kennzeichnung, wie die Werte entstanden sind, z.B. durch Messung
    */
    public void setWertherkunft(Wertermittlungsverfahren wertherkunft) {
        this.wertherkunft = wertherkunft;
    }

    public static ZeitreiheBuilder builder() {
        return new ZeitreiheBuilder();
    }

    public static class ZeitreiheBuilder extends GeschaeftsobjektBuilder {
        private String beschreibung;
        private String bezeichnung;
        private Mengeneinheit einheit;
        private Medium medium;
        private Messart messart;
        private Messgroesse messgroesse;
        private String version;
        private List<Zeitreihenwert> werte;
        private Wertermittlungsverfahren wertherkunft;

        private ZeitreiheBuilder() {
        }

        /**
        * Beschreibt die Verwendung der Zeitreihe
        */
        public ZeitreiheBuilder setBeschreibung(String beschreibung) {
            this.beschreibung = beschreibung;
            return this;
        }

        /**
        * Bezeichnung für die Zeitreihe
        */
        public ZeitreiheBuilder setBezeichnung(String bezeichnung) {
            this.bezeichnung = bezeichnung;
            return this;
        }

        /**
        * Alle Werte in der Tabelle haben die Einheit, die hier angegeben ist
        */
        public ZeitreiheBuilder setEinheit(Mengeneinheit einheit) {
            this.einheit = einheit;
            return this;
        }

        /**
        * Medium, das gemessen wurde (z.B. Wasser, Dampf, Strom, Gas)
        */
        public ZeitreiheBuilder setMedium(Medium medium) {
            this.medium = medium;
            return this;
        }

        /**
        * Beschreibt die Art der Messung (z.B. aktueller Wert, mittlerer Wert, maximaler Wert)
        */
        public ZeitreiheBuilder setMessart(Messart messart) {
            this.messart = messart;
            return this;
        }

        /**
        * Beschreibt, was gemessen wurde (z.B. Strom, Spannung, Wirkleistung, Scheinleistung)
        */
        public ZeitreiheBuilder setMessgroesse(Messgroesse messgroesse) {
            this.messgroesse = messgroesse;
            return this;
        }

        /**
        * Version der Zeitreihe
        */
        public ZeitreiheBuilder setVersion(String version) {
            this.version = version;
            return this;
        }

        /**
        * Hier liegen jeweils die Werte
        */
        public ZeitreiheBuilder setWerte(List<Zeitreihenwert> werte) {
            this.werte = werte;
            return this;
        }

        /**
        * Kennzeichnung, wie die Werte entstanden sind, z.B. durch Messung
        */
        public ZeitreiheBuilder setWertherkunft(Wertermittlungsverfahren wertherkunft) {
            this.wertherkunft = wertherkunft;
            return this;
        }

        public ZeitreiheBuilder set_id(String _id) {
            super.set_id(_id);
            return this;
        }

        public ZeitreiheBuilder setZusatzAttribute(List<ZusatzAttribut> zusatzAttribute) {
            super.setZusatzAttribute(zusatzAttribute);
            return this;
        }

        public Zeitreihe build() {
            return new Zeitreihe(this);
        }
    }
}