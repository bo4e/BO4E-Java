package bo4e.bo;

import bo4e.ZusatzAttribut;
import bo4e.com.Adresse;
import bo4e.com.Dienstleistung;
import bo4e.com.Geokoordinaten;
import bo4e.com.Katasteradresse;
import bo4e.enums.Netzebene;
import bo4e.enums.Sparte;
import bo4e.enums.Typ;

import java.util.List;

/**
* Object containing information about a Messlokation
*
* .. raw:: html
*
* <object data="../_static/images/bo4e/bo/Messlokation.svg" type="image/svg+xml"></object>
*
* .. HINT::
* `Messlokation JSON Schema
* <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/BO4E/BO4E-Schemas/v202401.4.0/src/bo4e_schemas/bo/Messlokation.json>`_
*/
public class Messlokation extends Geschaeftsobjekt {
    private final Typ typ = Typ.MESSLOKATION;
    private Geokoordinaten geoadresse;
    private List<Geraet> geraete;
    private String grundzustaendigerMsbCodenr;
    private String grundzustaendigerMsbimCodenr;
    private Katasteradresse katasterinformation;
    private String lokationsbuendelObjektcode;
    private List<Lokationszuordnung> lokationszuordnungen;
    private Adresse messadresse;
    private List<Dienstleistung> messdienstleistung;
    private String messgebietnr;
    private String messlokationsId;
    private List<Zaehler> messlokationszaehler;
    private Netzebene netzebeneMessung;
    private Sparte sparte;

    public Messlokation() {
    }

    private Messlokation(MesslokationBuilder builder) {
        super(builder);
        this.geoadresse = builder.geoadresse;
        this.geraete = builder.geraete;
        this.grundzustaendigerMsbCodenr = builder.grundzustaendigerMsbCodenr;
        this.grundzustaendigerMsbimCodenr = builder.grundzustaendigerMsbimCodenr;
        this.katasterinformation = builder.katasterinformation;
        this.lokationsbuendelObjektcode = builder.lokationsbuendelObjektcode;
        this.lokationszuordnungen = builder.lokationszuordnungen;
        this.messadresse = builder.messadresse;
        this.messdienstleistung = builder.messdienstleistung;
        this.messgebietnr = builder.messgebietnr;
        this.messlokationsId = builder.messlokationsId;
        this.messlokationszaehler = builder.messlokationszaehler;
        this.netzebeneMessung = builder.netzebeneMessung;
        this.sparte = builder.sparte;
    }

    public Typ getTyp() {
        return typ;
    }

    public Geokoordinaten getGeoadresse() {
        return geoadresse;
    }

    public void setGeoadresse(Geokoordinaten geoadresse) {
        this.geoadresse = geoadresse;
    }

    /**
    * Liste der Geräte, die zu dieser Messstelle gehört
    */
    public List<Geraet> getGeraete() {
        return geraete;
    }

    /**
    * Liste der Geräte, die zu dieser Messstelle gehört
    */
    public void setGeraete(List<Geraet> geraete) {
        this.geraete = geraete;
    }

    public String getGrundzustaendigerMsbCodenr() {
        return grundzustaendigerMsbCodenr;
    }

    public void setGrundzustaendigerMsbCodenr(String grundzustaendigerMsbCodenr) {
        this.grundzustaendigerMsbCodenr = grundzustaendigerMsbCodenr;
    }

    public String getGrundzustaendigerMsbimCodenr() {
        return grundzustaendigerMsbimCodenr;
    }

    public void setGrundzustaendigerMsbimCodenr(String grundzustaendigerMsbimCodenr) {
        this.grundzustaendigerMsbimCodenr = grundzustaendigerMsbimCodenr;
    }

    /**
    * Lokationszuordnung, um bspw. die zugehörigen Marktlokationen anzugeben
    */
    public Katasteradresse getKatasterinformation() {
        return katasterinformation;
    }

    /**
    * Lokationszuordnung, um bspw. die zugehörigen Marktlokationen anzugeben
    */
    public void setKatasterinformation(Katasteradresse katasterinformation) {
        this.katasterinformation = katasterinformation;
    }

