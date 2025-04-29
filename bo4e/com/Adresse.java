package bo4e.com;

import bo4e.ZusatzAttribut;
import bo4e.enums.ComTyp;
import bo4e.enums.Landescode;

import java.util.List;

/**
* Contains an address that can be used for most purposes.
*
* .. raw:: html
*
* <object data="../_static/images/bo4e/com/Adresse.svg" type="image/svg+xml"></object>
*
* .. HINT::
* `Adresse JSON Schema
* <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/BO4E/BO4E-Schemas/v202501.0.0/src/bo4e_schemas/com/Adresse.json>`_
*/
public class Adresse extends COM {
    private final ComTyp _typ = ComTyp.ADRESSE;
    private String adresszusatz;
    private String coErgaenzung;
    private String hausnummer;
    private Landescode landescode;
    private String ort;
    private String ortsteil;
    private String postfach;
    private String postleitzahl;
    private String strasse;

    public Adresse() {
    }

    private Adresse(AdresseBuilder builder) {
        super(builder);
        this.adresszusatz = builder.adresszusatz;
        this.coErgaenzung = builder.coErgaenzung;
        this.hausnummer = builder.hausnummer;
        this.landescode = builder.landescode;
        this.ort = builder.ort;
        this.ortsteil = builder.ortsteil;
        this.postfach = builder.postfach;
        this.postleitzahl = builder.postleitzahl;
        this.strasse = builder.strasse;
    }

    public ComTyp get_typ() {
        return _typ;
    }

    /**
    * Zusatzhinweis zum Auffinden der Adresse, z.B. "3. Stock linke Wohnung"
    */
    public String getAdresszusatz() {
        return adresszusatz;
    }

    /**
    * Zusatzhinweis zum Auffinden der Adresse, z.B. "3. Stock linke Wohnung"
    */
    public void setAdresszusatz(String adresszusatz) {
        this.adresszusatz = adresszusatz;
    }

    /**
    * Im Falle einer c/o-Adresse steht in diesem Attribut die Anrede. Z.B. "c/o Veronica
    * Hauptmieterin"
    */
    public String getCoErgaenzung() {
        return coErgaenzung;
    }

    /**
    * Im Falle einer c/o-Adresse steht in diesem Attribut die Anrede. Z.B. "c/o Veronica
    * Hauptmieterin"
    */
    public void setCoErgaenzung(String coErgaenzung) {
        this.coErgaenzung = coErgaenzung;
    }

    /**
    * Hausnummer inkl. Zusatz; z.B. "3", "4a"
    */
    public String getHausnummer() {
        return hausnummer;
    }

    /**
    * Hausnummer inkl. Zusatz; z.B. "3", "4a"
    */
    public void setHausnummer(String hausnummer) {
        this.hausnummer = hausnummer;
    }

    /**
    * Offizieller ISO-Landescode
    */
    public Landescode getLandescode() {
        return landescode;
    }

    /**
    * Offizieller ISO-Landescode
    */
    public void setLandescode(Landescode landescode) {
        this.landescode = landescode;
    }

    /**
    * Bezeichnung der Stadt; z.B. "Hückelhoven"
    */
    public String getOrt() {
        return ort;
    }

    /**
    * Bezeichnung der Stadt; z.B. "Hückelhoven"
    */
    public void setOrt(String ort) {
        this.ort = ort;
    }

    /**
    * Bezeichnung des Ortsteils; z.B. "Mitte"
    */
    public String getOrtsteil() {
        return ortsteil;
    }

    /**
    * Bezeichnung des Ortsteils; z.B. "Mitte"
    */
    public void setOrtsteil(String ortsteil) {
        this.ortsteil = ortsteil;
    }

    /**
    * Im Falle einer Postfachadresse das Postfach; Damit werden Straße und Hausnummer nicht
    * berücksichtigt
    */
    public String getPostfach() {
        return postfach;
    }

    /**
    * Im Falle einer Postfachadresse das Postfach; Damit werden Straße und Hausnummer nicht
    * berücksichtigt
    */
    public void setPostfach(String postfach) {
        this.postfach = postfach;
    }

    /**
    * Die Postleitzahl; z.B: "41836"
    */
    public String getPostleitzahl() {
        return postleitzahl;
    }

    /**
    * Die Postleitzahl; z.B: "41836"
    */
    public void setPostleitzahl(String postleitzahl) {
        this.postleitzahl = postleitzahl;
    }

    /**
    * Bezeichnung der Straße; z.B. "Weserstraße"
    */
    public String getStrasse() {
        return strasse;
    }

    /**
    * Bezeichnung der Straße; z.B. "Weserstraße"
    */
    public void setStrasse(String strasse) {
        this.strasse = strasse;
    }

    public static AdresseBuilder builder() {
        return new AdresseBuilder();
    }

    public static class AdresseBuilder extends COMBuilder {
        private String adresszusatz;
        private String coErgaenzung;
        private String hausnummer;
        private Landescode landescode;
        private String ort;
        private String ortsteil;
        private String postfach;
        private String postleitzahl;
        private String strasse;

        private AdresseBuilder() {
        }

        /**
        * Zusatzhinweis zum Auffinden der Adresse, z.B. "3. Stock linke Wohnung"
        */
        public AdresseBuilder setAdresszusatz(String adresszusatz) {
            this.adresszusatz = adresszusatz;
            return this;
        }

        /**
        * Im Falle einer c/o-Adresse steht in diesem Attribut die Anrede. Z.B. "c/o Veronica
        * Hauptmieterin"
        */
        public AdresseBuilder setCoErgaenzung(String coErgaenzung) {
            this.coErgaenzung = coErgaenzung;
            return this;
        }

        /**
        * Hausnummer inkl. Zusatz; z.B. "3", "4a"
        */
        public AdresseBuilder setHausnummer(String hausnummer) {
            this.hausnummer = hausnummer;
            return this;
        }

        /**
        * Offizieller ISO-Landescode
        */
        public AdresseBuilder setLandescode(Landescode landescode) {
            this.landescode = landescode;
            return this;
        }

        /**
        * Bezeichnung der Stadt; z.B. "Hückelhoven"
        */
        public AdresseBuilder setOrt(String ort) {
            this.ort = ort;
            return this;
        }

        /**
        * Bezeichnung des Ortsteils; z.B. "Mitte"
        */
        public AdresseBuilder setOrtsteil(String ortsteil) {
            this.ortsteil = ortsteil;
            return this;
        }

        /**
        * Im Falle einer Postfachadresse das Postfach; Damit werden Straße und Hausnummer nicht
        * berücksichtigt
        */
        public AdresseBuilder setPostfach(String postfach) {
            this.postfach = postfach;
            return this;
        }

        /**
        * Die Postleitzahl; z.B: "41836"
        */
        public AdresseBuilder setPostleitzahl(String postleitzahl) {
            this.postleitzahl = postleitzahl;
            return this;
        }

        /**
        * Bezeichnung der Straße; z.B. "Weserstraße"
        */
        public AdresseBuilder setStrasse(String strasse) {
            this.strasse = strasse;
            return this;
        }

        public AdresseBuilder set_id(String _id) {
            super.set_id(_id);
            return this;
        }

        public AdresseBuilder setZusatzAttribute(List<ZusatzAttribut> zusatzAttribute) {
            super.setZusatzAttribute(zusatzAttribute);
            return this;
        }

        public Adresse build() {
            return new Adresse(this);
        }
    }
}