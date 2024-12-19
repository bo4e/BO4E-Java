package bo4e.bo;

import bo4e.ZusatzAttribut;
import bo4e.com.Adresse;
import bo4e.com.Kontaktweg;
import bo4e.enums.Anrede;
import bo4e.enums.Geschaeftspartnerrolle;
import bo4e.enums.Organisationstyp;
import bo4e.enums.Titel;
import bo4e.enums.Typ;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.List;

/**
* Mit diesem Objekt können Geschäftspartner übertragen werden.
* Sowohl Unternehmen, als auch Privatpersonen können Geschäftspartner sein.
* Hinweis: "Marktteilnehmer" haben ein eigenes BO, welches sich von diesem BO ableitet.
* Hier sollte daher keine Zuordnung zu Marktrollen erfolgen.
*
* .. raw:: html
*
* <object data="../_static/images/bo4e/bo/Geschaeftspartner.svg"
* type="image/svg+xml"></object>
*
* .. HINT::
* `Geschaeftspartner JSON Schema
* <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/BO4E/BO4E-Schemas/v202401.4.0/src/bo4e_schemas/bo/Geschaeftspartner.json>`_
*/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Geschaeftspartner extends Geschaeftsobjekt {
    private final Typ typ = Typ.GESCHAEFTSPARTNER;
    private Adresse adresse;
    private String amtsgericht;
    private Anrede anrede;
    private List<Person> ansprechpartner;
    private List<Geschaeftspartnerrolle> geschaeftspartnerrollen;
    private String glaeubigerId;
    private String handelsregisternummer;
    private String individuelleAnrede;
    private List<Kontaktweg> kontaktwege;
    private String nachname;
    private String organisationsname;
    private Organisationstyp organisationstyp;
    private Titel titel;
    private String umsatzsteuerId;
    private String vorname;
    private String website;

    public Geschaeftspartner() {
    }

    private Geschaeftspartner(GeschaeftspartnerBuilder builder) {
        super(builder);
        this.adresse = builder.adresse;
        this.amtsgericht = builder.amtsgericht;
        this.anrede = builder.anrede;
        this.ansprechpartner = builder.ansprechpartner;
        this.geschaeftspartnerrollen = builder.geschaeftspartnerrollen;
        this.glaeubigerId = builder.glaeubigerId;
        this.handelsregisternummer = builder.handelsregisternummer;
        this.individuelleAnrede = builder.individuelleAnrede;
        this.kontaktwege = builder.kontaktwege;
        this.nachname = builder.nachname;
        this.organisationsname = builder.organisationsname;
        this.organisationstyp = builder.organisationstyp;
        this.titel = builder.titel;
        this.umsatzsteuerId = builder.umsatzsteuerId;
        this.vorname = builder.vorname;
        this.website = builder.website;
    }

    public Typ getTyp() {
        return typ;
    }

    /**
    * Adresse des Geschäftspartners
    */
    public Adresse getAdresse() {
        return adresse;
    }

    /**
    * Adresse des Geschäftspartners
    */
    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }

    /**
    * Amtsgericht bzw Handelsregistergericht, das die Handelsregisternummer herausgegeben hat
    */
    public String getAmtsgericht() {
        return amtsgericht;
    }

    /**
    * Amtsgericht bzw Handelsregistergericht, das die Handelsregisternummer herausgegeben hat
    */
    public void setAmtsgericht(String amtsgericht) {
        this.amtsgericht = amtsgericht;
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

    public List<Person> getAnsprechpartner() {
        return ansprechpartner;
    }

    public void setAnsprechpartner(List<Person> ansprechpartner) {
        this.ansprechpartner = ansprechpartner;
    }

    /**
    * Rollen, die die Geschäftspartner inne haben (z.B. Interessent, Kunde)
    */
    public List<Geschaeftspartnerrolle> getGeschaeftspartnerrollen() {
        return geschaeftspartnerrollen;
    }

    /**
    * Rollen, die die Geschäftspartner inne haben (z.B. Interessent, Kunde)
    */
    public void setGeschaeftspartnerrollen(List<Geschaeftspartnerrolle> geschaeftspartnerrollen) {
        this.geschaeftspartnerrollen = geschaeftspartnerrollen;
    }

    /**
    * Die Gläubiger-ID welche im Zahlungsverkehr verwendet wird; Z.B. "DE 47116789"
    */
    public String getGlaeubigerId() {
        return glaeubigerId;
    }

    /**
    * Die Gläubiger-ID welche im Zahlungsverkehr verwendet wird; Z.B. "DE 47116789"
    */
    public void setGlaeubigerId(String glaeubigerId) {
        this.glaeubigerId = glaeubigerId;
    }

    /**
    * Handelsregisternummer des Geschäftspartners
    */
    public String getHandelsregisternummer() {
        return handelsregisternummer;
    }

    /**
    * Handelsregisternummer des Geschäftspartners
    */
    public void setHandelsregisternummer(String handelsregisternummer) {
        this.handelsregisternummer = handelsregisternummer;
    }

    public String getIndividuelleAnrede() {
        return individuelleAnrede;
    }

    public void setIndividuelleAnrede(String individuelleAnrede) {
        this.individuelleAnrede = individuelleAnrede;
    }

    /**
    * Kontaktwege des Geschäftspartners
    */
    public List<Kontaktweg> getKontaktwege() {
        return kontaktwege;
    }

    /**
    * Kontaktwege des Geschäftspartners
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
    * Kontaktwege des Geschäftspartners
    */
    public String getOrganisationsname() {
        return organisationsname;
    }

    /**
    * Kontaktwege des Geschäftspartners
    */
    public void setOrganisationsname(String organisationsname) {
        this.organisationsname = organisationsname;
    }

    public Organisationstyp getOrganisationstyp() {
        return organisationstyp;
    }

    public void setOrganisationstyp(Organisationstyp organisationstyp) {
        this.organisationstyp = organisationstyp;
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
    * Die Steuer-ID des Geschäftspartners; Beispiel: "DE 813281825"
    */
    public String getUmsatzsteuerId() {
        return umsatzsteuerId;
    }

    /**
    * Die Steuer-ID des Geschäftspartners; Beispiel: "DE 813281825"
    */
    public void setUmsatzsteuerId(String umsatzsteuerId) {
        this.umsatzsteuerId = umsatzsteuerId;
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
    * Internetseite des Marktpartners
    */
    public String getWebsite() {
        return website;
    }

    /**
    * Internetseite des Marktpartners
    */
    public void setWebsite(String website) {
        this.website = website;
    }

    public static GeschaeftspartnerBuilder builder() {
        return new GeschaeftspartnerBuilder();
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class GeschaeftspartnerBuilder extends GeschaeftsobjektBuilder {
        private Adresse adresse;
        private String amtsgericht;
        private Anrede anrede;
        private List<Person> ansprechpartner;
        private List<Geschaeftspartnerrolle> geschaeftspartnerrollen;
        private String glaeubigerId;
        private String handelsregisternummer;
        private String individuelleAnrede;
        private List<Kontaktweg> kontaktwege;
        private String nachname;
        private String organisationsname;
        private Organisationstyp organisationstyp;
        private Titel titel;
        private String umsatzsteuerId;
        private String vorname;
        private String website;

        private GeschaeftspartnerBuilder() {
        }

        /**
        * Adresse des Geschäftspartners
        */
        public GeschaeftspartnerBuilder setAdresse(Adresse adresse) {
            this.adresse = adresse;
            return this;
        }

        /**
        * Amtsgericht bzw Handelsregistergericht, das die Handelsregisternummer herausgegeben hat
        */
        public GeschaeftspartnerBuilder setAmtsgericht(String amtsgericht) {
            this.amtsgericht = amtsgericht;
            return this;
        }

        /**
        * Mögliche Anrede der Person
        */
        public GeschaeftspartnerBuilder setAnrede(Anrede anrede) {
            this.anrede = anrede;
            return this;
        }

        public GeschaeftspartnerBuilder setAnsprechpartner(List<Person> ansprechpartner) {
            this.ansprechpartner = ansprechpartner;
            return this;
        }

        /**
        * Rollen, die die Geschäftspartner inne haben (z.B. Interessent, Kunde)
        */
        public GeschaeftspartnerBuilder setGeschaeftspartnerrollen(List<Geschaeftspartnerrolle> geschaeftspartnerrollen) {
            this.geschaeftspartnerrollen = geschaeftspartnerrollen;
            return this;
        }

        /**
        * Die Gläubiger-ID welche im Zahlungsverkehr verwendet wird; Z.B. "DE 47116789"
        */
        public GeschaeftspartnerBuilder setGlaeubigerId(String glaeubigerId) {
            this.glaeubigerId = glaeubigerId;
            return this;
        }

        /**
        * Handelsregisternummer des Geschäftspartners
        */
        public GeschaeftspartnerBuilder setHandelsregisternummer(String handelsregisternummer) {
            this.handelsregisternummer = handelsregisternummer;
            return this;
        }

        public GeschaeftspartnerBuilder setIndividuelleAnrede(String individuelleAnrede) {
            this.individuelleAnrede = individuelleAnrede;
            return this;
        }

        /**
        * Kontaktwege des Geschäftspartners
        */
        public GeschaeftspartnerBuilder setKontaktwege(List<Kontaktweg> kontaktwege) {
            this.kontaktwege = kontaktwege;
            return this;
        }

        /**
        * Nachname (Familienname) der Person
        */
        public GeschaeftspartnerBuilder setNachname(String nachname) {
            this.nachname = nachname;
            return this;
        }

        /**
        * Kontaktwege des Geschäftspartners
        */
        public GeschaeftspartnerBuilder setOrganisationsname(String organisationsname) {
            this.organisationsname = organisationsname;
            return this;
        }

        public GeschaeftspartnerBuilder setOrganisationstyp(Organisationstyp organisationstyp) {
            this.organisationstyp = organisationstyp;
            return this;
        }

        /**
        * Möglicher Titel der Person
        */
        public GeschaeftspartnerBuilder setTitel(Titel titel) {
            this.titel = titel;
            return this;
        }

        /**
        * Die Steuer-ID des Geschäftspartners; Beispiel: "DE 813281825"
        */
        public GeschaeftspartnerBuilder setUmsatzsteuerId(String umsatzsteuerId) {
            this.umsatzsteuerId = umsatzsteuerId;
            return this;
        }

        /**
        * Vorname der Person
        */
        public GeschaeftspartnerBuilder setVorname(String vorname) {
            this.vorname = vorname;
            return this;
        }

        /**
        * Internetseite des Marktpartners
        */
        public GeschaeftspartnerBuilder setWebsite(String website) {
            this.website = website;
            return this;
        }

        public GeschaeftspartnerBuilder setId(String id) {
            super.setId(id);
            return this;
        }

        public GeschaeftspartnerBuilder setZusatzAttribute(List<ZusatzAttribut> zusatzAttribute) {
            super.setZusatzAttribute(zusatzAttribute);
            return this;
        }

        public Geschaeftspartner build() {
            return new Geschaeftspartner(this);
        }
    }
}