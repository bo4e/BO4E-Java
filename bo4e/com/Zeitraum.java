package bo4e.com;

import bo4e.ZusatzAttribut;
import bo4e.enums.ComTyp;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.time.LocalDate;
import java.time.OffsetTime;
import java.util.List;

/**
* Diese Komponente wird zur Abbildung von Zeiträumen in Form von Dauern oder der Angabe von
* Start und Ende verwendet.
* Es muss daher eine der drei Möglichkeiten angegeben sein:
* - Einheit und Dauer oder
* - Zeitraum: Startdatum bis Enddatum oder
* - Zeitraum: Startzeitpunkt (Datum und Uhrzeit) bis Endzeitpunkt (Datum und Uhrzeit)
*
* .. raw:: html
*
* <object data="../_static/images/bo4e/com/Zeitraum.svg" type="image/svg+xml"></object>
*
* .. HINT::
* `Zeitraum JSON Schema
* <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/BO4E/BO4E-Schemas/v202501.1.0-rc1/src/bo4e_schemas/com/Zeitraum.json>`_
*/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Zeitraum extends COM {
    private final ComTyp _typ = ComTyp.ZEITRAUM;
    private String dauer;
    private LocalDate enddatum;
    private OffsetTime enduhrzeit;
    private LocalDate startdatum;
    private OffsetTime startuhrzeit;

    public Zeitraum() {
    }

    private Zeitraum(ZeitraumBuilder builder) {
        super(builder);
        this.dauer = builder.dauer;
        this.enddatum = builder.enddatum;
        this.enduhrzeit = builder.enduhrzeit;
        this.startdatum = builder.startdatum;
        this.startuhrzeit = builder.startuhrzeit;
    }

    public ComTyp get_typ() {
        return _typ;
    }

    /**
    * Dauer in ISO 8601 Format.
    *
    * Example:
    * 'P1DT30H4S'
    *
    * See `RFC 3339 <https://datatracker.ietf.org/doc/html/rfc3339>`_
    */
    public String getDauer() {
        return dauer;
    }

    /**
    * Dauer in ISO 8601 Format.
    *
    * Example:
    * 'P1DT30H4S'
    *
    * See `RFC 3339 <https://datatracker.ietf.org/doc/html/rfc3339>`_
    */
    public void setDauer(String dauer) {
        this.dauer = dauer;
    }

    /**
    * Enddatum des betrachteten Zeitraums ist **inklusiv**.
    *
    * Example:
    * '2025-01-01'
    */
    public LocalDate getEnddatum() {
        return enddatum;
    }

    /**
    * Enddatum des betrachteten Zeitraums ist **inklusiv**.
    *
    * Example:
    * '2025-01-01'
    */
    public void setEnddatum(LocalDate enddatum) {
        this.enddatum = enddatum;
    }

    /**
    * Enduhrzeit mit Zeitzone. Die angegebene Uhrzeit ist im betrachteten Zeitraum
    * **exklusiv**.
    *
    * Example:
    * '19:00:00+01:00'
    */
    public OffsetTime getEnduhrzeit() {
        return enduhrzeit;
    }

    /**
    * Enduhrzeit mit Zeitzone. Die angegebene Uhrzeit ist im betrachteten Zeitraum
    * **exklusiv**.
    *
    * Example:
    * '19:00:00+01:00'
    */
    public void setEnduhrzeit(OffsetTime enduhrzeit) {
        this.enduhrzeit = enduhrzeit;
    }

    /**
    * Startdatum des betrachteten Zeitraums ist **inklusiv**.
    *
    * Example:
    * '2025-01-01'
    */
    public LocalDate getStartdatum() {
        return startdatum;
    }

    /**
    * Startdatum des betrachteten Zeitraums ist **inklusiv**.
    *
    * Example:
    * '2025-01-01'
    */
    public void setStartdatum(LocalDate startdatum) {
        this.startdatum = startdatum;
    }

    /**
    * Startuhrzeit mit Zeitzone. Die angegebene Uhrzeit ist im betrachteten Zeitraum
    * **inklusiv**.
    *
    * Example:
    * '18:00:00+01:00'
    */
    public OffsetTime getStartuhrzeit() {
        return startuhrzeit;
    }

    /**
    * Startuhrzeit mit Zeitzone. Die angegebene Uhrzeit ist im betrachteten Zeitraum
    * **inklusiv**.
    *
    * Example:
    * '18:00:00+01:00'
    */
    public void setStartuhrzeit(OffsetTime startuhrzeit) {
        this.startuhrzeit = startuhrzeit;
    }

    public static ZeitraumBuilder builder() {
        return new ZeitraumBuilder();
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class ZeitraumBuilder extends COMBuilder {
        private String dauer;
        private LocalDate enddatum;
        private OffsetTime enduhrzeit;
        private LocalDate startdatum;
        private OffsetTime startuhrzeit;

        private ZeitraumBuilder() {
        }

        /**
        * Dauer in ISO 8601 Format.
        *
        * Example:
        * 'P1DT30H4S'
        *
        * See `RFC 3339 <https://datatracker.ietf.org/doc/html/rfc3339>`_
        */
        public ZeitraumBuilder setDauer(String dauer) {
            this.dauer = dauer;
            return this;
        }

        /**
        * Enddatum des betrachteten Zeitraums ist **inklusiv**.
        *
        * Example:
        * '2025-01-01'
        */
        public ZeitraumBuilder setEnddatum(LocalDate enddatum) {
            this.enddatum = enddatum;
            return this;
        }

        /**
        * Enduhrzeit mit Zeitzone. Die angegebene Uhrzeit ist im betrachteten Zeitraum
        * **exklusiv**.
        *
        * Example:
        * '19:00:00+01:00'
        */
        public ZeitraumBuilder setEnduhrzeit(OffsetTime enduhrzeit) {
            this.enduhrzeit = enduhrzeit;
            return this;
        }

        /**
        * Startdatum des betrachteten Zeitraums ist **inklusiv**.
        *
        * Example:
        * '2025-01-01'
        */
        public ZeitraumBuilder setStartdatum(LocalDate startdatum) {
            this.startdatum = startdatum;
            return this;
        }

        /**
        * Startuhrzeit mit Zeitzone. Die angegebene Uhrzeit ist im betrachteten Zeitraum
        * **inklusiv**.
        *
        * Example:
        * '18:00:00+01:00'
        */
        public ZeitraumBuilder setStartuhrzeit(OffsetTime startuhrzeit) {
            this.startuhrzeit = startuhrzeit;
            return this;
        }

        public ZeitraumBuilder set_id(String _id) {
            super.set_id(_id);
            return this;
        }

        public ZeitraumBuilder setZusatzAttribute(List<ZusatzAttribut> zusatzAttribute) {
            super.setZusatzAttribute(zusatzAttribute);
            return this;
        }

        public Zeitraum build() {
            return new Zeitraum(this);
        }
    }
}