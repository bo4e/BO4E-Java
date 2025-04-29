package bo4e.com;

import bo4e.ZusatzAttribut;
import bo4e.enums.ComTyp;
import bo4e.enums.Zaehlertyp;

import java.util.List;

/**
* Die Komponente Ausschreibungsdetail wird verwendet um die Informationen zu einer
* Abnahmestelle innerhalb eines
* Ausschreibungsloses abzubilden.
*
* .. raw:: html
*
* <object data="../_static/images/bo4e/com/Ausschreibungsdetail.svg"
* type="image/svg+xml"></object>
*
* .. HINT::
* `Ausschreibungsdetail JSON Schema
* <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/BO4E/BO4E-Schemas/v202401.7.0/src/bo4e_schemas/com/Ausschreibungsdetail.json>`_
*/
public class Ausschreibungsdetail extends COM {
    private final ComTyp _typ = ComTyp.AUSSCHREIBUNGSDETAIL;
    private Boolean istLastgangVorhanden;
    private String kunde;
    private Zeitraum lieferzeitraum;
    private Adresse marktlokationsadresse;
    private String marktlokationsbezeichnung;
    private String marktlokationsId;
    private String netzbetreiber;
    private String netzebeneLieferung;
    private String netzebeneMessung;
    private Menge prognoseArbeitLieferzeitraum;
    private Menge prognoseJahresarbeit;
    private Menge prognoseLeistung;
    private Adresse rechnungsadresse;
    private String zaehlernummer;
    private Zaehlertyp zaehlertechnik;

    public Ausschreibungsdetail() {
    }

    private Ausschreibungsdetail(AusschreibungsdetailBuilder builder) {
        super(builder);
        this.istLastgangVorhanden = builder.istLastgangVorhanden;
        this.kunde = builder.kunde;
        this.lieferzeitraum = builder.lieferzeitraum;
        this.marktlokationsadresse = builder.marktlokationsadresse;
        this.marktlokationsbezeichnung = builder.marktlokationsbezeichnung;
        this.marktlokationsId = builder.marktlokationsId;
        this.netzbetreiber = builder.netzbetreiber;
        this.netzebeneLieferung = builder.netzebeneLieferung;
        this.netzebeneMessung = builder.netzebeneMessung;
        this.prognoseArbeitLieferzeitraum = builder.prognoseArbeitLieferzeitraum;
        this.prognoseJahresarbeit = builder.prognoseJahresarbeit;
        this.prognoseLeistung = builder.prognoseLeistung;
        this.rechnungsadresse = builder.rechnungsadresse;
        this.zaehlernummer = builder.zaehlernummer;
        this.zaehlertechnik = builder.zaehlertechnik;
    }

    public ComTyp get_typ() {
        return _typ;
    }

    /**
    * Zeigt an, ob es zu der Marktlokation einen Lastgang gibt.
    * Falls ja, kann dieser abgerufen werden und daraus die Verbrauchswerte ermittelt werden
    */
    public Boolean getIstLastgangVorhanden() {
        return istLastgangVorhanden;
    }

    /**
    * Zeigt an, ob es zu der Marktlokation einen Lastgang gibt.
    * Falls ja, kann dieser abgerufen werden und daraus die Verbrauchswerte ermittelt werden
    */
    public void setIstLastgangVorhanden(Boolean istLastgangVorhanden) {
        this.istLastgangVorhanden = istLastgangVorhanden;
    }

    /**
    * Bezeichnung des Kunden, der die Marktlokation nutzt
    */
    public String getKunde() {
        return kunde;
    }

    /**
    * Bezeichnung des Kunden, der die Marktlokation nutzt
    */
    public void setKunde(String kunde) {
        this.kunde = kunde;
    }

    /**
    * Angefragter Zeitraum für die ausgeschriebene Belieferung
    */
    public Zeitraum getLieferzeitraum() {
        return lieferzeitraum;
    }

    /**
    * Angefragter Zeitraum für die ausgeschriebene Belieferung
    */
    public void setLieferzeitraum(Zeitraum lieferzeitraum) {
        this.lieferzeitraum = lieferzeitraum;
    }

    /**
    * Die Adresse an der die Marktlokation sich befindet
    */
    public Adresse getMarktlokationsadresse() {
        return marktlokationsadresse;
    }

    /**
    * Die Adresse an der die Marktlokation sich befindet
    */
    public void setMarktlokationsadresse(Adresse marktlokationsadresse) {
        this.marktlokationsadresse = marktlokationsadresse;
    }

    /**
    * Bezeichnung für die Lokation, z.B. 'Zentraler Einkauf, Hamburg'
    */
    public String getMarktlokationsbezeichnung() {
        return marktlokationsbezeichnung;
    }

    /**
    * Bezeichnung für die Lokation, z.B. 'Zentraler Einkauf, Hamburg'
    */
    public void setMarktlokationsbezeichnung(String marktlokationsbezeichnung) {
        this.marktlokationsbezeichnung = marktlokationsbezeichnung;
    }

    /**
    * Identifikation einer ausgeschriebenen Marktlokation
    */
    public String getMarktlokationsId() {
        return marktlokationsId;
    }

