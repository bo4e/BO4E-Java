package bo4e.com;

import bo4e.enums.Kontaktart;

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
 * <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/BO4E/BO4E-Schemas/v202401.1.0-rc1/src/bo4e_schemas/com/Kontakt.json>`_
 */
public class Kontaktweg extends COM {
    private String beschreibung;
    private Boolean istBevorzugterKontaktweg;
    private Kontaktart kontaktart;
    private String kontaktwert;

    public String getBeschreibung() { return beschreibung; }
    public void setBeschreibung(String value) { this.beschreibung = value; }

    public Boolean getIstBevorzugterKontaktweg() { return istBevorzugterKontaktweg; }
    public void setIstBevorzugterKontaktweg(Boolean value) { this.istBevorzugterKontaktweg = value; }

    public Kontaktart getKontaktart() { return kontaktart; }
    public void setKontaktart(Kontaktart value) { this.kontaktart = value; }

    public String getKontaktwert() { return kontaktwert; }
    public void setKontaktwert(String value) { this.kontaktwert = value; }

}
