package bo4e.bo;

import bo4e.ZusatzAttribut;
import bo4e.com.Zaehlwerk;
import bo4e.enums.Befestigungsart;
import bo4e.enums.BoTyp;
import bo4e.enums.Messwerterfassung;
import bo4e.enums.Registeranzahl;
import bo4e.enums.Sparte;
import bo4e.enums.Zaehlerauspraegung;
import bo4e.enums.Zaehlergroesse;
import bo4e.enums.Zaehlertyp;
import bo4e.enums.ZaehlertypSpezifikation;

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
* <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/BO4E/BO4E-Schemas/v202501.1.0-rc1/src/bo4e_schemas/bo/Zaehler.json>`_
*/
public class Zaehler extends Geschaeftsobjekt {
    private final BoTyp _typ = BoTyp.ZAEHLER;
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

    public BoTyp get_typ() {
        return _typ;
    }

    /**
    * Befestigungsart
    */
    public Befestigungsart getBefestigungsart() {
        return befestigungsart;
    }

    /**
    * Befestigungsart
    */
    public void setBefestigungsart(Befestigungsart befestigungsart) {
        this.befestigungsart = befestigungsart;
    }

    /**
    * Bis zu diesem Datum (exklusiv) ist der Zähler geeicht.
    */
    public OffsetDateTime getEichungBis() {
        return eichungBis;
    }

    /**
    * Bis zu diesem Datum (exklusiv) ist der Zähler geeicht.
    */
    public void setEichungBis(OffsetDateTime eichungBis) {
        this.eichungBis = eichungBis;
    }

    /**
    * Liste der Geräte, die zu diesem Zähler gehören, bspw. Smartmeter-Gateway
    */
    public List<Geraet> getGeraete() {
        return geraete;
    }

    /**
    * Liste der Geräte, die zu diesem Zähler gehören, bspw. Smartmeter-Gateway
    */
    public void setGeraete(List<Geraet> geraete) {
        this.geraete = geraete;
    }

    /**
    * Fernschaltung
    */
    public Boolean getIstFernschaltbar() {
        return istFernschaltbar;
    }

    /**
    * Fernschaltung
    */
    public void setIstFernschaltbar(Boolean istFernschaltbar) {
        this.istFernschaltbar = istFernschaltbar;
    }

    /**
    * Zu diesem Datum fand die letzte Eichprüfung des Zählers statt.
    */
    public OffsetDateTime getLetzteEichung() {
        return letzteEichung;
    }

    /**
    * Zu diesem Datum fand die letzte Eichprüfung des Zählers statt.
    */
    public void setLetzteEichung(OffsetDateTime letzteEichung) {
        this.letzteEichung = letzteEichung;
    }

    /**
    * Messwerterfassung des Zählers
    */
    public Messwerterfassung getMesswerterfassung() {
        return messwerterfassung;
    }

    /**
    * Messwerterfassung des Zählers
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
    * Strom oder Gas
    */
    public Sparte getSparte() {
        return sparte;
    }

    /**
    * Strom oder Gas
    */
    public void setSparte(Sparte sparte) {
        this.sparte = sparte;
    }

    /**
    * Spezifikation die Richtung des Zählers betreffend
    */
    public Zaehlerauspraegung getZaehlerauspraegung() {
        return zaehlerauspraegung;
    }

    /**
    * Spezifikation die Richtung des Zählers betreffend
    */
    public void setZaehlerauspraegung(Zaehlerauspraegung zaehlerauspraegung) {
        this.zaehlerauspraegung = zaehlerauspraegung;
    }

    /**
    * Größe des Zählers
    */
    public Zaehlergroesse getZaehlergroesse() {
        return zaehlergroesse;
    }

    /**
    * Größe des Zählers
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
    * Zählerkonstante auf dem Zähler
    */
    public Double getZaehlerkonstante() {
        return zaehlerkonstante;
    }

    /**
    * Zählerkonstante auf dem Zähler
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
    * Typisierung des Zählers
    */
    public Zaehlertyp getZaehlertyp() {
        return zaehlertyp;
    }

    /**
    * Typisierung des Zählers
    */
    public void setZaehlertyp(Zaehlertyp zaehlertyp) {
        this.zaehlertyp = zaehlertyp;
    }

    /**
    * Besondere Spezifikation des Zählers
    */
    public ZaehlertypSpezifikation getZaehlertypSpezifikation() {
        return zaehlertypSpezifikation;
    }

    /**
    * Besondere Spezifikation des Zählers
    */
    public void setZaehlertypSpezifikation(ZaehlertypSpezifikation zaehlertypSpezifikation) {
        this.zaehlertypSpezifikation = zaehlertypSpezifikation;
    }

    public List<Zaehlwerk> getZaehlwerke() {
        return zaehlwerke;
    }

    public void setZaehlwerke(List<Zaehlwerk> zaehlwerke) {
        this.zaehlwerke = zaehlwerke;
    }

    public static ZaehlerBuilder builder() {
        return new ZaehlerBuilder();
    }

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
        * Befestigungsart
        */
        public ZaehlerBuilder setBefestigungsart(Befestigungsart befestigungsart) {
            this.befestigungsart = befestigungsart;
            return this;
        }

        /**
        * Bis zu diesem Datum (exklusiv) ist der Zähler geeicht.
        */
        public ZaehlerBuilder setEichungBis(OffsetDateTime eichungBis) {
            this.eichungBis = eichungBis;
            return this;
        }

        /**
        * Liste der Geräte, die zu diesem Zähler gehören, bspw. Smartmeter-Gateway
        */
        public ZaehlerBuilder setGeraete(List<Geraet> geraete) {
            this.geraete = geraete;
            return this;
        }

        /**
        * Fernschaltung
        */
        public ZaehlerBuilder setIstFernschaltbar(Boolean istFernschaltbar) {
            this.istFernschaltbar = istFernschaltbar;
            return this;
        }

        /**
        * Zu diesem Datum fand die letzte Eichprüfung des Zählers statt.
        */
        public ZaehlerBuilder setLetzteEichung(OffsetDateTime letzteEichung) {
            this.letzteEichung = letzteEichung;
            return this;
        }

        /**
        * Messwerterfassung des Zählers
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
        * Strom oder Gas
        */
        public ZaehlerBuilder setSparte(Sparte sparte) {
            this.sparte = sparte;
            return this;
        }

        /**
        * Spezifikation die Richtung des Zählers betreffend
        */
        public ZaehlerBuilder setZaehlerauspraegung(Zaehlerauspraegung zaehlerauspraegung) {
            this.zaehlerauspraegung = zaehlerauspraegung;
            return this;
        }

        /**
        * Größe des Zählers
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
        * Zählerkonstante auf dem Zähler
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
        * Typisierung des Zählers
        */
        public ZaehlerBuilder setZaehlertyp(Zaehlertyp zaehlertyp) {
            this.zaehlertyp = zaehlertyp;
            return this;
        }

        /**
        * Besondere Spezifikation des Zählers
        */
        public ZaehlerBuilder setZaehlertypSpezifikation(ZaehlertypSpezifikation zaehlertypSpezifikation) {
            this.zaehlertypSpezifikation = zaehlertypSpezifikation;
            return this;
        }

        public ZaehlerBuilder setZaehlwerke(List<Zaehlwerk> zaehlwerke) {
            this.zaehlwerke = zaehlwerke;
            return this;
        }

        public ZaehlerBuilder set_id(String _id) {
            super.set_id(_id);
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