    /**
    * Identifikation einer ausgeschriebenen Marktlokation
    */
    public void setMarktlokationsId(String marktlokationsId) {
        this.marktlokationsId = marktlokationsId;
    }

    /**
    * Bezeichnung des zuständigen Netzbetreibers, z.B. 'Stromnetz Hamburg GmbH'
    */
    public String getNetzbetreiber() {
        return netzbetreiber;
    }

    /**
    * Bezeichnung des zuständigen Netzbetreibers, z.B. 'Stromnetz Hamburg GmbH'
    */
    public void setNetzbetreiber(String netzbetreiber) {
        this.netzbetreiber = netzbetreiber;
    }

    /**
    * In der angegebenen Netzebene wird die Marktlokation versorgt, z.B. MSP für Mittelspannung
    */
    public String getNetzebeneLieferung() {
        return netzebeneLieferung;
    }

    /**
    * In der angegebenen Netzebene wird die Marktlokation versorgt, z.B. MSP für Mittelspannung
    */
    public void setNetzebeneLieferung(String netzebeneLieferung) {
        this.netzebeneLieferung = netzebeneLieferung;
    }

    /**
    * In der angegebenen Netzebene wird die Lokation gemessen, z.B. NSP für Niederspannung
    */
    public String getNetzebeneMessung() {
        return netzebeneMessung;
    }

    /**
    * In der angegebenen Netzebene wird die Lokation gemessen, z.B. NSP für Niederspannung
    */
    public void setNetzebeneMessung(String netzebeneMessung) {
        this.netzebeneMessung = netzebeneMessung;
    }

    /**
    * Ein Prognosewert für die Arbeit innerhalb des angefragten Lieferzeitraums der
    * ausgeschriebenen Lokation
    */
    public Menge getPrognoseArbeitLieferzeitraum() {
        return prognoseArbeitLieferzeitraum;
    }

    /**
    * Ein Prognosewert für die Arbeit innerhalb des angefragten Lieferzeitraums der
    * ausgeschriebenen Lokation
    */
    public void setPrognoseArbeitLieferzeitraum(Menge prognoseArbeitLieferzeitraum) {
        this.prognoseArbeitLieferzeitraum = prognoseArbeitLieferzeitraum;
    }

    /**
    * Prognosewert für die Jahresarbeit der ausgeschriebenen Lokation
    */
    public Menge getPrognoseJahresarbeit() {
        return prognoseJahresarbeit;
    }

    /**
    * Prognosewert für die Jahresarbeit der ausgeschriebenen Lokation
    */
    public void setPrognoseJahresarbeit(Menge prognoseJahresarbeit) {
        this.prognoseJahresarbeit = prognoseJahresarbeit;
    }

    /**
    * Prognosewert für die abgenommene maximale Leistung der ausgeschriebenen Lokation
    */
    public Menge getPrognoseLeistung() {
        return prognoseLeistung;
    }

    /**
    * Prognosewert für die abgenommene maximale Leistung der ausgeschriebenen Lokation
    */
    public void setPrognoseLeistung(Menge prognoseLeistung) {
        this.prognoseLeistung = prognoseLeistung;
    }

    /**
    * Die (evtl. abweichende) Rechnungsadresse
    */
    public Adresse getRechnungsadresse() {
        return rechnungsadresse;
    }

    /**
    * Die (evtl. abweichende) Rechnungsadresse
    */
    public void setRechnungsadresse(Adresse rechnungsadresse) {
        this.rechnungsadresse = rechnungsadresse;
    }

    /**
    * Die Bezeichnung des Zählers an der Marktlokation
    */
    public String getZaehlernummer() {
        return zaehlernummer;
    }

    /**
    * Die Bezeichnung des Zählers an der Marktlokation
    */
    public void setZaehlernummer(String zaehlernummer) {
        this.zaehlernummer = zaehlernummer;
    }

    /**
    * Spezifikation, um welche Zählertechnik es sich im vorliegenden Fall handelt, z.B.
    * Leistungsmessung
    */
    public Zaehlertyp getZaehlertechnik() {
        return zaehlertechnik;
    }

    /**
    * Spezifikation, um welche Zählertechnik es sich im vorliegenden Fall handelt, z.B.
    * Leistungsmessung
    */
    public void setZaehlertechnik(Zaehlertyp zaehlertechnik) {
        this.zaehlertechnik = zaehlertechnik;
    }

    public static AusschreibungsdetailBuilder builder() {
        return new AusschreibungsdetailBuilder();
    }

    public static class AusschreibungsdetailBuilder extends COMBuilder {
        private Boolean istLastgangVorhanden;
        private String kunde;
        private Zeitraum lieferzeitraum;
        private Adresse marktlokationsadresse;
        private String marktlokationsbezeichnung;
        private String marktlokationsId;
        private String netzbetreiber;
        private String netzebeneLieferung;
        private String netzebeneMessung;
        private Menge prognoseArbeitLieferzeitraum;
        private Menge prognoseJahresarbeit;
        private Menge prognoseLeistung;
        private Adresse rechnungsadresse;
        private String zaehlernummer;
        private Zaehlertyp zaehlertechnik;

