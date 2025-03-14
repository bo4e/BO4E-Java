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
* <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/BO4E/BO4E-Schemas/v202401.6.0/src/bo4e_schemas/bo/TechnischeRessource.json>`_
*/
public class TechnischeRessource extends Geschaeftsobjekt {
    private final Typ _typ = Typ.TECHNISCHERESSOURCE;
    private EMobilitaetsart emobilitaetsart;
    private Erzeugungsart erzeugungsart;
    private String lokationsbuendelObjektcode;
    private List<Lokationszuordnung> lokationszuordnungen;
    private Menge nennleistungabgabe;
    private Menge nennleistungaufnahme;
    private Speicherart speicherart;
    private Menge speicherkapazitaet;
    private String technischeRessourceId;
    private TechnischeRessourceNutzung technischeRessourceNutzung;
    private TechnischeRessourceVerbrauchsart technischeRessourceVerbrauchsart;
    private String vorgelagerteMesslokationId;
    private Waermenutzung waermenutzung;
    private String zugeordneteMarktlokationId;
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

    public Typ get_typ() {
        return _typ;
    }

    /**
    * Art der E-Mobilität
    */
    public EMobilitaetsart getEmobilitaetsart() {
        return emobilitaetsart;
    }

    /**
    * Art der E-Mobilität
    */
    public void setEmobilitaetsart(EMobilitaetsart emobilitaetsart) {
        this.emobilitaetsart = emobilitaetsart;
    }

    /**
    * Art der Erzeugung der Energie
    */
    public Erzeugungsart getErzeugungsart() {
        return erzeugungsart;
    }

    /**
    * Art der Erzeugung der Energie
    */
    public void setErzeugungsart(Erzeugungsart erzeugungsart) {
        this.erzeugungsart = erzeugungsart;
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
    * Nennleistung (Abgabe)
    */
    public Menge getNennleistungabgabe() {
        return nennleistungabgabe;
    }

    /**
    * Nennleistung (Abgabe)
    */
    public void setNennleistungabgabe(Menge nennleistungabgabe) {
        this.nennleistungabgabe = nennleistungabgabe;
    }

    /**
    * Nennleistung (Aufnahme)
    */
    public Menge getNennleistungaufnahme() {
        return nennleistungaufnahme;
    }

    /**
    * Nennleistung (Aufnahme)
    */
    public void setNennleistungaufnahme(Menge nennleistungaufnahme) {
        this.nennleistungaufnahme = nennleistungaufnahme;
    }

    /**
    * Art des Speichers
    */
    public Speicherart getSpeicherart() {
        return speicherart;
    }

    /**
    * Art des Speichers
    */
    public void setSpeicherart(Speicherart speicherart) {
        this.speicherart = speicherart;
    }

    /**
    * Speicherkapazität
    */
    public Menge getSpeicherkapazitaet() {
        return speicherkapazitaet;
    }

    /**
    * Speicherkapazität
    */
    public void setSpeicherkapazitaet(Menge speicherkapazitaet) {
        this.speicherkapazitaet = speicherkapazitaet;
    }

    /**
    * Identifikationsnummer einer technischen Ressource
    */
    public String getTechnischeRessourceId() {
        return technischeRessourceId;
    }

    /**
    * Identifikationsnummer einer technischen Ressource
    */
    public void setTechnischeRessourceId(String technischeRessourceId) {
        this.technischeRessourceId = technischeRessourceId;
    }

    /**
    * Art und Nutzung der technischen Ressource
    */
    public TechnischeRessourceNutzung getTechnischeRessourceNutzung() {
        return technischeRessourceNutzung;
    }

    /**
    * Art und Nutzung der technischen Ressource
    */
    public void setTechnischeRessourceNutzung(TechnischeRessourceNutzung technischeRessourceNutzung) {
        this.technischeRessourceNutzung = technischeRessourceNutzung;
    }

    /**
    * Verbrauchsart der technischen Ressource
    */
    public TechnischeRessourceVerbrauchsart getTechnischeRessourceVerbrauchsart() {
        return technischeRessourceVerbrauchsart;
    }

    /**
    * Verbrauchsart der technischen Ressource
    */
    public void setTechnischeRessourceVerbrauchsart(TechnischeRessourceVerbrauchsart technischeRessourceVerbrauchsart) {
        this.technischeRessourceVerbrauchsart = technischeRessourceVerbrauchsart;
    }

    /**
    * Vorgelagerte Messlokation ID
    */
    public String getVorgelagerteMesslokationId() {
        return vorgelagerteMesslokationId;
    }

    /**
    * Vorgelagerte Messlokation ID
    */
    public void setVorgelagerteMesslokationId(String vorgelagerteMesslokationId) {
        this.vorgelagerteMesslokationId = vorgelagerteMesslokationId;
    }

    /**
    * Wärmenutzung
    */
    public Waermenutzung getWaermenutzung() {
        return waermenutzung;
    }

    /**
    * Wärmenutzung
    */
    public void setWaermenutzung(Waermenutzung waermenutzung) {
        this.waermenutzung = waermenutzung;
    }

    /**
    * Referenz auf die der technischen Ressource zugeordneten Marktlokation
    */
    public String getZugeordneteMarktlokationId() {
        return zugeordneteMarktlokationId;
    }

    /**
    * Referenz auf die der technischen Ressource zugeordneten Marktlokation
    */
    public void setZugeordneteMarktlokationId(String zugeordneteMarktlokationId) {
        this.zugeordneteMarktlokationId = zugeordneteMarktlokationId;
    }

    /**
    * Referenz auf die der technischen Ressource zugeordneten Steuerbaren Ressource
    */
    public String getZugeordneteSteuerbareRessourceId() {
        return zugeordneteSteuerbareRessourceId;
    }

    /**
    * Referenz auf die der technischen Ressource zugeordneten Steuerbaren Ressource
    */
    public void setZugeordneteSteuerbareRessourceId(String zugeordneteSteuerbareRessourceId) {
        this.zugeordneteSteuerbareRessourceId = zugeordneteSteuerbareRessourceId;
    }

    public static TechnischeRessourceBuilder builder() {
        return new TechnischeRessourceBuilder();
    }

    public static class TechnischeRessourceBuilder extends GeschaeftsobjektBuilder {
        private EMobilitaetsart emobilitaetsart;
        private Erzeugungsart erzeugungsart;
        private String lokationsbuendelObjektcode;
        private List<Lokationszuordnung> lokationszuordnungen;
        private Menge nennleistungabgabe;
        private Menge nennleistungaufnahme;
        private Speicherart speicherart;
        private Menge speicherkapazitaet;
        private String technischeRessourceId;
        private TechnischeRessourceNutzung technischeRessourceNutzung;
        private TechnischeRessourceVerbrauchsart technischeRessourceVerbrauchsart;
        private String vorgelagerteMesslokationId;
        private Waermenutzung waermenutzung;
        private String zugeordneteMarktlokationId;
        private String zugeordneteSteuerbareRessourceId;

        private TechnischeRessourceBuilder() {
        }

        /**
        * Art der E-Mobilität
        */
        public TechnischeRessourceBuilder setEmobilitaetsart(EMobilitaetsart emobilitaetsart) {
            this.emobilitaetsart = emobilitaetsart;
            return this;
        }

        /**
        * Art der Erzeugung der Energie
        */
        public TechnischeRessourceBuilder setErzeugungsart(Erzeugungsart erzeugungsart) {
            this.erzeugungsart = erzeugungsart;
            return this;
        }

        /**
        * Lokationsbuendel Code, der die Funktion dieses BOs an der Lokationsbuendelstruktur
        * beschreibt.
        */
        public TechnischeRessourceBuilder setLokationsbuendelObjektcode(String lokationsbuendelObjektcode) {
            this.lokationsbuendelObjektcode = lokationsbuendelObjektcode;
            return this;
        }

        /**
        * Lokationszuordnung, um bspw. die zugehörigen Messlokationen anzugeben
        */
        public TechnischeRessourceBuilder setLokationszuordnungen(List<Lokationszuordnung> lokationszuordnungen) {
            this.lokationszuordnungen = lokationszuordnungen;
            return this;
        }

        /**
        * Nennleistung (Abgabe)
        */
        public TechnischeRessourceBuilder setNennleistungabgabe(Menge nennleistungabgabe) {
            this.nennleistungabgabe = nennleistungabgabe;
            return this;
        }

        /**
        * Nennleistung (Aufnahme)
        */
        public TechnischeRessourceBuilder setNennleistungaufnahme(Menge nennleistungaufnahme) {
            this.nennleistungaufnahme = nennleistungaufnahme;
            return this;
        }

        /**
        * Art des Speichers
        */
        public TechnischeRessourceBuilder setSpeicherart(Speicherart speicherart) {
            this.speicherart = speicherart;
            return this;
        }

        /**
        * Speicherkapazität
        */
        public TechnischeRessourceBuilder setSpeicherkapazitaet(Menge speicherkapazitaet) {
            this.speicherkapazitaet = speicherkapazitaet;
            return this;
        }

        /**
        * Identifikationsnummer einer technischen Ressource
        */
        public TechnischeRessourceBuilder setTechnischeRessourceId(String technischeRessourceId) {
            this.technischeRessourceId = technischeRessourceId;
            return this;
        }

        /**
        * Art und Nutzung der technischen Ressource
        */
        public TechnischeRessourceBuilder setTechnischeRessourceNutzung(TechnischeRessourceNutzung technischeRessourceNutzung) {
            this.technischeRessourceNutzung = technischeRessourceNutzung;
            return this;
        }

        /**
        * Verbrauchsart der technischen Ressource
        */
        public TechnischeRessourceBuilder setTechnischeRessourceVerbrauchsart(TechnischeRessourceVerbrauchsart technischeRessourceVerbrauchsart) {
            this.technischeRessourceVerbrauchsart = technischeRessourceVerbrauchsart;
            return this;
        }

        /**
        * Vorgelagerte Messlokation ID
        */
        public TechnischeRessourceBuilder setVorgelagerteMesslokationId(String vorgelagerteMesslokationId) {
            this.vorgelagerteMesslokationId = vorgelagerteMesslokationId;
            return this;
        }

        /**
        * Wärmenutzung
        */
        public TechnischeRessourceBuilder setWaermenutzung(Waermenutzung waermenutzung) {
            this.waermenutzung = waermenutzung;
            return this;
        }

        /**
        * Referenz auf die der technischen Ressource zugeordneten Marktlokation
        */
        public TechnischeRessourceBuilder setZugeordneteMarktlokationId(String zugeordneteMarktlokationId) {
            this.zugeordneteMarktlokationId = zugeordneteMarktlokationId;
            return this;
        }

        /**
        * Referenz auf die der technischen Ressource zugeordneten Steuerbaren Ressource
        */
        public TechnischeRessourceBuilder setZugeordneteSteuerbareRessourceId(String zugeordneteSteuerbareRessourceId) {
            this.zugeordneteSteuerbareRessourceId = zugeordneteSteuerbareRessourceId;
            return this;
        }

        public TechnischeRessourceBuilder set_id(String _id) {
            super.set_id(_id);
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