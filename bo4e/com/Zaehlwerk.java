package bo4e.com;

import bo4e.ZusatzAttribut;
import bo4e.enums.Energierichtung;
import bo4e.enums.Mengeneinheit;
import bo4e.enums.Verbrauchsart;
import bo4e.enums.Waermenutzung;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.List;

/**
* Mit dieser Komponente werden Zählwerke modelliert.
*
* .. raw:: html
*
* <object data="../_static/images/bo4e/com/Zaehlwerk.svg" type="image/svg+xml"></object>
*
* .. HINT::
* `Zaehlwerk JSON Schema
* <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/BO4E/BO4E-Schemas/v202401.4.0/src/bo4e_schemas/com/Zaehlwerk.json>`_
*/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Zaehlwerk extends COM {
    private Long anzahlAblesungen;
    private String bezeichnung;
    private Mengeneinheit einheit;
    private Boolean istAbrechnungsrelevant;
    private Boolean istSchwachlastfaehig;
    private Boolean istSteuerbefreit;
    private Boolean istUnterbrechbar;
    private Konzessionsabgabe konzessionsabgabe;
    private Long nachkommastelle;
    private String obisKennzahl;
    private Energierichtung richtung;
    private Verbrauchsart verbrauchsart;
    private List<VerwendungszweckProMarktrolle> verwendungszwecke;
    private Long vorkommastelle;
    private Waermenutzung waermenutzung;
    private Double wandlerfaktor;
    private String zaehlwerkId;
    private Zaehlzeitregister zaehlzeitregister;

    public Zaehlwerk() {
    }

    private Zaehlwerk(ZaehlwerkBuilder builder) {
        super(builder);
        this.anzahlAblesungen = builder.anzahlAblesungen;
        this.bezeichnung = builder.bezeichnung;
        this.einheit = builder.einheit;
        this.istAbrechnungsrelevant = builder.istAbrechnungsrelevant;
        this.istSchwachlastfaehig = builder.istSchwachlastfaehig;
        this.istSteuerbefreit = builder.istSteuerbefreit;
        this.istUnterbrechbar = builder.istUnterbrechbar;
        this.konzessionsabgabe = builder.konzessionsabgabe;
        this.nachkommastelle = builder.nachkommastelle;
        this.obisKennzahl = builder.obisKennzahl;
        this.richtung = builder.richtung;
        this.verbrauchsart = builder.verbrauchsart;
        this.verwendungszwecke = builder.verwendungszwecke;
        this.vorkommastelle = builder.vorkommastelle;
        this.waermenutzung = builder.waermenutzung;
        this.wandlerfaktor = builder.wandlerfaktor;
        this.zaehlwerkId = builder.zaehlwerkId;
        this.zaehlzeitregister = builder.zaehlzeitregister;
    }

    /**
    * Abrechnungsrelevant
    */
    public Long getAnzahlAblesungen() {
        return anzahlAblesungen;
    }

    /**
    * Abrechnungsrelevant
    */
    public void setAnzahlAblesungen(Long anzahlAblesungen) {
        this.anzahlAblesungen = anzahlAblesungen;
    }

    public String getBezeichnung() {
        return bezeichnung;
    }

    public void setBezeichnung(String bezeichnung) {
        this.bezeichnung = bezeichnung;
    }

    public Mengeneinheit getEinheit() {
        return einheit;
    }

    public void setEinheit(Mengeneinheit einheit) {
        this.einheit = einheit;
    }

    /**
    * Anzahl der Nachkommastellen
    */
    public Boolean getIstAbrechnungsrelevant() {
        return istAbrechnungsrelevant;
    }

    /**
    * Anzahl der Nachkommastellen
    */
    public void setIstAbrechnungsrelevant(Boolean istAbrechnungsrelevant) {
        this.istAbrechnungsrelevant = istAbrechnungsrelevant;
    }

    /**
    * Schwachlastfaehigkeit
    */
    public Boolean getIstSchwachlastfaehig() {
        return istSchwachlastfaehig;
    }

    /**
    * Schwachlastfaehigkeit
    */
    public void setIstSchwachlastfaehig(Boolean istSchwachlastfaehig) {
        this.istSchwachlastfaehig = istSchwachlastfaehig;
    }

    /**
    * Konzessionsabgabe
    */
    public Boolean getIstSteuerbefreit() {
        return istSteuerbefreit;
    }

    /**
    * Konzessionsabgabe
    */
    public void setIstSteuerbefreit(Boolean istSteuerbefreit) {
        this.istSteuerbefreit = istSteuerbefreit;
    }

    /**
    * Stromverbrauchsart/Verbrauchsart Marktlokation
    */
    public Boolean getIstUnterbrechbar() {
        return istUnterbrechbar;
    }

    /**
    * Stromverbrauchsart/Verbrauchsart Marktlokation
    */
    public void setIstUnterbrechbar(Boolean istUnterbrechbar) {
        this.istUnterbrechbar = istUnterbrechbar;
    }

    /**
    * Wärmenutzung Marktlokation
    */
    public Konzessionsabgabe getKonzessionsabgabe() {
        return konzessionsabgabe;
    }

    /**
    * Wärmenutzung Marktlokation
    */
    public void setKonzessionsabgabe(Konzessionsabgabe konzessionsabgabe) {
        this.konzessionsabgabe = konzessionsabgabe;
    }

    /**
    * Anzahl der Vorkommastellen
    */
    public Long getNachkommastelle() {
        return nachkommastelle;
    }

    /**
    * Anzahl der Vorkommastellen
    */
    public void setNachkommastelle(Long nachkommastelle) {
        this.nachkommastelle = nachkommastelle;
    }

    public String getObisKennzahl() {
        return obisKennzahl;
    }

    public void setObisKennzahl(String obisKennzahl) {
        this.obisKennzahl = obisKennzahl;
    }

    public Energierichtung getRichtung() {
        return richtung;
    }

    public void setRichtung(Energierichtung richtung) {
        this.richtung = richtung;
    }

    /**
    * Stromverbrauchsart/Verbrauchsart Marktlokation
    */
    public Verbrauchsart getVerbrauchsart() {
        return verbrauchsart;
    }

    /**
    * Stromverbrauchsart/Verbrauchsart Marktlokation
    */
    public void setVerbrauchsart(Verbrauchsart verbrauchsart) {
        this.verbrauchsart = verbrauchsart;
    }

    /**
    * Schwachlastfaehigkeit
    */
    public List<VerwendungszweckProMarktrolle> getVerwendungszwecke() {
        return verwendungszwecke;
    }

    /**
    * Schwachlastfaehigkeit
    */
    public void setVerwendungszwecke(List<VerwendungszweckProMarktrolle> verwendungszwecke) {
        this.verwendungszwecke = verwendungszwecke;
    }

    /**
    * Steuerbefreiung
    */
    public Long getVorkommastelle() {
        return vorkommastelle;
    }

    /**
    * Steuerbefreiung
    */
    public void setVorkommastelle(Long vorkommastelle) {
        this.vorkommastelle = vorkommastelle;
    }

    /**
    * Unterbrechbarkeit Marktlokation
    */
    public Waermenutzung getWaermenutzung() {
        return waermenutzung;
    }

    /**
    * Unterbrechbarkeit Marktlokation
    */
    public void setWaermenutzung(Waermenutzung waermenutzung) {
        this.waermenutzung = waermenutzung;
    }

    public Double getWandlerfaktor() {
        return wandlerfaktor;
    }

    public void setWandlerfaktor(Double wandlerfaktor) {
        this.wandlerfaktor = wandlerfaktor;
    }

    public String getZaehlwerkId() {
        return zaehlwerkId;
    }

    public void setZaehlwerkId(String zaehlwerkId) {
        this.zaehlwerkId = zaehlwerkId;
    }

    /**
    * Anzahl Ablesungen pro Jahr
    */
    public Zaehlzeitregister getZaehlzeitregister() {
        return zaehlzeitregister;
    }

    /**
    * Anzahl Ablesungen pro Jahr
    */
    public void setZaehlzeitregister(Zaehlzeitregister zaehlzeitregister) {
        this.zaehlzeitregister = zaehlzeitregister;
    }

    public static ZaehlwerkBuilder builder() {
        return new ZaehlwerkBuilder();
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class ZaehlwerkBuilder extends COMBuilder {
        private Long anzahlAblesungen;
        private String bezeichnung;
        private Mengeneinheit einheit;
        private Boolean istAbrechnungsrelevant;
        private Boolean istSchwachlastfaehig;
        private Boolean istSteuerbefreit;
        private Boolean istUnterbrechbar;
        private Konzessionsabgabe konzessionsabgabe;
        private Long nachkommastelle;
        private String obisKennzahl;
        private Energierichtung richtung;
        private Verbrauchsart verbrauchsart;
        private List<VerwendungszweckProMarktrolle> verwendungszwecke;
        private Long vorkommastelle;
        private Waermenutzung waermenutzung;
        private Double wandlerfaktor;
        private String zaehlwerkId;
        private Zaehlzeitregister zaehlzeitregister;

        private ZaehlwerkBuilder() {
        }

        /**
        * Abrechnungsrelevant
        */
        public ZaehlwerkBuilder setAnzahlAblesungen(Long anzahlAblesungen) {
            this.anzahlAblesungen = anzahlAblesungen;
            return this;
        }

        public ZaehlwerkBuilder setBezeichnung(String bezeichnung) {
            this.bezeichnung = bezeichnung;
            return this;
        }

        public ZaehlwerkBuilder setEinheit(Mengeneinheit einheit) {
            this.einheit = einheit;
            return this;
        }

        /**
        * Anzahl der Nachkommastellen
        */
        public ZaehlwerkBuilder setIstAbrechnungsrelevant(Boolean istAbrechnungsrelevant) {
            this.istAbrechnungsrelevant = istAbrechnungsrelevant;
            return this;
        }

        /**
        * Schwachlastfaehigkeit
        */
        public ZaehlwerkBuilder setIstSchwachlastfaehig(Boolean istSchwachlastfaehig) {
            this.istSchwachlastfaehig = istSchwachlastfaehig;
            return this;
        }

        /**
        * Konzessionsabgabe
        */
        public ZaehlwerkBuilder setIstSteuerbefreit(Boolean istSteuerbefreit) {
            this.istSteuerbefreit = istSteuerbefreit;
            return this;
        }

        /**
        * Stromverbrauchsart/Verbrauchsart Marktlokation
        */
        public ZaehlwerkBuilder setIstUnterbrechbar(Boolean istUnterbrechbar) {
            this.istUnterbrechbar = istUnterbrechbar;
            return this;
        }

        /**
        * Wärmenutzung Marktlokation
        */
        public ZaehlwerkBuilder setKonzessionsabgabe(Konzessionsabgabe konzessionsabgabe) {
            this.konzessionsabgabe = konzessionsabgabe;
            return this;
        }

        /**
        * Anzahl der Vorkommastellen
        */
        public ZaehlwerkBuilder setNachkommastelle(Long nachkommastelle) {
            this.nachkommastelle = nachkommastelle;
            return this;
        }

        public ZaehlwerkBuilder setObisKennzahl(String obisKennzahl) {
            this.obisKennzahl = obisKennzahl;
            return this;
        }

        public ZaehlwerkBuilder setRichtung(Energierichtung richtung) {
            this.richtung = richtung;
            return this;
        }

        /**
        * Stromverbrauchsart/Verbrauchsart Marktlokation
        */
        public ZaehlwerkBuilder setVerbrauchsart(Verbrauchsart verbrauchsart) {
            this.verbrauchsart = verbrauchsart;
            return this;
        }

        /**
        * Schwachlastfaehigkeit
        */
        public ZaehlwerkBuilder setVerwendungszwecke(List<VerwendungszweckProMarktrolle> verwendungszwecke) {
            this.verwendungszwecke = verwendungszwecke;
            return this;
        }

        /**
        * Steuerbefreiung
        */
        public ZaehlwerkBuilder setVorkommastelle(Long vorkommastelle) {
            this.vorkommastelle = vorkommastelle;
            return this;
        }

        /**
        * Unterbrechbarkeit Marktlokation
        */
        public ZaehlwerkBuilder setWaermenutzung(Waermenutzung waermenutzung) {
            this.waermenutzung = waermenutzung;
            return this;
        }

        public ZaehlwerkBuilder setWandlerfaktor(Double wandlerfaktor) {
            this.wandlerfaktor = wandlerfaktor;
            return this;
        }

        public ZaehlwerkBuilder setZaehlwerkId(String zaehlwerkId) {
            this.zaehlwerkId = zaehlwerkId;
            return this;
        }

        /**
        * Anzahl Ablesungen pro Jahr
        */
        public ZaehlwerkBuilder setZaehlzeitregister(Zaehlzeitregister zaehlzeitregister) {
            this.zaehlzeitregister = zaehlzeitregister;
            return this;
        }

        public ZaehlwerkBuilder setId(String id) {
            super.setId(id);
            return this;
        }

        public ZaehlwerkBuilder setZusatzAttribute(List<ZusatzAttribut> zusatzAttribute) {
            super.setZusatzAttribute(zusatzAttribute);
            return this;
        }

        public Zaehlwerk build() {
            return new Zaehlwerk(this);
        }
    }
}