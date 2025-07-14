package bo4e.bo;

import bo4e.ZusatzAttribut;
import bo4e.com.Betrag;
import bo4e.com.Kostenblock;
import bo4e.com.Zeitraum;
import bo4e.enums.BoTyp;
import bo4e.enums.Kostenklasse;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.List;

/**
* Dieses BO wird zur Übertagung von hierarchischen Kostenstrukturen verwendet.
* Die Kosten werden dabei in Kostenblöcke und diese wiederum in Kostenpositionen
* strukturiert.
*
* .. raw:: html
*
* <object data="../_static/images/bo4e/bo/Kosten.svg" type="image/svg+xml"></object>
*
* .. HINT::
* `Kosten JSON Schema
* <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/BO4E/BO4E-Schemas/v202501.1.0-rc1/src/bo4e_schemas/bo/Kosten.json>`_
*/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Kosten extends Geschaeftsobjekt {
    private final BoTyp _typ = BoTyp.KOSTEN;
    private Zeitraum gueltigkeit;
    private List<Kostenblock> kostenbloecke;
    private Kostenklasse kostenklasse;
    private List<Betrag> summeKosten;

    public Kosten() {
    }

    private Kosten(KostenBuilder builder) {
        super(builder);
        this.gueltigkeit = builder.gueltigkeit;
        this.kostenbloecke = builder.kostenbloecke;
        this.kostenklasse = builder.kostenklasse;
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
    public List<Kostenblock> getKostenbloecke() {
        return kostenbloecke;
    }

    /**
    * In Kostenblöcken werden Kostenpositionen zusammengefasst. Beispiele: Netzkosten, Umlagen,
    * Steuern etc
    */
    public void setKostenbloecke(List<Kostenblock> kostenbloecke) {
        this.kostenbloecke = kostenbloecke;
    }

    /**
    * Klasse der Kosten, beispielsweise Fremdkosten
    */
    public Kostenklasse getKostenklasse() {
        return kostenklasse;
    }

    /**
    * Klasse der Kosten, beispielsweise Fremdkosten
    */
    public void setKostenklasse(Kostenklasse kostenklasse) {
        this.kostenklasse = kostenklasse;
    }

    /**
    * Die Gesamtsumme über alle Kostenblöcke und -positionen
    */
    public List<Betrag> getSummeKosten() {
        return summeKosten;
    }

    /**
    * Die Gesamtsumme über alle Kostenblöcke und -positionen
    */
    public void setSummeKosten(List<Betrag> summeKosten) {
        this.summeKosten = summeKosten;
    }

    public static KostenBuilder builder() {
        return new KostenBuilder();
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class KostenBuilder extends GeschaeftsobjektBuilder {
        private Zeitraum gueltigkeit;
        private List<Kostenblock> kostenbloecke;
        private Kostenklasse kostenklasse;
        private List<Betrag> summeKosten;

        private KostenBuilder() {
        }

        /**
        * Für diesen Zeitraum wurden die Kosten ermittelt
        */
        public KostenBuilder setGueltigkeit(Zeitraum gueltigkeit) {
            this.gueltigkeit = gueltigkeit;
            return this;
        }

        /**
        * In Kostenblöcken werden Kostenpositionen zusammengefasst. Beispiele: Netzkosten, Umlagen,
        * Steuern etc
        */
        public KostenBuilder setKostenbloecke(List<Kostenblock> kostenbloecke) {
            this.kostenbloecke = kostenbloecke;
            return this;
        }

        /**
        * Klasse der Kosten, beispielsweise Fremdkosten
        */
        public KostenBuilder setKostenklasse(Kostenklasse kostenklasse) {
            this.kostenklasse = kostenklasse;
            return this;
        }

        /**
        * Die Gesamtsumme über alle Kostenblöcke und -positionen
        */
        public KostenBuilder setSummeKosten(List<Betrag> summeKosten) {
            this.summeKosten = summeKosten;
            return this;
        }

        public KostenBuilder set_id(String _id) {
            super.set_id(_id);
            return this;
        }

        public KostenBuilder setZusatzAttribute(List<ZusatzAttribut> zusatzAttribute) {
            super.setZusatzAttribute(zusatzAttribute);
            return this;
        }

        public Kosten build() {
            return new Kosten(this);
        }
    }
}