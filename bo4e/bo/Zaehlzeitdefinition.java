package bo4e.bo;

import bo4e.ZusatzAttribut;
import bo4e.com.Zaehlzeitsaison;
import bo4e.enums.BoTyp;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.List;

/**
* Beschreibt, zu welchen Zeiten welche Register aktiv sind.
*
* Die `Zaehlzeitdefinition` ist unabhängig von konkreter Messhardware: sie weiß nichts über
* `Zaehlwerk`e oder `Zaehler` an einer Messlokation und definiert lediglich abstrakt,
* welche
* Register-Codes (z.B. "HT", "NT", aber prinzipiell beliebige freie Zeichenketten) zu
* welchen
* Tageszeiten gelten.
*
* Die zeitliche Modellierung ist dreistufig geschachtelt:
*
* 1. ``saisons`` – ein Jahr kann in unterschiedliche Saisons aufgeteilt sein (z.B.
* Sommer/Winter).
* Welche Tage zu welcher Saison gehören, gibt das `saisonprofil` an.
* 2. Pro Saison: ``tagtypen`` – verschiedene Tagtypen (z.B. Werktag, Wochenende,
* Feiertag)
* können unterschiedliche Schaltschemata haben. Welche Tage als Feiertag gelten, gibt
* der
* `feiertagskalender` an.
* 3. Pro Tagtyp: ``umschaltzeiten`` – die eigentlichen Uhrzeiten, zu denen auf welches
* Register
* umgeschaltet wird.
*
* .. raw:: html
*
* <object data="../_static/images/bo4e/bo/Zaehlzeitdefinition.svg"
* type="image/svg+xml"></object>
*
* .. HINT::
* `Zaehlzeitdefinition JSON Schema
* <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/BO4E/BO4E-Schemas/v202607.1.0/src/bo4e_schemas/bo/Zaehlzeitdefinition.json>`_
*/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Zaehlzeitdefinition extends Geschaeftsobjekt {
    private final BoTyp _typ = BoTyp.ZAEHLZEITDEFINITION;
    private String feiertagskalender;
    private String saisonprofil;
    private List<Zaehlzeitsaison> saisons;
    private Marktteilnehmer urheber;

    public Zaehlzeitdefinition() {
    }

    private Zaehlzeitdefinition(ZaehlzeitdefinitionBuilder builder) {
        super(builder);
        this.feiertagskalender = builder.feiertagskalender;
        this.saisonprofil = builder.saisonprofil;
        this.saisons = builder.saisons;
        this.urheber = builder.urheber;
    }

    public BoTyp get_typ() {
        return _typ;
    }

    /**
    * Bezeichnung des Feiertagskalenders, nach dem `FEIERTAGS`-Tagtypen aufgelöst werden (z.B.
    * "BDEW",
    * landes- oder gemeindespezifische Kalender). Frei wählbare Zeichenkette, deren Bedeutung
    * zwischen
    * den Marktpartnern abgestimmt sein muss.
    */
    public String getFeiertagskalender() {
        return feiertagskalender;
    }

    /**
    * Bezeichnung des Feiertagskalenders, nach dem `FEIERTAGS`-Tagtypen aufgelöst werden (z.B.
    * "BDEW",
    * landes- oder gemeindespezifische Kalender). Frei wählbare Zeichenkette, deren Bedeutung
    * zwischen
    * den Marktpartnern abgestimmt sein muss.
    */
    public void setFeiertagskalender(String feiertagskalender) {
        this.feiertagskalender = feiertagskalender;
    }

    /**
    * Bezeichnung des Saisonprofils, das die Datumsgrenzen der in `saisons` referenzierten
    * Saisons
    * festlegt (z.B. "Sommer/Winter").
    */
    public String getSaisonprofil() {
        return saisonprofil;
    }

    /**
    * Bezeichnung des Saisonprofils, das die Datumsgrenzen der in `saisons` referenzierten
    * Saisons
    * festlegt (z.B. "Sommer/Winter").
    */
    public void setSaisonprofil(String saisonprofil) {
        this.saisonprofil = saisonprofil;
    }

    /**
    * Die Schaltschemata, gruppiert nach Saison.
    */
    public List<Zaehlzeitsaison> getSaisons() {
        return saisons;
    }

    /**
    * Die Schaltschemata, gruppiert nach Saison.
    */
    public void setSaisons(List<Zaehlzeitsaison> saisons) {
        this.saisons = saisons;
    }

    /**
    * Der Marktteilnehmer, der diese Zählzeitdefinition herausgegeben hat (typischerweise
    * Netzbetreiber
    * oder Lieferant). Identifiziert zusammen mit einer fachlichen Gültigkeit, welche
    * Definition zu welchem
    * Zeitpunkt gilt.
    */
    public Marktteilnehmer getUrheber() {
        return urheber;
    }

    /**
    * Der Marktteilnehmer, der diese Zählzeitdefinition herausgegeben hat (typischerweise
    * Netzbetreiber
    * oder Lieferant). Identifiziert zusammen mit einer fachlichen Gültigkeit, welche
    * Definition zu welchem
    * Zeitpunkt gilt.
    */
    public void setUrheber(Marktteilnehmer urheber) {
        this.urheber = urheber;
    }

    public static ZaehlzeitdefinitionBuilder builder() {
        return new ZaehlzeitdefinitionBuilder();
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class ZaehlzeitdefinitionBuilder extends GeschaeftsobjektBuilder {
        private String feiertagskalender;
        private String saisonprofil;
        private List<Zaehlzeitsaison> saisons;
        private Marktteilnehmer urheber;

        private ZaehlzeitdefinitionBuilder() {
        }

        /**
        * Bezeichnung des Feiertagskalenders, nach dem `FEIERTAGS`-Tagtypen aufgelöst werden (z.B.
        * "BDEW",
        * landes- oder gemeindespezifische Kalender). Frei wählbare Zeichenkette, deren Bedeutung
        * zwischen
        * den Marktpartnern abgestimmt sein muss.
        */
        public ZaehlzeitdefinitionBuilder setFeiertagskalender(String feiertagskalender) {
            this.feiertagskalender = feiertagskalender;
            return this;
        }

        /**
        * Bezeichnung des Saisonprofils, das die Datumsgrenzen der in `saisons` referenzierten
        * Saisons
        * festlegt (z.B. "Sommer/Winter").
        */
        public ZaehlzeitdefinitionBuilder setSaisonprofil(String saisonprofil) {
            this.saisonprofil = saisonprofil;
            return this;
        }

        /**
        * Die Schaltschemata, gruppiert nach Saison.
        */
        public ZaehlzeitdefinitionBuilder setSaisons(List<Zaehlzeitsaison> saisons) {
            this.saisons = saisons;
            return this;
        }

        /**
        * Der Marktteilnehmer, der diese Zählzeitdefinition herausgegeben hat (typischerweise
        * Netzbetreiber
        * oder Lieferant). Identifiziert zusammen mit einer fachlichen Gültigkeit, welche
        * Definition zu welchem
        * Zeitpunkt gilt.
        */
        public ZaehlzeitdefinitionBuilder setUrheber(Marktteilnehmer urheber) {
            this.urheber = urheber;
            return this;
        }

        public ZaehlzeitdefinitionBuilder set_id(String _id) {
            super.set_id(_id);
            return this;
        }

        public ZaehlzeitdefinitionBuilder setZusatzAttribute(List<ZusatzAttribut> zusatzAttribute) {
            super.setZusatzAttribute(zusatzAttribute);
            return this;
        }

        public Zaehlzeitdefinition build() {
            return new Zaehlzeitdefinition(this);
        }
    }
}