    /**
    * Lokationsbuendel Code, der die Funktion dieses BOs an der Lokationsbuendelstruktur
    * beschreibt.
    */
    public String getLokationsbuendelObjektcode() {
        return lokationsbuendelObjektcode;
    }

    /**
    * Lokationsbuendel Code, der die Funktion dieses BOs an der Lokationsbuendelstruktur
    * beschreibt.
    */
    public void setLokationsbuendelObjektcode(String lokationsbuendelObjektcode) {
        this.lokationsbuendelObjektcode = lokationsbuendelObjektcode;
    }

    /**
    * Lokationszuordnung, um bspw. die zugehörigen Marktlokationen anzugeben
    */
    public List<Lokationszuordnung> getLokationszuordnungen() {
        return lokationszuordnungen;
    }

    /**
    * Lokationszuordnung, um bspw. die zugehörigen Marktlokationen anzugeben
    */
    public void setLokationszuordnungen(List<Lokationszuordnung> lokationszuordnungen) {
        this.lokationszuordnungen = lokationszuordnungen;
    }

    public Adresse getMessadresse() {
        return messadresse;
    }

    public void setMessadresse(Adresse messadresse) {
        this.messadresse = messadresse;
    }

    /**
    * Liste der Messdienstleistungen, die zu dieser Messstelle gehört
    */
    public List<Dienstleistung> getMessdienstleistung() {
        return messdienstleistung;
    }

    /**
    * Liste der Messdienstleistungen, die zu dieser Messstelle gehört
    */
    public void setMessdienstleistung(List<Dienstleistung> messdienstleistung) {
        this.messdienstleistung = messdienstleistung;
    }

    /**
    * Die Nummer des Messgebietes in der ene't-Datenbank
    */
    public String getMessgebietnr() {
        return messgebietnr;
    }

    /**
    * Die Nummer des Messgebietes in der ene't-Datenbank
    */
    public void setMessgebietnr(String messgebietnr) {
        this.messgebietnr = messgebietnr;
    }

    /**
    * Die Messlokations-Identifikation; Das ist die frühere Zählpunktbezeichnung
    */
    public String getMesslokationsId() {
        return messlokationsId;
    }

    /**
    * Die Messlokations-Identifikation; Das ist die frühere Zählpunktbezeichnung
    */
    public void setMesslokationsId(String messlokationsId) {
        this.messlokationsId = messlokationsId;
    }

    /**
    * Zähler, die zu dieser Messlokation gehören
    */
    public List<Zaehler> getMesslokationszaehler() {
        return messlokationszaehler;
    }

    /**
    * Zähler, die zu dieser Messlokation gehören
    */
    public void setMesslokationszaehler(List<Zaehler> messlokationszaehler) {
        this.messlokationszaehler = messlokationszaehler;
    }

    /**
    * Spannungsebene der Messung
    */
    public Netzebene getNetzebeneMessung() {
        return netzebeneMessung;
    }

    /**
    * Spannungsebene der Messung
    */
    public void setNetzebeneMessung(Netzebene netzebeneMessung) {
        this.netzebeneMessung = netzebeneMessung;
    }

    /**
    * Sparte der Messlokation, z.B. Gas oder Strom
    */
    public Sparte getSparte() {
        return sparte;
    }

    /**
    * Sparte der Messlokation, z.B. Gas oder Strom
    */
    public void setSparte(Sparte sparte) {
        this.sparte = sparte;
    }

    public static MesslokationBuilder builder() {
        return new MesslokationBuilder();
    }

    public static class MesslokationBuilder extends GeschaeftsobjektBuilder {
        private Geokoordinaten geoadresse;
        private List<Geraet> geraete;
        private String grundzustaendigerMsbCodenr;
        private String grundzustaendigerMsbimCodenr;
        private Katasteradresse katasterinformation;
        private String lokationsbuendelObjektcode;
        private List<Lokationszuordnung> lokationszuordnungen;
        private Adresse messadresse;
        private List<Dienstleistung> messdienstleistung;
        private String messgebietnr;
        private String messlokationsId;
        private List<Zaehler> messlokationszaehler;
        private Netzebene netzebeneMessung;
        private Sparte sparte;

