package bo4e.com;

import bo4e.ZusatzAttribut;
import bo4e.enums.ComTyp;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.List;

/**
* Mit dieser Komponente kann ein aus verschiedenen Preispositionen zusammengesetzter
* Tarifpreis zeitaufgelöst
* dargestellt werden.
*
* .. raw:: html
*
* <object data="../_static/images/bo4e/com/Tarifpreiszeitscheibe.svg"
* type="image/svg+xml"></object>
*
* .. HINT::
* `Tarifpreiszeitscheibe JSON Schema
* <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/BO4E/BO4E-Schemas/v202601.0.0/src/bo4e_schemas/com/Tarifpreiszeitscheibe.json>`_
*/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Tarifpreiszeitscheibe extends COM {
    private final ComTyp _typ = ComTyp.TARIFPREISZEITSCHEIBE;
    private List<EinheitsPreisposition> einheitsPreispositionen;
    private List<LastvariablePreisposition> lastvariablePreispositionen;
    private List<RelativePreisposition> relativePreispositionen;
    private Zeitraum zeitscheibengueltigkeit;
    private List<ZeitvariablePreisposition> zeitvariablePreispositionen;

    public Tarifpreiszeitscheibe() {
    }

    private Tarifpreiszeitscheibe(TarifpreiszeitscheibeBuilder builder) {
        super(builder);
        this.einheitsPreispositionen = builder.einheitsPreispositionen;
        this.lastvariablePreispositionen = builder.lastvariablePreispositionen;
        this.relativePreispositionen = builder.relativePreispositionen;
        this.zeitscheibengueltigkeit = builder.zeitscheibengueltigkeit;
        this.zeitvariablePreispositionen = builder.zeitvariablePreispositionen;
    }

    public ComTyp get_typ() {
        return _typ;
    }

    /**
    * Eine Liste von Einheits-Preispositionen.
    */
    public List<EinheitsPreisposition> getEinheitsPreispositionen() {
        return einheitsPreispositionen;
    }

    /**
    * Eine Liste von Einheits-Preispositionen.
    */
    public void setEinheitsPreispositionen(List<EinheitsPreisposition> einheitsPreispositionen) {
        this.einheitsPreispositionen = einheitsPreispositionen;
    }

    /**
    * Eine Liste von lastvariablen Preispositionen.
    * Diese Preispositionen sind vorgesehen, um bspw. ein Staffel- oder Zonenmodell abzubilden.
    */
    public List<LastvariablePreisposition> getLastvariablePreispositionen() {
        return lastvariablePreispositionen;
    }

    /**
    * Eine Liste von lastvariablen Preispositionen.
    * Diese Preispositionen sind vorgesehen, um bspw. ein Staffel- oder Zonenmodell abzubilden.
    */
    public void setLastvariablePreispositionen(List<LastvariablePreisposition> lastvariablePreispositionen) {
        this.lastvariablePreispositionen = lastvariablePreispositionen;
    }

    /**
    * Eine Liste von relativen Preispositionen.
    * Diese Preispositionen modellieren prozentuale Modifikationen auf bestehende
    * Preispositionen.
    *
    * Dazu wird über ein Feld in `RelativePreisposition` auf die `_id` einer anderen
    * Preispositionen verwiesen.
    * Die ID hat hierbei kein vorgegebenes Format und hat auch keine fachliche Bedeutung. Es
    * handelt sich hierbei
    * um eine rein technische Lösung, um einen Querverweis zu modellieren.
    */
    public List<RelativePreisposition> getRelativePreispositionen() {
        return relativePreispositionen;
    }

    /**
    * Eine Liste von relativen Preispositionen.
    * Diese Preispositionen modellieren prozentuale Modifikationen auf bestehende
    * Preispositionen.
    *
    * Dazu wird über ein Feld in `RelativePreisposition` auf die `_id` einer anderen
    * Preispositionen verwiesen.
    * Die ID hat hierbei kein vorgegebenes Format und hat auch keine fachliche Bedeutung. Es
    * handelt sich hierbei
    * um eine rein technische Lösung, um einen Querverweis zu modellieren.
    */
    public void setRelativePreispositionen(List<RelativePreisposition> relativePreispositionen) {
        this.relativePreispositionen = relativePreispositionen;
    }

    /**
    * Gibt an für welchen Zeitraum dieser zusammengesetzte Tarifpreis gültig ist.
    */
    public Zeitraum getZeitscheibengueltigkeit() {
        return zeitscheibengueltigkeit;
    }

    /**
    * Gibt an für welchen Zeitraum dieser zusammengesetzte Tarifpreis gültig ist.
    */
    public void setZeitscheibengueltigkeit(Zeitraum zeitscheibengueltigkeit) {
        this.zeitscheibengueltigkeit = zeitscheibengueltigkeit;
    }

    /**
    * Eine Liste von zeitvariablen Preispositionen.
    * Dies können z.B. Preispositionen mit Zählzeitdefinitionen sein, um ein klassisches HT/NT
    * Modell abzubilden.
    */
    public List<ZeitvariablePreisposition> getZeitvariablePreispositionen() {
        return zeitvariablePreispositionen;
    }

    /**
    * Eine Liste von zeitvariablen Preispositionen.
    * Dies können z.B. Preispositionen mit Zählzeitdefinitionen sein, um ein klassisches HT/NT
    * Modell abzubilden.
    */
    public void setZeitvariablePreispositionen(List<ZeitvariablePreisposition> zeitvariablePreispositionen) {
        this.zeitvariablePreispositionen = zeitvariablePreispositionen;
    }

    public static TarifpreiszeitscheibeBuilder builder() {
        return new TarifpreiszeitscheibeBuilder();
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class TarifpreiszeitscheibeBuilder extends COMBuilder {
        private List<EinheitsPreisposition> einheitsPreispositionen;
        private List<LastvariablePreisposition> lastvariablePreispositionen;
        private List<RelativePreisposition> relativePreispositionen;
        private Zeitraum zeitscheibengueltigkeit;
        private List<ZeitvariablePreisposition> zeitvariablePreispositionen;

        private TarifpreiszeitscheibeBuilder() {
        }

        /**
        * Eine Liste von Einheits-Preispositionen.
        */
        public TarifpreiszeitscheibeBuilder setEinheitsPreispositionen(List<EinheitsPreisposition> einheitsPreispositionen) {
            this.einheitsPreispositionen = einheitsPreispositionen;
            return this;
        }

        /**
        * Eine Liste von lastvariablen Preispositionen.
        * Diese Preispositionen sind vorgesehen, um bspw. ein Staffel- oder Zonenmodell abzubilden.
        */
        public TarifpreiszeitscheibeBuilder setLastvariablePreispositionen(List<LastvariablePreisposition> lastvariablePreispositionen) {
            this.lastvariablePreispositionen = lastvariablePreispositionen;
            return this;
        }

        /**
        * Eine Liste von relativen Preispositionen.
        * Diese Preispositionen modellieren prozentuale Modifikationen auf bestehende
        * Preispositionen.
        *
        * Dazu wird über ein Feld in `RelativePreisposition` auf die `_id` einer anderen
        * Preispositionen verwiesen.
        * Die ID hat hierbei kein vorgegebenes Format und hat auch keine fachliche Bedeutung. Es
        * handelt sich hierbei
        * um eine rein technische Lösung, um einen Querverweis zu modellieren.
        */
        public TarifpreiszeitscheibeBuilder setRelativePreispositionen(List<RelativePreisposition> relativePreispositionen) {
            this.relativePreispositionen = relativePreispositionen;
            return this;
        }

        /**
        * Gibt an für welchen Zeitraum dieser zusammengesetzte Tarifpreis gültig ist.
        */
        public TarifpreiszeitscheibeBuilder setZeitscheibengueltigkeit(Zeitraum zeitscheibengueltigkeit) {
            this.zeitscheibengueltigkeit = zeitscheibengueltigkeit;
            return this;
        }

        /**
        * Eine Liste von zeitvariablen Preispositionen.
        * Dies können z.B. Preispositionen mit Zählzeitdefinitionen sein, um ein klassisches HT/NT
        * Modell abzubilden.
        */
        public TarifpreiszeitscheibeBuilder setZeitvariablePreispositionen(List<ZeitvariablePreisposition> zeitvariablePreispositionen) {
            this.zeitvariablePreispositionen = zeitvariablePreispositionen;
            return this;
        }

        public TarifpreiszeitscheibeBuilder set_id(String _id) {
            super.set_id(_id);
            return this;
        }

        public TarifpreiszeitscheibeBuilder setZusatzAttribute(List<ZusatzAttribut> zusatzAttribute) {
            super.setZusatzAttribute(zusatzAttribute);
            return this;
        }

        public Tarifpreiszeitscheibe build() {
            return new Tarifpreiszeitscheibe(this);
        }
    }
}