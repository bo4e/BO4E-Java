package bo4e.bo;

import bo4e.ZusatzAttribut;
import bo4e.com.Adresse;
import bo4e.com.Kontaktweg;
import bo4e.com.Zustaendigkeit;
import bo4e.enums.Anrede;
import bo4e.enums.Titel;
import bo4e.enums.Typ;

import java.time.OffsetDateTime;
import java.util.List;

/**
 * Object containing information about a Person
 *
 * .. raw:: html
 *
 * <object data="../_static/images/bo4e/bo/Person.svg" type="image/svg+xml"></object>
 *
 * .. HINT::
 * `Person JSON Schema
 * <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/BO4E/BO4E-Schemas/v202401.3.2/src/bo4e_schemas/bo/Person.json>`_
 */
public class Person extends Geschaeftsobjekt {
    private final Typ typ = Typ.PERSON;
    private Adresse adresse;
    private Anrede anrede;
    private OffsetDateTime geburtsdatum;
    private String individuelleAnrede;
    private String kommentar;
    private List<Kontaktweg> kontaktwege;
    private String nachname;
    private Titel titel;
    private String vorname;
    private List<Zustaendigkeit> zustaendigkeiten;

    public Person() {
    }

    private Person(PersonBuilder builder) {
        super(builder);
        this.adresse = builder.adresse;
        this.anrede = builder.anrede;
        this.geburtsdatum = builder.geburtsdatum;
        this.individuelleAnrede = builder.individuelleAnrede;
        this.kommentar = builder.kommentar;
        this.kontaktwege = builder.kontaktwege;
        this.nachname = builder.nachname;
        this.titel = builder.titel;
        this.vorname = builder.vorname;
        this.zustaendigkeiten = builder.zustaendigkeiten;
    }

    public Typ getTyp() {
        return typ;
    }

    /**
     * Adresse der Person, falls diese von der Adresse des Geschäftspartners abweicht
     */
    public Adresse getAdresse() {
        return adresse;
    }

