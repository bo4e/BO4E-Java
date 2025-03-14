package bo4e.bo;

import bo4e.ZusatzAttribut;
import bo4e.com.Konfigurationsprodukt;
import bo4e.com.Menge;
import bo4e.com.VerwendungszweckProMarktrolle;
import bo4e.enums.Marktrolle;
import bo4e.enums.Sparte;
import bo4e.enums.Typ;

import java.util.List;

/**
* Object containing information about a Netzlokation
*
* .. raw:: html
*
* <object data="../_static/images/bo4e/bo/Netzlokation.svg" type="image/svg+xml"></object>
*
* .. HINT::
* `Netzlokation JSON Schema
* <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/BO4E/BO4E-Schemas/v202401.6.0/src/bo4e_schemas/bo/Netzlokation.json>`_
*/
public class Netzlokation extends Geschaeftsobjekt {
    private final Typ _typ = Typ.NETZLOKATION;
    private Marktrolle eigenschaftMsbLokation;
    private String grundzustaendigerMsbCodenr;
    private List<Konfigurationsprodukt> konfigurationsprodukte;
    private String lokationsbuendelObjektcode;
    private List<Lokationszuordnung> lokationszuordnungen;
    private Menge netzanschlussleistung;
    private String netzlokationsId;
    private String obiskennzahl;
    private Sparte sparte;
    private Boolean steuerkanal;
    private VerwendungszweckProMarktrolle verwendungszweck;

    public Netzlokation() {
    }

    private Netzlokation(NetzlokationBuilder builder) {
        super(builder);
        this.eigenschaftMsbLokation = builder.eigenschaftMsbLokation;
        this.grundzustaendigerMsbCodenr = builder.grundzustaendigerMsbCodenr;
        this.konfigurationsprodukte = builder.konfigurationsprodukte;
        this.lokationsbuendelObjektcode = builder.lokationsbuendelObjektcode;
        this.lokationszuordnungen = builder.lokationszuordnungen;
        this.netzanschlussleistung = builder.netzanschlussleistung;
        this.netzlokationsId = builder.netzlokationsId;
        this.obiskennzahl = builder.obiskennzahl;
        this.sparte = builder.sparte;
        this.steuerkanal = builder.steuerkanal;
        this.verwendungszweck = builder.verwendungszweck;
    }

    public Typ get_typ() {
        return _typ;
    }

    /**
    * Eigenschaft des Messstellenbetreibers an der Lokation
    */
    public Marktrolle getEigenschaftMsbLokation() {
        return eigenschaftMsbLokation;
    }

    /**
    * Eigenschaft des Messstellenbetreibers an der Lokation
    */
    public void setEigenschaftMsbLokation(Marktrolle eigenschaftMsbLokation) {
        this.eigenschaftMsbLokation = eigenschaftMsbLokation;
    }

    /**
    * Codenummer des grundzuständigen Messstellenbetreibers, der für diese Netzlokation
    * zuständig ist.
    */
    public String getGrundzustaendigerMsbCodenr() {
        return grundzustaendigerMsbCodenr;
    }

    /**
    * Codenummer des grundzuständigen Messstellenbetreibers, der für diese Netzlokation
    * zuständig ist.
    */
    public void setGrundzustaendigerMsbCodenr(String grundzustaendigerMsbCodenr) {
        this.grundzustaendigerMsbCodenr = grundzustaendigerMsbCodenr;
    }

    /**
    * Produkt-Daten der Netzlokation
    */
    public List<Konfigurationsprodukt> getKonfigurationsprodukte() {
        return konfigurationsprodukte;
    }

    /**
    * Produkt-Daten der Netzlokation
    */
    public void setKonfigurationsprodukte(List<Konfigurationsprodukt> konfigurationsprodukte) {
        this.konfigurationsprodukte = konfigurationsprodukte;
    }

    /**
    * Lokationsbuendel Code, der die Funktion dieses BOs an der Lokationsbuendelstruktur
    * beschreibt.
    */
    public String getLokationsbuendelObjektcode() {
        return lokationsbuendelObjektcode;
    }

    /**
    * Lokationsbuendel Code, der die Funktion dieses BOs an der Lokationsbuendelstruktur
    * beschreibt.
    */
    public void setLokationsbuendelObjektcode(String lokationsbuendelObjektcode) {
        this.lokationsbuendelObjektcode = lokationsbuendelObjektcode;
    }

    /**
    * Lokationszuordnung, um bspw. die zugehörigen Messlokationen anzugeben
    */
    public List<Lokationszuordnung> getLokationszuordnungen() {
        return lokationszuordnungen;
    }

    /**
    * Lokationszuordnung, um bspw. die zugehörigen Messlokationen anzugeben
    */
    public void setLokationszuordnungen(List<Lokationszuordnung> lokationszuordnungen) {
        this.lokationszuordnungen = lokationszuordnungen;
    }

    /**
    * Netzanschlussleistungsmenge der Netzlokation
    */
    public Menge getNetzanschlussleistung() {
        return netzanschlussleistung;
    }

    /**
    * Netzanschlussleistungsmenge der Netzlokation
    */
    public void setNetzanschlussleistung(Menge netzanschlussleistung) {
        this.netzanschlussleistung = netzanschlussleistung;
    }

    /**
    * Identifikationsnummer einer Netzlokation, an der Energie entweder verbraucht, oder
    * erzeugt wird
    */
    public String getNetzlokationsId() {
        return netzlokationsId;
    }

    /**
    * Identifikationsnummer einer Netzlokation, an der Energie entweder verbraucht, oder
    * erzeugt wird
    */
    public void setNetzlokationsId(String netzlokationsId) {
        this.netzlokationsId = netzlokationsId;
    }