        private AusschreibungsdetailBuilder() {
        }

        /**
        * Zeigt an, ob es zu der Marktlokation einen Lastgang gibt.
        * Falls ja, kann dieser abgerufen werden und daraus die Verbrauchswerte ermittelt werden
        */
        public AusschreibungsdetailBuilder setIstLastgangVorhanden(Boolean istLastgangVorhanden) {
            this.istLastgangVorhanden = istLastgangVorhanden;
            return this;
        }

        /**
        * Bezeichnung des Kunden, der die Marktlokation nutzt
        */
        public AusschreibungsdetailBuilder setKunde(String kunde) {
            this.kunde = kunde;
            return this;
        }

        /**
        * Angefragter Zeitraum für die ausgeschriebene Belieferung
        */
        public AusschreibungsdetailBuilder setLieferzeitraum(Zeitraum lieferzeitraum) {
            this.lieferzeitraum = lieferzeitraum;
            return this;
        }

        /**
        * Die Adresse an der die Marktlokation sich befindet
        */
        public AusschreibungsdetailBuilder setMarktlokationsadresse(Adresse marktlokationsadresse) {
            this.marktlokationsadresse = marktlokationsadresse;
            return this;
        }

        /**
        * Bezeichnung für die Lokation, z.B. 'Zentraler Einkauf, Hamburg'
        */
        public AusschreibungsdetailBuilder setMarktlokationsbezeichnung(String marktlokationsbezeichnung) {
            this.marktlokationsbezeichnung = marktlokationsbezeichnung;
            return this;
        }

        /**
        * Identifikation einer ausgeschriebenen Marktlokation
        */
        public AusschreibungsdetailBuilder setMarktlokationsId(String marktlokationsId) {
            this.marktlokationsId = marktlokationsId;
            return this;
        }

        /**
        * Bezeichnung des zuständigen Netzbetreibers, z.B. 'Stromnetz Hamburg GmbH'
        */
        public AusschreibungsdetailBuilder setNetzbetreiber(String netzbetreiber) {
            this.netzbetreiber = netzbetreiber;
            return this;
        }

        /**
        * In der angegebenen Netzebene wird die Marktlokation versorgt, z.B. MSP für Mittelspannung
        */
        public AusschreibungsdetailBuilder setNetzebeneLieferung(String netzebeneLieferung) {
            this.netzebeneLieferung = netzebeneLieferung;
            return this;
        }

        /**
        * In der angegebenen Netzebene wird die Lokation gemessen, z.B. NSP für Niederspannung
        */
        public AusschreibungsdetailBuilder setNetzebeneMessung(String netzebeneMessung) {
            this.netzebeneMessung = netzebeneMessung;
            return this;
        }

        /**
        * Ein Prognosewert für die Arbeit innerhalb des angefragten Lieferzeitraums der
        * ausgeschriebenen Lokation
        */
        public AusschreibungsdetailBuilder setPrognoseArbeitLieferzeitraum(Menge prognoseArbeitLieferzeitraum) {
            this.prognoseArbeitLieferzeitraum = prognoseArbeitLieferzeitraum;
            return this;
        }

        /**
        * Prognosewert für die Jahresarbeit der ausgeschriebenen Lokation
        */
        public AusschreibungsdetailBuilder setPrognoseJahresarbeit(Menge prognoseJahresarbeit) {
            this.prognoseJahresarbeit = prognoseJahresarbeit;
            return this;
        }

        /**
        * Prognosewert für die abgenommene maximale Leistung der ausgeschriebenen Lokation
        */
        public AusschreibungsdetailBuilder setPrognoseLeistung(Menge prognoseLeistung) {
            this.prognoseLeistung = prognoseLeistung;
            return this;
        }

        /**
        * Die (evtl. abweichende) Rechnungsadresse
        */
        public AusschreibungsdetailBuilder setRechnungsadresse(Adresse rechnungsadresse) {
            this.rechnungsadresse = rechnungsadresse;
            return this;
        }

        /**
        * Die Bezeichnung des Zählers an der Marktlokation
        */
        public AusschreibungsdetailBuilder setZaehlernummer(String zaehlernummer) {
            this.zaehlernummer = zaehlernummer;
            return this;
        }

        /**
        * Spezifikation, um welche Zählertechnik es sich im vorliegenden Fall handelt, z.B.
        * Leistungsmessung
        */
        public AusschreibungsdetailBuilder setZaehlertechnik(Zaehlertyp zaehlertechnik) {
            this.zaehlertechnik = zaehlertechnik;
            return this;
        }

        public AusschreibungsdetailBuilder set_id(String _id) {
            super.set_id(_id);
            return this;
        }

        public AusschreibungsdetailBuilder setZusatzAttribute(List<ZusatzAttribut> zusatzAttribute) {
            super.setZusatzAttribute(zusatzAttribute);
            return this;
        }

        public Ausschreibungsdetail build() {
            return new Ausschreibungsdetail(this);
        }
    }
}