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
 * <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/BO4E/BO4E-Schemas/v202401.3.1/src/bo4e_schemas/bo/Netzlokation.json>`_
 */
public class Netzlokation extends Geschaeftsobjekt {
    /**
     * Typ des Geschaeftsobjekts
     */
    private final Typ typ = Typ.NETZLOKATION;
    /**
     * Eigenschaft des Messstellenbetreibers an der Lokation
     */
    private Marktrolle eigenschaftMsbLokation;
    /**
     * Codenummer des grundzuständigen Messstellenbetreibers, der für diese Netzlokation
     * zuständig ist.
     */
    private String grundzustaendigerMsbCodenr;
    /**
     * Produkt-Daten der Netzlokation
     */
    private List<Konfigurationsprodukt> konfigurationsprodukte;
    /**
     * Lokationsbuendel Code, der die Funktion dieses BOs an der Lokationsbuendelstruktur
     * beschreibt.
     */
    private String lokationsbuendelObjektcode;
    /**
     * Lokationszuordnung, um bspw. die zugehörigen Messlokationen anzugeben
     */
    private List<Lokationszuordnung> lokationszuordnungen;
    /**
     * Netzanschlussleistungsmenge der Netzlokation
     */
    private Menge netzanschlussleistung;
    /**
     * Identifikationsnummer einer Netzlokation, an der Energie entweder verbraucht, oder
     * erzeugt wird
     */
    private String netzlokationsId;
    /**
     * Die OBIS-Kennzahl für die Netzlokation
     */
    private String obiskennzahl;
    /**
     * Sparte der Netzlokation, z.B. Gas oder Strom.
     */
    private Sparte sparte;
    /**
     * Ob ein Steuerkanal der Netzlokation zugeordnet ist und somit die Netzlokation gesteuert
     * werden kann.
     */
    private Boolean steuerkanal;
    /**
     * Verwendungungszweck der Werte Netzlokation
     */
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

    public Typ getTyp() {
        return typ;
    }

    public Marktrolle getEigenschaftMsbLokation() {
        return eigenschaftMsbLokation;
    }

    public void setEigenschaftMsbLokation(Marktrolle eigenschaftMsbLokation) {
        this.eigenschaftMsbLokation = eigenschaftMsbLokation;
    }

    public String getGrundzustaendigerMsbCodenr() {
        return grundzustaendigerMsbCodenr;
    }

    public void setGrundzustaendigerMsbCodenr(String grundzustaendigerMsbCodenr) {
        this.grundzustaendigerMsbCodenr = grundzustaendigerMsbCodenr;
    }

    public List<Konfigurationsprodukt> getKonfigurationsprodukte() {
        return konfigurationsprodukte;
    }

    public void setKonfigurationsprodukte(List<Konfigurationsprodukt> konfigurationsprodukte) {
        this.konfigurationsprodukte = konfigurationsprodukte;
    }

    public String getLokationsbuendelObjektcode() {
        return lokationsbuendelObjektcode;
    }

    public void setLokationsbuendelObjektcode(String lokationsbuendelObjektcode) {
        this.lokationsbuendelObjektcode = lokationsbuendelObjektcode;
    }

    public List<Lokationszuordnung> getLokationszuordnungen() {
        return lokationszuordnungen;
    }

    public void setLokationszuordnungen(List<Lokationszuordnung> lokationszuordnungen) {
        this.lokationszuordnungen = lokationszuordnungen;
    }

    public Menge getNetzanschlussleistung() {
        return netzanschlussleistung;
    }

    public void setNetzanschlussleistung(Menge netzanschlussleistung) {
        this.netzanschlussleistung = netzanschlussleistung;
    }

    public String getNetzlokationsId() {
        return netzlokationsId;
    }

    public void setNetzlokationsId(String netzlokationsId) {
        this.netzlokationsId = netzlokationsId;
    }

    public String getObiskennzahl() {
        return obiskennzahl;
    }

    public void setObiskennzahl(String obiskennzahl) {
        this.obiskennzahl = obiskennzahl;
    }

    public Sparte getSparte() {
        return sparte;
    }

    public void setSparte(Sparte sparte) {
        this.sparte = sparte;
    }

    public Boolean getSteuerkanal() {
        return steuerkanal;
    }

    public void setSteuerkanal(Boolean steuerkanal) {
        this.steuerkanal = steuerkanal;
    }

    public VerwendungszweckProMarktrolle getVerwendungszweck() {
        return verwendungszweck;
    }

    public void setVerwendungszweck(VerwendungszweckProMarktrolle verwendungszweck) {
        this.verwendungszweck = verwendungszweck;
    }

    public static class NetzlokationBuilder extends GeschaeftsobjektBuilder {
        /**
         * Eigenschaft des Messstellenbetreibers an der Lokation
         */
        private Marktrolle eigenschaftMsbLokation;
        /**
         * Codenummer des grundzuständigen Messstellenbetreibers, der für diese Netzlokation
         * zuständig ist.
         */
        private String grundzustaendigerMsbCodenr;
        /**
         * Produkt-Daten der Netzlokation
         */
        private List<Konfigurationsprodukt> konfigurationsprodukte;
        /**
         * Lokationsbuendel Code, der die Funktion dieses BOs an der Lokationsbuendelstruktur
         * beschreibt.
         */
        private String lokationsbuendelObjektcode;
        /**
         * Lokationszuordnung, um bspw. die zugehörigen Messlokationen anzugeben
         */
        private List<Lokationszuordnung> lokationszuordnungen;
        /**
         * Netzanschlussleistungsmenge der Netzlokation
         */
        private Menge netzanschlussleistung;
        /**
         * Identifikationsnummer einer Netzlokation, an der Energie entweder verbraucht, oder
         * erzeugt wird
         */
        private String netzlokationsId;
        /**
         * Die OBIS-Kennzahl für die Netzlokation
         */
        private String obiskennzahl;
        /**
         * Sparte der Netzlokation, z.B. Gas oder Strom.
         */
        private Sparte sparte;
        /**
         * Ob ein Steuerkanal der Netzlokation zugeordnet ist und somit die Netzlokation gesteuert
         * werden kann.
         */
        private Boolean steuerkanal;
        /**
         * Verwendungungszweck der Werte Netzlokation
         */
        private VerwendungszweckProMarktrolle verwendungszweck;
    
        public Marktrolle getEigenschaftMsbLokation() {
            return eigenschaftMsbLokation;
        }
    
        public NetzlokationBuilder setEigenschaftMsbLokation(Marktrolle eigenschaftMsbLokation) {
            this.eigenschaftMsbLokation = eigenschaftMsbLokation;
            return this;
        }
    
        public String getGrundzustaendigerMsbCodenr() {
            return grundzustaendigerMsbCodenr;
        }
    
        public NetzlokationBuilder setGrundzustaendigerMsbCodenr(String grundzustaendigerMsbCodenr) {
            this.grundzustaendigerMsbCodenr = grundzustaendigerMsbCodenr;
            return this;
        }
    
        public List<Konfigurationsprodukt> getKonfigurationsprodukte() {
            return konfigurationsprodukte;
        }
    
        public NetzlokationBuilder setKonfigurationsprodukte(List<Konfigurationsprodukt> konfigurationsprodukte) {
            this.konfigurationsprodukte = konfigurationsprodukte;
            return this;
        }
    
        public String getLokationsbuendelObjektcode() {
            return lokationsbuendelObjektcode;
        }
    
        public NetzlokationBuilder setLokationsbuendelObjektcode(String lokationsbuendelObjektcode) {
            this.lokationsbuendelObjektcode = lokationsbuendelObjektcode;
            return this;
        }
    
        public List<Lokationszuordnung> getLokationszuordnungen() {
            return lokationszuordnungen;
        }
    
        public NetzlokationBuilder setLokationszuordnungen(List<Lokationszuordnung> lokationszuordnungen) {
            this.lokationszuordnungen = lokationszuordnungen;
            return this;
        }
    
        public Menge getNetzanschlussleistung() {
            return netzanschlussleistung;
        }
    
        public NetzlokationBuilder setNetzanschlussleistung(Menge netzanschlussleistung) {
            this.netzanschlussleistung = netzanschlussleistung;
            return this;
        }
    
        public String getNetzlokationsId() {
            return netzlokationsId;
        }
    
        public NetzlokationBuilder setNetzlokationsId(String netzlokationsId) {
            this.netzlokationsId = netzlokationsId;
            return this;
        }
    
        public String getObiskennzahl() {
            return obiskennzahl;
        }
    
        public NetzlokationBuilder setObiskennzahl(String obiskennzahl) {
            this.obiskennzahl = obiskennzahl;
            return this;
        }
    
        public Sparte getSparte() {
            return sparte;
        }
    
        public NetzlokationBuilder setSparte(Sparte sparte) {
            this.sparte = sparte;
            return this;
        }
    
        public Boolean getSteuerkanal() {
            return steuerkanal;
        }
    
        public NetzlokationBuilder setSteuerkanal(Boolean steuerkanal) {
            this.steuerkanal = steuerkanal;
            return this;
        }
    
        public VerwendungszweckProMarktrolle getVerwendungszweck() {
            return verwendungszweck;
        }
    
        public NetzlokationBuilder setVerwendungszweck(VerwendungszweckProMarktrolle verwendungszweck) {
            this.verwendungszweck = verwendungszweck;
            return this;
        }
    
        public NetzlokationBuilder setId(String id) {
            super.setId(id);
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