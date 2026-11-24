package bo4e.com;

import bo4e.ZusatzAttribut;
import bo4e.enums.ComTyp;

import java.util.List;

/**
* Bündelt alle Schaltschemata, die innerhalb einer Saison einer `Zaehlzeitdefinition`
* gelten.
*
* Eine Saison ist ein Teil des Jahres, in dem dieselben Schaltschemata gelten –
* typischerweise
* Sommer und Winter. Welche Tage zu welcher Saison gehören, wird nicht in diesem COM,
* sondern
* über das `saisonprofil` der übergeordneten `Zaehlzeitdefinition` festgelegt;
* `bezeichnung`
* bildet hier die textuelle Verknüpfung zwischen Profil und Saisonabschnitt.
*
* .. raw:: html
*
* <object data="../_static/images/bo4e/com/Zaehlzeitsaison.svg"
* type="image/svg+xml"></object>
*
* .. HINT::
* `Zaehlzeitsaison JSON Schema
* <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/BO4E/BO4E-Schemas/v202607.1.0-rc2/src/bo4e_schemas/com/Zaehlzeitsaison.json>`_
*/
public class Zaehlzeitsaison extends COM {
    private final ComTyp _typ = ComTyp.ZAEHLZEITSAISON;
    private String bezeichnung;
    private List<Zaehlzeittagtyp> tagtypen;

    public Zaehlzeitsaison() {
    }

    private Zaehlzeitsaison(ZaehlzeitsaisonBuilder builder) {
        super(builder);
        this.bezeichnung = builder.bezeichnung;
        this.tagtypen = builder.tagtypen;
    }

    public ComTyp get_typ() {
        return _typ;
    }

    /**
    * Bezeichnung der Saison (z.B. "Sommer", "Winter"). Muss zu einem Saisonabschnitt des in
    * der
    * übergeordneten `Zaehlzeitdefinition` referenzierten `saisonprofil` passen. Leer, wenn
    * keine
    * Saisonunterscheidung getroffen wird.
    */
    public String getBezeichnung() {
        return bezeichnung;
    }

    /**
    * Bezeichnung der Saison (z.B. "Sommer", "Winter"). Muss zu einem Saisonabschnitt des in
    * der
    * übergeordneten `Zaehlzeitdefinition` referenzierten `saisonprofil` passen. Leer, wenn
    * keine
    * Saisonunterscheidung getroffen wird.
    */
    public void setBezeichnung(String bezeichnung) {
        this.bezeichnung = bezeichnung;
    }

    /**
    * Die Schaltschemata für die unterschiedlichen Tagtypen (z.B. Werktag, Wochenende,
    * Feiertag)
    * innerhalb dieser Saison.
    */
    public List<Zaehlzeittagtyp> getTagtypen() {
        return tagtypen;
    }

    /**
    * Die Schaltschemata für die unterschiedlichen Tagtypen (z.B. Werktag, Wochenende,
    * Feiertag)
    * innerhalb dieser Saison.
    */
    public void setTagtypen(List<Zaehlzeittagtyp> tagtypen) {
        this.tagtypen = tagtypen;
    }

    public static ZaehlzeitsaisonBuilder builder() {
        return new ZaehlzeitsaisonBuilder();
    }

    public static class ZaehlzeitsaisonBuilder extends COMBuilder {
        private String bezeichnung;
        private List<Zaehlzeittagtyp> tagtypen;

        private ZaehlzeitsaisonBuilder() {
        }

        /**
        * Bezeichnung der Saison (z.B. "Sommer", "Winter"). Muss zu einem Saisonabschnitt des in
        * der
        * übergeordneten `Zaehlzeitdefinition` referenzierten `saisonprofil` passen. Leer, wenn
        * keine
        * Saisonunterscheidung getroffen wird.
        */
        public ZaehlzeitsaisonBuilder setBezeichnung(String bezeichnung) {
            this.bezeichnung = bezeichnung;
            return this;
        }

        /**
        * Die Schaltschemata für die unterschiedlichen Tagtypen (z.B. Werktag, Wochenende,
        * Feiertag)
        * innerhalb dieser Saison.
        */
        public ZaehlzeitsaisonBuilder setTagtypen(List<Zaehlzeittagtyp> tagtypen) {
            this.tagtypen = tagtypen;
            return this;
        }

        public ZaehlzeitsaisonBuilder set_id(String _id) {
            super.set_id(_id);
            return this;
        }

        public ZaehlzeitsaisonBuilder setZusatzAttribute(List<ZusatzAttribut> zusatzAttribute) {
            super.setZusatzAttribute(zusatzAttribute);
            return this;
        }

        public Zaehlzeitsaison build() {
            return new Zaehlzeitsaison(this);
        }
    }
}