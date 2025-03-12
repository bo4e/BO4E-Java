package bo4e.com;

import bo4e.ZusatzAttribut;
import bo4e.bo.Geraet;
import bo4e.enums.Voraussetzungen;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.List;

/**
* Mit dieser Komponente werden Einschränkungen für die Anwendung von Tarifen modelliert.
*
* .. raw:: html
*
* <object data="../_static/images/bo4e/com/Tarifeinschraenkung.svg"
* type="image/svg+xml"></object>
*
* .. HINT::
* `Tarifeinschraenkung JSON Schema
* <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/BO4E/BO4E-Schemas/v202401.5.0/src/bo4e_schemas/com/Tarifeinschraenkung.json>`_
*/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Tarifeinschraenkung extends COM {
    private List<Menge> einschraenkungleistung;
    private List<Geraet> einschraenkungzaehler;
    private List<Voraussetzungen> voraussetzungen;
    private List<String> zusatzprodukte;

    public Tarifeinschraenkung() {
    }

    private Tarifeinschraenkung(TarifeinschraenkungBuilder builder) {
        super(builder);
        this.einschraenkungleistung = builder.einschraenkungleistung;
        this.einschraenkungzaehler = builder.einschraenkungzaehler;
        this.voraussetzungen = builder.voraussetzungen;
        this.zusatzprodukte = builder.zusatzprodukte;
    }

    /**
    * Die vereinbarte Leistung, die (näherungsweise) abgenommen wird.
    * Insbesondere Gastarife können daran gebunden sein, dass die Leistung einer vereinbarten
    * Höhe entspricht.
    */
    public List<Menge> getEinschraenkungleistung() {
        return einschraenkungleistung;
    }

    /**
    * Die vereinbarte Leistung, die (näherungsweise) abgenommen wird.
    * Insbesondere Gastarife können daran gebunden sein, dass die Leistung einer vereinbarten
    * Höhe entspricht.
    */
    public void setEinschraenkungleistung(List<Menge> einschraenkungleistung) {
        this.einschraenkungleistung = einschraenkungleistung;
    }

    /**
    * Liste der Zähler/Geräte, die erforderlich sind, damit dieser Tarif zur Anwendung gelangen
    * kann.
    * (Falls keine Zähler angegeben sind, ist der Tarif nicht an das Vorhandensein bestimmter
    * Zähler gebunden.)
    */
    public List<Geraet> getEinschraenkungzaehler() {
        return einschraenkungzaehler;
    }

    /**
    * Liste der Zähler/Geräte, die erforderlich sind, damit dieser Tarif zur Anwendung gelangen
    * kann.
    * (Falls keine Zähler angegeben sind, ist der Tarif nicht an das Vorhandensein bestimmter
    * Zähler gebunden.)
    */
    public void setEinschraenkungzaehler(List<Geraet> einschraenkungzaehler) {
        this.einschraenkungzaehler = einschraenkungzaehler;
    }

    /**
    * Voraussetzungen, die erfüllt sein müssen, damit dieser Tarif zur Anwendung kommen kann
    */
    public List<Voraussetzungen> getVoraussetzungen() {
        return voraussetzungen;
    }

    /**
    * Voraussetzungen, die erfüllt sein müssen, damit dieser Tarif zur Anwendung kommen kann
    */
    public void setVoraussetzungen(List<Voraussetzungen> voraussetzungen) {
        this.voraussetzungen = voraussetzungen;
    }

    /**
    * Weitere Produkte, die gemeinsam mit diesem Tarif bestellt werden können
    */
    public List<String> getZusatzprodukte() {
        return zusatzprodukte;
    }

    /**
    * Weitere Produkte, die gemeinsam mit diesem Tarif bestellt werden können
    */
    public void setZusatzprodukte(List<String> zusatzprodukte) {
        this.zusatzprodukte = zusatzprodukte;
    }

    public static TarifeinschraenkungBuilder builder() {
        return new TarifeinschraenkungBuilder();
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class TarifeinschraenkungBuilder extends COMBuilder {
        private List<Menge> einschraenkungleistung;
        private List<Geraet> einschraenkungzaehler;
        private List<Voraussetzungen> voraussetzungen;
        private List<String> zusatzprodukte;

        private TarifeinschraenkungBuilder() {
        }

        /**
        * Die vereinbarte Leistung, die (näherungsweise) abgenommen wird.
        * Insbesondere Gastarife können daran gebunden sein, dass die Leistung einer vereinbarten
        * Höhe entspricht.
        */
        public TarifeinschraenkungBuilder setEinschraenkungleistung(List<Menge> einschraenkungleistung) {
            this.einschraenkungleistung = einschraenkungleistung;
            return this;
        }

        /**
        * Liste der Zähler/Geräte, die erforderlich sind, damit dieser Tarif zur Anwendung gelangen
        * kann.
        * (Falls keine Zähler angegeben sind, ist der Tarif nicht an das Vorhandensein bestimmter
        * Zähler gebunden.)
        */
        public TarifeinschraenkungBuilder setEinschraenkungzaehler(List<Geraet> einschraenkungzaehler) {
            this.einschraenkungzaehler = einschraenkungzaehler;
            return this;
        }

        /**
        * Voraussetzungen, die erfüllt sein müssen, damit dieser Tarif zur Anwendung kommen kann
        */
        public TarifeinschraenkungBuilder setVoraussetzungen(List<Voraussetzungen> voraussetzungen) {
            this.voraussetzungen = voraussetzungen;
            return this;
        }

        /**
        * Weitere Produkte, die gemeinsam mit diesem Tarif bestellt werden können
        */
        public TarifeinschraenkungBuilder setZusatzprodukte(List<String> zusatzprodukte) {
            this.zusatzprodukte = zusatzprodukte;
            return this;
        }

        public TarifeinschraenkungBuilder set_id(String _id) {
            super.set_id(_id);
            return this;
        }

        public TarifeinschraenkungBuilder setZusatzAttribute(List<ZusatzAttribut> zusatzAttribute) {
            super.setZusatzAttribute(zusatzAttribute);
            return this;
        }

        public Tarifeinschraenkung build() {
            return new Tarifeinschraenkung(this);
        }
    }
}