    /**
    * Die OBIS-Kennzahl für die Netzlokation
    */
    public String getObiskennzahl() {
        return obiskennzahl;
    }

    /**
    * Die OBIS-Kennzahl für die Netzlokation
    */
    public void setObiskennzahl(String obiskennzahl) {
        this.obiskennzahl = obiskennzahl;
    }

    /**
    * Sparte der Netzlokation, z.B. Gas oder Strom.
    */
    public Sparte getSparte() {
        return sparte;
    }

    /**
    * Sparte der Netzlokation, z.B. Gas oder Strom.
    */
    public void setSparte(Sparte sparte) {
        this.sparte = sparte;
    }

    /**
    * Ob ein Steuerkanal der Netzlokation zugeordnet ist und somit die Netzlokation gesteuert
    * werden kann.
    */
    public Boolean getSteuerkanal() {
        return steuerkanal;
    }

    /**
    * Ob ein Steuerkanal der Netzlokation zugeordnet ist und somit die Netzlokation gesteuert
    * werden kann.
    */
    public void setSteuerkanal(Boolean steuerkanal) {
        this.steuerkanal = steuerkanal;
    }

    /**
    * Verwendungungszweck der Werte Netzlokation
    */
    public VerwendungszweckProMarktrolle getVerwendungszweck() {
        return verwendungszweck;
    }

    /**
    * Verwendungungszweck der Werte Netzlokation
    */
    public void setVerwendungszweck(VerwendungszweckProMarktrolle verwendungszweck) {
        this.verwendungszweck = verwendungszweck;
    }

    public static NetzlokationBuilder builder() {
        return new NetzlokationBuilder();
    }

    public static class NetzlokationBuilder extends GeschaeftsobjektBuilder {
        private Marktrolle eigenschaftMsbLokation;
        private String grundzustaendigerMsbCodenr;
        private List<Konfigurationsprodukt> konfigurationsprodukte;
        private String lokationsbuendelObjektcode;
        private List<Lokationszuordnung> lokationszuordnungen;
        private Menge netzanschlussleistung;
        private String netzlokationsId;
        private String obiskennzahl;
        private Sparte sparte;
        private Boolean steuerkanal;
        private VerwendungszweckProMarktrolle verwendungszweck;

        private NetzlokationBuilder() {
        }

        /**
        * Eigenschaft des Messstellenbetreibers an der Lokation
        */
        public NetzlokationBuilder setEigenschaftMsbLokation(Marktrolle eigenschaftMsbLokation) {
            this.eigenschaftMsbLokation = eigenschaftMsbLokation;
            return this;
        }

        /**
        * Codenummer des grundzuständigen Messstellenbetreibers, der für diese Netzlokation
        * zuständig ist.
        */
        public NetzlokationBuilder setGrundzustaendigerMsbCodenr(String grundzustaendigerMsbCodenr) {
            this.grundzustaendigerMsbCodenr = grundzustaendigerMsbCodenr;
            return this;
        }

        /**
        * Produkt-Daten der Netzlokation
        */
        public NetzlokationBuilder setKonfigurationsprodukte(List<Konfigurationsprodukt> konfigurationsprodukte) {
            this.konfigurationsprodukte = konfigurationsprodukte;
            return this;
        }

        /**
        * Lokationsbuendel Code, der die Funktion dieses BOs an der Lokationsbuendelstruktur
        * beschreibt.
        */
        public NetzlokationBuilder setLokationsbuendelObjektcode(String lokationsbuendelObjektcode) {
            this.lokationsbuendelObjektcode = lokationsbuendelObjektcode;
            return this;
        }

        /**
        * Lokationszuordnung, um bspw. die zugehörigen Messlokationen anzugeben
        */
        public NetzlokationBuilder setLokationszuordnungen(List<Lokationszuordnung> lokationszuordnungen) {
            this.lokationszuordnungen = lokationszuordnungen;
            return this;
        }

        /**
        * Netzanschlussleistungsmenge der Netzlokation
        */
        public NetzlokationBuilder setNetzanschlussleistung(Menge netzanschlussleistung) {
            this.netzanschlussleistung = netzanschlussleistung;
            return this;
        }

        /**
        * Identifikationsnummer einer Netzlokation, an der Energie entweder verbraucht, oder
        * erzeugt wird
        */
        public NetzlokationBuilder setNetzlokationsId(String netzlokationsId) {
            this.netzlokationsId = netzlokationsId;
            return this;
        }

        /**
        * Die OBIS-Kennzahl für die Netzlokation
        */
        public NetzlokationBuilder setObiskennzahl(String obiskennzahl) {
            this.obiskennzahl = obiskennzahl;
            return this;
        }

        /**
        * Sparte der Netzlokation, z.B. Gas oder Strom.
        */
        public NetzlokationBuilder setSparte(Sparte sparte) {
            this.sparte = sparte;
            return this;
        }

        /**
        * Ob ein Steuerkanal der Netzlokation zugeordnet ist und somit die Netzlokation gesteuert
        * werden kann.
        */
        public NetzlokationBuilder setSteuerkanal(Boolean steuerkanal) {
            this.steuerkanal = steuerkanal;
            return this;
        }

        /**
        * Verwendungungszweck der Werte Netzlokation
        */
        public NetzlokationBuilder setVerwendungszweck(VerwendungszweckProMarktrolle verwendungszweck) {
            this.verwendungszweck = verwendungszweck;
            return this;
        }

        public NetzlokationBuilder set_id(String _id) {
            super.set_id(_id);
            return this;
        }

        public NetzlokationBuilder setZusatzAttribute(List<ZusatzAttribut> zusatzAttribute) {
            super.setZusatzAttribute(zusatzAttribute);
            return this;
        }

        public Netzlokation build() {
            return new Netzlokation(this);
        }
    }
}