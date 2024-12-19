package bo4e.bo;

import bo4e.ZusatzAttribut;
import bo4e.com.Zaehlwerk;
import bo4e.enums.Befestigungsart;
import bo4e.enums.Messwerterfassung;
import bo4e.enums.Registeranzahl;
import bo4e.enums.Sparte;
import bo4e.enums.Typ;
import bo4e.enums.Zaehlerauspraegung;
import bo4e.enums.Zaehlergroesse;
import bo4e.enums.Zaehlertyp;
import bo4e.enums.ZaehlertypSpezifikation;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.time.OffsetDateTime;
import java.util.List;

/**
* Object containing information about a meter/"Zaehler".
*
* .. raw:: html
*
* <object data="../_static/images/bo4e/bo/Zaehler.svg" type="image/svg+xml"></object>
*
* .. HINT::
* `Zaehler JSON Schema
* <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/BO4E/BO4E-Schemas/v202401.4.0/src/bo4e_schemas/bo/Zaehler.json>`_
*/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Zaehler extends Geschaeftsobjekt {
    private final Typ typ = Typ.ZAEHLER;
    private Befestigungsart befestigungsart;
    private OffsetDateTime eichungBis;
    private List<Geraet> geraete;
    private Boolean istFernschaltbar;
    private OffsetDateTime letzteEichung;
    private Messwerterfassung messwerterfassung;
    private Registeranzahl registeranzahl;
    private Sparte sparte;
    private Zaehlerauspraegung zaehlerauspraegung;
    private Zaehlergroesse zaehlergroesse;
    private Geschaeftspartner zaehlerhersteller;
    private Double zaehlerkonstante;
    private String zaehlernummer;
    private Zaehlertyp zaehlertyp;
    private ZaehlertypSpezifikation zaehlertypSpezifikation;
    private List<Zaehlwerk> zaehlwerke;

    public Zaehler() {
    }

    private Zaehler(ZaehlerBuilder builder) {
        super(builder);
        this.befestigungsart = builder.befestigungsart;
        this.eichungBis = builder.eichungBis;
        this.geraete = builder.geraete;
        this.istFernschaltbar = builder.istFernschaltbar;
        this.letzteEichung = builder.letzteEichung;
        this.messwerterfassung = builder.messwerterfassung;
        this.registeranzahl = builder.registeranzahl;
        this.sparte = builder.sparte;
        this.zaehlerauspraegung = builder.zaehlerauspraegung;
        this.zaehlergroesse = builder.zaehlergroesse;
        this.zaehlerhersteller = builder.zaehlerhersteller;
        this.zaehlerkonstante = builder.zaehlerkonstante;
        this.zaehlernummer = builder.zaehlernummer;
        this.zaehlertyp = builder.zaehlertyp;
        this.zaehlertypSpezifikation = builder.zaehlertypSpezifikation;
        this.zaehlwerke = builder.zaehlwerke;
    }

    public Typ getTyp() {
        return typ;
    }

    /**
    * Besondere Spezifikation des Zählers
    */
    public Befestigungsart getBefestigungsart() {
        return befestigungsart;
    }

    /**
    * Besondere Spezifikation des Zählers
    */
    public void setBefestigungsart(Befestigungsart befestigungsart) {
        this.befestigungsart = befestigungsart;
    }

    /**
    * Zählerkonstante auf dem Zähler
    */
    public OffsetDateTime getEichungBis() {
        return eichungBis;
    }

    /**
    * Zählerkonstante auf dem Zähler
    */
    public void setEichungBis(OffsetDateTime eichungBis) {
        this.eichungBis = eichungBis;
    }

    /**
    * Größe des Zählers
    */
    public List<Geraet> getGeraete() {
        return geraete;
    }

    /**
    * Größe des Zählers
    */
    public void setGeraete(List<Geraet> geraete) {
        this.geraete = geraete;
    }

    /**
    * Der Hersteller des Zählers
    */
    public Boolean getIstFernschaltbar() {
        return istFernschaltbar;
    }

    /**
    * Der Hersteller des Zählers
    */
    public void setIstFernschaltbar(Boolean istFernschaltbar) {
        this.istFernschaltbar = istFernschaltbar;
    }

    /**
    * Bis zu diesem Datum (exklusiv) ist der Zähler geeicht.
    */
    public OffsetDateTime getLetzteEichung() {
        return letzteEichung;
    }

    /**
    * Bis zu diesem Datum (exklusiv) ist der Zähler geeicht.
    */
    public void setLetzteEichung(OffsetDateTime letzteEichung) {
        this.letzteEichung = letzteEichung;
    }

    /**
    * Fernschaltung
    */
    public Messwerterfassung getMesswerterfassung() {
        return messwerterfassung;
    }

    /**
    * Fernschaltung
    */
    public void setMesswerterfassung(Messwerterfassung messwerterfassung) {
        this.messwerterfassung = messwerterfassung;
    }

    /**
    * Spezifikation bezüglich unterstützter Tarif
    */
    public Registeranzahl getRegisteranzahl() {
        return registeranzahl;
    }

    /**
    * Spezifikation bezüglich unterstützter Tarif
    */
    public void setRegisteranzahl(Registeranzahl registeranzahl) {
        this.registeranzahl = registeranzahl;
    }

    /**
    * Nummerierung des Zählers,vergeben durch den Messstellenbetreiber
    */
    public Sparte getSparte() {
        return sparte;
    }

    /**
    * Nummerierung des Zählers,vergeben durch den Messstellenbetreiber
    */
    public void setSparte(Sparte sparte) {
        this.sparte = sparte;
    }

    /**
    * Strom oder Gas
    */
    public Zaehlerauspraegung getZaehlerauspraegung() {
        return zaehlerauspraegung;
    }

    /**
    * Strom oder Gas
    */
    public void setZaehlerauspraegung(Zaehlerauspraegung zaehlerauspraegung) {
        this.zaehlerauspraegung = zaehlerauspraegung;
    }

    /**
    * Befestigungsart
    */
    public Zaehlergroesse getZaehlergroesse() {
        return zaehlergroesse;
    }

    /**
    * Befestigungsart
    */
    public void setZaehlergroesse(Zaehlergroesse zaehlergroesse) {
        this.zaehlergroesse = zaehlergroesse;
    }

    /**
    * Der Hersteller des Zählers
    */
    public Geschaeftspartner getZaehlerhersteller() {
        return zaehlerhersteller;
    }

    /**
    * Der Hersteller des Zählers
    */
    public void setZaehlerhersteller(Geschaeftspartner zaehlerhersteller) {
        this.zaehlerhersteller = zaehlerhersteller;
    }

    /**
    * Spezifikation bezüglich unterstützter Tarif
    */
    public Double getZaehlerkonstante() {
        return zaehlerkonstante;
    }

    /**
    * Spezifikation bezüglich unterstützter Tarif
    */
    public void setZaehlerkonstante(Double zaehlerkonstante) {
        this.zaehlerkonstante = zaehlerkonstante;
    }

    /**
    * Nummerierung des Zählers,vergeben durch den Messstellenbetreiber
    */
    public String getZaehlernummer() {
        return zaehlernummer;
    }

    /**
    * Nummerierung des Zählers,vergeben durch den Messstellenbetreiber
    */
    public void setZaehlernummer(String zaehlernummer) {
        this.zaehlernummer = zaehlernummer;
    }

    /**
    * Spezifikation die Richtung des Zählers betreffend
    */
    public Zaehlertyp getZaehlertyp() {
        return zaehlertyp;
    }

    /**
    * Spezifikation die Richtung des Zählers betreffend
    */
    public void setZaehlertyp(Zaehlertyp zaehlertyp) {
        this.zaehlertyp = zaehlertyp;
    }

    /**
    * Messwerterfassung des Zählers
    */
    public ZaehlertypSpezifikation getZaehlertypSpezifikation() {
        return zaehlertypSpezifikation;
    }

    /**
    * Messwerterfassung des Zählers
    */
    public void setZaehlertypSpezifikation(ZaehlertypSpezifikation zaehlertypSpezifikation) {
        this.zaehlertypSpezifikation = zaehlertypSpezifikation;
    }

    /**
    * Typisierung des Zählers
    */
    public List<Zaehlwerk> getZaehlwerke() {
        return zaehlwerke;
    }

    /**
    * Typisierung des Zählers
    */
    public void setZaehlwerke(List<Zaehlwerk> zaehlwerke) {
        this.zaehlwerke = zaehlwerke;
    }

    public static ZaehlerBuilder builder() {
        return new ZaehlerBuilder();
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class ZaehlerBuilder extends GeschaeftsobjektBuilder {
        private Befestigungsart befestigungsart;
        private OffsetDateTime eichungBis;
        private List<Geraet> geraete;
        private Boolean istFernschaltbar;
        private OffsetDateTime letzteEichung;
        private Messwerterfassung messwerterfassung;
        private Registeranzahl registeranzahl;
        private Sparte sparte;
        private Zaehlerauspraegung zaehlerauspraegung;
        private Zaehlergroesse zaehlergroesse;
        private Geschaeftspartner zaehlerhersteller;
        private Double zaehlerkonstante;
        private String zaehlernummer;
        private Zaehlertyp zaehlertyp;
        private ZaehlertypSpezifikation zaehlertypSpezifikation;
        private List<Zaehlwerk> zaehlwerke;

        private ZaehlerBuilder() {
        }

        /**
        * Besondere Spezifikation des Zählers
        */
        public ZaehlerBuilder setBefestigungsart(Befestigungsart befestigungsart) {
            this.befestigungsart = befestigungsart;
            return this;
        }

        /**
        * Zählerkonstante auf dem Zähler
        */
        public ZaehlerBuilder setEichungBis(OffsetDateTime eichungBis) {
            this.eichungBis = eichungBis;
            return this;
        }

        /**
        * Größe des Zählers
        */
        public ZaehlerBuilder setGeraete(List<Geraet> geraete) {
            this.geraete = geraete;
            return this;
        }

        /**
        * Der Hersteller des Zählers
        */
        public ZaehlerBuilder setIstFernschaltbar(Boolean istFernschaltbar) {
            this.istFernschaltbar = istFernschaltbar;
            return this;
        }

        /**
        * Bis zu diesem Datum (exklusiv) ist der Zähler geeicht.
        */
        public ZaehlerBuilder setLetzteEichung(OffsetDateTime letzteEichung) {
            this.letzteEichung = letzteEichung;
            return this;
        }

        /**
        * Fernschaltung
        */
        public ZaehlerBuilder setMesswerterfassung(Messwerterfassung messwerterfassung) {
            this.messwerterfassung = messwerterfassung;
            return this;
        }

        /**
        * Spezifikation bezüglich unterstützter Tarif
        */
        public ZaehlerBuilder setRegisteranzahl(Registeranzahl registeranzahl) {
            this.registeranzahl = registeranzahl;
            return this;
        }

        /**
        * Nummerierung des Zählers,vergeben durch den Messstellenbetreiber
        */
        public ZaehlerBuilder setSparte(Sparte sparte) {
            this.sparte = sparte;
            return this;
        }

        /**
        * Strom oder Gas
        */
        public ZaehlerBuilder setZaehlerauspraegung(Zaehlerauspraegung zaehlerauspraegung) {
            this.zaehlerauspraegung = zaehlerauspraegung;
            return this;
        }

        /**
        * Befestigungsart
        */
        public ZaehlerBuilder setZaehlergroesse(Zaehlergroesse zaehlergroesse) {
            this.zaehlergroesse = zaehlergroesse;
            return this;
        }

        /**
        * Der Hersteller des Zählers
        */
        public ZaehlerBuilder setZaehlerhersteller(Geschaeftspartner zaehlerhersteller) {
            this.zaehlerhersteller = zaehlerhersteller;
            return this;
        }

        /**
        * Spezifikation bezüglich unterstützter Tarif
        */
        public ZaehlerBuilder setZaehlerkonstante(Double zaehlerkonstante) {
            this.zaehlerkonstante = zaehlerkonstante;
            return this;
        }

        /**
        * Nummerierung des Zählers,vergeben durch den Messstellenbetreiber
        */
        public ZaehlerBuilder setZaehlernummer(String zaehlernummer) {
            this.zaehlernummer = zaehlernummer;
            return this;
        }

        /**
        * Spezifikation die Richtung des Zählers betreffend
        */
        public ZaehlerBuilder setZaehlertyp(Zaehlertyp zaehlertyp) {
            this.zaehlertyp = zaehlertyp;
            return this;
        }

        /**
        * Messwerterfassung des Zählers
        */
        public ZaehlerBuilder setZaehlertypSpezifikation(ZaehlertypSpezifikation zaehlertypSpezifikation) {
            this.zaehlertypSpezifikation = zaehlertypSpezifikation;
            return this;
        }

        /**
        * Typisierung des Zählers
        */
        public ZaehlerBuilder setZaehlwerke(List<Zaehlwerk> zaehlwerke) {
            this.zaehlwerke = zaehlwerke;
            return this;
        }

        public ZaehlerBuilder setId(String id) {
            super.setId(id);
            return this;
        }

        public ZaehlerBuilder setZusatzAttribute(List<ZusatzAttribut> zusatzAttribute) {
            super.setZusatzAttribute(zusatzAttribute);
            return this;
        }

        public Zaehler build() {
            return new Zaehler(this);
        }
    }
}