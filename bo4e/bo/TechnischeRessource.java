package bo4e.bo;

import bo4e.ZusatzAttribut;
import bo4e.com.Menge;
import bo4e.enums.EMobilitaetsart;
import bo4e.enums.Erzeugungsart;
import bo4e.enums.Speicherart;
import bo4e.enums.TechnischeRessourceNutzung;
import bo4e.enums.TechnischeRessourceVerbrauchsart;
import bo4e.enums.Typ;
import bo4e.enums.Waermenutzung;

import java.util.List;

/**
 * Object containing information about a technische Ressource
 *
 * .. raw:: html
 *
 * <object data="../_static/images/bo4e/bo/TechnischeRessource.svg"
 * type="image/svg+xml"></object>
 *
 * .. HINT::
 * `TechnischeRessource JSON Schema
 * <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/BO4E/BO4E-Schemas/v202401.3.1/src/bo4e_schemas/bo/TechnischeRessource.json>`_
 */
public class TechnischeRessource extends Geschaeftsobjekt {
    /**
     * Typ des Geschaeftsobjekts
     */
    private final Typ typ = Typ.TECHNISCHERESSOURCE;
    /**
     * Art der E-Mobilität
     */
    private EMobilitaetsart emobilitaetsart;
    /**
     * Art der Erzeugung der Energie
     */
    private Erzeugungsart erzeugungsart;
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
     * Nennleistung (Abgabe)
     */
    private Menge nennleistungabgabe;
    /**
     * Nennleistung (Aufnahme)
     */
    private Menge nennleistungaufnahme;
    /**
     * Art des Speichers
     */
    private Speicherart speicherart;
    /**
     * Speicherkapazität
     */
    private Menge speicherkapazitaet;
    /**
     * Identifikationsnummer einer technischen Ressource
     */
    private String technischeRessourceId;
    /**
     * Art und Nutzung der technischen Ressource
     */
    private TechnischeRessourceNutzung technischeRessourceNutzung;
    /**
     * Verbrauchsart der technischen Ressource
     */
    private TechnischeRessourceVerbrauchsart technischeRessourceVerbrauchsart;
    /**
     * Vorgelagerte Messlokation ID
     */
    private String vorgelagerteMesslokationId;
    /**
     * Wärmenutzung
     */
    private Waermenutzung waermenutzung;
    /**
     * Referenz auf die der technischen Ressource zugeordneten Marktlokation
     */
    private String zugeordneteMarktlokationId;
    /**
     * Referenz auf die der technischen Ressource zugeordneten Steuerbaren Ressource
     */
    private String zugeordneteSteuerbareRessourceId;

    public TechnischeRessource() {
    }

    private TechnischeRessource(TechnischeRessourceBuilder builder) {
        super(builder);
        this.emobilitaetsart = builder.emobilitaetsart;
        this.erzeugungsart = builder.erzeugungsart;
        this.lokationsbuendelObjektcode = builder.lokationsbuendelObjektcode;
        this.lokationszuordnungen = builder.lokationszuordnungen;
        this.nennleistungabgabe = builder.nennleistungabgabe;
        this.nennleistungaufnahme = builder.nennleistungaufnahme;
        this.speicherart = builder.speicherart;
        this.speicherkapazitaet = builder.speicherkapazitaet;
        this.technischeRessourceId = builder.technischeRessourceId;
        this.technischeRessourceNutzung = builder.technischeRessourceNutzung;
        this.technischeRessourceVerbrauchsart = builder.technischeRessourceVerbrauchsart;
        this.vorgelagerteMesslokationId = builder.vorgelagerteMesslokationId;
        this.waermenutzung = builder.waermenutzung;
        this.zugeordneteMarktlokationId = builder.zugeordneteMarktlokationId;
        this.zugeordneteSteuerbareRessourceId = builder.zugeordneteSteuerbareRessourceId;
    }

    public Typ getTyp() {
        return typ;
    }

    public EMobilitaetsart getEmobilitaetsart() {
        return emobilitaetsart;
    }

    public void setEmobilitaetsart(EMobilitaetsart emobilitaetsart) {
        this.emobilitaetsart = emobilitaetsart;
    }

    public Erzeugungsart getErzeugungsart() {
        return erzeugungsart;
    }

