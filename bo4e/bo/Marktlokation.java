package bo4e.bo;

import bo4e.ZusatzAttribut;
import bo4e.com.Adresse;
import bo4e.com.Geokoordinaten;
import bo4e.com.Katasteradresse;
import bo4e.com.Verbrauch;
import bo4e.com.Zaehlwerk;
import bo4e.enums.Bilanzierungsmethode;
import bo4e.enums.Energierichtung;
import bo4e.enums.Gasqualitaet;
import bo4e.enums.Gebiettyp;
import bo4e.enums.Kundentyp;
import bo4e.enums.Netzebene;
import bo4e.enums.Sparte;
import bo4e.enums.Typ;
import bo4e.enums.Verbrauchsart;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.List;

/**
* Object containing information about a Marktlokation
*
* .. raw:: html
*
* <object data="../_static/images/bo4e/bo/Marktlokation.svg"
* type="image/svg+xml"></object>
*
* .. HINT::
* `Marktlokation JSON Schema
* <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/BO4E/BO4E-Schemas/v202401.4.0/src/bo4e_schemas/bo/Marktlokation.json>`_
*/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Marktlokation extends Geschaeftsobjekt {
    private final Typ typ = Typ.MARKTLOKATION;
    private String bilanzierungsgebiet;
    private Bilanzierungsmethode bilanzierungsmethode;
    private Geschaeftspartner endkunde;
    private Energierichtung energierichtung;
    private Gasqualitaet gasqualitaet;
    private Gebiettyp gebietstyp;
    private Geokoordinaten geoadresse;
    private String grundversorgercodenr;
    private Boolean istUnterbrechbar;
    private Katasteradresse katasterinformation;
    private List<Kundentyp> kundengruppen;
    private Adresse lokationsadresse;
    private String lokationsbuendelObjektcode;
    private List<Lokationszuordnung> lokationszuordnungen;
    private String marktgebiet;
    private String marktlokationsId;
    private String netzbetreibercodenr;
    private Netzebene netzebene;
    private String netzgebietsnr;
    private String regelzone;
    private Sparte sparte;
    private Verbrauchsart verbrauchsart;
    private List<Verbrauch> verbrauchsmengen;
    private List<Zaehlwerk> zaehlwerke;
    private List<Zaehlwerk> zaehlwerkeDerBeteiligtenMarktrolle;

    public Marktlokation() {
    }

    private Marktlokation(MarktlokationBuilder builder) {
        super(builder);
        this.bilanzierungsgebiet = builder.bilanzierungsgebiet;
        this.bilanzierungsmethode = builder.bilanzierungsmethode;
        this.endkunde = builder.endkunde;
        this.energierichtung = builder.energierichtung;
        this.gasqualitaet = builder.gasqualitaet;
        this.gebietstyp = builder.gebietstyp;
        this.geoadresse = builder.geoadresse;
        this.grundversorgercodenr = builder.grundversorgercodenr;
        this.istUnterbrechbar = builder.istUnterbrechbar;
        this.katasterinformation = builder.katasterinformation;
        this.kundengruppen = builder.kundengruppen;
        this.lokationsadresse = builder.lokationsadresse;
        this.lokationsbuendelObjektcode = builder.lokationsbuendelObjektcode;
        this.lokationszuordnungen = builder.lokationszuordnungen;
        this.marktgebiet = builder.marktgebiet;
        this.marktlokationsId = builder.marktlokationsId;
        this.netzbetreibercodenr = builder.netzbetreibercodenr;
        this.netzebene = builder.netzebene;
        this.netzgebietsnr = builder.netzgebietsnr;
        this.regelzone = builder.regelzone;
        this.sparte = builder.sparte;
        this.verbrauchsart = builder.verbrauchsart;
        this.verbrauchsmengen = builder.verbrauchsmengen;
        this.zaehlwerke = builder.zaehlwerke;
        this.zaehlwerkeDerBeteiligtenMarktrolle = builder.zaehlwerkeDerBeteiligtenMarktrolle;
    }

    public Typ getTyp() {
        return typ;
    }

    /**
    * Bilanzierungsgebiet, dem das Netzgebiet zugeordnet ist - im Falle eines Strom Netzes
    */
    public String getBilanzierungsgebiet() {
        return bilanzierungsgebiet;
    }

    /**
    * Bilanzierungsgebiet, dem das Netzgebiet zugeordnet ist - im Falle eines Strom Netzes
    */
    public void setBilanzierungsgebiet(String bilanzierungsgebiet) {
        this.bilanzierungsgebiet = bilanzierungsgebiet;
    }

    /**
    * Die Bilanzierungsmethode, RLM oder SLP
    */
    public Bilanzierungsmethode getBilanzierungsmethode() {
        return bilanzierungsmethode;
    }

    /**
    * Die Bilanzierungsmethode, RLM oder SLP
    */
    public void setBilanzierungsmethode(Bilanzierungsmethode bilanzierungsmethode) {
        this.bilanzierungsmethode = bilanzierungsmethode;
    }

    /**
    * Geschäftspartner, dem diese Marktlokation gehört
    */
    public Geschaeftspartner getEndkunde() {
        return endkunde;
    }

    /**
    * Geschäftspartner, dem diese Marktlokation gehört
    */
    public void setEndkunde(Geschaeftspartner endkunde) {
        this.endkunde = endkunde;
    }

    /**
    * Kennzeichnung, ob Energie eingespeist oder entnommen (ausgespeist) wird
    */
    public Energierichtung getEnergierichtung() {
        return energierichtung;
    }

    /**
    * Kennzeichnung, ob Energie eingespeist oder entnommen (ausgespeist) wird
    */
    public void setEnergierichtung(Energierichtung energierichtung) {
        this.energierichtung = energierichtung;
    }

    /**
    * Die Gasqualität in diesem Netzgebiet. H-Gas oder L-Gas. Im Falle eines Gas-Netzes
    */
    public Gasqualitaet getGasqualitaet() {
        return gasqualitaet;
    }

    /**
    * Die Gasqualität in diesem Netzgebiet. H-Gas oder L-Gas. Im Falle eines Gas-Netzes
    */
    public void setGasqualitaet(Gasqualitaet gasqualitaet) {
        this.gasqualitaet = gasqualitaet;
    }

    /**
    * Typ des Netzgebietes, z.B. Verteilnetz
    */
    public Gebiettyp getGebietstyp() {
        return gebietstyp;
    }

    /**
    * Typ des Netzgebietes, z.B. Verteilnetz
    */
    public void setGebietstyp(Gebiettyp gebietstyp) {
        this.gebietstyp = gebietstyp;
    }

    public Geokoordinaten getGeoadresse() {
        return geoadresse;
    }

    public void setGeoadresse(Geokoordinaten geoadresse) {
        this.geoadresse = geoadresse;
    }

    /**
    * Codenummer des Grundversorgers, der für diese Marktlokation zuständig ist
    */
    public String getGrundversorgercodenr() {
        return grundversorgercodenr;
    }

    /**
    * Codenummer des Grundversorgers, der für diese Marktlokation zuständig ist
    */
    public void setGrundversorgercodenr(String grundversorgercodenr) {
        this.grundversorgercodenr = grundversorgercodenr;
    }

    /**
    * Gibt an, ob es sich um eine unterbrechbare Belieferung handelt
    */
    public Boolean getIstUnterbrechbar() {
        return istUnterbrechbar;
    }

    /**
    * Gibt an, ob es sich um eine unterbrechbare Belieferung handelt
    */
    public void setIstUnterbrechbar(Boolean istUnterbrechbar) {
        this.istUnterbrechbar = istUnterbrechbar;
    }

    public Katasteradresse getKatasterinformation() {
        return katasterinformation;
    }

    public void setKatasterinformation(Katasteradresse katasterinformation) {
        this.katasterinformation = katasterinformation;
    }

    /**
    * Kundengruppen der Marktlokation
    */
    public List<Kundentyp> getKundengruppen() {
        return kundengruppen;
    }

    /**
    * Kundengruppen der Marktlokation
    */
    public void setKundengruppen(List<Kundentyp> kundengruppen) {
        this.kundengruppen = kundengruppen;
    }

    /**
    * Die Adresse, an der die Energie-Lieferung oder -Einspeisung erfolgt
    */
    public Adresse getLokationsadresse() {
        return lokationsadresse;
    }

    /**
    * Die Adresse, an der die Energie-Lieferung oder -Einspeisung erfolgt
    */
    public void setLokationsadresse(Adresse lokationsadresse) {
        this.lokationsadresse = lokationsadresse;
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
    * Lokationszuordnung, um bspw. die zugehörigen Messlokationen anzugeben
    */
    public List<Lokationszuordnung> getLokationszuordnungen() {
        return lokationszuordnungen;
    }

    /**
    * Lokationszuordnung, um bspw. die zugehörigen Messlokationen anzugeben
    */
    public void setLokationszuordnungen(List<Lokationszuordnung> lokationszuordnungen) {
        this.lokationszuordnungen = lokationszuordnungen;
    }

    /**
    * für Gas. Code vom EIC, https://www.entsog.eu/data/data-portal/codes-list
    */
    public String getMarktgebiet() {
        return marktgebiet;
    }

    /**
    * für Gas. Code vom EIC, https://www.entsog.eu/data/data-portal/codes-list
    */
    public void setMarktgebiet(String marktgebiet) {
        this.marktgebiet = marktgebiet;
    }

    /**
    * Identifikationsnummer einer Marktlokation, an der Energie entweder verbraucht, oder
    * erzeugt wird.
    */
    public String getMarktlokationsId() {
        return marktlokationsId;
    }

    /**
    * Identifikationsnummer einer Marktlokation, an der Energie entweder verbraucht, oder
    * erzeugt wird.
    */
    public void setMarktlokationsId(String marktlokationsId) {
        this.marktlokationsId = marktlokationsId;
    }

    /**
    * Codenummer des Netzbetreibers, an dessen Netz diese Marktlokation angeschlossen ist.
    */
    public String getNetzbetreibercodenr() {
        return netzbetreibercodenr;
    }

    /**
    * Codenummer des Netzbetreibers, an dessen Netz diese Marktlokation angeschlossen ist.
    */
    public void setNetzbetreibercodenr(String netzbetreibercodenr) {
        this.netzbetreibercodenr = netzbetreibercodenr;
    }

    public Netzebene getNetzebene() {
        return netzebene;
    }

    public void setNetzebene(Netzebene netzebene) {
        this.netzebene = netzebene;
    }

    /**
    * Die ID des Gebietes in der ene't-Datenbank
    */
    public String getNetzgebietsnr() {
        return netzgebietsnr;
    }

    /**
    * Die ID des Gebietes in der ene't-Datenbank
    */
    public void setNetzgebietsnr(String netzgebietsnr) {
        this.netzgebietsnr = netzgebietsnr;
    }

    /**
    * Kundengruppen der Marktlokation
    */
    public String getRegelzone() {
        return regelzone;
    }

    /**
    * Kundengruppen der Marktlokation
    */
    public void setRegelzone(String regelzone) {
        this.regelzone = regelzone;
    }

    /**
    * Sparte der Marktlokation, z.B. Gas oder Strom
    */
    public Sparte getSparte() {
        return sparte;
    }

    /**
    * Sparte der Marktlokation, z.B. Gas oder Strom
    */
    public void setSparte(Sparte sparte) {
        this.sparte = sparte;
    }

    /**
    * Verbrauchsart der Marktlokation.
    */
    public Verbrauchsart getVerbrauchsart() {
        return verbrauchsart;
    }

    /**
    * Verbrauchsart der Marktlokation.
    */
    public void setVerbrauchsart(Verbrauchsart verbrauchsart) {
        this.verbrauchsart = verbrauchsart;
    }

    public List<Verbrauch> getVerbrauchsmengen() {
        return verbrauchsmengen;
    }

    public void setVerbrauchsmengen(List<Verbrauch> verbrauchsmengen) {
        this.verbrauchsmengen = verbrauchsmengen;
    }

    /**
    * für Gas. Code vom EIC, https://www.entsog.eu/data/data-portal/codes-list
    */
    public List<Zaehlwerk> getZaehlwerke() {
        return zaehlwerke;
    }

    /**
    * für Gas. Code vom EIC, https://www.entsog.eu/data/data-portal/codes-list
    */
    public void setZaehlwerke(List<Zaehlwerk> zaehlwerke) {
        this.zaehlwerke = zaehlwerke;
    }

    /**
    * Lokationszuordnung, um bspw. die zugehörigen Messlokationen anzugeben
    */
    public List<Zaehlwerk> getZaehlwerkeDerBeteiligtenMarktrolle() {
        return zaehlwerkeDerBeteiligtenMarktrolle;
    }

    /**
    * Lokationszuordnung, um bspw. die zugehörigen Messlokationen anzugeben
    */
    public void setZaehlwerkeDerBeteiligtenMarktrolle(List<Zaehlwerk> zaehlwerkeDerBeteiligtenMarktrolle) {
        this.zaehlwerkeDerBeteiligtenMarktrolle = zaehlwerkeDerBeteiligtenMarktrolle;
    }

    public static MarktlokationBuilder builder() {
        return new MarktlokationBuilder();
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class MarktlokationBuilder extends GeschaeftsobjektBuilder {
        private String bilanzierungsgebiet;
        private Bilanzierungsmethode bilanzierungsmethode;
        private Geschaeftspartner endkunde;
        private Energierichtung energierichtung;
        private Gasqualitaet gasqualitaet;
        private Gebiettyp gebietstyp;
        private Geokoordinaten geoadresse;
        private String grundversorgercodenr;
        private Boolean istUnterbrechbar;
        private Katasteradresse katasterinformation;
        private List<Kundentyp> kundengruppen;
        private Adresse lokationsadresse;
        private String lokationsbuendelObjektcode;
        private List<Lokationszuordnung> lokationszuordnungen;
        private String marktgebiet;
        private String marktlokationsId;
        private String netzbetreibercodenr;
        private Netzebene netzebene;
        private String netzgebietsnr;
        private String regelzone;
        private Sparte sparte;
        private Verbrauchsart verbrauchsart;
        private List<Verbrauch> verbrauchsmengen;
        private List<Zaehlwerk> zaehlwerke;
        private List<Zaehlwerk> zaehlwerkeDerBeteiligtenMarktrolle;

        private MarktlokationBuilder() {
        }

        /**
        * Bilanzierungsgebiet, dem das Netzgebiet zugeordnet ist - im Falle eines Strom Netzes
        */
        public MarktlokationBuilder setBilanzierungsgebiet(String bilanzierungsgebiet) {
            this.bilanzierungsgebiet = bilanzierungsgebiet;
            return this;
        }

        /**
        * Die Bilanzierungsmethode, RLM oder SLP
        */
        public MarktlokationBuilder setBilanzierungsmethode(Bilanzierungsmethode bilanzierungsmethode) {
            this.bilanzierungsmethode = bilanzierungsmethode;
            return this;
        }

        /**
        * Geschäftspartner, dem diese Marktlokation gehört
        */
        public MarktlokationBuilder setEndkunde(Geschaeftspartner endkunde) {
            this.endkunde = endkunde;
            return this;
        }

        /**
        * Kennzeichnung, ob Energie eingespeist oder entnommen (ausgespeist) wird
        */
        public MarktlokationBuilder setEnergierichtung(Energierichtung energierichtung) {
            this.energierichtung = energierichtung;
            return this;
        }

        /**
        * Die Gasqualität in diesem Netzgebiet. H-Gas oder L-Gas. Im Falle eines Gas-Netzes
        */
        public MarktlokationBuilder setGasqualitaet(Gasqualitaet gasqualitaet) {
            this.gasqualitaet = gasqualitaet;
            return this;
        }

        /**
        * Typ des Netzgebietes, z.B. Verteilnetz
        */
        public MarktlokationBuilder setGebietstyp(Gebiettyp gebietstyp) {
            this.gebietstyp = gebietstyp;
            return this;
        }

        public MarktlokationBuilder setGeoadresse(Geokoordinaten geoadresse) {
            this.geoadresse = geoadresse;
            return this;
        }

        /**
        * Codenummer des Grundversorgers, der für diese Marktlokation zuständig ist
        */
        public MarktlokationBuilder setGrundversorgercodenr(String grundversorgercodenr) {
            this.grundversorgercodenr = grundversorgercodenr;
            return this;
        }

        /**
        * Gibt an, ob es sich um eine unterbrechbare Belieferung handelt
        */
        public MarktlokationBuilder setIstUnterbrechbar(Boolean istUnterbrechbar) {
            this.istUnterbrechbar = istUnterbrechbar;
            return this;
        }

        public MarktlokationBuilder setKatasterinformation(Katasteradresse katasterinformation) {
            this.katasterinformation = katasterinformation;
            return this;
        }

        /**
        * Kundengruppen der Marktlokation
        */
        public MarktlokationBuilder setKundengruppen(List<Kundentyp> kundengruppen) {
            this.kundengruppen = kundengruppen;
            return this;
        }

        /**
        * Die Adresse, an der die Energie-Lieferung oder -Einspeisung erfolgt
        */
        public MarktlokationBuilder setLokationsadresse(Adresse lokationsadresse) {
            this.lokationsadresse = lokationsadresse;
            return this;
        }

        /**
        * Lokationsbuendel Code, der die Funktion dieses BOs an der Lokationsbuendelstruktur
        * beschreibt.
        */
        public MarktlokationBuilder setLokationsbuendelObjektcode(String lokationsbuendelObjektcode) {
            this.lokationsbuendelObjektcode = lokationsbuendelObjektcode;
            return this;
        }

        /**
        * Lokationszuordnung, um bspw. die zugehörigen Messlokationen anzugeben
        */
        public MarktlokationBuilder setLokationszuordnungen(List<Lokationszuordnung> lokationszuordnungen) {
            this.lokationszuordnungen = lokationszuordnungen;
            return this;
        }

        /**
        * für Gas. Code vom EIC, https://www.entsog.eu/data/data-portal/codes-list
        */
        public MarktlokationBuilder setMarktgebiet(String marktgebiet) {
            this.marktgebiet = marktgebiet;
            return this;
        }

        /**
        * Identifikationsnummer einer Marktlokation, an der Energie entweder verbraucht, oder
        * erzeugt wird.
        */
        public MarktlokationBuilder setMarktlokationsId(String marktlokationsId) {
            this.marktlokationsId = marktlokationsId;
            return this;
        }

        /**
        * Codenummer des Netzbetreibers, an dessen Netz diese Marktlokation angeschlossen ist.
        */
        public MarktlokationBuilder setNetzbetreibercodenr(String netzbetreibercodenr) {
            this.netzbetreibercodenr = netzbetreibercodenr;
            return this;
        }

        public MarktlokationBuilder setNetzebene(Netzebene netzebene) {
            this.netzebene = netzebene;
            return this;
        }

        /**
        * Die ID des Gebietes in der ene't-Datenbank
        */
        public MarktlokationBuilder setNetzgebietsnr(String netzgebietsnr) {
            this.netzgebietsnr = netzgebietsnr;
            return this;
        }

        /**
        * Kundengruppen der Marktlokation
        */
        public MarktlokationBuilder setRegelzone(String regelzone) {
            this.regelzone = regelzone;
            return this;
        }

        /**
        * Sparte der Marktlokation, z.B. Gas oder Strom
        */
        public MarktlokationBuilder setSparte(Sparte sparte) {
            this.sparte = sparte;
            return this;
        }

        /**
        * Verbrauchsart der Marktlokation.
        */
        public MarktlokationBuilder setVerbrauchsart(Verbrauchsart verbrauchsart) {
            this.verbrauchsart = verbrauchsart;
            return this;
        }

        public MarktlokationBuilder setVerbrauchsmengen(List<Verbrauch> verbrauchsmengen) {
            this.verbrauchsmengen = verbrauchsmengen;
            return this;
        }

        /**
        * für Gas. Code vom EIC, https://www.entsog.eu/data/data-portal/codes-list
        */
        public MarktlokationBuilder setZaehlwerke(List<Zaehlwerk> zaehlwerke) {
            this.zaehlwerke = zaehlwerke;
            return this;
        }

        /**
        * Lokationszuordnung, um bspw. die zugehörigen Messlokationen anzugeben
        */
        public MarktlokationBuilder setZaehlwerkeDerBeteiligtenMarktrolle(List<Zaehlwerk> zaehlwerkeDerBeteiligtenMarktrolle) {
            this.zaehlwerkeDerBeteiligtenMarktrolle = zaehlwerkeDerBeteiligtenMarktrolle;
            return this;
        }

        public MarktlokationBuilder setId(String id) {
            super.setId(id);
            return this;
        }

        public MarktlokationBuilder setZusatzAttribute(List<ZusatzAttribut> zusatzAttribute) {
            super.setZusatzAttribute(zusatzAttribute);
            return this;
        }

        public Marktlokation build() {
            return new Marktlokation(this);
        }
    }
}