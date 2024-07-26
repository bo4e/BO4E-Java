package bo4e.bo;

import bo4e.ZusatzAttribut;
import bo4e.com.Angebotsvariante;
import bo4e.enums.Sparte;
import bo4e.enums.Typ;

import java.time.OffsetDateTime;
import java.util.List;

/**
 * Mit diesem BO kann ein Versorgungsangebot zur Strom- oder Gasversorgung oder die
 * Teilnahme an einer Ausschreibung
 * übertragen werden. Es können verschiedene Varianten enthalten sein (z.B. ein- und
 * mehrjährige Laufzeit).
 * Innerhalb jeder Variante können Teile enthalten sein, die jeweils für eine oder mehrere
 * Marktlokationen erstellt
 * werden.
 *
 * .. raw:: html
 *
 * <object data="../_static/images/bo4e/bo/Angebot.svg" type="image/svg+xml"></object>
 *
 * .. HINT::
 * `Angebot JSON Schema
 * <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/BO4E/BO4E-Schemas/v202401.3.2/src/bo4e_schemas/bo/Angebot.json>`_
 */
public class Angebot extends Geschaeftsobjekt {
    private final Typ typ = Typ.ANGEBOT;
    private String anfragereferenz;
    private OffsetDateTime angebotsdatum;
    private Geschaeftspartner angebotsgeber;
    private Geschaeftspartner angebotsnehmer;
    private String angebotsnummer;
    private OffsetDateTime bindefrist;
    private Sparte sparte;
    private Person unterzeichnerAngebotsgeber;
    private Person unterzeichnerAngebotsnehmer;
    private List<Angebotsvariante> varianten;

    public Angebot() {
    }

    private Angebot(AngebotBuilder builder) {
        super(builder);
        this.anfragereferenz = builder.anfragereferenz;
        this.angebotsdatum = builder.angebotsdatum;
        this.angebotsgeber = builder.angebotsgeber;
        this.angebotsnehmer = builder.angebotsnehmer;
        this.angebotsnummer = builder.angebotsnummer;
        this.bindefrist = builder.bindefrist;
        this.sparte = builder.sparte;
        this.unterzeichnerAngebotsgeber = builder.unterzeichnerAngebotsgeber;
        this.unterzeichnerAngebotsnehmer = builder.unterzeichnerAngebotsnehmer;
        this.varianten = builder.varianten;
    }

    public Typ getTyp() {
        return typ;
    }

    /**
     * Bis zu diesem Zeitpunkt (Tag/Uhrzeit) inklusive gilt das Angebot
     */
    public String getAnfragereferenz() {
        return anfragereferenz;
    }

    /**
     * Bis zu diesem Zeitpunkt (Tag/Uhrzeit) inklusive gilt das Angebot
     */
    public void setAnfragereferenz(String anfragereferenz) {
        this.anfragereferenz = anfragereferenz;
    }

    /**
     * Erstellungsdatum des Angebots
     */
    public OffsetDateTime getAngebotsdatum() {
        return angebotsdatum;
    }

    /**
     * Erstellungsdatum des Angebots
     */
    public void setAngebotsdatum(OffsetDateTime angebotsdatum) {
        this.angebotsdatum = angebotsdatum;
    }

    /**
     * Ersteller des Angebots
     */
    public Geschaeftspartner getAngebotsgeber() {
        return angebotsgeber;
    }

    /**
     * Ersteller des Angebots
     */
    public void setAngebotsgeber(Geschaeftspartner angebotsgeber) {
        this.angebotsgeber = angebotsgeber;
    }

    /**
     * Empfänger des Angebots
     */
    public Geschaeftspartner getAngebotsnehmer() {
        return angebotsnehmer;
    }

    /**
     * Empfänger des Angebots
     */
    public void setAngebotsnehmer(Geschaeftspartner angebotsnehmer) {
        this.angebotsnehmer = angebotsnehmer;
    }

    /**
     * Eindeutige Nummer des Angebotes
     */
    public String getAngebotsnummer() {
        return angebotsnummer;
    }

    /**
     * Eindeutige Nummer des Angebotes
     */
    public void setAngebotsnummer(String angebotsnummer) {
        this.angebotsnummer = angebotsnummer;
    }

    /**
     * Bis zu diesem Zeitpunkt (Tag/Uhrzeit) inklusive gilt das Angebot
     */
    public OffsetDateTime getBindefrist() {
        return bindefrist;
    }

    /**
     * Bis zu diesem Zeitpunkt (Tag/Uhrzeit) inklusive gilt das Angebot
     */
    public void setBindefrist(OffsetDateTime bindefrist) {
        this.bindefrist = bindefrist;
    }

    /**
     * Sparte, für die das Angebot abgegeben wird (Strom/Gas)
     */
    public Sparte getSparte() {
        return sparte;
    }

    /**
     * Sparte, für die das Angebot abgegeben wird (Strom/Gas)
     */
    public void setSparte(Sparte sparte) {
        this.sparte = sparte;
    }

    /**
     * Person, die als Angebotsgeber das Angebots ausgestellt hat
     */
    public Person getUnterzeichnerAngebotsgeber() {
        return unterzeichnerAngebotsgeber;
    }

    /**
     * Person, die als Angebotsgeber das Angebots ausgestellt hat
     */
    public void setUnterzeichnerAngebotsgeber(Person unterzeichnerAngebotsgeber) {
        this.unterzeichnerAngebotsgeber = unterzeichnerAngebotsgeber;
    }

    /**
     * Person, die als Angebotsnehmer das Angebot angenommen hat
     */
    public Person getUnterzeichnerAngebotsnehmer() {
        return unterzeichnerAngebotsnehmer;
    }

