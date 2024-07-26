package bo4e.com;

import bo4e.ZusatzAttribut;
import bo4e.enums.Kontaktart;

import java.util.List;

/**
 * Die Komponente wird dazu verwendet, die Kontaktwege innerhalb des BOs Person
 * darzustellen
 *
 * .. raw:: html
 *
 * <object data="../_static/images/bo4e/com/Kontakt.svg" type="image/svg+xml"></object>
 *
 * .. HINT::
 * `Kontakt JSON Schema
 * <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/BO4E/BO4E-Schemas/v202401.3.2/src/bo4e_schemas/com/Kontakt.json>`_
 */
public class Kontaktweg extends COM {
    private String beschreibung;
    private Boolean istBevorzugterKontaktweg;
    private Kontaktart kontaktart;
    private String kontaktwert;

    public Kontaktweg() {
    }

    private Kontaktweg(KontaktwegBuilder builder) {
        super(builder);
        this.beschreibung = builder.beschreibung;
        this.istBevorzugterKontaktweg = builder.istBevorzugterKontaktweg;
        this.kontaktart = builder.kontaktart;
        this.kontaktwert = builder.kontaktwert;
    }

    /**
     * Spezifikation, beispielsweise "Durchwahl", "Sammelnummer" etc.
     */
    public String getBeschreibung() {
        return beschreibung;
    }

    /**
     * Spezifikation, beispielsweise "Durchwahl", "Sammelnummer" etc.
     */
    public void setBeschreibung(String beschreibung) {
        this.beschreibung = beschreibung;
    }

    /**
     * Gibt an, ob es sich um den bevorzugten Kontaktweg handelt.
     */
    public Boolean getIstBevorzugterKontaktweg() {
        return istBevorzugterKontaktweg;
    }

    /**
     * Gibt an, ob es sich um den bevorzugten Kontaktweg handelt.
     */
    public void setIstBevorzugterKontaktweg(Boolean istBevorzugterKontaktweg) {
        this.istBevorzugterKontaktweg = istBevorzugterKontaktweg;
    }

    /**
     * Gibt die Kontaktart des Kontaktes an.
     */
    public Kontaktart getKontaktart() {
        return kontaktart;
    }

    /**
     * Gibt die Kontaktart des Kontaktes an.
     */
    public void setKontaktart(Kontaktart kontaktart) {
        this.kontaktart = kontaktart;
    }

    /**
     * Die Nummer oder E-Mail-Adresse.
     */
    public String getKontaktwert() {
        return kontaktwert;
    }

    /**
     * Die Nummer oder E-Mail-Adresse.
     */
    public void setKontaktwert(String kontaktwert) {
        this.kontaktwert = kontaktwert;
    }

    public static KontaktwegBuilder builder() {
        return new KontaktwegBuilder();
    }

    public static class KontaktwegBuilder extends COMBuilder {
        private String beschreibung;
        private Boolean istBevorzugterKontaktweg;
        private Kontaktart kontaktart;
        private String kontaktwert;

        private KontaktwegBuilder() {
        }

        /**
         * Spezifikation, beispielsweise "Durchwahl", "Sammelnummer" etc.
         */
        public String getBeschreibung() {
            return beschreibung;
        }

        /**
         * Spezifikation, beispielsweise "Durchwahl", "Sammelnummer" etc.
         */
        public KontaktwegBuilder setBeschreibung(String beschreibung) {
            this.beschreibung = beschreibung;
            return this;
        }

        /**
         * Gibt an, ob es sich um den bevorzugten Kontaktweg handelt.
         */
        public Boolean getIstBevorzugterKontaktweg() {
            return istBevorzugterKontaktweg;
        }

        /**
         * Gibt an, ob es sich um den bevorzugten Kontaktweg handelt.
         */
        public KontaktwegBuilder setIstBevorzugterKontaktweg(Boolean istBevorzugterKontaktweg) {
            this.istBevorzugterKontaktweg = istBevorzugterKontaktweg;
            return this;
        }

        /**
         * Gibt die Kontaktart des Kontaktes an.
         */
        public Kontaktart getKontaktart() {
            return kontaktart;
        }

        /**
         * Gibt die Kontaktart des Kontaktes an.
         */
        public KontaktwegBuilder setKontaktart(Kontaktart kontaktart) {
            this.kontaktart = kontaktart;
            return this;
        }

        /**
         * Die Nummer oder E-Mail-Adresse.
         */
        public String getKontaktwert() {
            return kontaktwert;
        }

        /**
         * Die Nummer oder E-Mail-Adresse.
         */
        public KontaktwegBuilder setKontaktwert(String kontaktwert) {
            this.kontaktwert = kontaktwert;
            return this;
        }

        public KontaktwegBuilder setId(String id) {
            super.setId(id);
            return this;
        }

        public KontaktwegBuilder setZusatzAttribute(List<ZusatzAttribut> zusatzAttribute) {
            super.setZusatzAttribute(zusatzAttribute);
            return this;
        }

        public Kontaktweg build() {
            return new Kontaktweg(this);
        }
    }
}