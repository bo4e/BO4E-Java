package bo4e.com;

import bo4e.ZusatzAttribut;
import bo4e.enums.Angebotsstatus;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.time.OffsetDateTime;
import java.util.List;

/**
 * Führt die verschiedenen Ausprägungen der Angebotsberechnung auf
 *
 * .. raw:: html
 *
 * <object data="../_static/images/bo4e/com/Angebotsvariante.svg"
 * type="image/svg+xml"></object>
 *
 * .. HINT::
 * `Angebotsvariante JSON Schema
 * <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/BO4E/BO4E-Schemas/v202401.4.0/src/bo4e_schemas/com/Angebotsvariante.json>`_
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Angebotsvariante extends COM {
    private Angebotsstatus angebotsstatus;
    private OffsetDateTime bindefrist;
    private OffsetDateTime erstellungsdatum;
    private Betrag gesamtkosten;
    private Menge gesamtmenge;
    private List<Angebotsteil> teile;

    public Angebotsvariante() {
    }

    private Angebotsvariante(AngebotsvarianteBuilder builder) {
        super(builder);
        this.angebotsstatus = builder.angebotsstatus;
        this.bindefrist = builder.bindefrist;
        this.erstellungsdatum = builder.erstellungsdatum;
        this.gesamtkosten = builder.gesamtkosten;
        this.gesamtmenge = builder.gesamtmenge;
        this.teile = builder.teile;
    }

    /**
     * Gibt den Status eines Angebotes an.
     */
    public Angebotsstatus getAngebotsstatus() {
        return angebotsstatus;
    }

    /**
     * Gibt den Status eines Angebotes an.
     */
    public void setAngebotsstatus(Angebotsstatus angebotsstatus) {
        this.angebotsstatus = angebotsstatus;
    }

    /**
     * Bis zu diesem Zeitpunkt gilt die Angebotsvariante
     */
    public OffsetDateTime getBindefrist() {
        return bindefrist;
    }

    /**
     * Bis zu diesem Zeitpunkt gilt die Angebotsvariante
     */
    public void setBindefrist(OffsetDateTime bindefrist) {
        this.bindefrist = bindefrist;
    }

    /**
     * Datum der Erstellung der Angebotsvariante
     */
    public OffsetDateTime getErstellungsdatum() {
        return erstellungsdatum;
    }

    /**
     * Datum der Erstellung der Angebotsvariante
     */
    public void setErstellungsdatum(OffsetDateTime erstellungsdatum) {
        this.erstellungsdatum = erstellungsdatum;
    }

    /**
     * Aufsummierte Kosten aller Angebotsteile
     */
    public Betrag getGesamtkosten() {
        return gesamtkosten;
    }

    /**
     * Aufsummierte Kosten aller Angebotsteile
     */
    public void setGesamtkosten(Betrag gesamtkosten) {
        this.gesamtkosten = gesamtkosten;
    }

    /**
     * Aufsummierte Wirkarbeitsmenge aller Angebotsteile
     */
    public Menge getGesamtmenge() {
        return gesamtmenge;
    }

    /**
     * Aufsummierte Wirkarbeitsmenge aller Angebotsteile
     */
    public void setGesamtmenge(Menge gesamtmenge) {
        this.gesamtmenge = gesamtmenge;
    }

    /**
     * Angebotsteile werden im einfachsten Fall für eine Marktlokation oder Lieferstellenadresse
     * erzeugt.
     * Hier werden die Mengen und Gesamtkosten aller Angebotspositionen zusammengefasst.
     * Eine Variante besteht mindestens aus einem Angebotsteil.
     */
    public List<Angebotsteil> getTeile() {
        return teile;
    }

    /**
     * Angebotsteile werden im einfachsten Fall für eine Marktlokation oder Lieferstellenadresse
     * erzeugt.
     * Hier werden die Mengen und Gesamtkosten aller Angebotspositionen zusammengefasst.
     * Eine Variante besteht mindestens aus einem Angebotsteil.
     */
    public void setTeile(List<Angebotsteil> teile) {
        this.teile = teile;
    }

    public static AngebotsvarianteBuilder builder() {
        return new AngebotsvarianteBuilder();
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class AngebotsvarianteBuilder extends COMBuilder {
        private Angebotsstatus angebotsstatus;
        private OffsetDateTime bindefrist;
        private OffsetDateTime erstellungsdatum;
        private Betrag gesamtkosten;
        private Menge gesamtmenge;
        private List<Angebotsteil> teile;

        private AngebotsvarianteBuilder() {
        }

        /**
         * Gibt den Status eines Angebotes an.
         */
        public Angebotsstatus getAngebotsstatus() {
            return angebotsstatus;
        }

        /**
         * Gibt den Status eines Angebotes an.
         */
        public AngebotsvarianteBuilder setAngebotsstatus(Angebotsstatus angebotsstatus) {
            this.angebotsstatus = angebotsstatus;
            return this;
        }

        /**
         * Bis zu diesem Zeitpunkt gilt die Angebotsvariante
         */
        public OffsetDateTime getBindefrist() {
            return bindefrist;
        }

        /**
         * Bis zu diesem Zeitpunkt gilt die Angebotsvariante
         */
        public AngebotsvarianteBuilder setBindefrist(OffsetDateTime bindefrist) {
            this.bindefrist = bindefrist;
            return this;
        }

        /**
         * Datum der Erstellung der Angebotsvariante
         */
        public OffsetDateTime getErstellungsdatum() {
            return erstellungsdatum;
        }

        /**
         * Datum der Erstellung der Angebotsvariante
         */
        public AngebotsvarianteBuilder setErstellungsdatum(OffsetDateTime erstellungsdatum) {
            this.erstellungsdatum = erstellungsdatum;
            return this;
        }

        /**
         * Aufsummierte Kosten aller Angebotsteile
         */
        public Betrag getGesamtkosten() {
            return gesamtkosten;
        }

        /**
         * Aufsummierte Kosten aller Angebotsteile
         */
        public AngebotsvarianteBuilder setGesamtkosten(Betrag gesamtkosten) {
            this.gesamtkosten = gesamtkosten;
            return this;
        }

        /**
         * Aufsummierte Wirkarbeitsmenge aller Angebotsteile
         */
        public Menge getGesamtmenge() {
            return gesamtmenge;
        }

        /**
         * Aufsummierte Wirkarbeitsmenge aller Angebotsteile
         */
        public AngebotsvarianteBuilder setGesamtmenge(Menge gesamtmenge) {
            this.gesamtmenge = gesamtmenge;
            return this;
        }

        /**
         * Angebotsteile werden im einfachsten Fall für eine Marktlokation oder Lieferstellenadresse
         * erzeugt.
         * Hier werden die Mengen und Gesamtkosten aller Angebotspositionen zusammengefasst.
         * Eine Variante besteht mindestens aus einem Angebotsteil.
         */
        public List<Angebotsteil> getTeile() {
            return teile;
        }

        /**
         * Angebotsteile werden im einfachsten Fall für eine Marktlokation oder Lieferstellenadresse
         * erzeugt.
         * Hier werden die Mengen und Gesamtkosten aller Angebotspositionen zusammengefasst.
         * Eine Variante besteht mindestens aus einem Angebotsteil.
         */
        public AngebotsvarianteBuilder setTeile(List<Angebotsteil> teile) {
            this.teile = teile;
            return this;
        }

        public AngebotsvarianteBuilder setId(String id) {
            super.setId(id);
            return this;
        }

        public AngebotsvarianteBuilder setZusatzAttribute(List<ZusatzAttribut> zusatzAttribute) {
            super.setZusatzAttribute(zusatzAttribute);
            return this;
        }

        public Angebotsvariante build() {
            return new Angebotsvariante(this);
        }
    }
}