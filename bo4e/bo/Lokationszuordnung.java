package bo4e.bo;

import bo4e.ZusatzAttribut;
import bo4e.com.Zeitspanne;
import bo4e.enums.Typ;

import java.util.List;

/**
 * Modell für die Abbildung der Referenz auf die Lokationsbündelstruktur. Diese gibt an
 * welche Marktlokationen,
 * Messlokationen, Netzlokationen, technische/steuerbaren Ressourcen an einer Lokation
 * vorhanden sind.
 *
 * .. raw:: html
 *
 * <object data="../_static/images/bo4e/bo/Lokationszuordnung.svg"
 * type="image/svg+xml"></object>
 *
 * .. HINT::
 * `Lokationszuordnung JSON Schema
 * <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/BO4E/BO4E-Schemas/v202401.3.1/src/bo4e_schemas/bo/Lokationszuordnung.json>`_
 */
public class Lokationszuordnung extends Geschaeftsobjekt {
    /**
     * Typ des Geschaeftsobjekts
     */
    private final Typ typ = Typ.LOKATIONSZUORDNUNG;
    /**
     * Zeitspanne der Gültigkeit
     */
    private Zeitspanne gueltigkeit;
    /**
     * Code, der angibt wie die Lokationsbündelstruktur zusammengesetzt ist (zu finden unter
     * "Codeliste der Lokationsbündelstrukturen" auf https://www.edi-energy.de/index.php?id=38)
     */
    private String lokationsbuendelcode;
    /**
     * Liste mit referenzierten Marktlokationen
     */
    private List<Marktlokation> marktlokationen;
    /**
     * Liste mit referenzierten Messlokationen
     */
    private List<Messlokation> messlokationen;
    /**
     * Liste mit referenzierten Netzlokationen
     */
    private List<Netzlokation> netzlokationen;
    /**
     * Liste mit referenzierten steuerbaren Ressourcen
     */
    private List<SteuerbareRessource> steuerbareRessourcen;
    /**
     * Liste mit referenzierten technischen Ressourcen
     */
    private List<TechnischeRessource> technischeRessourcen;
    /**
     * Verknüpfungsrichtung z.B. Malo-Melo [TODO: Eventuell anderer Datentyp]
     */
    private String zuordnungstyp;

    public Lokationszuordnung() {
    }

    private Lokationszuordnung(LokationszuordnungBuilder builder) {
        super(builder);
        this.gueltigkeit = builder.gueltigkeit;
        this.lokationsbuendelcode = builder.lokationsbuendelcode;
        this.marktlokationen = builder.marktlokationen;
        this.messlokationen = builder.messlokationen;
        this.netzlokationen = builder.netzlokationen;
        this.steuerbareRessourcen = builder.steuerbareRessourcen;
        this.technischeRessourcen = builder.technischeRessourcen;
        this.zuordnungstyp = builder.zuordnungstyp;
    }

    public Typ getTyp() {
        return typ;
    }

    public Zeitspanne getGueltigkeit() {
        return gueltigkeit;
    }

    public void setGueltigkeit(Zeitspanne gueltigkeit) {
        this.gueltigkeit = gueltigkeit;
    }

    public String getLokationsbuendelcode() {
        return lokationsbuendelcode;
    }

    public void setLokationsbuendelcode(String lokationsbuendelcode) {
        this.lokationsbuendelcode = lokationsbuendelcode;
    }

    public List<Marktlokation> getMarktlokationen() {
        return marktlokationen;
    }

    public void setMarktlokationen(List<Marktlokation> marktlokationen) {
        this.marktlokationen = marktlokationen;
    }

    public List<Messlokation> getMesslokationen() {
        return messlokationen;
    }

    public void setMesslokationen(List<Messlokation> messlokationen) {
        this.messlokationen = messlokationen;
    }

    public List<Netzlokation> getNetzlokationen() {
        return netzlokationen;
    }

    public void setNetzlokationen(List<Netzlokation> netzlokationen) {
        this.netzlokationen = netzlokationen;
    }

    public List<SteuerbareRessource> getSteuerbareRessourcen() {
        return steuerbareRessourcen;
    }

    public void setSteuerbareRessourcen(List<SteuerbareRessource> steuerbareRessourcen) {
        this.steuerbareRessourcen = steuerbareRessourcen;
    }

