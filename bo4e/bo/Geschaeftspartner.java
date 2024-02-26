package bo4e.bo;

import bo4e.enums.Typ;
import bo4e.com.Adresse;
import bo4e.enums.Anrede;
import bo4e.enums.Geschaeftspartnerrolle;
import bo4e.com.Kontaktweg;
import bo4e.enums.Organisationstyp;
import bo4e.enums.Titel;

/**
 * Mit diesem Objekt können Geschäftspartner übertragen werden.
 * Sowohl Unternehmen, als auch Privatpersonen können Geschäftspartner sein.
 * Hinweis: Marktteilnehmer haben ein eigenes BO, welches sich von diesem BO ableitet.
 * Hier sollte daher keine Zuordnung zu Marktrollen erfolgen.
 *
 * .. raw:: html
 *
 * <object data="../_static/images/bo4e/bo/Geschaeftspartner.svg"
 * type="image/svg+xml"></object>
 *
 * .. HINT::
 * `Geschaeftspartner JSON Schema
 * <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/BO4E/BO4E-Schemas/v202401.1.0-rc1/src/bo4e_schemas/bo/Geschaeftspartner.json>`_
 */
public class Geschaeftspartner extends Geschaeftsobjekt {
    private final Typ _typ = Typ.GESCHAEFTSPARTNER;
    private Adresse adresse;
    private String amtsgericht;
    private Anrede anrede;
    private Person[] ansprechpartner;
    private Geschaeftspartnerrolle[] geschaeftspartnerrollen;
    private String glaeubigerId;
    private String handelsregisternummer;
    private String individuelleAnrede;
    private Kontaktweg[] kontaktwege;
    private String nachname;
    private String organisationsname;
    private Organisationstyp organisationstyp;
    private Titel titel;
    private String umsatzsteuerId;
    private String vorname;
    private String website;

    public Typ getTyp() { return _typ; }

    public Adresse getAdresse() { return adresse; }
    public void setAdresse(Adresse value) { this.adresse = value; }

    public String getAmtsgericht() { return amtsgericht; }
    public void setAmtsgericht(String value) { this.amtsgericht = value; }

    public Anrede getAnrede() { return anrede; }
    public void setAnrede(Anrede value) { this.anrede = value; }

    public Person[] getAnsprechpartner() { return ansprechpartner; }
    public void setAnsprechpartner(Person[] value) { this.ansprechpartner = value; }

    public Geschaeftspartnerrolle[] getGeschaeftspartnerrollen() { return geschaeftspartnerrollen; }
    public void setGeschaeftspartnerrollen(Geschaeftspartnerrolle[] value) { this.geschaeftspartnerrollen = value; }

    public String getGlaeubigerId() { return glaeubigerId; }
    public void setGlaeubigerId(String value) { this.glaeubigerId = value; }

    public String getHandelsregisternummer() { return handelsregisternummer; }
    public void setHandelsregisternummer(String value) { this.handelsregisternummer = value; }

    public String getIndividuelleAnrede() { return individuelleAnrede; }
    public void setIndividuelleAnrede(String value) { this.individuelleAnrede = value; }

    public Kontaktweg[] getKontaktwege() { return kontaktwege; }
    public void setKontaktwege(Kontaktweg[] value) { this.kontaktwege = value; }

    public String getNachname() { return nachname; }
    public void setNachname(String value) { this.nachname = value; }

    public String getOrganisationsname() { return organisationsname; }
    public void setOrganisationsname(String value) { this.organisationsname = value; }

    public Organisationstyp getOrganisationstyp() { return organisationstyp; }
    public void setOrganisationstyp(Organisationstyp value) { this.organisationstyp = value; }

    public Titel getTitel() { return titel; }
    public void setTitel(Titel value) { this.titel = value; }

    public String getUmsatzsteuerId() { return umsatzsteuerId; }
    public void setUmsatzsteuerId(String value) { this.umsatzsteuerId = value; }

    public String getVorname() { return vorname; }
    public void setVorname(String value) { this.vorname = value; }

    public String getWebsite() { return website; }
    public void setWebsite(String value) { this.website = value; }

}
