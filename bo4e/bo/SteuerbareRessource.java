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
* <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/BO4E/BO4E-Schemas/v202401.4.0/src/bo4e_schemas/bo/SteuerbareRessource.json>`_
*/
public class SteuerbareRessource extends Geschaeftsobjekt {
    private final Typ typ = Typ.STEUERBARERESSOURCE;
    private Marktrolle eigenschaftMsbLokation;
    private List<Konfigurationsprodukt> konfigurationsprodukte;
    private String lokationsbuendelObjektcode;
    private List<Lokationszuordnung> lokationszuordnungen;
    private String steuerbareRessourceId;
    private SteuerkanalLeistungsbeschreibung steuerkanalLeistungsbeschreibung;
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
    * Produkt-Daten der Steuerbaren Ressource
    */
    public List<Konfigurationsprodukt> getKonfigurationsprodukte() {
        return konfigurationsprodukte;
    }

    /**
    * Produkt-Daten der Steuerbaren Ressource
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
    * Id der steuerbaren Ressource
    */
    public String getSteuerbareRessourceId() {
        return steuerbareRessourceId;
    }

    /**
    * Id der steuerbaren Ressource
    */
    public void setSteuerbareRessourceId(String steuerbareRessourceId) {
        this.steuerbareRessourceId = steuerbareRessourceId;
    }

    /**
    * Leistungsbeschreibung des Steuerkanals
    */
    public SteuerkanalLeistungsbeschreibung getSteuerkanalLeistungsbeschreibung() {
        return steuerkanalLeistungsbeschreibung;
    }

    /**
    * Leistungsbeschreibung des Steuerkanals
    */
    public void setSteuerkanalLeistungsbeschreibung(SteuerkanalLeistungsbeschreibung steuerkanalLeistungsbeschreibung) {
        this.steuerkanalLeistungsbeschreibung = steuerkanalLeistungsbeschreibung;
    }

    /**
    * Angabe des Messstellenbetreibers, der der Steuerbaren Ressource zugeordnet ist.
    */
    public String getZugeordneteMsbCodenummer() {
        return zugeordneteMsbCodenummer;
    }

    /**
    * Angabe des Messstellenbetreibers, der der Steuerbaren Ressource zugeordnet ist.
    */
    public void setZugeordneteMsbCodenummer(String zugeordneteMsbCodenummer) {
        this.zugeordneteMsbCodenummer = zugeordneteMsbCodenummer;
    }

    public static SteuerbareRessourceBuilder builder() {
        return new SteuerbareRessourceBuilder();
    }

    public static class SteuerbareRessourceBuilder extends GeschaeftsobjektBuilder {
        private Marktrolle eigenschaftMsbLokation;
        private List<Konfigurationsprodukt> konfigurationsprodukte;
        private String lokationsbuendelObjektcode;
        private List<Lokationszuordnung> lokationszuordnungen;
        private String steuerbareRessourceId;
        private SteuerkanalLeistungsbeschreibung steuerkanalLeistungsbeschreibung;
        private String zugeordneteMsbCodenummer;

        private SteuerbareRessourceBuilder() {
        }

        /**
        * Eigenschaft des Messstellenbetreibers an der Lokation
        */
        public SteuerbareRessourceBuilder setEigenschaftMsbLokation(Marktrolle eigenschaftMsbLokation) {
            this.eigenschaftMsbLokation = eigenschaftMsbLokation;
            return this;
        }

        /**
        * Produkt-Daten der Steuerbaren Ressource
        */
        public SteuerbareRessourceBuilder setKonfigurationsprodukte(List<Konfigurationsprodukt> konfigurationsprodukte) {
            this.konfigurationsprodukte = konfigurationsprodukte;
            return this;
        }

        /**
        * Lokationsbuendel Code, der die Funktion dieses BOs an der Lokationsbuendelstruktur
        * beschreibt.
        */
        public SteuerbareRessourceBuilder setLokationsbuendelObjektcode(String lokationsbuendelObjektcode) {
            this.lokationsbuendelObjektcode = lokationsbuendelObjektcode;
            return this;
        }

        /**
        * Lokationszuordnung, um bspw. die zugehörigen Messlokationen anzugeben
        */
        public SteuerbareRessourceBuilder setLokationszuordnungen(List<Lokationszuordnung> lokationszuordnungen) {
            this.lokationszuordnungen = lokationszuordnungen;
            return this;
        }

        /**
        * Id der steuerbaren Ressource
        */
        public SteuerbareRessourceBuilder setSteuerbareRessourceId(String steuerbareRessourceId) {
            this.steuerbareRessourceId = steuerbareRessourceId;
            return this;
        }

        /**
        * Leistungsbeschreibung des Steuerkanals
        */
        public SteuerbareRessourceBuilder setSteuerkanalLeistungsbeschreibung(SteuerkanalLeistungsbeschreibung steuerkanalLeistungsbeschreibung) {
            this.steuerkanalLeistungsbeschreibung = steuerkanalLeistungsbeschreibung;
            return this;
        }

        /**
        * Angabe des Messstellenbetreibers, der der Steuerbaren Ressource zugeordnet ist.
        */
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