package bo4e.bo;

import bo4e.enums.Typ;
import bo4e.com.Adresse;
import bo4e.enums.Anrede;
import bo4e.com.Kontaktweg;
import bo4e.enums.Titel;
import bo4e.com.Zustaendigkeit;
import java.time.OffsetDateTime;

/**
 * Object containing information about a Person
 *
 * .. raw:: html
 *
 * <object data="../_static/images/bo4e/bo/Person.svg" type="image/svg+xml"></object>
 *
 * .. HINT::
 * `Person JSON Schema
 * <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/BO4E/BO4E-Schemas/v202401.1.0-rc1/src/bo4e_schemas/bo/Person.json>`_
 */
public class Person extends Geschaeftsobjekt {
    private final Typ _typ = Typ.PERSON;
    private Adresse adresse;
    private Anrede anrede;
    private OffsetDateTime geburtsdatum;
    private String individuelleAnrede;
    private String kommentar;
    private Kontaktweg[] kontaktwege;
    private String nachname;
    private Titel titel;
    private String vorname;
    private Zustaendigkeit[] zustaendigkeiten;

    public Typ getTyp() { return _typ; }

    public Adresse getAdresse() { return adresse; }
    public void setAdresse(Adresse value) { this.adresse = value; }

    public Anrede getAnrede() { return anrede; }
    public void setAnrede(Anrede value) { this.anrede = value; }

    public OffsetDateTime getGeburtsdatum() { return geburtsdatum; }
    public void setGeburtsdatum(OffsetDateTime value) { this.geburtsdatum = value; }

    public String getIndividuelleAnrede() { return individuelleAnrede; }
    public void setIndividuelleAnrede(String value) { this.individuelleAnrede = value; }

    public String getKommentar() { return kommentar; }
    public void setKommentar(String value) { this.kommentar = value; }

    public Kontaktweg[] getKontaktwege() { return kontaktwege; }
    public void setKontaktwege(Kontaktweg[] value) { this.kontaktwege = value; }

    public String getNachname() { return nachname; }
    public void setNachname(String value) { this.nachname = value; }

    public Titel getTitel() { return titel; }
    public void setTitel(Titel value) { this.titel = value; }

    public String getVorname() { return vorname; }
    public void setVorname(String value) { this.vorname = value; }

    public Zustaendigkeit[] getZustaendigkeiten() { return zustaendigkeiten; }
    public void setZustaendigkeiten(Zustaendigkeit[] value) { this.zustaendigkeiten = value; }
}
