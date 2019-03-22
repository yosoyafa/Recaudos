package utils;

import android.provider.BaseColumns;

public class DataBase {

    public static final String TABLE_CLIENTS = "clients";
    public static final String TABLE_RECAUDOS = "recaudos";
    public static final String TABLE_TICKETS = "tickets";

    public static final String SQL_CRATE_TABLE_CLIENTS = "CREATE TABLE "
            + DataBase.TABLE_CLIENTS + " ("
            + "key_id INTEGER PRIMARY KEY AUTOINCREMENT,"
            + DataClientColumns.CLIENT_ID + " TEXT,"
            + DataClientColumns.CLIENT_NAME + " TEXT,"
            + DataClientColumns.CLIENT_TOTAL + " TEXT,"
            + DataClientColumns.CLIENT_VIGENCIA_DESDE + " TEXT,"
            + DataClientColumns.CLIENT_VIGENCIA_HASTA + " TEXT,"
            + DataClientColumns.CLIENT_NUMERO_POLIZA + " TEXT,"
            + DataClientColumns.CLIENT_VALOR_CONTRATO + " TEXT,"
            + DataClientColumns.CLIENT_PERIODICIDAD + " TEXT)";

    public static final String SQL_CRATE_TABLE_RECAUDOS = "CREATE TABLE "
            + DataBase.TABLE_RECAUDOS + " ("
            + "key_id INTEGER PRIMARY KEY AUTOINCREMENT,"
            + DataRecaudoColumns.RECAUDO_CEDULA_CLIENTE + " TEXT,"
            + DataRecaudoColumns.RECAUDO_NUMERADOR_RC + " TEXT,"
            + DataRecaudoColumns.RECAUDO_ID_RECAUDADOR + " TEXT,"
            + DataRecaudoColumns.RECAUDO_USER_RECAUDADOR + " TEXT,"
            + DataRecaudoColumns.RECAUDO_VALOR + " TEXT,"
            + DataRecaudoColumns.RECAUDO_LATITUD + " TEXT,"
            + DataRecaudoColumns.RECAUDO_LONGITUD + " TEXT,"
            + DataRecaudoColumns.RECAUDO_ONLINE + " INTEGER,"
            + DataRecaudoColumns.RECAUDO_FECHA + " TEXT,"
            + DataRecaudoColumns.RECAUDO_OBSERVACIONES + " TEXT)";

    public static final String SQL_CRATE_TABLE_TICKETS = "CREATE TABLE "
            + DataBase.TABLE_TICKETS + " ("
            + DataTicketColumns.TICKET_CABECERA + " TEXT,"
            + DataTicketColumns.TICKET_FECHA + " TEXT,"
            + DataTicketColumns.TICKET_VIGD + " TEXT,"
            + DataTicketColumns.TICKET_VIGH + " TEXT,"
            + DataTicketColumns.TICKET_VALORVIGCONTRATO + " TEXT,"
            + DataTicketColumns.TICKET_PERIODICIDAD + " TEXT,"
            + DataTicketColumns.TICKET_NUMRECIBO + " TEXT PRIMARY KEY,"
            + DataTicketColumns.TICKET_NUMCONTRATO + " TEXT,"
            + DataTicketColumns.TICKET_CCCLIENTE + " TEXT,"
            + DataTicketColumns.TICKET_NOMBCLIENTE + " TEXT,"
            + DataTicketColumns.TICKET_VALORRECAUDADO + " TEXT,"
            + DataTicketColumns.TICKET_OBSERVACION + " TEXT,"
            + DataTicketColumns.TICKET_NOMBASESOR + " TEXT)";

    public static abstract class DataTicketColumns implements BaseColumns {
        public static final String TICKET_CABECERA = "cabecera";
        public static final String TICKET_FECHA = "fecha";
        public static final String TICKET_VIGD = "vigD";
        public static final String TICKET_VIGH = "vigH";
        public static final String TICKET_VALORVIGCONTRATO = "valorVigContrato";
        public static final String TICKET_PERIODICIDAD = "periodicidad";
        public static final String TICKET_NUMRECIBO = "numRecibo";
        public static final String TICKET_NUMCONTRATO = "numContrato";
        public static final String TICKET_CCCLIENTE = "ccCliente";
        public static final String TICKET_NOMBCLIENTE = "nombCliente";
        public static final String TICKET_VALORRECAUDADO = "valorRecaudado";
        public static final String TICKET_OBSERVACION = "observacion";
        public static final String TICKET_NOMBASESOR = "nombAsesor";
    }

    public static abstract class DataClientColumns implements BaseColumns {
        public static final String CLIENT_NAME = "nombre";
        public static final String CLIENT_ID = "id";
        public static final String CLIENT_TOTAL = "total";
        public static final String CLIENT_VIGENCIA_DESDE = "vigencia_desde";
        public static final String CLIENT_VIGENCIA_HASTA = "vigencia_hasta";
        public static final String CLIENT_NUMERO_POLIZA = "numero_poliza";
        public static final String CLIENT_VALOR_CONTRATO = "valor_contrato";
        public static final String CLIENT_PERIODICIDAD = "periodicidad";

    }

    public static abstract class DataRecaudoColumns implements BaseColumns {
        public static final String RECAUDO_USER_RECAUDADOR = "user_recaudador";
        public static final String RECAUDO_ID_RECAUDADOR = "id_recaudador";
        public static final String RECAUDO_CEDULA_CLIENTE = "cedula_cliente";
        public static final String RECAUDO_VALOR = "valor";
        public static final String RECAUDO_LATITUD = "latitud";
        public static final String RECAUDO_LONGITUD = "longitud";
        public static final String RECAUDO_ONLINE = "online";
        public static final String RECAUDO_FECHA = "fecha";
        public static final String RECAUDO_NUMERADOR_RC = "numerador_rc";
        public static final String RECAUDO_OBSERVACIONES = "observaciones";
    }

}