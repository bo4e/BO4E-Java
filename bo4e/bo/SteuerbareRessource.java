package bo4e.bo;

import bo4e.ZusatzAttribut;
import bo4e.com.Konfigurationsprodukt;
import bo4e.enums.Marktrolle;
import bo4e.enums.SteuerkanalLeistungsbeschreibung;
import bo4e.enums.Typ;

import java.util.List;

/**
 * Object containing information about a steuerbare Ressource
 *
 * .. raw:: html
 *
 * <object data="../_static/images/bo4e/bo/SteuerbareRessource.svg"
 * type="image/svg+xml"></object>
 *
 * .. HINT::
 * `SteuerbareRessource JSON Schema
 * <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/BO4E/BO4E-Schemas/v202401.3.1/src/bo4e_schemas/bo/SteuerbareRessource.json>`_
 */
public class SteuerbareRessource extends Geschaeftsobjekt {
    /**
     * Typ des Geschaeftsobjekts
     */
    private final Typ typ = Typ.STEUERBARERESSOURCE;
    /**
     * Eigenschaft des Messstellenbetreibers an der Lokation
     */
    private Marktrolle eigenschaftMsbLokation;
    /**
     * Produkt-Daten der Steuerbaren Ressource
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
     * Id der steuerbaren Ressource
     */
    private String steuerbareRessourceId;
    /**
     * Leistungsbeschreibung des Steuerkanals
     */
    private SteuerkanalLeistungsbeschreibung steuerkanalLeistungsbeschreibung;
    /**
     * Angabe des Messstellenbetreibers, der der Steuerbaren Ressource zugeordnet ist.
     */
    private String zugeordneteMsbCodenummer;

    public SteuerbareRessource() {
    }

    private SteuerbareRessource(SteuerbareRessourceBuilder builder) {
        super(builder);
        this.eigenschaftMsbLokation = builder.eigenschaftMsbLokation;
        this.konfigurationsprodukte = builder.konfigurationsprodukte;
        this.lokationsbuendelObjektcode = builder.lokationsbuendelObjektcode;
        this.lokationszuordnungen = builder.lokationszuordnungen;
        this.steuerbareRessourceId = builder.steuerbareRessourceId;
        this.steuerkanalLeistungsbeschreibung = builder.steuerkanalLeistungsbeschreibung;
        this.zugeordneteMsbCodenummer = builder.zugeordneteMsbCodenummer;
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

    public String getSteuerbareRessourceId() {
        return steuerbareRessourceId;
    }

    public void setSteuerbareRessourceId(String steuerbareRessourceId) {
        this.steuerbareRessourceId = steuerbareRessourceId;
    }

    public SteuerkanalLeistungsbeschreibung getSteuerkanalLeistungsbeschreibung() {
        return steuerkanalLeistungsbeschreibung;
    }

    public void setSteuerkanalLeistungsbeschreibung(SteuerkanalLeistungsbeschreibung steuerkanalLeistungsbeschreibung) {
        this.steuerkanalLeistungsbeschreibung = steuerkanalLeistungsbeschreibung;
    }

    public String getZugeordneteMsbCodenummer() {
        return zugeordneteMsbCodenummer;
    }

    public void setZugeordneteMsbCodenummer(String zugeordneteMsbCodenummer) {
        this.zugeordneteMsbCodenummer = zugeordneteMsbCodenummer;
    }

    public static class SteuerbareRessourceBuilder extends GeschaeftsobjektBuilder {
        /**
         * Eigenschaft des Messstellenbetreibers an der Lokation
         */
        private Marktrolle eigenschaftMsbLokation;
        /**
         * Produkt-Daten der Steuerbaren Ressource
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
         * Id der steuerbaren Ressource
         */
        private String steuerbareRessourceId;
        /**
         * Leistungsbeschreibung des Steuerkanals
         */
        private SteuerkanalLeistungsbeschreibung steuerkanalLeistungsbeschreibung;
        /**
         * Angabe des Messstellenbetreibers, der der Steuerbaren Ressource zugeordnet ist.
         */
        private String zugeordneteMsbCodenummer;
    
        public Marktrolle getEigenschaftMsbLokation() {
            return eigenschaftMsbLokation;
        }
    
        public SteuerbareRessourceBuilder setEigenschaftMsbLokation(Marktrolle eigenschaftMsbLokation) {
            this.eigenschaftMsbLokation = eigenschaftMsbLokation;
            return this;
        }
    
        public List<Konfigurationsprodukt> getKonfigurationsprodukte() {
            return konfigurationsprodukte;
        }
    
        public SteuerbareRessourceBuilder setKonfigurationsprodukte(List<Konfigurationsprodukt> konfigurationsprodukte) {
            this.konfigurationsprodukte = konfigurationsprodukte;
            return this;
        }
    
        public String getLokationsbuendelObjektcode() {
            return lokationsbuendelObjektcode;
        }
    
        public SteuerbareRessourceBuilder setLokationsbuendelObjektcode(String lokationsbuendelObjektcode) {
            this.lokationsbuendelObjektcode = lokationsbuendelObjektcode;
            return this;
        }
    
        public List<Lokationszuordnung> getLokationszuordnungen() {
            return lokationszuordnungen;
        }
    
        public SteuerbareRessourceBuilder setLokationszuordnungen(List<Lokationszuordnung> lokationszuordnungen) {
            this.lokationszuordnungen = lokationszuordnungen;
            return this;
        }
    
        public String getSteuerbareRessourceId() {
            return steuerbareRessourceId;
        }
    
        public SteuerbareRessourceBuilder setSteuerbareRessourceId(String steuerbareRessourceId) {
            this.steuerbareRessourceId = steuerbareRessourceId;
            return this;
        }
    
        public SteuerkanalLeistungsbeschreibung getSteuerkanalLeistungsbeschreibung() {
            return steuerkanalLeistungsbeschreibung;
        }
    
        public SteuerbareRessourceBuilder setSteuerkanalLeistungsbeschreibung(SteuerkanalLeistungsbeschreibung steuerkanalLeistungsbeschreibung) {
            this.steuerkanalLeistungsbeschreibung = steuerkanalLeistungsbeschreibung;
            return this;
        }
    
        public String getZugeordneteMsbCodenummer() {
            return zugeordneteMsbCodenummer;
        }
    
        public SteuerbareRessourceBuilder setZugeordneteMsbCodenummer(String zugeordneteMsbCodenummer) {
            this.zugeordneteMsbCodenummer = zugeordneteMsbCodenummer;
            return this;
        }
    
        public SteuerbareRessourceBuilder setId(String id) {
            super.setId(id);
            return this;
        }
    
        public SteuerbareRessourceBuilder setZusatzAttribute(List<ZusatzAttribut> zusatzAttribute) {
            super.setZusatzAttribute(zusatzAttribute);
            return this;
        }
    
        public SteuerbareRessource build() {
            return new SteuerbareRessource(this);
        }
    }
}