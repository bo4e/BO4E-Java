package bo4e.com;

import bo4e.ZusatzAttribut;
import bo4e.enums.ComTyp;

import java.util.List;

/**
* Modelliert eine relative Preisposition.
*
* .. raw:: html
*
* <object data="../_static/images/bo4e/com/RelativePreisposition.svg"
* type="image/svg+xml"></object>
*
* .. HINT::
* `RelativePreisposition JSON Schema
* <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/BO4E/BO4E-Schemas/v202601.0.0/src/bo4e_schemas/com/RelativePreisposition.json>`_
*/
public class RelativePreisposition extends COM {
    private final ComTyp _typ = ComTyp.RELATIVEPREISPOSITION;
    private String bezeichnung;
    private String idReferenz;
    private Double wert;

    public RelativePreisposition() {
    }

    private RelativePreisposition(RelativePreispositionBuilder builder) {
        super(builder);
        this.bezeichnung = builder.bezeichnung;
        this.idReferenz = builder.idReferenz;
        this.wert = builder.wert;
    }

    public ComTyp get_typ() {
        return _typ;
    }

    /**
    * Eine (beliebige) Bezeichnung für die Preisposition.
    */
    public String getBezeichnung() {
        return bezeichnung;
    }

    /**
    * Eine (beliebige) Bezeichnung für die Preisposition.
    */
    public void setBezeichnung(String bezeichnung) {
        this.bezeichnung = bezeichnung;
    }

    /**
    * Referenziert auf eine andere Preisposition.
    * Die Referenz bezieht sich auf das technische Feld `_id`, da es sich hier um eine
    * technische Lösung handelt
    * und der Wert selbst keine fachliche Bedeutung hat.
    * Das `_id` Feld der unterschiedlichen Preispositionen muss innerhalb einer
    * `Tarifpreiszeitscheibe`
    * entsprechend unique sein.
    */
    public String getIdReferenz() {
        return idReferenz;
    }

    /**
    * Referenziert auf eine andere Preisposition.
    * Die Referenz bezieht sich auf das technische Feld `_id`, da es sich hier um eine
    * technische Lösung handelt
    * und der Wert selbst keine fachliche Bedeutung hat.
    * Das `_id` Feld der unterschiedlichen Preispositionen muss innerhalb einer
    * `Tarifpreiszeitscheibe`
    * entsprechend unique sein.
    */
    public void setIdReferenz(String idReferenz) {
        this.idReferenz = idReferenz;
    }

    /**
    * Der Modifikator in Prozent, der auf den Preis der referenzierten Preisposition angewendet
    * wird.
    * Der Wert wird multiplikativ angewendet. D.h. wenn bspw. ein Rabatt von 20% angewendet
    * werden soll, muss der Wert
    * `0,8` betragen.
    */
    public Double getWert() {
        return wert;
    }

    /**
    * Der Modifikator in Prozent, der auf den Preis der referenzierten Preisposition angewendet
    * wird.
    * Der Wert wird multiplikativ angewendet. D.h. wenn bspw. ein Rabatt von 20% angewendet
    * werden soll, muss der Wert
    * `0,8` betragen.
    */
    public void setWert(Double wert) {
        this.wert = wert;
    }

    public static RelativePreispositionBuilder builder() {
        return new RelativePreispositionBuilder();
    }

    public static class RelativePreispositionBuilder extends COMBuilder {
        private String bezeichnung;
        private String idReferenz;
        private Double wert;

        private RelativePreispositionBuilder() {
        }

        /**
        * Eine (beliebige) Bezeichnung für die Preisposition.
        */
        public RelativePreispositionBuilder setBezeichnung(String bezeichnung) {
            this.bezeichnung = bezeichnung;
            return this;
        }

        /**
        * Referenziert auf eine andere Preisposition.
        * Die Referenz bezieht sich auf das technische Feld `_id`, da es sich hier um eine
        * technische Lösung handelt
        * und der Wert selbst keine fachliche Bedeutung hat.
        * Das `_id` Feld der unterschiedlichen Preispositionen muss innerhalb einer
        * `Tarifpreiszeitscheibe`
        * entsprechend unique sein.
        */
        public RelativePreispositionBuilder setIdReferenz(String idReferenz) {
            this.idReferenz = idReferenz;
            return this;
        }

        /**
        * Der Modifikator in Prozent, der auf den Preis der referenzierten Preisposition angewendet
        * wird.
        * Der Wert wird multiplikativ angewendet. D.h. wenn bspw. ein Rabatt von 20% angewendet
        * werden soll, muss der Wert
        * `0,8` betragen.
        */
        public RelativePreispositionBuilder setWert(Double wert) {
            this.wert = wert;
            return this;
        }

        public RelativePreispositionBuilder set_id(String _id) {
            super.set_id(_id);
            return this;
        }

        public RelativePreispositionBuilder setZusatzAttribute(List<ZusatzAttribut> zusatzAttribute) {
            super.setZusatzAttribute(zusatzAttribute);
            return this;
        }

        public RelativePreisposition build() {
            return new RelativePreisposition(this);
        }
    }
}