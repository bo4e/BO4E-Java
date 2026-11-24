package bo4e.com;

import bo4e.ZusatzAttribut;
import bo4e.enums.ComTyp;
import bo4e.enums.Wiederholungstyp;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.List;

/**
* Beschreibt das Schaltschema eines Tagtyps innerhalb einer `Zaehlzeitsaison`: welcher
* Tagtyp
* gemeint ist und zu welchen Uhrzeiten welches Register an diesem Tagtyp aktiv ist.
*
* Der Tagtyp wird über einen `Wiederholungstyp` ausgedrückt (z.B. `WERKTAGS`, `MONTAGS`,
* `FEIERTAGS`).
*
* Die `umschaltzeiten` füllen einen ganzen Tag vollständig und überlappungsfrei aus.
* Die jeweilige Umschaltzeit definiert (wenn der Größe nach sortiert) die untere Grenze
* (inklusiv);
* der Beginn des Tages (00:00 Uhr) und das Ende des Tages (24:00 Uhr) bilden die äußeren
* Grenzen.
*
* .. raw:: html
*
* <object data="../_static/images/bo4e/com/Zaehlzeittagtyp.svg"
* type="image/svg+xml"></object>
*
* .. HINT::
* `Zaehlzeittagtyp JSON Schema
* <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/BO4E/BO4E-Schemas/v202607.0.0/src/bo4e_schemas/com/Zaehlzeittagtyp.json>`_
*/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Zaehlzeittagtyp extends COM {
    private final ComTyp _typ = ComTyp.ZAEHLZEITTAGTYP;
    private Wiederholungstyp tagtyp;
    private List<Umschaltzeit> umschaltzeiten;

    public Zaehlzeittagtyp() {
    }

    private Zaehlzeittagtyp(ZaehlzeittagtypBuilder builder) {
        super(builder);
        this.tagtyp = builder.tagtyp;
        this.umschaltzeiten = builder.umschaltzeiten;
    }

    public ComTyp get_typ() {
        return _typ;
    }

    /**
    * An welchen Tagen das Schaltschema dieses Tagtyps gilt (z.B. `WERKTAGS`, `MONTAGS`,
    * `FEIERTAGS`).
    */
    public Wiederholungstyp getTagtyp() {
        return tagtyp;
    }

    /**
    * An welchen Tagen das Schaltschema dieses Tagtyps gilt (z.B. `WERKTAGS`, `MONTAGS`,
    * `FEIERTAGS`).
    */
    public void setTagtyp(Wiederholungstyp tagtyp) {
        this.tagtyp = tagtyp;
    }

    /**
    * Die Umschaltzeiten dieses Tagtyps. Sortiert ergibt sich daraus das Schaltschema für einen
    * Tag.
    */
    public List<Umschaltzeit> getUmschaltzeiten() {
        return umschaltzeiten;
    }

    /**
    * Die Umschaltzeiten dieses Tagtyps. Sortiert ergibt sich daraus das Schaltschema für einen
    * Tag.
    */
    public void setUmschaltzeiten(List<Umschaltzeit> umschaltzeiten) {
        this.umschaltzeiten = umschaltzeiten;
    }

    public static ZaehlzeittagtypBuilder builder() {
        return new ZaehlzeittagtypBuilder();
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class ZaehlzeittagtypBuilder extends COMBuilder {
        private Wiederholungstyp tagtyp;
        private List<Umschaltzeit> umschaltzeiten;

        private ZaehlzeittagtypBuilder() {
        }

        /**
        * An welchen Tagen das Schaltschema dieses Tagtyps gilt (z.B. `WERKTAGS`, `MONTAGS`,
        * `FEIERTAGS`).
        */
        public ZaehlzeittagtypBuilder setTagtyp(Wiederholungstyp tagtyp) {
            this.tagtyp = tagtyp;
            return this;
        }

        /**
        * Die Umschaltzeiten dieses Tagtyps. Sortiert ergibt sich daraus das Schaltschema für einen
        * Tag.
        */
        public ZaehlzeittagtypBuilder setUmschaltzeiten(List<Umschaltzeit> umschaltzeiten) {
            this.umschaltzeiten = umschaltzeiten;
            return this;
        }

        public ZaehlzeittagtypBuilder set_id(String _id) {
            super.set_id(_id);
            return this;
        }

        public ZaehlzeittagtypBuilder setZusatzAttribute(List<ZusatzAttribut> zusatzAttribute) {
            super.setZusatzAttribute(zusatzAttribute);
            return this;
        }

        public Zaehlzeittagtyp build() {
            return new Zaehlzeittagtyp(this);
        }
    }
}