    public void setErzeugungsart(Erzeugungsart erzeugungsart) {
        this.erzeugungsart = erzeugungsart;
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

    public Menge getNennleistungabgabe() {
        return nennleistungabgabe;
    }

    public void setNennleistungabgabe(Menge nennleistungabgabe) {
        this.nennleistungabgabe = nennleistungabgabe;
    }

    public Menge getNennleistungaufnahme() {
        return nennleistungaufnahme;
    }

    public void setNennleistungaufnahme(Menge nennleistungaufnahme) {
        this.nennleistungaufnahme = nennleistungaufnahme;
    }

    public Speicherart getSpeicherart() {
        return speicherart;
    }

    public void setSpeicherart(Speicherart speicherart) {
        this.speicherart = speicherart;
    }

    public Menge getSpeicherkapazitaet() {
        return speicherkapazitaet;
    }

    public void setSpeicherkapazitaet(Menge speicherkapazitaet) {
        this.speicherkapazitaet = speicherkapazitaet;
    }

    public String getTechnischeRessourceId() {
        return technischeRessourceId;
    }

    public void setTechnischeRessourceId(String technischeRessourceId) {
        this.technischeRessourceId = technischeRessourceId;
    }

    public TechnischeRessourceNutzung getTechnischeRessourceNutzung() {
        return technischeRessourceNutzung;
    }

    public void setTechnischeRessourceNutzung(TechnischeRessourceNutzung technischeRessourceNutzung) {
        this.technischeRessourceNutzung = technischeRessourceNutzung;
    }

    public TechnischeRessourceVerbrauchsart getTechnischeRessourceVerbrauchsart() {
        return technischeRessourceVerbrauchsart;
    }

    public void setTechnischeRessourceVerbrauchsart(TechnischeRessourceVerbrauchsart technischeRessourceVerbrauchsart) {
        this.technischeRessourceVerbrauchsart = technischeRessourceVerbrauchsart;
    }

    public String getVorgelagerteMesslokationId() {
        return vorgelagerteMesslokationId;
    }

    public void setVorgelagerteMesslokationId(String vorgelagerteMesslokationId) {
        this.vorgelagerteMesslokationId = vorgelagerteMesslokationId;
    }

    public Waermenutzung getWaermenutzung() {
        return waermenutzung;
    }

    public void setWaermenutzung(Waermenutzung waermenutzung) {
        this.waermenutzung = waermenutzung;
    }

    public String getZugeordneteMarktlokationId() {
        return zugeordneteMarktlokationId;
    }

    public void setZugeordneteMarktlokationId(String zugeordneteMarktlokationId) {
        this.zugeordneteMarktlokationId = zugeordneteMarktlokationId;
    }

    public String getZugeordneteSteuerbareRessourceId() {
        return zugeordneteSteuerbareRessourceId;
    }

    public void setZugeordneteSteuerbareRessourceId(String zugeordneteSteuerbareRessourceId) {
        this.zugeordneteSteuerbareRessourceId = zugeordneteSteuerbareRessourceId;
    }

    public static class TechnischeRessourceBuilder extends GeschaeftsobjektBuilder {
        /**
         * Art der E-Mobilität
         */
        private EMobilitaetsart emobilitaetsart;
        /**
         * Art der Erzeugung der Energie
         */
        private Erzeugungsart erzeugungsart;
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
         * Nennleistung (Abgabe)
         */
        private Menge nennleistungabgabe;
        /**
         * Nennleistung (Aufnahme)
         */
        private Menge nennleistungaufnahme;
        /**
         * Art des Speichers
         */
        private Speicherart speicherart;
        /**
         * Speicherkapazität
         */
        private Menge speicherkapazitaet;
        /**
         * Identifikationsnummer einer technischen Ressource
         */
        private String technischeRessourceId;
        /**
         * Art und Nutzung der technischen Ressource
         */
        private TechnischeRessourceNutzung technischeRessourceNutzung;
        /**
         * Verbrauchsart der technischen Ressource
         */
        private TechnischeRessourceVerbrauchsart technischeRessourceVerbrauchsart;
        /**
         * Vorgelagerte Messlokation ID
         */
        private String vorgelagerteMesslokationId;
        /**
         * Wärmenutzung
         */
        private Waermenutzung waermenutzung;
        /**
         * Referenz auf die der technischen Ressource zugeordneten Marktlokation
         */
        private String zugeordneteMarktlokationId;
        /**
         * Referenz auf die der technischen Ressource zugeordneten Steuerbaren Ressource
         */
        private String zugeordneteSteuerbareRessourceId;
    
        public EMobilitaetsart getEmobilitaetsart() {
            return emobilitaetsart;
        }
    
        public TechnischeRessourceBuilder setEmobilitaetsart(EMobilitaetsart emobilitaetsart) {
            this.emobilitaetsart = emobilitaetsart;
            return this;
        }
    
        public Erzeugungsart getErzeugungsart() {
            return erzeugungsart;
        }
    
        public TechnischeRessourceBuilder setErzeugungsart(Erzeugungsart erzeugungsart) {
            this.erzeugungsart = erzeugungsart;
            return this;
        }
    
        public String getLokationsbuendelObjektcode() {
            return lokationsbuendelObjektcode;
        }
    
        public TechnischeRessourceBuilder setLokationsbuendelObjektcode(String lokationsbuendelObjektcode) {
            this.lokationsbuendelObjektcode = lokationsbuendelObjektcode;
            return this;
        }
    
        public List<Lokationszuordnung> getLokationszuordnungen() {
            return lokationszuordnungen;
        }
    
        public TechnischeRessourceBuilder setLokationszuordnungen(List<Lokationszuordnung> lokationszuordnungen) {
            this.lokationszuordnungen = lokationszuordnungen;
            return this;
        }
    
        public Menge getNennleistungabgabe() {
            return nennleistungabgabe;
        }
    
        public TechnischeRessourceBuilder setNennleistungabgabe(Menge nennleistungabgabe) {
            this.nennleistungabgabe = nennleistungabgabe;
            return this;
        }
    
        public Menge getNennleistungaufnahme() {
            return nennleistungaufnahme;
        }
    
        public TechnischeRessourceBuilder setNennleistungaufnahme(Menge nennleistungaufnahme) {
            this.nennleistungaufnahme = nennleistungaufnahme;
            return this;
        }
    
        public Speicherart getSpeicherart() {
            return speicherart;
        }
    
        public TechnischeRessourceBuilder setSpeicherart(Speicherart speicherart) {
            this.speicherart = speicherart;
            return this;
        }
    
        public Menge getSpeicherkapazitaet() {
            return speicherkapazitaet;
        }
    
        public TechnischeRessourceBuilder setSpeicherkapazitaet(Menge speicherkapazitaet) {
            this.speicherkapazitaet = speicherkapazitaet;
            return this;
        }
    
        public String getTechnischeRessourceId() {
            return technischeRessourceId;
        }
    
        public TechnischeRessourceBuilder setTechnischeRessourceId(String technischeRessourceId) {
            this.technischeRessourceId = technischeRessourceId;
            return this;
        }
    
        public TechnischeRessourceNutzung getTechnischeRessourceNutzung() {
            return technischeRessourceNutzung;
        }
    
        public TechnischeRessourceBuilder setTechnischeRessourceNutzung(TechnischeRessourceNutzung technischeRessourceNutzung) {
            this.technischeRessourceNutzung = technischeRessourceNutzung;
            return this;
        }
    
        public TechnischeRessourceVerbrauchsart getTechnischeRessourceVerbrauchsart() {
            return technischeRessourceVerbrauchsart;
        }
    
        public TechnischeRessourceBuilder setTechnischeRessourceVerbrauchsart(TechnischeRessourceVerbrauchsart technischeRessourceVerbrauchsart) {
            this.technischeRessourceVerbrauchsart = technischeRessourceVerbrauchsart;
            return this;
        }
    
        public String getVorgelagerteMesslokationId() {
            return vorgelagerteMesslokationId;
        }
    
        public TechnischeRessourceBuilder setVorgelagerteMesslokationId(String vorgelagerteMesslokationId) {
            this.vorgelagerteMesslokationId = vorgelagerteMesslokationId;
            return this;
        }
    
        public Waermenutzung getWaermenutzung() {
            return waermenutzung;
        }
    
        public TechnischeRessourceBuilder setWaermenutzung(Waermenutzung waermenutzung) {
            this.waermenutzung = waermenutzung;
            return this;
        }
    
        public String getZugeordneteMarktlokationId() {
            return zugeordneteMarktlokationId;
        }
    
        public TechnischeRessourceBuilder setZugeordneteMarktlokationId(String zugeordneteMarktlokationId) {
            this.zugeordneteMarktlokationId = zugeordneteMarktlokationId;
            return this;
        }
    
        public String getZugeordneteSteuerbareRessourceId() {
            return zugeordneteSteuerbareRessourceId;
        }
    
        public TechnischeRessourceBuilder setZugeordneteSteuerbareRessourceId(String zugeordneteSteuerbareRessourceId) {
            this.zugeordneteSteuerbareRessourceId = zugeordneteSteuerbareRessourceId;
            return this;
        }
    
        public TechnischeRessourceBuilder setId(String id) {
            super.setId(id);
            return this;
        }
    
        public TechnischeRessourceBuilder setZusatzAttribute(List<ZusatzAttribut> zusatzAttribute) {
            super.setZusatzAttribute(zusatzAttribute);
            return this;
        }
    
        public TechnischeRessource build() {
            return new TechnischeRessource(this);
        }
    }
}