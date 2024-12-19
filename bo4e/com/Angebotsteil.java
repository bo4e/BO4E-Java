package bo4e.com;

import bo4e.ZusatzAttribut;
import bo4e.bo.Marktlokation;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.List;

/**
* Mit dieser Komponente wird ein Teil einer Angebotsvariante abgebildet.
* Hier werden alle Angebotspositionen aggregiert.
* Angebotsteile werden im einfachsten Fall für eine Marktlokation oder Lieferstellenadresse
* erzeugt.
* Hier werden die Mengen und Gesamtkosten aller Angebotspositionen zusammengefasst.
* Eine Variante besteht mindestens aus einem Angebotsteil.
*
* .. raw:: html
*
* <object data="../_static/images/bo4e/com/Angebotsteil.svg"
* type="image/svg+xml"></object>
*
* .. HINT::
* `Angebotsteil JSON Schema
* <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/BO4E/BO4E-Schemas/v202401.4.0/src/bo4e_schemas/com/Angebotsteil.json>`_
*/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Angebotsteil extends COM {
    private String anfrageSubreferenz;
    private Betrag gesamtkostenangebotsteil;
    private Menge gesamtmengeangebotsteil;
    private List<Marktlokation> lieferstellenangebotsteil;
    private Zeitraum lieferzeitraum;
    private List<Angebotsposition> positionen;

    public Angebotsteil() {
    }

    private Angebotsteil(AngebotsteilBuilder builder) {
        super(builder);
        this.anfrageSubreferenz = builder.anfrageSubreferenz;
        this.gesamtkostenangebotsteil = builder.gesamtkostenangebotsteil;
        this.gesamtmengeangebotsteil = builder.gesamtmengeangebotsteil;
        this.lieferstellenangebotsteil = builder.lieferstellenangebotsteil;
        this.lieferzeitraum = builder.lieferzeitraum;
        this.positionen = builder.positionen;
    }

    /**
    * Identifizierung eines Subkapitels einer Anfrage, beispielsweise das Los einer
    * Ausschreibung
    */
    public String getAnfrageSubreferenz() {
        return anfrageSubreferenz;
    }

    /**
    * Identifizierung eines Subkapitels einer Anfrage, beispielsweise das Los einer
    * Ausschreibung
    */
    public void setAnfrageSubreferenz(String anfrageSubreferenz) {
        this.anfrageSubreferenz = anfrageSubreferenz;
    }

    /**
    * Summe der Jahresenergiekosten aller in diesem Angebotsteil enthaltenen Lieferstellen
    */
    public Betrag getGesamtkostenangebotsteil() {
        return gesamtkostenangebotsteil;
    }

    /**
    * Summe der Jahresenergiekosten aller in diesem Angebotsteil enthaltenen Lieferstellen
    */
    public void setGesamtkostenangebotsteil(Betrag gesamtkostenangebotsteil) {
        this.gesamtkostenangebotsteil = gesamtkostenangebotsteil;
    }

    /**
    * Summe der Verbräuche aller in diesem Angebotsteil eingeschlossenen Lieferstellen
    */
    public Menge getGesamtmengeangebotsteil() {
        return gesamtmengeangebotsteil;
    }

    /**
    * Summe der Verbräuche aller in diesem Angebotsteil eingeschlossenen Lieferstellen
    */
    public void setGesamtmengeangebotsteil(Menge gesamtmengeangebotsteil) {
        this.gesamtmengeangebotsteil = gesamtmengeangebotsteil;
    }

    /**
    * Marktlokationen, für die dieses Angebotsteil gilt, falls vorhanden.
    * Durch die Marktlokation ist auch die Lieferadresse festgelegt
    */
    public List<Marktlokation> getLieferstellenangebotsteil() {
        return lieferstellenangebotsteil;
    }

    /**
    * Marktlokationen, für die dieses Angebotsteil gilt, falls vorhanden.
    * Durch die Marktlokation ist auch die Lieferadresse festgelegt
    */
    public void setLieferstellenangebotsteil(List<Marktlokation> lieferstellenangebotsteil) {
        this.lieferstellenangebotsteil = lieferstellenangebotsteil;
    }

    /**
    * Hier kann der Belieferungszeitraum angegeben werden, für den dieser Angebotsteil gilt
    */
    public Zeitraum getLieferzeitraum() {
        return lieferzeitraum;
    }

    /**
    * Hier kann der Belieferungszeitraum angegeben werden, für den dieser Angebotsteil gilt
    */
    public void setLieferzeitraum(Zeitraum lieferzeitraum) {
        this.lieferzeitraum = lieferzeitraum;
    }

    /**
    * Einzelne Positionen, die zu diesem Angebotsteil gehören
    */
    public List<Angebotsposition> getPositionen() {
        return positionen;
    }

    /**
    * Einzelne Positionen, die zu diesem Angebotsteil gehören
    */
    public void setPositionen(List<Angebotsposition> positionen) {
        this.positionen = positionen;
    }

    public static AngebotsteilBuilder builder() {
        return new AngebotsteilBuilder();
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class AngebotsteilBuilder extends COMBuilder {
        private String anfrageSubreferenz;
        private Betrag gesamtkostenangebotsteil;
        private Menge gesamtmengeangebotsteil;
        private List<Marktlokation> lieferstellenangebotsteil;
        private Zeitraum lieferzeitraum;
        private List<Angebotsposition> positionen;

        private AngebotsteilBuilder() {
        }

        /**
        * Identifizierung eines Subkapitels einer Anfrage, beispielsweise das Los einer
        * Ausschreibung
        */
        public AngebotsteilBuilder setAnfrageSubreferenz(String anfrageSubreferenz) {
            this.anfrageSubreferenz = anfrageSubreferenz;
            return this;
        }

        /**
        * Summe der Jahresenergiekosten aller in diesem Angebotsteil enthaltenen Lieferstellen
        */
        public AngebotsteilBuilder setGesamtkostenangebotsteil(Betrag gesamtkostenangebotsteil) {
            this.gesamtkostenangebotsteil = gesamtkostenangebotsteil;
            return this;
        }

        /**
        * Summe der Verbräuche aller in diesem Angebotsteil eingeschlossenen Lieferstellen
        */
        public AngebotsteilBuilder setGesamtmengeangebotsteil(Menge gesamtmengeangebotsteil) {
            this.gesamtmengeangebotsteil = gesamtmengeangebotsteil;
            return this;
        }

        /**
        * Marktlokationen, für die dieses Angebotsteil gilt, falls vorhanden.
        * Durch die Marktlokation ist auch die Lieferadresse festgelegt
        */
        public AngebotsteilBuilder setLieferstellenangebotsteil(List<Marktlokation> lieferstellenangebotsteil) {
            this.lieferstellenangebotsteil = lieferstellenangebotsteil;
            return this;
        }

        /**
        * Hier kann der Belieferungszeitraum angegeben werden, für den dieser Angebotsteil gilt
        */
        public AngebotsteilBuilder setLieferzeitraum(Zeitraum lieferzeitraum) {
            this.lieferzeitraum = lieferzeitraum;
            return this;
        }

        /**
        * Einzelne Positionen, die zu diesem Angebotsteil gehören
        */
        public AngebotsteilBuilder setPositionen(List<Angebotsposition> positionen) {
            this.positionen = positionen;
            return this;
        }

        public AngebotsteilBuilder setId(String id) {
            super.setId(id);
            return this;
        }

        public AngebotsteilBuilder setZusatzAttribute(List<ZusatzAttribut> zusatzAttribute) {
            super.setZusatzAttribute(zusatzAttribute);
            return this;
        }

        public Angebotsteil build() {
            return new Angebotsteil(this);
        }
    }
}