package bo4e.enums;

import java.io.IOException;

/**
 * Auflistung sämtlicher existierender Komponenten.
 *
 * .. HINT::
 * Die Unterscheidung zwischen Komponenten und Geschäftsobjekten ist, dass Komponenten immer
 * in einem Geschäftsobjekt enthalten sind.
 * Komponenten sind also immer Teil von einem Geschäftsobjekt und können nicht alleine
 * existieren.
 */
public enum ComTyp {
    ADRESSE, ANGEBOTSPOSITION, ANGEBOTSTEIL, ANGEBOTSVARIANTE, AUFABSCHLAG, AUSSCHREIBUNGSDETAIL, AUSSCHREIBUNGSLOS, BETRAG, DIENSTLEISTUNG, EINHEITSPREISPOSITION, ENERGIEHERKUNFT, ENERGIEMIX, FREMDKOSTENBLOCK, FREMDKOSTENPOSITION, GEOKOORDINATEN, KATASTERADRESSE, KONFIGURATIONSPRODUKT, KONTAKTWEG, KONZESSIONSABGABE, KOSTENBLOCK, KOSTENPOSITION, LASTPROFIL, LASTVARIABLEPREISPOSITION, MARKTGEBIETINFO, MENGE, MESSWERT, PREIS, PREISGARANTIE, PREISPOSITION, PREISSTAFFEL, RECHNUNGSPOSITION, REGIONSOPERATION, REGIONSPREIS, REGIONSZEITSCHEIBE, RELATIVEPREISPOSITION, SIGMOIDPARAMETER, STANDORTEIGENSCHAFTENGAS, STANDORTEIGENSCHAFTENSTROM, STEUERBETRAG, TAGESPARAMETER, TARIFBERECHNUNGSPARAMETER, TARIFEINSCHRAENKUNG, TARIFPREIS, TARIFPREISPOSITION, TARIFPREISZEITSCHEIBE, UMSCHALTZEIT, UNTERSCHRIFT, VERTRAGSKONDITIONEN, VERTRAGSTEIL, VERWENDUNGSZWECKPROMARKTROLLE, VORAUSZAHLUNG, ZAEHLWERK, ZAEHLZEITREGISTER, ZAEHLZEITSAISON, ZAEHLZEITTAGTYP, ZAHLUNGSINFORMATION, ZEITRAUM, ZEITREIHENWERT, ZEITVARIABLEPREISPOSITION, ZUSTAENDIGKEIT;

