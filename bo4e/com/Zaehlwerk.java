package bo4e.com;

import bo4e.ZusatzAttribut;
import bo4e.enums.ComTyp;
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
* <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/BO4E/BO4E-Schemas/v202501.0.0/src/bo4e_schemas/com/Zaehlwerk.json>`_
*/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Zaehlwerk extends COM {
    private final ComTyp _typ = ComTyp.ZAEHLWERK;
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

    public ComTyp get_typ() {
        return _typ;
    }

    /**
    * Anzahl Ablesungen pro Jahr
    */
    public Long getAnzahlAblesungen() {
        return anzahlAblesungen;
    }

    /**
    * Anzahl Ablesungen pro Jahr
    */
    public void setAnzahlAblesungen(Long anzahlAblesungen) {
        this.anzahlAblesungen = anzahlAblesungen;
    }

    /**
    * Zusätzliche Bezeichnung, z.B. Zählwerk_Wirkarbeit.
    */
    public String getBezeichnung() {
        return bezeichnung;
    }

    /**
    * Zusätzliche Bezeichnung, z.B. Zählwerk_Wirkarbeit.
    */
    public void setBezeichnung(String bezeichnung) {
        this.bezeichnung = bezeichnung;
    }

    /**
    * Die Einheit der gemessenen Größe, z.B. kWh
    */
    public Mengeneinheit getEinheit() {
        return einheit;
    }

    /**
    * Die Einheit der gemessenen Größe, z.B. kWh
    */
    public void setEinheit(Mengeneinheit einheit) {
        this.einheit = einheit;
    }

    /**
    * Abrechnungsrelevant
    */
    public Boolean getIstAbrechnungsrelevant() {
        return istAbrechnungsrelevant;
    }

    /**
    * Abrechnungsrelevant
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
    * Steuerbefreiung
    */
    public Boolean getIstSteuerbefreit() {
        return istSteuerbefreit;
    }

    /**
    * Steuerbefreiung
    */
    public void setIstSteuerbefreit(Boolean istSteuerbefreit) {
        this.istSteuerbefreit = istSteuerbefreit;
    }

    /**
    * Unterbrechbarkeit Marktlokation
    */
    public Boolean getIstUnterbrechbar() {
        return istUnterbrechbar;
    }

    /**
    * Unterbrechbarkeit Marktlokation
    */
    public void setIstUnterbrechbar(Boolean istUnterbrechbar) {
        this.istUnterbrechbar = istUnterbrechbar;
    }

    /**
    * Konzessionsabgabe
    */
    public Konzessionsabgabe getKonzessionsabgabe() {
        return konzessionsabgabe;
    }

    /**
    * Konzessionsabgabe
    */
    public void setKonzessionsabgabe(Konzessionsabgabe konzessionsabgabe) {
        this.konzessionsabgabe = konzessionsabgabe;
    }

    /**
    * Anzahl der Nachkommastellen
    */
    public Long getNachkommastelle() {
        return nachkommastelle;
    }

    /**
    * Anzahl der Nachkommastellen
    */
    public void setNachkommastelle(Long nachkommastelle) {
        this.nachkommastelle = nachkommastelle;
    }

    /**
    * Die OBIS-Kennzahl für das Zählwerk, die festlegt, welche auf die gemessene Größe mit dem
    * Stand gemeldet wird.
    * Nur Zählwerkstände mit dieser OBIS-Kennzahl werden an diesem Zählwerk registriert.
    */
    public String getObisKennzahl() {
        return obisKennzahl;
    }

    /**
    * Die OBIS-Kennzahl für das Zählwerk, die festlegt, welche auf die gemessene Größe mit dem
    * Stand gemeldet wird.
    * Nur Zählwerkstände mit dieser OBIS-Kennzahl werden an diesem Zählwerk registriert.
    */
    public void setObisKennzahl(String obisKennzahl) {
        this.obisKennzahl = obisKennzahl;
    }

    /**
    * Die Energierichtung, Einspeisung oder Ausspeisung.
    */
    public Energierichtung getRichtung() {
        return richtung;
    }

    /**
    * Die Energierichtung, Einspeisung oder Ausspeisung.
    */
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
    * Verwendungungszweck der Werte Marktlokation
    */
    public List<VerwendungszweckProMarktrolle> getVerwendungszwecke() {
        return verwendungszwecke;
    }

    /**
    * Verwendungungszweck der Werte Marktlokation
    */
    public void setVerwendungszwecke(List<VerwendungszweckProMarktrolle> verwendungszwecke) {
        this.verwendungszwecke = verwendungszwecke;
    }

    /**
    * Anzahl der Vorkommastellen
    */
    public Long getVorkommastelle() {
        return vorkommastelle;
    }

    /**
    * Anzahl der Vorkommastellen
    */
    public void setVorkommastelle(Long vorkommastelle) {
        this.vorkommastelle = vorkommastelle;
    }

    /**
    * Wärmenutzung Marktlokation
    */
    public Waermenutzung getWaermenutzung() {
        return waermenutzung;
    }

    /**
    * Wärmenutzung Marktlokation
    */
    public void setWaermenutzung(Waermenutzung waermenutzung) {
        this.waermenutzung = waermenutzung;
    }

    /**
    * Mit diesem Faktor wird eine Zählerstandsdifferenz multipliziert, um zum eigentlichen
    * Verbrauch im Zeitraum
    * zu kommen.
    */
    public Double getWandlerfaktor() {
        return wandlerfaktor;
    }

    /**
    * Mit diesem Faktor wird eine Zählerstandsdifferenz multipliziert, um zum eigentlichen
    * Verbrauch im Zeitraum
    * zu kommen.
    */
    public void setWandlerfaktor(Double wandlerfaktor) {
        this.wandlerfaktor = wandlerfaktor;
    }

    /**
    * Identifikation des Zählwerks (Registers) innerhalb des Zählers.
    * Oftmals eine laufende Nummer hinter der Zählernummer. Z.B. 47110815_1
    */
    public String getZaehlwerkId() {
        return zaehlwerkId;
    }

    /**
    * Identifikation des Zählwerks (Registers) innerhalb des Zählers.
    * Oftmals eine laufende Nummer hinter der Zählernummer. Z.B. 47110815_1
    */
    public void setZaehlwerkId(String zaehlwerkId) {
        this.zaehlwerkId = zaehlwerkId;
    }

    /**
    * Erweiterte Definition der Zählzeit in Bezug auf ein Register
    */
    public Zaehlzeitregister getZaehlzeitregister() {
        return zaehlzeitregister;
    }

    /**
    * Erweiterte Definition der Zählzeit in Bezug auf ein Register
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
        * Anzahl Ablesungen pro Jahr
        */
        public ZaehlwerkBuilder setAnzahlAblesungen(Long anzahlAblesungen) {
            this.anzahlAblesungen = anzahlAblesungen;
            return this;
        }

        /**
        * Zusätzliche Bezeichnung, z.B. Zählwerk_Wirkarbeit.
        */
        public ZaehlwerkBuilder setBezeichnung(String bezeichnung) {
            this.bezeichnung = bezeichnung;
            return this;
        }

        /**
        * Die Einheit der gemessenen Größe, z.B. kWh
        */
        public ZaehlwerkBuilder setEinheit(Mengeneinheit einheit) {
            this.einheit = einheit;
            return this;
        }

        /**
        * Abrechnungsrelevant
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
        * Steuerbefreiung
        */
        public ZaehlwerkBuilder setIstSteuerbefreit(Boolean istSteuerbefreit) {
            this.istSteuerbefreit = istSteuerbefreit;
            return this;
        }

        /**
        * Unterbrechbarkeit Marktlokation
        */
        public ZaehlwerkBuilder setIstUnterbrechbar(Boolean istUnterbrechbar) {
            this.istUnterbrechbar = istUnterbrechbar;
            return this;
        }

        /**
        * Konzessionsabgabe
        */
        public ZaehlwerkBuilder setKonzessionsabgabe(Konzessionsabgabe konzessionsabgabe) {
            this.konzessionsabgabe = konzessionsabgabe;
            return this;
        }

        /**
        * Anzahl der Nachkommastellen
        */
        public ZaehlwerkBuilder setNachkommastelle(Long nachkommastelle) {
            this.nachkommastelle = nachkommastelle;
            return this;
        }

        /**
        * Die OBIS-Kennzahl für das Zählwerk, die festlegt, welche auf die gemessene Größe mit dem
        * Stand gemeldet wird.
        * Nur Zählwerkstände mit dieser OBIS-Kennzahl werden an diesem Zählwerk registriert.
        */
        public ZaehlwerkBuilder setObisKennzahl(String obisKennzahl) {
            this.obisKennzahl = obisKennzahl;
            return this;
        }

        /**
        * Die Energierichtung, Einspeisung oder Ausspeisung.
        */
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
        * Verwendungungszweck der Werte Marktlokation
        */
        public ZaehlwerkBuilder setVerwendungszwecke(List<VerwendungszweckProMarktrolle> verwendungszwecke) {
            this.verwendungszwecke = verwendungszwecke;
            return this;
        }

        /**
        * Anzahl der Vorkommastellen
        */
        public ZaehlwerkBuilder setVorkommastelle(Long vorkommastelle) {
            this.vorkommastelle = vorkommastelle;
            return this;
        }

        /**
        * Wärmenutzung Marktlokation
        */
        public ZaehlwerkBuilder setWaermenutzung(Waermenutzung waermenutzung) {
            this.waermenutzung = waermenutzung;
            return this;
        }

        /**
        * Mit diesem Faktor wird eine Zählerstandsdifferenz multipliziert, um zum eigentlichen
        * Verbrauch im Zeitraum
        * zu kommen.
        */
        public ZaehlwerkBuilder setWandlerfaktor(Double wandlerfaktor) {
            this.wandlerfaktor = wandlerfaktor;
            return this;
        }

        /**
        * Identifikation des Zählwerks (Registers) innerhalb des Zählers.
        * Oftmals eine laufende Nummer hinter der Zählernummer. Z.B. 47110815_1
        */
        public ZaehlwerkBuilder setZaehlwerkId(String zaehlwerkId) {
            this.zaehlwerkId = zaehlwerkId;
            return this;
        }

        /**
        * Erweiterte Definition der Zählzeit in Bezug auf ein Register
        */
        public ZaehlwerkBuilder setZaehlzeitregister(Zaehlzeitregister zaehlzeitregister) {
            this.zaehlzeitregister = zaehlzeitregister;
            return this;
        }

        public ZaehlwerkBuilder set_id(String _id) {
            super.set_id(_id);
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