    /**
     * Person, die als Angebotsnehmer das Angebot angenommen hat
     */
    public void setUnterzeichnerAngebotsnehmer(Person unterzeichnerAngebotsnehmer) {
        this.unterzeichnerAngebotsnehmer = unterzeichnerAngebotsnehmer;
    }

    public List<Angebotsvariante> getVarianten() {
        return varianten;
    }

    public void setVarianten(List<Angebotsvariante> varianten) {
        this.varianten = varianten;
    }

    public static AngebotBuilder builder() {
        return new AngebotBuilder();
    }

    public static class AngebotBuilder extends GeschaeftsobjektBuilder {
        private String anfragereferenz;
        private OffsetDateTime angebotsdatum;
        private Geschaeftspartner angebotsgeber;
        private Geschaeftspartner angebotsnehmer;
        private String angebotsnummer;
        private OffsetDateTime bindefrist;
        private Sparte sparte;
        private Person unterzeichnerAngebotsgeber;
        private Person unterzeichnerAngebotsnehmer;
        private List<Angebotsvariante> varianten;

        private AngebotBuilder() {
        }

        /**
         * Bis zu diesem Zeitpunkt (Tag/Uhrzeit) inklusive gilt das Angebot
         */
        public String getAnfragereferenz() {
            return anfragereferenz;
        }

        /**
         * Bis zu diesem Zeitpunkt (Tag/Uhrzeit) inklusive gilt das Angebot
         */
        public AngebotBuilder setAnfragereferenz(String anfragereferenz) {
            this.anfragereferenz = anfragereferenz;
            return this;
        }

        /**
         * Erstellungsdatum des Angebots
         */
        public OffsetDateTime getAngebotsdatum() {
            return angebotsdatum;
        }

        /**
         * Erstellungsdatum des Angebots
         */
        public AngebotBuilder setAngebotsdatum(OffsetDateTime angebotsdatum) {
            this.angebotsdatum = angebotsdatum;
            return this;
        }

        /**
         * Ersteller des Angebots
         */
        public Geschaeftspartner getAngebotsgeber() {
            return angebotsgeber;
        }

        /**
         * Ersteller des Angebots
         */
        public AngebotBuilder setAngebotsgeber(Geschaeftspartner angebotsgeber) {
            this.angebotsgeber = angebotsgeber;
            return this;
        }

        /**
         * Empfänger des Angebots
         */
        public Geschaeftspartner getAngebotsnehmer() {
            return angebotsnehmer;
        }

        /**
         * Empfänger des Angebots
         */
        public AngebotBuilder setAngebotsnehmer(Geschaeftspartner angebotsnehmer) {
            this.angebotsnehmer = angebotsnehmer;
            return this;
        }

        /**
         * Eindeutige Nummer des Angebotes
         */
        public String getAngebotsnummer() {
            return angebotsnummer;
        }

        /**
         * Eindeutige Nummer des Angebotes
         */
        public AngebotBuilder setAngebotsnummer(String angebotsnummer) {
            this.angebotsnummer = angebotsnummer;
            return this;
        }

        /**
         * Bis zu diesem Zeitpunkt (Tag/Uhrzeit) inklusive gilt das Angebot
         */
        public OffsetDateTime getBindefrist() {
            return bindefrist;
        }

        /**
         * Bis zu diesem Zeitpunkt (Tag/Uhrzeit) inklusive gilt das Angebot
         */
        public AngebotBuilder setBindefrist(OffsetDateTime bindefrist) {
            this.bindefrist = bindefrist;
            return this;
        }

        /**
         * Sparte, für die das Angebot abgegeben wird (Strom/Gas)
         */
        public Sparte getSparte() {
            return sparte;
        }

        /**
         * Sparte, für die das Angebot abgegeben wird (Strom/Gas)
         */
        public AngebotBuilder setSparte(Sparte sparte) {
            this.sparte = sparte;
            return this;
        }

        /**
         * Person, die als Angebotsgeber das Angebots ausgestellt hat
         */
        public Person getUnterzeichnerAngebotsgeber() {
            return unterzeichnerAngebotsgeber;
        }

        /**
         * Person, die als Angebotsgeber das Angebots ausgestellt hat
         */
        public AngebotBuilder setUnterzeichnerAngebotsgeber(Person unterzeichnerAngebotsgeber) {
            this.unterzeichnerAngebotsgeber = unterzeichnerAngebotsgeber;
            return this;
        }

        /**
         * Person, die als Angebotsnehmer das Angebot angenommen hat
         */
        public Person getUnterzeichnerAngebotsnehmer() {
            return unterzeichnerAngebotsnehmer;
        }

        /**
         * Person, die als Angebotsnehmer das Angebot angenommen hat
         */
        public AngebotBuilder setUnterzeichnerAngebotsnehmer(Person unterzeichnerAngebotsnehmer) {
            this.unterzeichnerAngebotsnehmer = unterzeichnerAngebotsnehmer;
            return this;
        }

        public List<Angebotsvariante> getVarianten() {
            return varianten;
        }

        public AngebotBuilder setVarianten(List<Angebotsvariante> varianten) {
            this.varianten = varianten;
            return this;
        }

        public AngebotBuilder setId(String id) {
            super.setId(id);
            return this;
        }

        public AngebotBuilder setZusatzAttribute(List<ZusatzAttribut> zusatzAttribute) {
            super.setZusatzAttribute(zusatzAttribute);
            return this;
        }

        public Angebot build() {
            return new Angebot(this);
        }
    }
}