    public String toValue() {
        switch (this) {
            case ADRESSE: return "ADRESSE";
            case ANGEBOTSPOSITION: return "ANGEBOTSPOSITION";
            case ANGEBOTSTEIL: return "ANGEBOTSTEIL";
            case ANGEBOTSVARIANTE: return "ANGEBOTSVARIANTE";
            case AUFABSCHLAG: return "AUFABSCHLAG";
            case AUSSCHREIBUNGSDETAIL: return "AUSSCHREIBUNGSDETAIL";
            case AUSSCHREIBUNGSLOS: return "AUSSCHREIBUNGSLOS";
            case BETRAG: return "BETRAG";
            case DIENSTLEISTUNG: return "DIENSTLEISTUNG";
            case EINHEITSPREISPOSITION: return "EINHEITSPREISPOSITION";
            case ENERGIEHERKUNFT: return "ENERGIEHERKUNFT";
            case ENERGIEMIX: return "ENERGIEMIX";
            case FREMDKOSTENBLOCK: return "FREMDKOSTENBLOCK";
            case FREMDKOSTENPOSITION: return "FREMDKOSTENPOSITION";
            case GEOKOORDINATEN: return "GEOKOORDINATEN";
            case KATASTERADRESSE: return "KATASTERADRESSE";
            case KONFIGURATIONSPRODUKT: return "KONFIGURATIONSPRODUKT";
            case KONTAKTWEG: return "KONTAKTWEG";
            case KONZESSIONSABGABE: return "KONZESSIONSABGABE";
            case KOSTENBLOCK: return "KOSTENBLOCK";
            case KOSTENPOSITION: return "KOSTENPOSITION";
            case LASTPROFIL: return "LASTPROFIL";
            case LASTVARIABLEPREISPOSITION: return "LASTVARIABLEPREISPOSITION";
            case MARKTGEBIETINFO: return "MARKTGEBIETINFO";
            case MENGE: return "MENGE";
            case MESSWERT: return "MESSWERT";
            case PREIS: return "PREIS";
            case PREISGARANTIE: return "PREISGARANTIE";
            case PREISPOSITION: return "PREISPOSITION";
            case PREISSTAFFEL: return "PREISSTAFFEL";
            case RECHNUNGSPOSITION: return "RECHNUNGSPOSITION";
            case REGIONSOPERATION: return "REGIONSOPERATION";
            case REGIONSPREIS: return "REGIONSPREIS";
            case REGIONSZEITSCHEIBE: return "REGIONSZEITSCHEIBE";
            case RELATIVEPREISPOSITION: return "RELATIVEPREISPOSITION";
            case SIGMOIDPARAMETER: return "SIGMOIDPARAMETER";
            case STANDORTEIGENSCHAFTENGAS: return "STANDORTEIGENSCHAFTENGAS";
            case STANDORTEIGENSCHAFTENSTROM: return "STANDORTEIGENSCHAFTENSTROM";
            case STEUERBETRAG: return "STEUERBETRAG";
            case TAGESPARAMETER: return "TAGESPARAMETER";
            case TARIFBERECHNUNGSPARAMETER: return "TARIFBERECHNUNGSPARAMETER";
            case TARIFEINSCHRAENKUNG: return "TARIFEINSCHRAENKUNG";
            case TARIFPREIS: return "TARIFPREIS";
            case TARIFPREISPOSITION: return "TARIFPREISPOSITION";
            case TARIFPREISZEITSCHEIBE: return "TARIFPREISZEITSCHEIBE";
            case UMSCHALTZEIT: return "UMSCHALTZEIT";
            case UNTERSCHRIFT: return "UNTERSCHRIFT";
            case VERTRAGSKONDITIONEN: return "VERTRAGSKONDITIONEN";
            case VERTRAGSTEIL: return "VERTRAGSTEIL";
            case VERWENDUNGSZWECKPROMARKTROLLE: return "VERWENDUNGSZWECKPROMARKTROLLE";
            case VORAUSZAHLUNG: return "VORAUSZAHLUNG";
            case ZAEHLWERK: return "ZAEHLWERK";
            case ZAEHLZEITREGISTER: return "ZAEHLZEITREGISTER";
            case ZAEHLZEITSAISON: return "ZAEHLZEITSAISON";
            case ZAEHLZEITTAGTYP: return "ZAEHLZEITTAGTYP";
            case ZAHLUNGSINFORMATION: return "ZAHLUNGSINFORMATION";
            case ZEITRAUM: return "ZEITRAUM";
            case ZEITREIHENWERT: return "ZEITREIHENWERT";
            case ZEITVARIABLEPREISPOSITION: return "ZEITVARIABLEPREISPOSITION";
            case ZUSTAENDIGKEIT: return "ZUSTAENDIGKEIT";
        }
        return null;
    }

