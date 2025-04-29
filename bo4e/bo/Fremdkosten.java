package bo4e.bo;

import bo4e.ZusatzAttribut;
import bo4e.com.Betrag;
import bo4e.com.Fremdkostenblock;
import bo4e.com.Zeitraum;
import bo4e.enums.BoTyp;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.List;

/**
* Mit diesem BO werden die Fremdkosten, beispielsweise für eine Angebotserstellung oder
* eine Rechnungsprüfung,
* übertragen.
* Die Fremdkosten enthalten dabei alle Kostenblöcke, die von anderen Marktteilnehmern oder
* Instanzen erhoben werden.
*
* .. raw:: html
*
* <object data="../_static/images/bo4e/bo/Fremdkosten.svg" type="image/svg+xml"></object>
*
* .. HINT::
* `Fremdkosten JSON Schema
* <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/BO4E/BO4E-Schemas/v202501.0.0/src/bo4e_schemas/bo/Fremdkosten.json>`_
*/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Fremdkosten extends Geschaeftsobjekt {
    private final BoTyp _typ = BoTyp.FREMDKOSTEN;
    private Zeitraum gueltigkeit;
    private List<Fremdkostenblock> kostenbloecke;
    private Betrag summeKosten;

    public Fremdkosten() {
    }

    private Fremdkosten(FremdkostenBuilder builder) {
        super(builder);
        this.gueltigkeit = builder.gueltigkeit;
        this.kostenbloecke = builder.kostenbloecke;
        this.summeKosten = builder.summeKosten;
    }

    public BoTyp get_typ() {
        return _typ;
    }

    /**
    * Für diesen Zeitraum wurden die Kosten ermittelt
    */
    public Zeitraum getGueltigkeit() {
        return gueltigkeit;
    }

    /**
    * Für diesen Zeitraum wurden die Kosten ermittelt
    */
    public void setGueltigkeit(Zeitraum gueltigkeit) {
        this.gueltigkeit = gueltigkeit;
    }

    /**
    * In Kostenblöcken werden Kostenpositionen zusammengefasst. Beispiele: Netzkosten, Umlagen,
    * Steuern etc
    */
    public List<Fremdkostenblock> getKostenbloecke() {
        return kostenbloecke;
    }

    /**
    * In Kostenblöcken werden Kostenpositionen zusammengefasst. Beispiele: Netzkosten, Umlagen,
    * Steuern etc
    */
    public void setKostenbloecke(List<Fremdkostenblock> kostenbloecke) {
        this.kostenbloecke = kostenbloecke;
    }

    /**
    * Die Gesamtsumme über alle Kostenblöcke und -positionen
    */
    public Betrag getSummeKosten() {
        return summeKosten;
    }

    /**
    * Die Gesamtsumme über alle Kostenblöcke und -positionen
    */
    public void setSummeKosten(Betrag summeKosten) {
        this.summeKosten = summeKosten;
    }

    public static FremdkostenBuilder builder() {
        return new FremdkostenBuilder();
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class FremdkostenBuilder extends GeschaeftsobjektBuilder {
        private Zeitraum gueltigkeit;
        private List<Fremdkostenblock> kostenbloecke;
        private Betrag summeKosten;

        private FremdkostenBuilder() {
        }

        /**
        * Für diesen Zeitraum wurden die Kosten ermittelt
        */
        public FremdkostenBuilder setGueltigkeit(Zeitraum gueltigkeit) {
            this.gueltigkeit = gueltigkeit;
            return this;
        }

        /**
        * In Kostenblöcken werden Kostenpositionen zusammengefasst. Beispiele: Netzkosten, Umlagen,
        * Steuern etc
        */
        public FremdkostenBuilder setKostenbloecke(List<Fremdkostenblock> kostenbloecke) {
            this.kostenbloecke = kostenbloecke;
            return this;
        }

        /**
        * Die Gesamtsumme über alle Kostenblöcke und -positionen
        */
        public FremdkostenBuilder setSummeKosten(Betrag summeKosten) {
            this.summeKosten = summeKosten;
            return this;
        }

        public FremdkostenBuilder set_id(String _id) {
            super.set_id(_id);
            return this;
        }

        public FremdkostenBuilder setZusatzAttribute(List<ZusatzAttribut> zusatzAttribute) {
            super.setZusatzAttribute(zusatzAttribute);
            return this;
        }

        public Fremdkosten build() {
            return new Fremdkosten(this);
        }
    }
}