        private MesslokationBuilder() {
        }

        public MesslokationBuilder setGeoadresse(Geokoordinaten geoadresse) {
            this.geoadresse = geoadresse;
            return this;
        }

        /**
        * Liste der Geräte, die zu dieser Messstelle gehört
        */
        public MesslokationBuilder setGeraete(List<Geraet> geraete) {
            this.geraete = geraete;
            return this;
        }

        public MesslokationBuilder setGrundzustaendigerMsbCodenr(String grundzustaendigerMsbCodenr) {
            this.grundzustaendigerMsbCodenr = grundzustaendigerMsbCodenr;
            return this;
        }

        public MesslokationBuilder setGrundzustaendigerMsbimCodenr(String grundzustaendigerMsbimCodenr) {
            this.grundzustaendigerMsbimCodenr = grundzustaendigerMsbimCodenr;
            return this;
        }

        /**
        * Lokationszuordnung, um bspw. die zugehörigen Marktlokationen anzugeben
        */
        public MesslokationBuilder setKatasterinformation(Katasteradresse katasterinformation) {
            this.katasterinformation = katasterinformation;
            return this;
        }

        /**
        * Lokationsbuendel Code, der die Funktion dieses BOs an der Lokationsbuendelstruktur
        * beschreibt.
        */
        public MesslokationBuilder setLokationsbuendelObjektcode(String lokationsbuendelObjektcode) {
            this.lokationsbuendelObjektcode = lokationsbuendelObjektcode;
            return this;
        }

        /**
        * Lokationszuordnung, um bspw. die zugehörigen Marktlokationen anzugeben
        */
        public MesslokationBuilder setLokationszuordnungen(List<Lokationszuordnung> lokationszuordnungen) {
            this.lokationszuordnungen = lokationszuordnungen;
            return this;
        }

        public MesslokationBuilder setMessadresse(Adresse messadresse) {
            this.messadresse = messadresse;
            return this;
        }

        /**
        * Liste der Messdienstleistungen, die zu dieser Messstelle gehört
        */
        public MesslokationBuilder setMessdienstleistung(List<Dienstleistung> messdienstleistung) {
            this.messdienstleistung = messdienstleistung;
            return this;
        }

        /**
        * Die Nummer des Messgebietes in der ene't-Datenbank
        */
        public MesslokationBuilder setMessgebietnr(String messgebietnr) {
            this.messgebietnr = messgebietnr;
            return this;
        }

        /**
        * Die Messlokations-Identifikation; Das ist die frühere Zählpunktbezeichnung
        */
        public MesslokationBuilder setMesslokationsId(String messlokationsId) {
            this.messlokationsId = messlokationsId;
            return this;
        }

        /**
        * Zähler, die zu dieser Messlokation gehören
        */
        public MesslokationBuilder setMesslokationszaehler(List<Zaehler> messlokationszaehler) {
            this.messlokationszaehler = messlokationszaehler;
            return this;
        }

        /**
        * Spannungsebene der Messung
        */
        public MesslokationBuilder setNetzebeneMessung(Netzebene netzebeneMessung) {
            this.netzebeneMessung = netzebeneMessung;
            return this;
        }

        /**
        * Sparte der Messlokation, z.B. Gas oder Strom
        */
        public MesslokationBuilder setSparte(Sparte sparte) {
            this.sparte = sparte;
            return this;
        }

        public MesslokationBuilder setId(String id) {
            super.setId(id);
            return this;
        }

        public MesslokationBuilder setZusatzAttribute(List<ZusatzAttribut> zusatzAttribute) {
            super.setZusatzAttribute(zusatzAttribute);
            return this;
        }

        public Messlokation build() {
            return new Messlokation(this);
        }
    }
}