    /**
     * Adresse der Person, falls diese von der Adresse des Geschäftspartners abweicht
     */
    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }

    /**
     * Mögliche Anrede der Person
     */
    public Anrede getAnrede() {
        return anrede;
    }

    /**
     * Mögliche Anrede der Person
     */
    public void setAnrede(Anrede anrede) {
        this.anrede = anrede;
    }

    /**
     * Geburtsdatum der Person
     */
    public OffsetDateTime getGeburtsdatum() {
        return geburtsdatum;
    }

    /**
     * Geburtsdatum der Person
     */
    public void setGeburtsdatum(OffsetDateTime geburtsdatum) {
        this.geburtsdatum = geburtsdatum;
    }

    public String getIndividuelleAnrede() {
        return individuelleAnrede;
    }

    public void setIndividuelleAnrede(String individuelleAnrede) {
        this.individuelleAnrede = individuelleAnrede;
    }

    /**
     * Weitere Informationen zur Person
     */
    public String getKommentar() {
        return kommentar;
    }

    /**
     * Weitere Informationen zur Person
     */
    public void setKommentar(String kommentar) {
        this.kommentar = kommentar;
    }

    /**
     * Kontaktwege der Person
     */
    public List<Kontaktweg> getKontaktwege() {
        return kontaktwege;
    }

    /**
     * Kontaktwege der Person
     */
    public void setKontaktwege(List<Kontaktweg> kontaktwege) {
        this.kontaktwege = kontaktwege;
    }

    /**
     * Nachname (Familienname) der Person
     */
    public String getNachname() {
        return nachname;
    }

    /**
     * Nachname (Familienname) der Person
     */
    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    /**
     * Möglicher Titel der Person
     */
    public Titel getTitel() {
        return titel;
    }

    /**
     * Möglicher Titel der Person
     */
    public void setTitel(Titel titel) {
        this.titel = titel;
    }

    /**
     * Vorname der Person
     */
    public String getVorname() {
        return vorname;
    }

    /**
     * Vorname der Person
     */
    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    /**
     * Liste der Abteilungen und Zuständigkeiten der Person
     */
    public List<Zustaendigkeit> getZustaendigkeiten() {
        return zustaendigkeiten;
    }

    /**
     * Liste der Abteilungen und Zuständigkeiten der Person
     */
    public void setZustaendigkeiten(List<Zustaendigkeit> zustaendigkeiten) {
        this.zustaendigkeiten = zustaendigkeiten;
    }

    public static PersonBuilder builder() {
        return new PersonBuilder();
    }

    public static class PersonBuilder extends GeschaeftsobjektBuilder {
        private Adresse adresse;
        private Anrede anrede;
        private OffsetDateTime geburtsdatum;
        private String individuelleAnrede;
        private String kommentar;
        private List<Kontaktweg> kontaktwege;
        private String nachname;
        private Titel titel;
        private String vorname;
        private List<Zustaendigkeit> zustaendigkeiten;

        private PersonBuilder() {
        }

        /**
         * Adresse der Person, falls diese von der Adresse des Geschäftspartners abweicht
         */
        public Adresse getAdresse() {
            return adresse;
        }

        /**
         * Adresse der Person, falls diese von der Adresse des Geschäftspartners abweicht
         */
        public PersonBuilder setAdresse(Adresse adresse) {
            this.adresse = adresse;
            return this;
        }

        /**
         * Mögliche Anrede der Person
         */
        public Anrede getAnrede() {
            return anrede;
        }

        /**
         * Mögliche Anrede der Person
         */
        public PersonBuilder setAnrede(Anrede anrede) {
            this.anrede = anrede;
            return this;
        }

        /**
         * Geburtsdatum der Person
         */
        public OffsetDateTime getGeburtsdatum() {
            return geburtsdatum;
        }

        /**
         * Geburtsdatum der Person
         */
        public PersonBuilder setGeburtsdatum(OffsetDateTime geburtsdatum) {
            this.geburtsdatum = geburtsdatum;
            return this;
        }

        public String getIndividuelleAnrede() {
            return individuelleAnrede;
        }

        public PersonBuilder setIndividuelleAnrede(String individuelleAnrede) {
            this.individuelleAnrede = individuelleAnrede;
            return this;
        }

        /**
         * Weitere Informationen zur Person
         */
        public String getKommentar() {
            return kommentar;
        }

        /**
         * Weitere Informationen zur Person
         */
        public PersonBuilder setKommentar(String kommentar) {
            this.kommentar = kommentar;
            return this;
        }

        /**
         * Kontaktwege der Person
         */
        public List<Kontaktweg> getKontaktwege() {
            return kontaktwege;
        }

        /**
         * Kontaktwege der Person
         */
        public PersonBuilder setKontaktwege(List<Kontaktweg> kontaktwege) {
            this.kontaktwege = kontaktwege;
            return this;
        }

        /**
         * Nachname (Familienname) der Person
         */
        public String getNachname() {
            return nachname;
        }

        /**
         * Nachname (Familienname) der Person
         */
        public PersonBuilder setNachname(String nachname) {
            this.nachname = nachname;
            return this;
        }

        /**
         * Möglicher Titel der Person
         */
        public Titel getTitel() {
            return titel;
        }

        /**
         * Möglicher Titel der Person
         */
        public PersonBuilder setTitel(Titel titel) {
            this.titel = titel;
            return this;
        }

        /**
         * Vorname der Person
         */
        public String getVorname() {
            return vorname;
        }

        /**
         * Vorname der Person
         */
        public PersonBuilder setVorname(String vorname) {
            this.vorname = vorname;
            return this;
        }

        /**
         * Liste der Abteilungen und Zuständigkeiten der Person
         */
        public List<Zustaendigkeit> getZustaendigkeiten() {
            return zustaendigkeiten;
        }

        /**
         * Liste der Abteilungen und Zuständigkeiten der Person
         */
        public PersonBuilder setZustaendigkeiten(List<Zustaendigkeit> zustaendigkeiten) {
            this.zustaendigkeiten = zustaendigkeiten;
            return this;
        }

        public PersonBuilder setId(String id) {
            super.setId(id);
            return this;
        }

        public PersonBuilder setZusatzAttribute(List<ZusatzAttribut> zusatzAttribute) {
            super.setZusatzAttribute(zusatzAttribute);
            return this;
        }

        public Person build() {
            return new Person(this);
        }
    }
}