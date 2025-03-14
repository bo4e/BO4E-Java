package bo4e.com;

import bo4e.ZusatzAttribut;
import bo4e.enums.AbgabeArt;

import java.util.List;

/**
* Diese Komponente wird zur Übertagung der Details zu einer Konzessionsabgabe verwendet.
*
* .. raw:: html
*
* <object data="../_static/images/bo4e/com/Konzessionsabgabe.svg"
* type="image/svg+xml"></object>
*
* .. HINT::
* `Konzessionsabgabe JSON Schema
* <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/BO4E/BO4E-Schemas/v202401.6.0/src/bo4e_schemas/com/Konzessionsabgabe.json>`_
*/
public class Konzessionsabgabe extends COM {
    private String kategorie;
    private Double kosten;
    private AbgabeArt satz;

    public Konzessionsabgabe() {
    }

    private Konzessionsabgabe(KonzessionsabgabeBuilder builder) {
        super(builder);
        this.kategorie = builder.kategorie;
        this.kosten = builder.kosten;
        this.satz = builder.satz;
    }

    /**
    * Gebührenkategorie der Konzessionsabgabe
    */
    public String getKategorie() {
        return kategorie;
    }

    /**
    * Gebührenkategorie der Konzessionsabgabe
    */
    public void setKategorie(String kategorie) {
        this.kategorie = kategorie;
    }

    /**
    * Konzessionsabgabe in E/kWh
    */
    public Double getKosten() {
        return kosten;
    }

    /**
    * Konzessionsabgabe in E/kWh
    */
    public void setKosten(Double kosten) {
        this.kosten = kosten;
    }

    /**
    * Art der Abgabe
    */
    public AbgabeArt getSatz() {
        return satz;
    }

    /**
    * Art der Abgabe
    */
    public void setSatz(AbgabeArt satz) {
        this.satz = satz;
    }

    public static KonzessionsabgabeBuilder builder() {
        return new KonzessionsabgabeBuilder();
    }

    public static class KonzessionsabgabeBuilder extends COMBuilder {
        private String kategorie;
        private Double kosten;
        private AbgabeArt satz;

        private KonzessionsabgabeBuilder() {
        }

        /**
        * Gebührenkategorie der Konzessionsabgabe
        */
        public KonzessionsabgabeBuilder setKategorie(String kategorie) {
            this.kategorie = kategorie;
            return this;
        }

        /**
        * Konzessionsabgabe in E/kWh
        */
        public KonzessionsabgabeBuilder setKosten(Double kosten) {
            this.kosten = kosten;
            return this;
        }

        /**
        * Art der Abgabe
        */
        public KonzessionsabgabeBuilder setSatz(AbgabeArt satz) {
            this.satz = satz;
            return this;
        }

        public KonzessionsabgabeBuilder set_id(String _id) {
            super.set_id(_id);
            return this;
        }

        public KonzessionsabgabeBuilder setZusatzAttribute(List<ZusatzAttribut> zusatzAttribute) {
            super.setZusatzAttribute(zusatzAttribute);
            return this;
        }

        public Konzessionsabgabe build() {
            return new Konzessionsabgabe(this);
        }
    }
}