    public List<TechnischeRessource> getTechnischeRessourcen() {
        return technischeRessourcen;
    }

    public void setTechnischeRessourcen(List<TechnischeRessource> technischeRessourcen) {
        this.technischeRessourcen = technischeRessourcen;
    }

    public String getZuordnungstyp() {
        return zuordnungstyp;
    }

    public void setZuordnungstyp(String zuordnungstyp) {
        this.zuordnungstyp = zuordnungstyp;
    }

    public static class LokationszuordnungBuilder extends GeschaeftsobjektBuilder {
        /**
         * Zeitspanne der Gültigkeit
         */
        private Zeitspanne gueltigkeit;
        /**
         * Code, der angibt wie die Lokationsbündelstruktur zusammengesetzt ist (zu finden unter
         * "Codeliste der Lokationsbündelstrukturen" auf https://www.edi-energy.de/index.php?id=38)
         */
        private String lokationsbuendelcode;
        /**
         * Liste mit referenzierten Marktlokationen
         */
        private List<Marktlokation> marktlokationen;
        /**
         * Liste mit referenzierten Messlokationen
         */
        private List<Messlokation> messlokationen;
        /**
         * Liste mit referenzierten Netzlokationen
         */
        private List<Netzlokation> netzlokationen;
        /**
         * Liste mit referenzierten steuerbaren Ressourcen
         */
        private List<SteuerbareRessource> steuerbareRessourcen;
        /**
         * Liste mit referenzierten technischen Ressourcen
         */
        private List<TechnischeRessource> technischeRessourcen;
        /**
         * Verknüpfungsrichtung z.B. Malo-Melo [TODO: Eventuell anderer Datentyp]
         */
        private String zuordnungstyp;
    
        public Zeitspanne getGueltigkeit() {
            return gueltigkeit;
        }
    
        public LokationszuordnungBuilder setGueltigkeit(Zeitspanne gueltigkeit) {
            this.gueltigkeit = gueltigkeit;
            return this;
        }
    
        public String getLokationsbuendelcode() {
            return lokationsbuendelcode;
        }
    
        public LokationszuordnungBuilder setLokationsbuendelcode(String lokationsbuendelcode) {
            this.lokationsbuendelcode = lokationsbuendelcode;
            return this;
        }
    
        public List<Marktlokation> getMarktlokationen() {
            return marktlokationen;
        }
    
        public LokationszuordnungBuilder setMarktlokationen(List<Marktlokation> marktlokationen) {
            this.marktlokationen = marktlokationen;
            return this;
        }
    
        public List<Messlokation> getMesslokationen() {
            return messlokationen;
        }
    
        public LokationszuordnungBuilder setMesslokationen(List<Messlokation> messlokationen) {
            this.messlokationen = messlokationen;
            return this;
        }
    
        public List<Netzlokation> getNetzlokationen() {
            return netzlokationen;
        }
    
        public LokationszuordnungBuilder setNetzlokationen(List<Netzlokation> netzlokationen) {
            this.netzlokationen = netzlokationen;
            return this;
        }
    
        public List<SteuerbareRessource> getSteuerbareRessourcen() {
            return steuerbareRessourcen;
        }
    
        public LokationszuordnungBuilder setSteuerbareRessourcen(List<SteuerbareRessource> steuerbareRessourcen) {
            this.steuerbareRessourcen = steuerbareRessourcen;
            return this;
        }
    
        public List<TechnischeRessource> getTechnischeRessourcen() {
            return technischeRessourcen;
        }
    
        public LokationszuordnungBuilder setTechnischeRessourcen(List<TechnischeRessource> technischeRessourcen) {
            this.technischeRessourcen = technischeRessourcen;
            return this;
        }
    
        public String getZuordnungstyp() {
            return zuordnungstyp;
        }
    
        public LokationszuordnungBuilder setZuordnungstyp(String zuordnungstyp) {
            this.zuordnungstyp = zuordnungstyp;
            return this;
        }
    
        public LokationszuordnungBuilder setId(String id) {
            super.setId(id);
            return this;
        }
    
        public LokationszuordnungBuilder setZusatzAttribute(List<ZusatzAttribut> zusatzAttribute) {
            super.setZusatzAttribute(zusatzAttribute);
            return this;
        }
    
        public Lokationszuordnung build() {
            return new Lokationszuordnung(this);
        }
    }
}