    public static ComTyp forValue(String value) throws IOException {
        if (value.equals("ADRESSE")) return ADRESSE;
        if (value.equals("ANGEBOTSPOSITION")) return ANGEBOTSPOSITION;
        if (value.equals("ANGEBOTSTEIL")) return ANGEBOTSTEIL;
        if (value.equals("ANGEBOTSVARIANTE")) return ANGEBOTSVARIANTE;
        if (value.equals("AUFABSCHLAG")) return AUFABSCHLAG;
        if (value.equals("AUSSCHREIBUNGSDETAIL")) return AUSSCHREIBUNGSDETAIL;
        if (value.equals("AUSSCHREIBUNGSLOS")) return AUSSCHREIBUNGSLOS;
        if (value.equals("BETRAG")) return BETRAG;
        if (value.equals("DIENSTLEISTUNG")) return DIENSTLEISTUNG;
        if (value.equals("EINHEITSPREISPOSITION")) return EINHEITSPREISPOSITION;
        if (value.equals("ENERGIEHERKUNFT")) return ENERGIEHERKUNFT;
        if (value.equals("ENERGIEMIX")) return ENERGIEMIX;
        if (value.equals("FREMDKOSTENBLOCK")) return FREMDKOSTENBLOCK;
        if (value.equals("FREMDKOSTENPOSITION")) return FREMDKOSTENPOSITION;
        if (value.equals("GEOKOORDINATEN")) return GEOKOORDINATEN;
        if (value.equals("KATASTERADRESSE")) return KATASTERADRESSE;
        if (value.equals("KONFIGURATIONSPRODUKT")) return KONFIGURATIONSPRODUKT;
        if (value.equals("KONTAKTWEG")) return KONTAKTWEG;
        if (value.equals("KONZESSIONSABGABE")) return KONZESSIONSABGABE;
        if (value.equals("KOSTENBLOCK")) return KOSTENBLOCK;
        if (value.equals("KOSTENPOSITION")) return KOSTENPOSITION;
        if (value.equals("LASTPROFIL")) return LASTPROFIL;
        if (value.equals("LASTVARIABLEPREISPOSITION")) return LASTVARIABLEPREISPOSITION;
        if (value.equals("MARKTGEBIETINFO")) return MARKTGEBIETINFO;
        if (value.equals("MENGE")) return MENGE;
        if (value.equals("MESSWERT")) return MESSWERT;
        if (value.equals("PREIS")) return PREIS;
        if (value.equals("PREISGARANTIE")) return PREISGARANTIE;
        if (value.equals("PREISPOSITION")) return PREISPOSITION;
        if (value.equals("PREISSTAFFEL")) return PREISSTAFFEL;
        if (value.equals("RECHNUNGSPOSITION")) return RECHNUNGSPOSITION;
        if (value.equals("REGIONSOPERATION")) return REGIONSOPERATION;
        if (value.equals("REGIONSPREIS")) return REGIONSPREIS;
        if (value.equals("REGIONSZEITSCHEIBE")) return REGIONSZEITSCHEIBE;
        if (value.equals("RELATIVEPREISPOSITION")) return RELATIVEPREISPOSITION;
        if (value.equals("SIGMOIDPARAMETER")) return SIGMOIDPARAMETER;
        if (value.equals("STANDORTEIGENSCHAFTENGAS")) return STANDORTEIGENSCHAFTENGAS;
        if (value.equals("STANDORTEIGENSCHAFTENSTROM")) return STANDORTEIGENSCHAFTENSTROM;
        if (value.equals("STEUERBETRAG")) return STEUERBETRAG;
        if (value.equals("TAGESPARAMETER")) return TAGESPARAMETER;
        if (value.equals("TARIFBERECHNUNGSPARAMETER")) return TARIFBERECHNUNGSPARAMETER;
        if (value.equals("TARIFEINSCHRAENKUNG")) return TARIFEINSCHRAENKUNG;
        if (value.equals("TARIFPREIS")) return TARIFPREIS;
        if (value.equals("TARIFPREISPOSITION")) return TARIFPREISPOSITION;
        if (value.equals("TARIFPREISZEITSCHEIBE")) return TARIFPREISZEITSCHEIBE;
        if (value.equals("UMSCHALTZEIT")) return UMSCHALTZEIT;
        if (value.equals("UNTERSCHRIFT")) return UNTERSCHRIFT;
        if (value.equals("VERTRAGSKONDITIONEN")) return VERTRAGSKONDITIONEN;
        if (value.equals("VERTRAGSTEIL")) return VERTRAGSTEIL;
        if (value.equals("VERWENDUNGSZWECKPROMARKTROLLE")) return VERWENDUNGSZWECKPROMARKTROLLE;
        if (value.equals("VORAUSZAHLUNG")) return VORAUSZAHLUNG;
        if (value.equals("ZAEHLWERK")) return ZAEHLWERK;
        if (value.equals("ZAEHLZEITREGISTER")) return ZAEHLZEITREGISTER;
        if (value.equals("ZAEHLZEITSAISON")) return ZAEHLZEITSAISON;
        if (value.equals("ZAEHLZEITTAGTYP")) return ZAEHLZEITTAGTYP;
        if (value.equals("ZAHLUNGSINFORMATION")) return ZAHLUNGSINFORMATION;
        if (value.equals("ZEITRAUM")) return ZEITRAUM;
        if (value.equals("ZEITREIHENWERT")) return ZEITREIHENWERT;
        if (value.equals("ZEITVARIABLEPREISPOSITION")) return ZEITVARIABLEPREISPOSITION;
        if (value.equals("ZUSTAENDIGKEIT")) return ZUSTAENDIGKEIT;
        throw new IOException("Cannot deserialize ComTyp");
    }
}
